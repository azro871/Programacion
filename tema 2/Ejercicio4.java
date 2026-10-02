import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double kb = 0.0;
        double mb = 0.0;

        System.out.println("Introduce los Kb:");
        kb = sc.nextDouble();

        mb = kb / 1024;

        System.out.println("Los Mb son:");
        System.out.println(mb);
    }
}