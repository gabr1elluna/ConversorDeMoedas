import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Real (BRL), Dólar (USD), Euro (EUR), Libra Esterlina (GBP)

        Scanner userInput = new Scanner(System.in);
        boolean stopSession = false;

        do {
            System.out.println(
                    """
                            -----------------------------------------------------------------------------------
                            |                               CONVERSOR DE MOEDAS                               |
                            |                                                                                 |
                            |                  Selecione uma opção abaixo:                                    |
                            |                                                                                 |
                            |                  1) Dólar --> Real Brasileiro                                   |
                            |                  2) Dólar --> Euro                                              |
                            |                  3) Dólar --> Libra Esterlina                                   |
                            |                  4) Real Brasileiro --> Dólar                                   |
                            |                  5) Real Brasileiro --> Euro                                    |
                            |                  6) Real Brasileiro --> Libra Esterlina                         |
                            |                  7) Finalizar Sessão                                            |
                            |                                                                                 |
                            -----------------------------------------------------------------------------------
                    """);
        } while (!stopSession) {
            String option = userInput.nextLine();

            switch (option) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    System.out.println("Finalizando sessão...");
                    stopSession = true;
                    break;
                default:
                    System.out.println("Essa opção não está disponível no catálogo.\nTente novamente outra opção!");
                    break;
            }
        }
    }
}

