import java.util.Scanner;

public class DiaSemana {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

System.out.println("Introduce un día:");
String dia = teclado.next();

if (("lunes")) {
    System.out.println("Toca a primera hora Lenguaje Marcas");
} else if (("martes")) {
    System.out.println("Base de Datos");
} else if (("miércoles")) {
    System.out.println("Toca a primera hora Sistemas informaticas");
} else if (("jueves")) {
    System.out.println("Toca a primera hora Programacion");
} else if (("viernes")) {
    System.out.println("Toca a primera hora Entornos de desarrollo");
} else {
    System.out.println("Toca a primera hora Día no válido");
}
    }
}
