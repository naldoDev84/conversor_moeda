import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
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

//        HttpClient client = HttpClient.newHttpClient();
//
//        HttpRequest request = HttpRequest.newBuilder()
//                .uri(URI.create("https://v6.exchangerate-api.com/v6/106045860db46a37920b971f/latest/USD"))
//                .build();
//
//        HttpResponse<String> response = client
//                .send(request, HttpResponse.BodyHandlers.ofString());
//        System.out.println(response.body());




    }
}