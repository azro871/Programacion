import java.util.Scanner;

public class Menor {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce el primer número:");
        double num1 = teclado.nextDouble();

        System.out.println("Introduce el segundo número:");
        double num2 = teclado.nextDouble();

        System.out.println("Introduce el tercer número:");
        double num3 = teclado.nextDouble();

        double menor = num1;

        if (num2 < menor) {
            menor = num2;
        }

        if (num3 < menor) {
            menor = num3;
        }

        System.out.println("El número más pequeño es: " + menor);
    }
}
