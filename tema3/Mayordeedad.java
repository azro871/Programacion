import java.util.Scanner;

public class Mayordeedad {
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          int edad = 0;
        
        System.out.println("Introduzca su edad");
        edad = sc.nextInt();

        if(edad >= 18)
            System.out.println("Es mayor de edad");
        else
            System.out.println("No es mayor de edad");
        sc.close();

    }
}
