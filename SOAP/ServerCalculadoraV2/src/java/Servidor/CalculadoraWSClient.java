package Servidor;

import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.util.Scanner;

public class CalculadoraWSClient {
    public static void main(String[] args) throws Exception {
  
        URL url = new URL("http://localhost:3306/ServerCalculadoraV2/CalculadoraWS?wsdl");
        QName qname = new QName("http://Servidor/", "CalculadoraWSService");
        Service service = Service.create(url, qname);
        
        Servidor.CalculadoraWSInterface calculadoraWS = service.getPort(Servidor.CalculadoraWSInterface.class);
        InterfazWeb.abrirInterfazWeb();
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("Seleccione la operación:");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            
            int opcion = scanner.nextInt();
            int a, b, resultado;
         
            switch (opcion) {
                case 1:
                    System.out.println("\n");
                    System.out.println("Ingrese el primer número:");
                    a = scanner.nextInt();
                    System.out.println("Ingrese el segundo número:");
                    b = scanner.nextInt();
                    resultado = calculadoraWS.sumar(a, b);
                    System.out.println("El resultado de la suma es: " + resultado + "\n");
                    break;
                case 2:
                    System.out.println("\n");
                    System.out.println("Ingrese el primer número:");
                    a = scanner.nextInt();
                    System.out.println("Ingrese el segundo número:");
                    b = scanner.nextInt();
                    resultado = calculadoraWS.restar(a, b);
                    System.out.println("El resultado de la resta es: " + resultado + "\n");
                    break;
                case 3:
                    System.out.println("\n");
                    System.out.println("Ingrese el primer número:");
                    a = scanner.nextInt();
                    System.out.println("Ingrese el segundo número:");
                    b = scanner.nextInt();
                    resultado = calculadoraWS.multiplicar(a, b);
                    System.out.println("El resultado de la multiplicación es: " + resultado + "\n");
                    break;
                case 4:
                    System.out.println("\n");
                    System.out.println("Ingrese el primer número:");
                    a = scanner.nextInt();
                    System.out.println("Ingrese el segundo número:");
                    b = scanner.nextInt();
                    resultado = calculadoraWS.dividir(a, b);
                    System.out.println("El resultado de la división es: " + resultado + "\n");
                    break;
                case 5:
                    continuar = false;
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
                    break;
            }
        }
        
        scanner.close();
    }
}
