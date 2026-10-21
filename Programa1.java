import java.util.Scanner;

public class Programa1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== Calculadora de calificaciones finales ===");
        System.out.print("Calificación de parciales (0-100): ");
        double parciales = sc.nextDouble();
        System.out.print("Calificación del proyecto (0-100): ");
        double proyecto = sc.nextDouble();
        System.out.print("Calificación del examen final (0-100): ");
        double examen = sc.nextDouble();

        if (parciales < 0 || parciales > 100 || proyecto < 0 || proyecto > 100
                || examen < 0 || examen > 100) {
            System.out.println("Error: las calificaciones deben estar entre 0 y 100.");
        } else {
            double finalCal = parciales * 0.40 + proyecto * 0.30 + examen * 0.30;
            System.out.printf("Promedio final: %.2f%n", finalCal);
        }
        sc.close();
    }
}
