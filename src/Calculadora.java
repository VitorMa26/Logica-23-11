
import java.util.Scanner;

public class Main {


    public static double somar(double a, double b) {
        return a + b;
    }
    public static double subtrair(double a, double b) {
        return a - b;
    }

    public static double multiplicar(double a, double b) {
        return a * b;
    }

  
    public static double dividir(double a, double b) {
        return a / b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double num1, num2;

        System.out.print("Digite o primeiro numero: ");
        num1 = sc.nextDouble();

        System.out.print("Digite o segundo numero: ");
        num2 = sc.nextDouble();

        System.out.println("\n===== RESULTADOS =====");

        System.out.println("Soma: " + somar(num1, num2));

        System.out.println("Subtracao: " + subtrair(num1, num2));

        System.out.println("Multiplicacao: " + multiplicar(num1, num2));

        if (num2 != 0) {
            System.out.println("Divisao: " + dividir(num1, num2));
        } else {
            System.out.println("Divisao: Nao e possivel dividir por zero!");
        }

        sc.close();
    }
}
