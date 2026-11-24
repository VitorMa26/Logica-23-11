
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] matriz = new int[4][4];
        int principal = 0;
        int secundaria = 0;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Digite o valor [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }

        System.out.println("\nMatriz 4x4:");

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        for (int i = 0; i < 4; i++) {
            principal += matriz[i][i];
            secundaria += matriz[i][3 - i];
        }

        System.out.println("\nSoma da diagonal principal: " + principal);
        System.out.println("Soma da diagonal secundaria: " + secundaria);

        sc.close();
    }
}
