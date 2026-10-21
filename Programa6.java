import java.util.Scanner;

public class Programa6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== Convertidor de grados ===");
        System.out.print("Ingresa la temperatura en grados Celsius: ");
        double celsius = sc.nextDouble();

        System.out.println("Elige la conversión:");
        System.out.println("1. Celsius a Fahrenheit");
        System.out.println("2. Celsius a Kelvin");
        System.out.print("Opción: ");
        int opcion = sc.nextInt();

        switch (opcion) {
            case 1:
                double fahrenheit = celsius * 9 / 5 + 32;
                System.out.printf("%.2f °C = %.2f °F%n", celsius, fahrenheit);
                break;
            case 2:
                double kelvin = celsius + 273.15;
                System.out.printf("%.2f °C = %.2f K%n", celsius, kelvin);
                break;
            default:
                System.out.println("Opción no válida.");
        }
        sc.close();
    }
}
