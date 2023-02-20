import java.util.InputMismatchException;
import java.util.Scanner;

public class ProjectBlackJack {
    public static void main(String[] args) {

        int ronda = 1;

        int jugador = 0;
        int maquina = 0;

        int numero = 0;

        boolean seguirMaquina = true;
        boolean seguirJugador = true;

        System.out.println("Hola bienvenido a Black JACK");

        do {

            // RONDA
            System.out.println();
            System.out.println("Repartimos las cartas de la ronda numero " + (ronda));

            numero =  Random(1, 10);

            if(ronda == 3){

                if((maquina + Random(1, 5) > 21)){
                    seguirMaquina = false;

                }

                if(!seguir()){
                    seguirJugador = false;
                }
            }

            if(seguirMaquina){
                maquina += Random(1, 10);
            }

            if(seguirJugador){
                jugador += numero;
                System.out.println("Su carta numero " + ronda + " es: " + numero);
                System.out.println("Llevas " + jugador + " puntos");
            }

            ronda++;
        }while(ronda <= 3);

        comparar(maquina, jugador);
    }

    public static int Random(int minimo, int maximo){
        return (int)(Math.random()*maximo+minimo);
    }

    public static boolean seguir() {

        Scanner s = new Scanner(System.in);

        String decision = "";

        System.out.println("¿desea jugar otra o dejar de jugar ahi? (Si o no)");
        decision = s.nextLine();

        if (decision.equalsIgnoreCase("si")) {
            return true;
        }
        return false;
    }

    public static void comparar(int maquina, int usuario){

        String resultado = "";
        boolean perdedor = false;

        System.out.println();

        if(maquina > 21  && usuario > 21){
            resultado = "PERDEDOR: ambos perdieron";
        }else{
            if(maquina > 21){
                resultado += "PERDEDOR: maquina";
                perdedor = true;
            }

            if(usuario > 21){
                resultado += "PERDEDOR: usuario";
                perdedor = true;
            }
        }

        if(!perdedor){
            if(maquina == usuario){
                resultado = "EMPATE";
            }else{
                resultado = maquina > usuario ? "GANADOR maquina" : "GANADOR usuario";
            }
        }


        System.out.println("maquina = " + maquina);
        System.out.println("usuario = " + usuario);
        System.out.println("Resultado: " + resultado );

    }
}
