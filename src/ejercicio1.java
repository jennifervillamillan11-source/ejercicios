import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el primer número:");
        double num1 = sc.nextDouble();

        System.out.println("Ingrese el segundo número:");
        double num2 = sc.nextDouble();

        System.out.println("Elija operación: +  -  *  /");
        char operacion = sc.next().charAt(0);
  
        double resultado = 0;

        if (operacion == '+') {
            resultado = num1 + num2;
        } else if (operacion == '-') {
            resultado = num1 - num2;
        } else if (operacion == '*') {
            resultado = num1 * num2;
        } else if (operacion == '/') {
            resultado = num1 / num2;
        } else {
            System.out.println("Operación no válida");
            return;
        }

        System.out.println("Resultado: " + resultado);
    }
}
