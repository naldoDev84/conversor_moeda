import java.io.IOException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scan = new Scanner(System.in);



        System.out.println("""
                1) Real Brasileiro -> Dólar Americano
                2) Dólar Americano -> Real Brasileiro
                3) Dólar -> Peso Argentino
                4) Real Brasileiro -> Peso Argentino
                5) Peso Argentino -> Dólar Americano
                6) Real Brasileiro -> Yen Japonês
                7) Yen Japonês -> Dólar Americano
                0) Sair
                """);

        Conversao conversao = new Conversao();


        System.out.println("Digite uma opção: ");
        int opcao = scan.nextInt();

        System.out.println("Digite um valor: ");
        String valor = scan.next();

        switch (opcao) {
            case 1:
                conversao.fazerConversao("BRL", "USD", valor);
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
                break;
            default:
        }
    }
}