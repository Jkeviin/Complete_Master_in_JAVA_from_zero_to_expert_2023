import java.util.Scanner;

public class TAREASection12_1 {

    /*
    * Leer 10 números enteros desde el teclado para llenar un arreglo de 10 elementos. Luego debemos mostrarlos en el siguiente orden: el último, el primero, el penúltimo, el segundo, el antepenúltimo, el tercero, y así sucesivamente.*/

    public static void main(String[] args) {

        /*
        Aquí está el detalle de lo que hace el código línea por línea:

            * int i, arreglo[]; - Declara dos variables, una para el contador del bucle for y otra para el arreglo.

            * arreglo = new int[10]; - Crea un arreglo de enteros con una longitud de 10 y lo asigna a la variable arreglo.

            * for (i = 0; i < 10; i++) {...} - Comienza un bucle for que se ejecutará 10 veces y solicita al usuario ingresar un número en cada iteración. Cada número ingresado se asigna a un elemento en el arreglo utilizando el índice i.

            * System.out.println("El resultado es:"); - Imprime una cadena que indica que se mostrarán los resultados del programa.

            * for (i = 0; i < 5; i++) {...} - Comienza otro bucle for que se ejecutará 5 veces. En cada iteración, se imprimirán dos números del arreglo, uno desde el principio del arreglo y otro desde el final del arreglo. Los números se imprimen en orden inverso en el segundo bucle for, comenzando desde el final del arreglo y avanzando hacia el principio.
        * */

        Scanner scanner = new Scanner(System.in);
        int i = 0, arreglo[];
        arreglo = new int[10];
        for (i = 0; i < 10; i++) {
            System.out.println("Ingrese un numero: ");
            arreglo[i] = scanner.nextInt();
        }

        System.out.println("Resultado Final:");
        for (i = 0; i < 5; i++) {
            System.out.println(arreglo[9 - i]);
            System.out.println(arreglo[i]);
        }
    }
}
