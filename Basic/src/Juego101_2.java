import java.util.Scanner;

public class Juego101_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jugador = 1;
        int[] puntajes = {0, 0, 0}; // se agregó un tercer elemento al arreglo
        int[] ultimosPuntajes = {0, 0, 0}; // se agregó un tercer elemento al arreglo
        boolean juegoTerminado = false;

        while (!juegoTerminado) {
            System.out.println("Jugador " + jugador + " - Puntaje: " + puntajes[jugador-1]); // se usa el índice correcto del arreglo
            MostrarOpciones();
            int opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    int numero = Random(1, 6);
                    System.out.println("El jugador " + jugador + " sacó un " + numero);

                    if (numero == 1) {
                        puntajes[jugador-1] = ultimosPuntajes[jugador-1]; // se usa el índice correcto del arreglo
                        System.out.println("¡El jugador " + jugador + " sacó un 1! Pierde los puntos obtenidos desde la última vez que plantó.");
                        jugador = (jugador % 3) + 1; // se asegura que el valor de jugador sea 1, 2 o 3
                    } else if (numero == 3) {
                        puntajes[jugador-1] += 3;
                        ultimosPuntajes[jugador-1] = puntajes[jugador-1]; // se usa el índice correcto del arreglo
                        System.out.println("¡El jugador " + jugador + " sacó un 3! Debe plantar.");
                        jugador = (jugador % 3) + 1; // se asegura que el valor de jugador sea 1, 2 o 3
                    } else {
                        puntajes[jugador-1] += numero; // se usa el índice correcto del arreglo
                    }

                    if (puntajes[jugador-1] > 100) {
                        System.out.println("¡Se pasó de 100! Devolviéndose al último punto de control.");
                        puntajes[jugador-1] = ultimosPuntajes[jugador-1]; // se usa el índice correcto del arreglo
                    } else if (puntajes[jugador-1] == 101) {
                        System.out.println("¡El jugador " + jugador + " ganó!");
                        juegoTerminado = true;
                    }

                    break;

                case 2:
                    ultimosPuntajes[jugador-1] = puntajes[jugador-1]; // se usa el índice correcto del arreglo
                    if (puntajes[jugador-1] == 100) {
                        System.out.println("¡El jugador " + jugador + " plantó en 100 y perdió!");
                        juegoTerminado = true;
                    }
                    jugador = (jugador % 3) + 1; // se asegura que el valor de jugador sea 1, 2 o 3
                    break;
                default:
                    System.out.println("Opción inválida");
                    break;
            }
        }
    }

    public static void MostrarOpciones(){
        System.out.println("1. Tirar dado");
        System.out.println("2. Plantar");
    }

    public static int Random(int minimo, int maximo) {
        return (int) (Math.random() * maximo + minimo);
    }

}