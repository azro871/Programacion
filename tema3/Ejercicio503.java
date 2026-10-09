import java.util.Scanner;

public class Ejercicio503 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la nota del primer control:");
        double nota1 = sc.nextDouble();

        System.out.println("Introduce la nota del segundo control:");
        double nota2 = sc.nextDouble();

        double media = (nota1 + nota2) / 2;

        if (media >= 5) {
            System.out.println("La nota del trimestre es: " + media);
        } else {
            System.out.println("¿Cual ha sido el resultado de la recuperacion? (apto/no apto)");
            int recuperacion = sc.nextInt();

            if (recuperacion == 1) {
                System.out.println("La nota del trimestre es: 5");
            } else {
                System.out.println("La nota del trimestre es: " + media);
            }
        }
    }
}