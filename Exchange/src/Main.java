import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {

            String apiKey = "7e6a61dbf87dc687c3259704"; // APIKEY obtenida de la muestra de ExchangeRate
            ExchangeClient client = new ExchangeClient(apiKey);
            CurrencyConvert converter = new CurrencyConvert(client);

            // Scanner para leer entradas del usuario
            Scanner scanner = new Scanner(System.in);

            // Solicitar la cantidad
            System.out.print("Enter amount in USD: ");
            double amount = scanner.nextDouble();

            // Divisas soportadas
            System.out.println("Supported target currencies:");
            System.out.println("- EUR (Euro)");
            System.out.println("- GBP (British Pound)");
            System.out.println("- MXN (Mexican Peso)");
            System.out.println("- BRL (Brazilian Real)");
            System.out.println("- VES (Venezuelan Bolívar)");
            System.out.println("- COP (Colombian Peso)");
            System.out.print("Enter target currency: ");
            String targetCurrency = scanner.next().toUpperCase();

            // Conversión
            double result = converter.convert(amount, "USD", targetCurrency);

            System.out.printf("Result: %.2f %s%n", result, targetCurrency);
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
