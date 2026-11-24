
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double[][] notas = new double[3][2];
        double totalGeral = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("Digite a nota do aluno " + (i + 1) +
                                 " na disciplina " + (j + 1) + ": ");
                notas[i][j] = entrada.nextDouble();
            }
        }

        for (int i = 0; i < 3; i++) {
            double somaAluno = 0;

            for (int j = 0; j < 2; j++) {
                somaAluno += notas[i][j];
            }

            System.out.println("Soma das notas do aluno " +
                               (i + 1) + ": " + somaAluno);

            totalGeral += somaAluno;
        }

        System.out.println("\nTotal geral das notas: " + totalGeral);

        entrada.close();
    }
}
