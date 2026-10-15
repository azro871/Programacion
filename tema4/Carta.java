import java.util.Scanner;

public class Carta {
    public static void main(String[] args) {

    

        int palo = (int) (Math.random() * 4.0);
        int valor = (int) (Math.random() * 13.0) + 1;

        Scanner sc = new Scanner(System.in);

        System.out.println("El palo de la baraja es: ");

        if (palo == 0)
            System.out.println("picas");
        else if (palo == 1)
            System.out.println("corazones");
        else if (palo == 2)
            System.out.println("diamantes");
        else
            System.out.println("tréboles");

        System.out.println("El valor de la carta es: " + valor);

        sc.close();
    }
}
