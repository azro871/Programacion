import java.util.Scanner;

public class Capicua {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un numero entero positivo de hasta 5 cifras:");
        int numero = teclado.nextInt();

        int original = numero;
        int invertido = 0;

        while (numero > 0) {
            int digito = numero % 10;
            invertido = invertido * 10 + digito;
            numero = numero / 10;
        }

        if (original == invertido) {
            System.out.println("El numero es capicua");
        } else {
            System.out.println("El numero no es capicua");
        }
    }
}