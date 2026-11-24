
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double[] notas = new double[5];
        double soma = 0;
        int aprovados = 0;
        int reprovados = 0;

       
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite a nota do aluno " + (i + 1) + ": ");
            notas[i] = entrada.nextDouble();

            soma += notas[i];

            if (notas[i] >= 7) {
                aprovados++;
            } else {
                reprovados++;
            }
        }
        
        double media = soma / 5;
        System.out.println("\n--- Resultado da Turma ---");
        System.out.println("Média da turma: " + media);
        System.out.println("Alunos aprovados: " + aprovados);
        System.out.println("Alunos reprovados: " + reprovados);

        entrada.close();
    }
}
