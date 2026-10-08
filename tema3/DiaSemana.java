import java.util.Scanner;

public class DiaSemana {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

System.out.println("Introduce un día:");
String dia = teclado.next();

if (dia.equals("lunes")) {
    System.out.println("Programación");
} else if (dia.equals("martes")) {
    System.out.println("Sistemas Informáticos");
} else if (dia.equals("miércoles")) {
    System.out.println("Base de Datos");
} else if (dia.equals("jueves")) {
    System.out.println("Lenguajes de Marcas");
} else if (dia.equals("viernes")) {
    System.out.println("Entornos de Desarrollo");
} else {
    System.out.println("Día no válido");
}
    }
}