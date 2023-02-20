public class PRUEBA {
    public static void main(String[] args) {
        int jugador = 0;

        for (int i = 0; i < 6; i++) {
            jugador = (jugador % 3);
            System.out.println("jugador = " + jugador);
        }
    }
}
