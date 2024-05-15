const WebSocket = require('ws');
const mysql = require('mysql');

// Configuración de la base de datos MySQL
const db = mysql.createConnection({
  host: 'localhost',
  user: 'root',
  password: '',
  database: 'dibujos' 
}); 

db.connect((err) => {
  if (err) {
    console.error('Error connecting to MySQL database:', err);
    return;
  }
  console.log('Connected to MySQL database');
});

// Configuración del servidor WebSocket
const wss = new WebSocket.Server({ port: 3000 });

wss.on('connection', (ws, req) => {
  const usuario = req.connection.remoteAddress.replace(/^.*:/, '');
  console.log('Cliente conectado desde la IP:', usuario);

  ws.on('message', (msg) => {
    const trazo = JSON.parse(Buffer.from(msg, 'base64'));

    // Guardar el trazo en la base de datos junto con la IP del cliente
    saveDrawing(trazo, usuario, (err) => {
      if (err) {
        console.error('Error saving drawing to database:', err);
        return;
      }
      // Reenviar el trazo a todos los clientes conectados
      wss.clients.forEach(client => {
        if (client !== ws && client.readyState === WebSocket.OPEN) {
          client.send(msg);
        }
      });
    });
  });
});


// Función para guardar un trazo en la base de datos junto con la IP del cliente
function saveDrawing(trazo, usuario, callback) {
  let sql = 'INSERT INTO trazos (trazo, usuario) VALUES (?, ?)';
  db.query(sql, [JSON.stringify(trazo), usuario], (err, result) => {
    if (err) {
      console.error('Error saving drawing to database:', err);
      callback(err);
      return;
    }
    callback(null);
  });
}













// Envía datos de la BD cada 2 segs
// Envía datos a clientes cada 2 segs
setInterval(() => {

  getUserData(data => {
  
    // Iterar por los clientes y enviar datos
    wss.clients.forEach(client => {
      if (client.readyState === WebSocket.OPEN) {  
        client.send(JSON.stringify(data));
      }
    });

  });

}, 2000);

// Consulta datos
function getUserData(callback) {

  let sql = 'SELECT usuario,trazo, COUNT(*) AS trazos FROM trazos GROUP BY usuario';

  db.query(sql, (err, results) => {
  
    let data = results.map(row => ({
      usuario: row.usuario,
      trazo: row.trazo,
      trazos: row.trazos
    }));

    callback(data);

  });

}