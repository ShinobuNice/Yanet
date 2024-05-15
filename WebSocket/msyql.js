const mysql = require('mysql');

const db = mysql.createConnection({
  host: 'localhost',
  user: 'root',
  password: '',
  database: 'dibujos'
});

db.connect((err) => {
  if (err) {
    console.error('Conexion No Establecida:', err);
    return;
  }
  console.log('Conexion Establecida');
});

module.exports = db;
