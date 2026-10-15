import java.util.Scanner;

public class Linea {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero = (int) (Math.random() * 6);

        if (numero == 0)
            System.out.println("*****");
        else if (numero == 1)
            System.out.println("-----");
        else if (numero == 2)
            System.out.println("=====");
        else if (numero == 3)
            System.out.println(".....");
        else if (numero == 4)
            System.out.println("|||||");
        else
            System.out.println("@@@@@");

        sc.close();
    }
}