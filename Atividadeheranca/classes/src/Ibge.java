import java.util.Scanner;
import model.Rica;
import model.Pobre;
import model.Miseravel;

public class Ibge {
    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);
        ValorDaCategoria(scanner);
    }

    public static void ValorDaCategoria(Scanner scanner) {
        while (true) {
            System.out.println("Escolha uma categoria:");
            System.out.println("1 - Rica");
            System.out.println("2 - Pobre");
            System.out.println("3 - Miserável");

            int escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    Rica rica = new Rica();
                    System.out.println("Você escolheu a categoria Rica.");
                    System.out.println(rica);
                    return; // Termina o processo após exibir o valor

                case 2:
                    Pobre pobre = new Pobre();
                    System.out.println("Você escolheu a categoria Pobre.");
                    System.out.println(pobre);
                    return; // Termina o processo após exibir o valor

                case 3:
                    Miseravel miseravel = new Miseravel();
                    System.out.println("Você escolheu a categoria Miserável.");
                    System.out.println(miseravel);
                    return; // Termina o processo após exibir o valor

                default:
                    System.out.println("Opção inválida. Por favor, inicie o processo novamente.");
                    // O loop continua para solicitar a entrada novamente
            }
        }
    }
}
