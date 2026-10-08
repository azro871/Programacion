import java.util.Scanner;

public class Ejercicio303 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el día:");
        int dia = sc.nextInt();

        System.out.println("Introduce el mes:");
        int mes = sc.nextInt();

        if (mes == 9 && dia <= 22) {
            System.out.println("Virgo");
        } else if (mes == 9 && dia > 22) {
            System.out.println("Libra");
        } else if (mes == 10 && dia <= 22) {
            System.out.println("Libra");
        } else if (mes == 10 && dia > 22) {
            System.out.println("Escorpio");
        } else if (mes == 11 && dia <= 21) {
            System.out.println("Escorpio");
        } else if (mes == 11 && dia > 21) {
            System.out.println("Sagitario");
        } else if (mes == 12 && dia <= 21) {
            System.out.println("Sagitario");
        } else {
            System.out.println("Capricornio");
        }
    }
}