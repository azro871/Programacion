import java.util.Scanner;

public class FtoC {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double celsius = 0.0;
        double farenheit = 0.0;

        System.out.println("Introduzca una temperatura en farenheit");

        farenheit = sc.nextDouble();

        celsius = 5.0 / 9 * (farenheit - 32);

        System.out.println("El resultado en celsius es = ");

        System.out.println(celsius);
    }
}