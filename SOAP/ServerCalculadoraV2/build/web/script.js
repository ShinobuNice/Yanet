function realizarOperacion() {
    const url = "http://localhost:3306/ServerCalculadoraV2/CalculadoraWS"; // Cambia esta URL según corresponda
    const operacion = document.getElementById("operacion").value;
    const a = parseInt(document.getElementById("a").value);
    const b = parseInt(document.getElementById("b").value);

    if (isNaN(a) || isNaN(b)) {
        document.getElementById("resultado").innerHTML = "Ingrese valores numéricos válidos.";
        return;
    }

    const soap = `
        <soap:Envelope xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:xsd="http://www.w3.org/2001/XMLSchema" xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/">
            <soap:Body>
                <${operacion} xmlns="http://Servidor/">
                    <a>${a}</a>
                    <b>${b}</b>
                </${operacion}>
            </soap:Body>
        </soap:Envelope>
    `;

    const xhr = new XMLHttpRequest();
    xhr.open("POST", url, true);
    xhr.setRequestHeader("Content-Type", "text/xml; charset=utf-8");
    xhr.onreadystatechange = function () {
        if (xhr.readyState === 4 && xhr.status === 200) {
            const parser = new DOMParser();
            const xmlDoc = parser.parseFromString(xhr.responseText, "text/xml");
            const resultado = xmlDoc.getElementsByTagName(`${operacion}Result`)[0].childNodes[0].nodeValue;
            document.getElementById("resultado").innerHTML = `El resultado de la operación ${operacion} es: ${resultado}`;
        }
    };
    xhr.send(soap);
}