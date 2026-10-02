import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double mb = 0.0;
        double kb = 0.0;

        System.out.println("Introduce los Mb:");
        mb = sc.nextDouble();

        kb = mb * 1024;

        System.out.println("Los Kb son:");
        System.out.println(kb);
    }
}