public class SentenciasBuclesEtiquetasBuscar {
    public static void main(String[] args) {

        String frase = "tres tristes tigres tragan trigo en un trigal";
        String palabra = "trigo";


        int maxPalabra = palabra.length();
        int maxFrase = frase.length() - maxPalabra;

        int cantidad = 0;

        buscar:
        for (int i = 0; i <= maxFrase;) {
            int k = i;
            for (int j = 0; j < maxPalabra; j++) {
                if (frase.charAt(k++) != palabra.charAt(j)) { // Comienza a comparar letra por letra, si acaba el segundo bucle y sin entrar a la condition, entonces habria 1 palabra que concuerda
                    i++;
                    continue buscar;
                }
            }
            cantidad++;
            i = i + maxPalabra;
        }

        System.out.println("Encontrado: " + cantidad + " de veces la palabra "+ palabra + " en la frase");


    }
}
