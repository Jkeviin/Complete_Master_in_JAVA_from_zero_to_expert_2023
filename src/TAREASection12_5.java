public class TAREASection12_5{

    /*
    * Escribir un programa que recorra un arreglo y genere un histograma con base en los valores de este.

    El arreglo debe contener 12 elementos que corresponden a números enteros de rango 1 al 6.

    Un histograma es una representación gráfica (de puntos o barra) de que tanto un elemento aparece en un conjunto de datos, es decir debe mostrar la frecuencia para todos los números del 1 al 6, incluso si no están presente en el arreglo.

    Por ejemplo para el arreglo {4, 3, 4, 6, 6, 4, 1, 4, 5, 4, 1, 1} el histograma debería ser:

    1: ***
    2:
    3: *
    4: *****
    5: *
    6: **
    Para la tarea usaremos el asterisco(*) como representación gráfica para el histograma.*/

    public static void main(String[] args) {
        // Definimos el arreglo original de 12 elementos con números del 1 al 6
        int[] arreglo = {4, 3, 4, 6, 6, 4, 1, 4, 5, 4, 1, 1};

        // Creamos un arreglo de frecuencia de tamaño 6 para contar cuántas veces aparece cada número del 1 al 6
        int[] frecuencia = new int[6];

        // Recorremos el arreglo original
        for (int i = 0; i < arreglo.length; i++) {
            // Incrementamos en 1 la frecuencia correspondiente al número actual del arreglo original
            frecuencia[arreglo[i]-1]++;
        }

        // Recorremos el arreglo de frecuencia
        for (int i = 0; i < 6; i++) {
            // Imprimimos el número actual del histograma y agregamos un ":" para separarlo de los asteriscos
            System.out.print(i+1 + ": ");

            // Recorremos la cantidad de veces que aparece el número actual del histograma e imprimimos un asterisco por cada ocurrencia
            for (int j = 0; j < frecuencia[i]; j++) {
                System.out.print("*");
            }

            // Imprimimos un salto de línea para separar cada línea del histograma
            System.out.println();
        }
    }
}
