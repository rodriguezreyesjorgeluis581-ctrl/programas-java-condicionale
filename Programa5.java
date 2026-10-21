import java.util.Scanner;

public class Programa5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== Estación del año ===");
        System.out.print("Ingresa el número de mes (1-12): ");
        int mes = sc.nextInt();

        switch (mes) {
            case 12:
            case 1:
            case 2:
                System.out.println("Estación: Invierno");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Estación: Primavera");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Estación: Verano");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Estación: Otoño");
                break;
            default:
                System.out.println("Mes no válido. Ingresa un número del 1 al 12.");
        }
        sc.close();
    }
}
