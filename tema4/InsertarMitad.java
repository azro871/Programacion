import java.util.Scanner;

public class InsertarMitad {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String cadena;

        System.out.print("Introduce una cadena: ");
        cadena = sc.nextLine();

        int mitad = cadena.length() / 2;

        System.out.println(cadena.substring(0, mitad) + "<>" + cadena.substring(mitad));

        sc.close();
    }
}