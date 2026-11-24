
    import java.util.Scanner;

    public class Main {
        public static void main(String[] args) {
            Scanner entrada = new Scanner(System.in);

            String[] nomes = new String[6];
            String busca;
            boolean encontrado = false;

            for (int i = 0; i < 6; i++) {
                System.out.print("Digite o " + (i + 1) + "º nome: ");
                nomes[i] = entrada.nextLine();
            }

            System.out.print("\nDigite o nome que deseja buscar: ");
            busca = entrada.nextLine();

            System.out.println("\n--- Resultado da busca ---");

            for (int i = 0; i < 6; i++) {
                if (nomes[i].equalsIgnoreCase(busca)) {
                    System.out.println("Nome encontrado na posição: " + i);
                    encontrado = true;
                }
            }

            if (!encontrado) {
                System.out.println("Nome não encontrado!");
            }

            entrada.close();
        }
    }
