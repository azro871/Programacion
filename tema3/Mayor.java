import java.util.Scanner;

public class Mayor {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a, b;

        System.out.println("Introduzca el numero uno:");
        a = sc.nextInt();

        System.out.println("Introduzca el numero dos:");
        b = sc.nextInt();

        if (a > b)
            System.out.println("El mayor es el primero");
        else if (a < b)
            System.out.println("El mayor es el segundo");
        else
            System.out.println("Son iguales");

        sc.close();
    }
}