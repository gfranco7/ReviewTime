import java.util.Scanner;

public class Operadores_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el día: ");
        int dia = scanner.nextInt();

        System.out.print("Ingrese el mes: ");
        int mes = scanner.nextInt();

        System.out.print("Ingrese el año: ");
        int anio = scanner.nextInt();

        int[] diasPorMes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if (esBisiesto(anio)) {
            diasPorMes[1] = 29; 
        }

        dia++;

        if (dia > diasPorMes[mes - 1]) {
            dia = 1;
            mes++;

            if (mes > 12) {
                mes = 1;
                anio++;
            }
        }

        System.out.println("La fecha del día siguiente es: " + dia + " " + mes + " " + anio);

        scanner.close();
    }

    public static boolean esBisiesto(int anio) {
        if (anio % 4 == 0) {
            if (anio % 100 == 0) {
                return anio % 400 == 0;
            } else {
                return true;
            }
        }
        return false;
    }
}
