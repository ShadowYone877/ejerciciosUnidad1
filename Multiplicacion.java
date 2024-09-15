import java.util.Scanner;

public class Multiplicacion {
public static void main(String[] args) {
Scanner sn = new Scanner(System.in);
int n1, n2;
System.out.print("Ingrese primer valor:");
n1 = sn.nextInt();
System.out.println("Ingrese segundo valor:");
n2 = sn.nextInt();

System.out.println("La multiplicación es :"+n1*n2);
}
}