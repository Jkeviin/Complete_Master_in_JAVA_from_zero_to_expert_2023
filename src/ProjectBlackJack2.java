import java.lang.constant.Constable;
import java.util.Scanner;

public class ProjectBlackJack2 {
    public static void main(String[] args) {

        int ronda = 1;

        int jugador = 0;
        int maquina = 0;

        int numero = 0;

        boolean seguirMaquina = true;
        boolean seguirJugador = true;

        boolean perdedor = false;

        System.out.println("Hola bienvenido a Black JACK");

        while (seguirJugador || seguirMaquina) {

            // RONDA
            System.out.println();
            System.out.println("Repartimos las cartas de la ronda numero " + (ronda));

            numero = Random(1, 10);

            if (seguirMaquina) {
                maquina += Random(1, 10);

                if ((maquina + Random(1, 5) > 21)) {
                    seguirMaquina = false;
                }
            }

            if (seguirJugador) {

                if (ronda != 1 && !seguir()) {
                    seguirJugador = false;
                } else {
                    jugador += numero;
                    System.out.println("Su carta numero " + ronda + " es: " + numero);
                    System.out.println("Llevas " + jugador + " puntos");
                    System.out.println("maquina = " + maquina);
                }
            }

            ronda++;

            if (jugador > 21 || maquina > 21) {
                perdedor = true;
                break;
            }

        }

        comparar(maquina, jugador, perdedor);
    }

    public static int Random(int minimo, int maximo) {
        return (int) (Math.random() * maximo + minimo);
    }

    public static boolean seguir() {

        Scanner s = new Scanner(System.in);

        String decision = "";

        System.out.println("¿desea jugar otra o dejar de jugar ahi? (Si o no)");
        decision = s.nextLine();

        return decision.equalsIgnoreCase("si");
    }

    public static void comparar(int maquina, int usuario, boolean perdedor) {

        String resultado = "";

        System.out.println();

        if(perdedor) {
            if (maquina > 21 && usuario > 21) {
                resultado = "PERDEDOR: ambos perdieron";
            }else{
                resultado = maquina > 21 ? "PERDEDOR: Maquina" : "PERDEDOR: Jugador";
            }
        }


        if (!perdedor) {
            if (maquina == usuario) {
                resultado = "EMPATE";
            } else {
                resultado = maquina > usuario ? "GANADOR maquina" : "GANADOR usuario";
            }
        }


        System.out.println("maquina = " + maquina);
        System.out.println("usuario = " + usuario);
        System.out.println("Resultado: " + resultado);

    }

    public static String Perdedor(String nombre) {


        String mensaje = nombre + "Perdió";

        return mensaje;
    }
}
