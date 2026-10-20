import java.util.Scanner;

public class NombreApellidos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce nombre y apellidos: ");
        String cadena = sc.nextLine();

        int espacio1 = cadena.indexOf(" ");
        int espacio2 = cadena.indexOf(" ", espacio1 + 1);

        String nombre = cadena.substring(0, espacio1);
        String apellido1 = cadena.substring(espacio1 + 1, espacio2);
        String apellido2 = cadena.substring(espacio2 + 1);

        System.out.println("Nombre: " + nombre);
        System.out.println("Primer apellido: " + apellido1);
        System.out.println("Segundo apellido: " + apellido2);

        sc.close();
    }
}