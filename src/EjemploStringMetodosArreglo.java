public class EjemploStringMetodosArreglo {
    public static void main(String[] args) {

        String trabalenguas = "trabalenguas";
        System.out.println("trabalenguas.length() = " + trabalenguas.length());

        System.out.println("trabalenguas.toCharArray() = " + trabalenguas.toCharArray()); // Convertirlo en un arreglo de Caracteres
        char[] arreglo = trabalenguas.toCharArray();   // [C@7b23ec81
        /*El valor que estás viendo, [C@7b23ec81, se refiere al tipo de objeto (C es la abreviación de char)
        y el identificador único del objeto en la memoria. No es una representación legible del contenido del arreglo.*/

        int largo = arreglo.length;
        System.out.println("largo = " + largo);

        for (int i = 0; i < largo; i++) {
            System.out.println(arreglo[i]);
        }

        System.out.println("\ntrabalenguas = " + trabalenguas.split("a"));
        String[] arreglo2 = trabalenguas.split("a");
        // Hace las divisiones del arreglo con la letra a, o sea, cada
        // que encuentra una la divide un index del arreglo

        int largo2 = arreglo2.length;
        System.out.println("largo2 = " + largo2);

        for (int i = 0; i < largo2; i++) {
            System.out.println(arreglo2[i]);
        }

        String archivo = "alguna.imagen.pdf";
        String[] arrchivoArr = archivo.split("[.]");  // Hay que agregar \\. o [.] para que lo lea como character

        for (int i = 0; i < arrchivoArr.length; i++) {
            System.out.println(arrchivoArr[i]);
        }

        System.out.println("arrchivoArr[arrchivoArr.length-1] = " + arrchivoArr[arrchivoArr.length-1]);

    }
}
