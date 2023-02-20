import java.util.Scanner;

public class TAREASection12_4 {

    /*
    Para la tarea se debe crear un arreglo con 10 elementos (enteros en el rango de 1 a 9). Escriba un programa que imprima el número que tiene más ocurrencias en el arreglo y también imprimir la cantidad de veces que aparece en el arreglo.

    Por ejemplo, para el arreglo: {1, 2, 3, 3, 4, 5, 5, 5, 6, 7}

    Como resultado debería imprimir lo siguiente:

    La mayor ocurrencias es: 3
    El elemento que mas se repite es: 5
    En el ejemplo, el elemento que más se repite en el arreglo es el número 5 con una ocurrencia de 3 veces.
    */
    public static void main(String[] args) {

        // se crea un arreglo de enteros con 10 elementos
        int[] arreglo = {1, 2, 3, 3, 4, 5, 5, 5, 6, 7};

        // se crea un arreglo de enteros con tamaño igual al número de elementos únicos en el arreglo original
        int[] numerosUnicos = new int[10];

        // se inicializa un contador para llevar el número de elementos únicos encontrados hasta ahora
        int contadorUnicos = 0;

        // se recorre el arreglo original para encontrar los elementos únicos
        for (int i = 0; i < arreglo.length; i++) {

            // se inicializa una variable booleana para indicar si el elemento actual es único
            boolean esUnico = true;

            // se recorren los elementos únicos encontrados hasta ahora para verificar si el elemento actual ya ha sido encontrado
            for (int j = 0; j < contadorUnicos; j++) {

                // si el elemento actual es igual a uno de los elementos únicos encontrados, entonces no es único
                if (arreglo[i] == numerosUnicos[j]) {
                    esUnico = false;
                    break;
                }
            }

            // si el elemento actual es único, se agrega al arreglo de elementos únicos y se incrementa el contador
            if (esUnico) {
                numerosUnicos[contadorUnicos] = arreglo[i];
                contadorUnicos++;
            }
        }

        // se crea un arreglo de enteros para almacenar los conteos de cada número único
        int[] conteos = new int[contadorUnicos];

        // se recorre el arreglo de elementos únicos para contar las ocurrencias de cada uno en el arreglo original
        for (int i = 0; i < contadorUnicos; i++) {
            int numero = numerosUnicos[i];  // se obtiene el número único actual
            int conteo = 0;  // se inicializa el conteo para este número en cero
            for (int j = 0; j < arreglo.length; j++) {
                if (arreglo[j] == numero) {  // si el número actual en el arreglo original es igual al número único actual
                    conteo++;  // se incrementa el conteo
                }
            }
            conteos[i] = conteo;  // se almacena el conteo en el arreglo de conteos
        }

        // se inicializan variables para encontrar el número con más ocurrencias
        int maximoConteo = 0;  // el máximo conteo encontrado hasta ahora es cero
        int numeroMasFrecuente = 0;  // el número más frecuente encontrado hasta ahora es cero

        // se recorre el arreglo de conteos para encontrar el número con más ocurrencias
        for (int i = 0; i < contadorUnicos; i++) {
            int conteo = conteos[i];  // se obtiene el conteo actual
            if (conteo > maximoConteo) {  // si el conteo actual es mayor que el máximo conteo encontrado hasta ahora
                maximoConteo = conteo;  // se actualiza el máximo conteo
                numeroMasFrecuente = numerosUnicos[i];  // se actualiza el número más frecuente
            }
        }

        // imprimir los resultados
        System.out.println("La mayor ocurrencia es: " + maximoConteo);
        System.out.println("El elemento que más se repite es: " + numeroMasFrecuente);

    }
}
