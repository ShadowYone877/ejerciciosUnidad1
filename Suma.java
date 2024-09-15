import java.util.Scanner;

public class Suma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer numero: ");
        double num1 = scanner.nextDouble();

        
        System.out.print("Ingrese el segundo número: ");
        double num2 = scanner.nextDouble();

        double suma = num1 + num2;

        System.out.println("El resultado es: " + suma);

        scanner.close();
    }
}
