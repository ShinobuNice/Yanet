package Servidor;

import javax.jws.WebService;
import javax.jws.WebMethod;

@WebService(endpointInterface = "Servidor.CalculadoraWSInterface")
public class CalculadoraWS implements CalculadoraWSInterface {

    private int contadorOperaciones;

    public CalculadoraWS() {
        this.contadorOperaciones = 0;
    }

    @WebMethod
    @Override
    public int sumar(int a, int b) {
        contadorOperaciones++;
        return (a + b);
    }

    @WebMethod
    @Override
    public int restar(int a, int b) {
        contadorOperaciones++;
        return (a - b);
    }

    @WebMethod
    @Override
    public int multiplicar(int a, int b) {
        contadorOperaciones++;
        return (a * b);
    }

    @WebMethod
    @Override
    public int dividir(int a, int b) {
        contadorOperaciones++;
        return (a / b);
    }

    @WebMethod
    @Override
    public int getContadorPeticiones() {
        return (this.contadorOperaciones);
    }
}