
import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static int[] lerVetor() {
        int[] v = new int[6];

        for (int i = 0; i < 6; i++) {
            System.out.print("Digite o " + (i + 1) + " numero: ");
            v[i] = sc.nextInt();
        }

        return v;
    }

    public static void mostrar(int[] v) {
        System.out.println("\nElementos do vetor:");

        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i] + " ");
        }

        System.out.println();
    }

    public static int somar(int[] v) {
        int soma = 0;

        for (int i = 0; i < v.length; i++) {
            soma += v[i];
        }

        return soma;
    }

    public static double media(int[] v) {
        return (double) somar(v) / v.length;
    }

    public static int maior(int[] v) {
        int maior = v[0];

        for (int i = 1; i < v.length; i++) {
            if (v[i] > maior) {
                maior = v[i];
            }
        }

        return maior;
    }

    public static int contar(int[] v, int valor) {
        int quantidade = 0;

        for (int i = 0; i < v.length; i++) {
            if (v[i] == valor) {
                quantidade++;
            }
        }

        return quantidade;
    }

    public static void main(String[] args) {

        int[] vetor = lerVetor();

        mostrar(vetor);

        System.out.println("Soma: " + somar(vetor));

        System.out.println("Media: " + media(vetor));

        System.out.println("Maior valor: " + maior(vetor));

        System.out.print("\nDigite um valor para contar: ");
        int valor = sc.nextInt();

        System.out.println("Quantidade de vezes que aparece: "
                + contar(vetor, valor));

        sc.close();
    }
}
