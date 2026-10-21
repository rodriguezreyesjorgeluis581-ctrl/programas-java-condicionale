import java.util.Scanner;

public class Programa4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== Cálculo de precio con descuento ===");
        System.out.print("Ingresa el precio original: ");
        double precio = sc.nextDouble();

        if (precio < 0) {
            System.out.println("Error: el precio no puede ser negativo.");
        } else {
            double descuento;
            if (precio <= 100) {
                descuento = 0;
            } else if (precio <= 200) {
                descuento = 0.10;
            } else if (precio <= 500) {
                descuento = 0.20;
            } else {
                descuento = 0.25;
            }
            double monto = precio * descuento;
            double precioFinal = precio - monto;
            System.out.printf("Descuento aplicado: %.0f%%%n", descuento * 100);
            System.out.printf("Monto descontado: $%.2f%n", monto);
            System.out.printf("Precio final: $%.2f%n", precioFinal);
        }
        sc.close();
    }
}
