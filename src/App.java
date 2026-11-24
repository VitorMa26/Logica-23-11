
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int[] numeros = new int[10];
        int pares = 0;
        int impares = 0;
        int soma = 0;

       
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros[i] = entrada.nextInt();

            soma += numeros[i];

            if (numeros[i] % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }
        
        System.out.println("\n--- Resultados ---");
        System.out.println("Números digitados:");

        for (int i = 0; i < 10; i++) {
            System.out.println(numeros[i]);
        }

        System.out.println("Quantidade de pares: " + pares);
        System.out.println("Quantidade de ímpares: " + impares);
        System.out.println("Soma de todos os números: " + soma);

        entrada.close();
    }
}
