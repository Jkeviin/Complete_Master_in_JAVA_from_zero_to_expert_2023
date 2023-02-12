public class SentenciaForArreglo {
    public static void main(String[] args) {

        for (int i = 0; i <= 10; i++) {
            System.out.println("i = "+ i);
        }

        for (int i = 10; i >= 0; i--) {
            System.out.println("i = "+ i);
        }

        for(int i = 1, j = 10; i < j; i++, j--){
            System.out.println(i + " - " + j);

            /*  1 - 10
                2 - 9
                3 - 8
                4 - 7
                5 - 6   */
        }

        for(int i = 0; i <= 10; i++) {

            if(!(i % 2 == 0)) {  // Sí no es par saltar código y seguir con el bule
                continue;
            }
            System.out.println("i = "+ i);
        }

    }
}
