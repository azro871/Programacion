import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double salarioSemanal = 0.0;
        double salarioHora = 12.0;
        double horasTrabajadas;

        System.out.println("Introduce las horas trabajadas:");
        horasTrabajadas = sc.nextDouble();

        salarioSemanal = salarioHora * horasTrabajadas;

        System.out.println("El salario semanal es:");
        System.out.println(salarioSemanal);
    }
}