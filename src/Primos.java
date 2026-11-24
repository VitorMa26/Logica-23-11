
import java.util.Scanner;

public class Main {

    public static boolean ehPrimo(int n) {

        if (n <= 1) {
            return false;
        }

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static int[] filtrarPrimos(int[] v) {

        int quantidade = 0;


        for (int i = 0; i < v.length; i++) {
            if (ehPrimo(v[i])) {
                quantidade++;
            }
        }

        int[] primos = new int[quantidade];

        int posicao = 0;


        for (int i = 0; i < v.length; i++) {
            if (ehPrimo(v[i])) {
                primos[posicao] = v[i];
                posicao++;
            }
        }

        return primos;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[8];

  
        for (int i = 0; i < 8; i++) {
            System.out.print("Digite o " + (i + 1) + " numero: ");
            numeros[i] = sc.nextInt();
        }


        int[] primos = filtrarPrimos(numeros);


        System.out.println("\nNumeros primos:");

        for (int i = 0; i < primos.length; i++) {
            System.out.print(primos[i] + " ");
        }

        if (primos.length == 0) {
            System.out.println("Nenhum numero primo encontrado.");
        }

        sc.close();
    }
}
