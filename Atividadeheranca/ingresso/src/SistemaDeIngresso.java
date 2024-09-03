import java.util.Scanner;

import model.Ingresso;
import model.IngressoVip;

public class SistemaDeIngresso {
    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);
        gerarIngresso(scanner);
    }
     public static void gerarIngresso(Scanner scanner) {
        //mensagem para usuário escolher o tipo de ingresso
        System.out.println("Escolha o tipo de ingresso:");
        System.out.println("1 - Normal");
        System.out.println("2 - VIP");

        int tipoIngresso = scanner.nextInt();

        switch (tipoIngresso) {
            case 1:
                Ingresso ingressoNormal = new Ingresso(40);
                System.out.println(ingressoNormal);
                break;

            case 2:
            //mensagem para usuário escolher o tipo decamarote
                System.out.println("Você escolheu o ingresso VIP.");
                System.out.println("Escolha o tipo de camarote:");
                System.out.println("1 - Camarote Superior");
                System.out.println("2 - Camarote Inferior");

                int tipoCamarote = scanner.nextInt();

                IngressoVip ingressoVIP = null;
                switch (tipoCamarote) {
                    case 1:
                        ingressoVIP = new IngressoVip(60, "Camarote Superior");
                        break;

                    case 2:
                        ingressoVIP = new IngressoVip(50, "Camarote Inferior");
                        break;

                    default:
                    // iniciar o processo novamente
                        System.out.println("Opção inválida para o tipo de camarote. Por favor, inicie o processo novamente.");
                        gerarIngresso(scanner); 
                        return;
                }
                System.out.println(ingressoVIP);
                break;

            default:
            //iniciar o processo novamente
                System.out.println("Opção inválida para o tipo de ingresso. Por favor, inicie o processo novamente.");
                gerarIngresso(scanner); 
                return;
        }
    }
}
