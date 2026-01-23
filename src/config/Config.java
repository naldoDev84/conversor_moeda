package config;
import io.github.cdimascio.dotenv.Dotenv;

public final class Config {

    private static final Dotenv env = Dotenv.load();

    public static String getExchangeApiKey(){
        String apiKey = env.get("EXCHANGE_API_KEY");

        if (apiKey == null || apiKey.isBlank()){
            throw new IllegalStateException("Exchange API Key não configurada no .env");
        }

        return apiKey.trim();
    }
}
