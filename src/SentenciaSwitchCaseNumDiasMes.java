import java.util.InputMismatchException;
import java.util.Scanner;

public class SentenciaSwitchCaseNumDiasMes {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int mes = 0;
        int anio = 0;
        int numeroDias = 0;

        try {
            System.out.println("Ingrese el numero del mes del 1 - 12");
            mes = s.nextInt();

            if (mes < 1 || mes > 12) {
                System.out.println("ERROR");
                main(args);
                System.exit(0);
            }

            System.out.println("Ingrese el año (YYYY)");
            anio = s.nextInt();

        } catch (InputMismatchException e) {
            System.out.println("ERROR");
            main(args);
            System.exit(0);
        }

        switch (mes) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                numeroDias = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                numeroDias = 30;
                break;
            case 2:
                if(anio % 400 == 0 || ( (anio % 4 == 0) && !(anio % 100 == 0))) { // Lógica si es año bisiesto o no
                    numeroDias = 29;
                } else {
                    numeroDias = 28;
                }
                break;
            default:
                numeroDias = 0;
        }

        System.out.println("numeroDias = " + numeroDias);
    }
}
