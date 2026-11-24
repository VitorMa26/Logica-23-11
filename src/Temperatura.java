
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String[] dias = {
            "Domingo", "Segunda-feira", "Terça-feira",
            "Quarta-feira", "Quinta-feira",
            "Sexta-feira", "Sábado"
        };

        double[] temperaturas = new double[7];
        double soma = 0;
        double maiorTemperatura;
        int diaMaisQuente = 0;

        for (int i = 0; i < 7; i++) {
            System.out.print("Digite a temperatura de " + dias[i] + ": ");
            temperaturas[i] = entrada.nextDouble();

            soma += temperaturas[i];
        }

        double media = soma / 7;

        maiorTemperatura = temperaturas[0];

        for (int i = 1; i < 7; i++) {
            if (temperaturas[i] > maiorTemperatura) {
                maiorTemperatura = temperaturas[i];
                diaMaisQuente = i;
            }
        }
        
        System.out.printf("%nMédia das temperaturas: %.2f°C%n", media);

        System.out.println("\nDias acima da média:");

        for (int i = 0; i < 7; i++) {
            if (temperaturas[i] > media) {
                System.out.println(dias[i] + ": " + temperaturas[i] + "°C");
            }
        }

        System.out.println("\nDia mais quente: " + dias[diaMaisQuente]);
        System.out.println("Temperatura: " + maiorTemperatura + "°C");

        entrada.close();
    }
}
