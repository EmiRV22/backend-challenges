import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class ExchangeClient {

    private static final String BASE_URL = "https://v6.exchangerate-api.com/v6/";
    private final String apiKey;

    public ExchangeClient(String apiKey) {
        this.apiKey = apiKey;
    }

    public double getExchangeRate(String baseCurrency, String targetCurrency) throws Exception {

        String urlStr = BASE_URL + apiKey + "/latest/" + baseCurrency;
        URL url = new URL(urlStr);
        HttpURLConnection request = (HttpURLConnection) url.openConnection();
        request.connect();

        // Parsear
        JsonParser jp = new JsonParser();
        JsonElement root = jp.parse(new InputStreamReader((InputStream) request.getContent()));
        JsonObject jsonobj = root.getAsJsonObject();

        String result = jsonobj.get("result").getAsString();
        if (!"success".equals(result)) {
            throw new RuntimeException("API request failed: " + result);
        }

        JsonObject conversionRates = jsonobj.getAsJsonObject("conversion_rates");
        if (!conversionRates.has(targetCurrency)) {
            throw new IllegalArgumentException("Target currency not found: " + targetCurrency);
        }

        return conversionRates.get(targetCurrency).getAsDouble();
    }
}
