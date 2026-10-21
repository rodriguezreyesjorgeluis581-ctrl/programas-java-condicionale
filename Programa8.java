import java.util.Scanner;

public class Programa8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== Brindar información: Películas ===");
        System.out.println("1. Interestelar");
        System.out.println("2. El Rey León");
        System.out.println("3. Coco");
        System.out.println("4. Inception");
        System.out.println("5. Toy Story");
        System.out.print("Elige una película (1-5): ");
        int opcion = sc.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Interestelar (2014) - Dir. Christopher Nolan. Ciencia ficción.");
                break;
            case 2:
                System.out.println("El Rey León (1994) - Animación de Disney sobre el joven Simba.");
                break;
            case 3:
                System.out.println("Coco (2017) - Pixar. Un niño viaja a la Tierra de los Muertos.");
                break;
            case 4:
                System.out.println("Inception (2010) - Dir. Christopher Nolan. Robo de ideas en los sueños.");
                break;
            case 5:
                System.out.println("Toy Story (1995) - Primer largometraje animado por computadora.");
                break;
            default:
                System.out.println("Opción no válida.");
        }
        sc.close();
    }
}
