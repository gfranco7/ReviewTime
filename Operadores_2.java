import java.util.Scanner;

public class Operadores_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el año para calcular el domingo de Pascua: ");
        int year = scanner.nextInt();
        
        int A = year % 19;
        int B = year % 4;
        int C = year % 7;
        int D = (19 * A + 24) % 30;
        int E = (2 * B + 4 * C + 6 * D + 5) % 7;
        int N = 22 + D + E;

        if (N <= 31) {
            System.out.println("El domingo de Pascua para el año " + year + " es el " + N + " de marzo.");
        } else {
            System.out.println("El domingo de Pascua para el año " + year + " es el " + (N - 31) + " de abril.");
        }
        
        scanner.close();
    }
}
