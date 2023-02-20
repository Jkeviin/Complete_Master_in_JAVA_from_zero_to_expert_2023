import java.util.Scanner;

public class TAREASection12_2 {

    /*
    Escriba un programa que imprima el número más alto de un arreglo de 7 elementos (de rango 11 a 99), por ejemplo {14, 33, 15, 36, 78, 21, 43}, si se repite un valor considerar uno solo.
    */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] arreglo = new int[8];

        int max = 0;

        for (int i = 0; i < 7; i++) {
            System.out.println("Ingrese un numero de 11 a 99: ");
            arreglo[i] = scanner.nextInt();
        }

        for (int i = 0; i < 7; i++) {
            max = Math.max(max, arreglo[i]);
        }
        System.out.println("El valor mas alto es: " + max);
    }
}
