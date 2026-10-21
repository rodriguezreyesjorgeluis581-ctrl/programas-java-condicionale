import java.util.Scanner;

public class Programa3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== Evaluación de calificaciones con letras ===");
        System.out.print("Ingresa la calificación (0-100): ");
        double cal = sc.nextDouble();

        if (cal < 0 || cal > 100) {
            System.out.println("Error: la calificación debe estar entre 0 y 100.");
        } else {
            char letra;
            if (cal >= 90) {
                letra = 'A';
            } else if (cal >= 80) {
                letra = 'B';
            } else if (cal >= 70) {
                letra = 'C';
            } else if (cal >= 60) {
                letra = 'D';
            } else {
                letra = 'F';
            }
            System.out.println("Tu calificación es: " + letra);
        }
        sc.close();
    }
}
