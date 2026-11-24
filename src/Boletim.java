
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] nomes = new String[4];
        double[][] notas = new double[4][3];

        String[] disciplinas = {
            "Logica", "Banco de Dados", "Redes"
        };

        double[] medias = new double[4];
        double maiorMedia = -1;
        int melhorAluno = 0;

        for (int i = 0; i < 4; i++) {
            System.out.print("\nNome do aluno: ");
            nomes[i] = sc.nextLine();

            for (int j = 0; j < 3; j++) {
                System.out.print("Nota de " + disciplinas[j] + ": ");
                notas[i][j] = sc.nextDouble();
            }
            sc.nextLine();
        }

        System.out.println("\n===== RESULTADO DOS ALUNOS =====");

        for (int i = 0; i < 4; i++) {
            double soma = 0;

            for (int j = 0; j < 3; j++) {
                soma += notas[i][j];
            }

            medias[i] = soma / 3;

            System.out.printf("%s - Media: %.2f",
                    nomes[i], medias[i]);

            if (medias[i] >= 7) {
                System.out.println(" - Aprovado");
            } else if (medias[i] >= 5) {
                System.out.println(" - Recuperacao");
            } else {
                System.out.println(" - Reprovado");
            }

            if (medias[i] > maiorMedia) {
                maiorMedia = medias[i];
                melhorAluno = i;
            }
        }

        System.out.println("\n===== MEDIA DAS DISCIPLINAS =====");

        for (int j = 0; j < 3; j++) {
            double soma = 0;

            for (int i = 0; i < 4; i++) {
                soma += notas[i][j];
            }

            double mediaDisciplina = soma / 4;

            System.out.printf("%s: %.2f\n",
                    disciplinas[j], mediaDisciplina);
        }


        System.out.println("\n===== MELHOR ALUNO =====");
        System.out.println("Aluno: " + nomes[melhorAluno]);
        System.out.printf("Maior media: %.2f\n", maiorMedia);

        sc.close();
    }
}
