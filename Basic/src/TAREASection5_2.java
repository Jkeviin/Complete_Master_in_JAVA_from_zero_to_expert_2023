import java.util.InputMismatchException;
import java.util.Scanner;

public class TAREASection5_2 {
    public static void main(String[] args) {
        /*
        Pedir 20 notas finales de alumnos en una escala de 1 a 7, manejar decimales en las notas (double). Mostrar el promedio de las notas mayores a 5, promedio de notas inferiores a 4 y la cantidad de notas 1, ademas mostrar el promedio total.

            Ayuda: usar un bucle for que itere hasta 20 (notas) y dentro del ciclo pedir las notas una a una para realizar los cálculos (contadores, sumas).

            Opcional: si una de las notas ingresadas es 0 debe salirse del ciclo for y mostrar un mensaje de error finalizando el programa.
         */

        Scanner scanner = new Scanner(System.in);

        double notas = 0;

        double promedioMayores = 0;
        int contadorMayores = 0;
        double promedioMenores = 0;
        int contadorMenores = 0;

        double promediototal = 0;

        int notas1 = 0;

        boolean error = false;

        double resultadoMayores = 0;
        double resultadoMenores = 0;
        double resultadoTotal = 0;

        for (int i = 0; i < 20; i++) {
            System.out.println("Ingrese la nota " + i);
            notas = scanner.nextDouble();

            promediototal += notas;

            if (notas <= 0 || notas > 7) {
                error = true;
                break;
            }

            notas1 = notas == 1 ? notas1++ : notas1;

            if (notas > 5) {
                promedioMayores += notas;
                contadorMayores++;
            } else if (notas < 4) {
                promedioMenores += notas;
                contadorMenores++;
            }

        }

        if (error) {
            System.out.println("ERROR: Debes ingresar un numero mayor a 0 y menor a 7!!");
        } else {
            if (contadorMayores > 0) {
                resultadoMayores = promedioMayores / contadorMayores;
                System.out.println("El promedio de las notas mayores a 5 es: \"" + resultadoMayores);
            }
            if (contadorMenores > 0) {
                resultadoMenores = promedioMenores / contadorMenores;
                System.out.println("El promedio de las notas inferiores a 4 es: \"" + resultadoMenores);
            }

            System.out.println("La cantidad de notas 1 es: " + notas1);

            resultadoTotal = promediototal / 20;

            System.out.println("El promedio total es: " + resultadoTotal);


        }


    }
}
