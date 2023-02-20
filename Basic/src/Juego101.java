import java.util.Scanner;

public class Juego101 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jugador = 1;
        int puntajeJugador1 = 0;
        int puntajeJugador2 = 0;
        int ultimoPuntajePlanta1 = 0;
        int ultimoPuntajePlanta2 = 0;
        boolean juegoTerminado = false;

        while (!juegoTerminado) {
            System.out.println("Jugador " + jugador + " - Puntaje: " + (jugador == 1 ? puntajeJugador1 : puntajeJugador2));
            MostrarOpciones();
            int opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    int numero = Random(1, 6);
                    System.out.println("El jugador " + jugador + " sacó un " + numero);

                    if (numero == 1) {
                        if (jugador == 1) {
                            puntajeJugador1 = ultimoPuntajePlanta1;
                        } else {
                            puntajeJugador2 = ultimoPuntajePlanta2;
                        }
                        System.out.println("¡El jugador " + jugador + " sacó un 1! Pierde los puntos obtenidos desde la última vez que plantó.");
                        jugador = jugador == 1 ? 2 : 1;
                    } else if (numero == 3) {
                        if (jugador == 1) {
                            puntajeJugador1 += 3;
                            ultimoPuntajePlanta1 = puntajeJugador1;
                        } else {
                            puntajeJugador2 += 3;
                            ultimoPuntajePlanta2 = puntajeJugador2;
                        }
                        System.out.println("¡El jugador " + jugador + " sacó un 3! Debe plantar.");
                        jugador = jugador == 1 ? 2 : 1;
                    } else {
                        if (jugador == 1) {
                            puntajeJugador1 += numero;
                        } else {
                            puntajeJugador2 += numero;
                        }
                    }

                    if (puntajeJugador1 > 100 || puntajeJugador2 > 100) {
                        System.out.println("¡Se pasó de 100! Devolviéndose al último punto de control.");
                        if (jugador == 1) {
                            puntajeJugador1 = ultimoPuntajePlanta1;
                        } else {
                            puntajeJugador2 = ultimoPuntajePlanta2;
                        }
                    } else if (puntajeJugador1 == 101) {
                        System.out.println("¡El jugador 1 ganó!");
                        juegoTerminado = true;
                    } else if (puntajeJugador2 == 101) {
                        System.out.println("¡El jugador 2 ganó!");
                        juegoTerminado = true;
                    }

                    break;

                case 2:
                    if (jugador == 1) {
                        ultimoPuntajePlanta1 = puntajeJugador1;
                    } else {
                        ultimoPuntajePlanta2 = puntajeJugador2;
                    }

                    if (puntajeJugador1 == 100 || puntajeJugador2 == 100) {
                        System.out.println("¡El jugador " + jugador + " plantó en 100 y perdió!");
                        juegoTerminado = true;
                    }

                    jugador = jugador == 1 ? 2 : 1;
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