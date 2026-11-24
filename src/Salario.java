
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double[] salarios = new double[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o salário do funcionário " + (i + 1) + ": R$ ");
            salarios[i] = entrada.nextDouble();

        
            if (salarios[i] < 2000) {
                salarios[i] = salarios[i] * 1.10;
            }
        }

        System.out.println("\n--- Salários Atualizados ---");

        for (int i = 0; i < 5; i++) {
            System.out.printf("Funcionário %d: R$ %.2f%n",
                    (i + 1), salarios[i]);
        }

        entrada.close();
    }
}
