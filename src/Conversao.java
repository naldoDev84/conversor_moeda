import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import config.Config;
import config.excesao.ExceptionConvertion;
import config.excesao.HttpStatusValidator;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Conversao {

    public void fazerConversao (String country1, String country2, String valor) throws IOException, InterruptedException {

        String valorValidado = ValidacaoValor.validarValor(valor);

        String apiKey = Config.getExchangeApiKey();

        URI url = URI.create("https://v6.exchangerate-api.com/v6/" + apiKey + "/pair/" + country1 + "/" + country2 + "/" + valorValidado);

        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(url)
                .build();
        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            int status = response.statusCode();
            HttpStatusValidator.validar(status);

            MoedaConversao moedaConvertida = gson.fromJson(response.body(), MoedaConversao.class);

            System.out.println("O valor em " + valorValidado + " " + moedaConvertida.base_code() +
                    " corresponde ao valor final de -> " + moedaConvertida.conversion_result() + " " + moedaConvertida.target_code());

        } catch (IOException e) {
            throw new RuntimeException("Erro na comunicação com a API", e);
        } catch (ExceptionConvertion e) {
            System.out.println("Erro na conversão" + e.getMessage());
        }
    }
}