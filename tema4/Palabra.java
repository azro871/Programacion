import java.util.Scanner;

public class Palabra {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String mayuscula = "";
        String minuscula = "";
        int contador = 0;
        int numM = 0;
        int numN = 0;
        char caracter;

        while (contador < 5) {

            // Generamos el codigo ASCII en mayuscula
            numM = (int) (65 + Math.random() * 26);
            caracter = (char) numM;

            // Concatenamos el caracter a la cadena
            mayuscula = mayuscula + caracter;

            // Calculamos el codigo en minuscula, sumando 32
            numN = numM + 32;

            // Convertimos el codigo en minuscula
            caracter = (char) numN;

            // Concatenamos el caracter a la cadena
            minuscula = minuscula + caracter;

            contador++;
        }

        System.out.println(mayuscula);
        System.out.println(minuscula);

        sc.close();
    }
}
