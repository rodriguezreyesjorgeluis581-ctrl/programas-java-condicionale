import java.util.Scanner;

public class Programa7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== Conversor de monedas (desde pesos mexicanos) ===");
        System.out.print("Ingresa la cantidad en pesos mexicanos (MXN): ");
        double pesos = sc.nextDouble();

        System.out.println("Elige la moneda destino:");
        System.out.println("1. Dólar (USD)");
        System.out.println("2. Euro (EUR)");
        System.out.println("3. Baht (THB)");
        System.out.println("4. Yen (JPY)");
        System.out.println("5. Won (KRW)");
        System.out.println("6. Dólar Australiano (AUD)");
        System.out.println("7. Sol (PEN)");
        System.out.println("8. Dólar Canadiense (CAD)");
        System.out.println("9. Bolívar (VES)");
        System.out.println("10. Peso Argentino (ARS)");
        System.out.print("Opción: ");
        int opcion = sc.nextInt();

        // Tasas de ejemplo (1 MXN = X moneda). Actualízalas con el tipo de cambio del día.
        switch (opcion) {
            case 1:
                System.out.printf("%.2f MXN = %.2f USD%n", pesos, pesos * 0.054);
                break;
            case 2:
                System.out.printf("%.2f MXN = %.2f EUR%n", pesos, pesos * 0.050);
                break;
            case 3:
                System.out.printf("%.2f MXN = %.2f THB%n", pesos, pesos * 1.75);
                break;
            case 4:
                System.out.printf("%.2f MXN = %.2f JPY%n", pesos, pesos * 8.20);
                break;
            case 5:
                System.out.printf("%.2f MXN = %.2f KRW%n", pesos, pesos * 77.0);
                break;
            case 6:
                System.out.printf("%.2f MXN = %.2f AUD%n", pesos, pesos * 0.083);
                break;
            case 7:
                System.out.printf("%.2f MXN = %.2f PEN%n", pesos, pesos * 0.19);
                break;
            case 8:
                System.out.printf("%.2f MXN = %.2f CAD%n", pesos, pesos * 0.075);
                break;
            case 9:
                System.out.printf("%.2f MXN = %.2f VES%n", pesos, pesos * 13.0);
                break;
            case 10:
                System.out.printf("%.2f MXN = %.2f ARS%n", pesos, pesos * 78.0);
                break;
            default:
                System.out.println("Opción no válida.");
        }
        sc.close();
    }
}
