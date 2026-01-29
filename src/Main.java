import config.excesao.ExceptionConvertion;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) throws IOException, InterruptedException {
        final Logger log = LoggerFactory.getLogger(Main.class);
        Scanner scan = new Scanner(System.in);
        int opcao = 1;
        String valor = "0";

        System.out.println("""
                1) Listar operações
                2) Real Brasileiro -> Dólar Americano
                3) Dólar Americano -> Real Brasileiro
                4) Dólar Americano -> Peso Argentino
                5) Real Brasileiro -> Peso Argentino
                6) Peso Argentino -> Dólar Americano
                7) Real Brasileiro -> Iene Japonês
                8) Iene Japonês -> Dólar Americano
                0) Sair
                """);

        GerenciadorConversao gerenciadorConversao = new GerenciadorConversao();


        Conversao conversao = new Conversao();

        HistoricoTransacoes historicoTransacoes = new HistoricoTransacoes();

        while (opcao != 0) {
            System.out.println("Digite uma opção: ");
            opcao = scan.nextInt();

            if (opcao == 0){
                log.info("Saindo do programa!");
                break;
            } else  if (opcao > 1 && opcao <= 8){
                System.out.println("Digite um valor: ");
                valor = scan.next();
            }

            try {
                switch (opcao) {
                    case 1:
                        gerenciadorConversao.listarTransacoes();
                        break;
                    case 2:
                        gerenciadorConversao.executarConversao("BRL", "USD", valor);
                        break;
                    case 3:
                        gerenciadorConversao.executarConversao("USD", "BRL", valor);
                        break;
                    case 4:
                        gerenciadorConversao.executarConversao("USD", "ARS", valor);
                        break;
                    case 5:
                        gerenciadorConversao.executarConversao("BRL", "ARS", valor);
                        break;
                    case 6:
                        gerenciadorConversao.executarConversao("ARS", "USD", valor);
                        break;
                    case 7:
                        gerenciadorConversao.executarConversao("BRL",  "JPY", valor);
                        break;
                    case 8:
                        gerenciadorConversao.executarConversao("JPY", "USD", valor);
                        break;
                    default:
                        System.out.println("Opção inválida");
                        break;
                }

            } catch (ExceptionConvertion | IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}