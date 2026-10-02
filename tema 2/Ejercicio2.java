import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double radio = 0.0;
        double altura = 0.0;
        double volumen = 0.0;

        System.out.println("Introduce el radio del cono:");
        radio = sc.nextDouble();

        System.out.println("Introduce la altura del cono:");
        altura = sc.nextDouble();

        volumen = (1.0 / 3.0) * 3.14 * radio * radio * altura;

        System.out.println("El volumen del cono es:");
        System.out.println(volumen);
    }
}