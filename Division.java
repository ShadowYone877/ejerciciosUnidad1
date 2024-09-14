import java.util.Scanner;
class Division{
public static void main (String []arcs){

    Scanner sc = new Scanner(System.in);
    double num1, num2, resultado;

    System.out.println("---Division---");
    System.out.println("Ingresa un el primer número: ");
    num1=sc.nextDouble();

    System.out.println("Ingresa el segundo número: ");
    num2=sc.nextDouble();

    resultado= num1/num2;

    System.out.println("El resultado de la division es: " +resultado);

}
}