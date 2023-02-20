import java.util.InputMismatchException;
import java.util.Scanner;

public class TAREASection5_1 {
    public static void main(String[] args) {
        /*
        Crear una clase con el método main donde el desafío es buscar el número menor de mínimo 10 valores enteros, usando la clase Scanner ingresar la cantidad de números a comparar, luego utilizando una sentencia for iterar el numero de veces (ingresado) para pedir el numero entero, entonces se requiere:

            Calcular el menor número e imprimir el valor.

            Si el menor número es menor que 10, imprimir "El número menor es menor que 10!". si no, imprimir " el numero menor es igual o mayor que 10!".
         */

        Scanner scanner = new Scanner(System.in);

        int cantidad = 0;

        try{
            System.out.println("Ingrese la cantidad de valores a comparar: ");
            cantidad = scanner.nextInt();
        }catch (InputMismatchException e){
            System.out.println("ERROR: Debes ingresar un numero!!");
            main(args);
            System.exit(0);
        }

        // Consultamos si es inferior a 10, dado que el valor mínimo según la especificación de la tarea es 10 (buscar el número más pequeño entre los mínimo 10 valores enteros).
        if (cantidad < 10) {
            System.out.println("Error: Debe comparar al menos 10 números enteros!");
        } else {
            int menor = Integer.MAX_VALUE; // El valor máximo que se puede almacenar en una variable de tipo "int" es representado por la constante Integer.MAX_VALUE, que es igual a 2147483647.
            int numero = 0;

            for (int i = 0; i < cantidad; i++) {
                System.out.println("Ingrese el numero " + (i + 1) + ": ");
                numero = scanner.nextInt();
                menor = (numero < menor) ? numero : menor;
            }

            System.out.println("El número menor es: " + menor);

            if (menor < 10) {
                System.out.println("El número " + menor + " es menor que 10!");
            } else {
                System.out.println("El número " + menor + " es igual o mayor que 10!");
            }
        }

    }
}
