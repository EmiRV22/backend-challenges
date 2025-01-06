public class CurrencyConvert {
    private final ExchangeClient client;

    public CurrencyConvert(ExchangeClient client) {
        this.client = client;
    }

    public double convert(double amount, String baseCurrency, String targetCurrency) throws Exception {
        double rate = client.getExchangeRate(baseCurrency, targetCurrency);
        return amount * rate;
    }
}
