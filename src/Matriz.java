
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int[][] matriz = new int[4][3];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Digite o valor da posição [" + i + "][" + j + "]: ");
                matriz[i][j] = entrada.nextInt();
            }
        }

        int maior = matriz[0][0];
        int menor = matriz[0][0];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {

                if (matriz[i][j] > maior) {
                    maior = matriz[i][j];
                }

                if (matriz[i][j] < menor) {
                    menor = matriz[i][j];
                }
            }
        }

        System.out.println("\nMaior elemento: " + maior);
        System.out.println("Menor elemento: " + menor);

        entrada.close();
    }
}
