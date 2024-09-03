import java.util.Scanner;

import model.Imovel;

public class App {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         gerarValorImovel(scanner);
     }
     public static void gerarValorImovel(Scanner scanner) {
        while (true) {
            System.out.println("Escolha o tipo de imóvel:");
            System.out.println("1 - Novo");
            System.out.println("2 - Velho");

            int tipoImovel = scanner.nextInt();


            switch (tipoImovel) {
                case 1:
                    Imovel imovelNovo = new Imovel(197000.00);
                    System.out.println("Você escolheu um imóvel novo.");
                    System.out.println("Valor do imóvel: R$" + imovelNovo.getValor());
                    return; // Termina o processo após exibir o valor

                case 2:
                    Imovel imovelVelho = new Imovel(155000.00);
                    System.out.println("Você escolheu um imóvel velho.");
                    System.out.println("Valor do imóvel: R$" + imovelVelho.getValor());
                    return; // Termina o processo após exibir o valor

                default:
                    System.out.println("Opção inválida. Por favor, inicie o processo novamente.");
                    // O loop continua para solicitar a entrada novamente
            }
        }
     }
}
