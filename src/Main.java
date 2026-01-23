import java.io.IOException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scan = new Scanner(System.in);
        int opcao = 1;

        System.out.println("""
                1) Real Brasileiro -> Dólar Americano
                2) Dólar Americano -> Real Brasileiro
                3) Dólar Americano -> Peso Argentino
                4) Real Brasileiro -> Peso Argentino
                5) Peso Argentino -> Dólar Americano
                6) Real Brasileiro -> Iene Japonês
                7) Iene Japonês -> Dólar Americano
                0) Sair
                """);

        Conversao conversao = new Conversao();

        while (opcao != 0) {
            System.out.println("Digite uma opção: ");
            opcao = scan.nextInt();

            if (opcao == 0){
                System.out.println("Saindo do programa!");
                break;
            }

            System.out.println("Digite um valor: ");
            String valor = scan.next();

            switch (opcao) {
                case 1:
                    conversao.fazerConversao("BRL", "USD", valor);
                    break;
                case 2:
                    conversao.fazerConversao("USD", "BRL", valor);
                    break;
                case 3:
                    conversao.fazerConversao("USD", "ARS", valor);
                    break;
                case 4:
                    conversao.fazerConversao("BRL", "ARS", valor);
                    break;
                case 5:
                    conversao.fazerConversao("ARS", "USD", valor);
                    break;
                case 6:
                    conversao.fazerConversao("BRL", "JPY", valor);
                    break;
                case 7:
                    conversao.fazerConversao("JPY", "USD", valor);
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        }
    }
}