import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Crear una instancia de CreditCard con un límite inicial y crédito
        CreditCard creditCard = new CreditCard(5000.0, 3000.0, null);
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Mostrar menú de opciones
            System.out.println("\n--- Menú ---");
            System.out.println("1. Realizar una compra");
            System.out.println("2. Ver información de la tarjeta");
            System.out.println("3. Ver historial de compras");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");

            int option = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer del scanner

            switch (option) {
                case 1:
                    // Realizar una compra
                    System.out.print("Ingrese el valor de la compra: ");
                    double value = scanner.nextDouble();
                    scanner.nextLine(); // Limpiar el buffer

                    // Mostrar opciones de descripción
                    System.out.println("\nSeleccione una descripción para la compra:");
                    System.out.println("1. Comida");
                    System.out.println("2. Ropa");
                    System.out.println("3. Entretenimiento");
                    System.out.println("4. Transporte");
                    System.out.println("5. Otra (Ingrese una descripción personalizada)");
                    System.out.print("Seleccione una opción: ");

                    int descriptionOption = scanner.nextInt();
                    scanner.nextLine(); // Limpiar el buffer
                    String description;

                    switch (descriptionOption) {
                        case 1:
                            description = "Comida";
                            break;
                        case 2:
                            description = "Ropa";
                            break;
                        case 3:
                            description = "Entretenimiento";
                            break;
                        case 4:
                            description = "Transporte";
                            break;
                        case 5:
                            System.out.print("Ingrese una descripción personalizada: ");
                            description = scanner.nextLine();
                            break;
                        default:
                            System.out.println("Opción no válida. Se usará 'Sin descripción'.");
                            description = "Sin descripción";
                    }

                    Buy buy = new Buy(value, description);
                    boolean successful = creditCard.sendBuy(buy);

                    if (successful) {
                        System.out.println("Compra realizada con éxito.");
                    } else {
                        System.out.println("Fondos insuficientes para realizar esta compra.");
                    }
                    break;

                case 2:
                    // Mostrar información de la tarjeta
                    System.out.println("\n--- Información de la tarjeta ---");
                    System.out.println("Límite: $" + creditCard.getLimit());
                    System.out.println("Crédito disponible: $" + creditCard.getCredit());
                    break;

                case 3:
                    // Mostrar historial de compras
                    System.out.println("\n--- Historial de compras ---");
                    if (creditCard.getShoppingList().isEmpty()) {
                        System.out.println("No hay compras registradas.");
                    } else {
                        for (Buy registeredBuy : creditCard.getShoppingList()) {
                            System.out.println(registeredBuy);
                        }
                    }
                    break;

                case 4:
                    // Salir del programa
                    System.out.println("¡Gracias por usar la aplicación! Adiós.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opción no válida. Por favor, intente de nuevo.");
            }
        }
    }
}
