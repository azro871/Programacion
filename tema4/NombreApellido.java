import java.util.Scanner;

public class NombreApellidos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce nombre y apellidos: ");
        String cadena = sc.nextLine();

        int posicion1 = cadena.indexOf(" ");
        int posicion2 = cadena.indexOf(" ", posicion1 + 1);

        String nombre = cadena.substring(0, posicion1);
        String apellido1 = cadena.substring(posicion1 + 1, posicion2);
        String apellido2 = cadena.substring(posicion2 + 1);

        System.out.println("Nombre: " + nombre);
        System.out.println("Primer apellido: " + apellido1);
        System.out.println("Segundo apellido: " + apellido2);

        sc.close();
    }
}
