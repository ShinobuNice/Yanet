package Servidor;

import javax.jws.WebService;

@WebService
public interface CalculadoraWSInterface {
    int sumar(int a, int b);
    int restar(int a, int b);
    int multiplicar(int a, int b);
    int dividir(int a, int b);
    int getContadorPeticiones();
}