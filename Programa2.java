import java.util.Scanner;

public class Programa2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== Verificar edad para votar ===");
        System.out.print("Ingresa tu edad: ");
        int edad = sc.nextInt();

        if (edad < 0) {
            System.out.println("Edad no válida.");
        } else if (edad >= 18) {
            System.out.println("Eres elegible para votar.");
        } else {
            System.out.println("No eres elegible para votar. Te faltan "
                    + (18 - edad) + " año(s).");
        }
        sc.close();
    }
}
