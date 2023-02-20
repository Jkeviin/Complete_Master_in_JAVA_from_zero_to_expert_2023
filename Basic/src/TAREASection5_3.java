import java.util.Scanner;

public class TAREASection5_3 {
    public static void main(String[] args) {
        /*
Mediante el teclado pedir dos números enteros positivos o negativos y multiplicarlos, pero sin usar el símbolo de multiplicación (*).

Puede utilizar una sentencia for para realizar la multiplicación y tener en cuenta los unarios, donde menos por menos es positivo.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el numero a: ");
        int a = scanner.nextInt();

        System.out.println("Ingrese el numero b: ");
        int b = scanner.nextInt();
        int resultado = 0;

        // Se verifica si es negativo
        boolean positivoB = b > -1;
        boolean positivoA = a > -1;

        // Si es negativo, se convierte a positivo
        int absolutoA = positivoA? a: -a; // equivalente a Math.abs(a);

        // Se necesita A positivo para poder recorrer el bucle, lo que hace es que se suma al mismo B la cantidad de veces de A
        for(int i = 0; i < absolutoA; i++){
            resultado += b;
        }

        // Si los dos son negativos, hace el resultado positivo (siendo (- * - = +).
        if((!positivoA && !positivoB) || !positivoA){
            resultado = -resultado;
        }

        System.out.println("el resultado es " + resultado);

    }
}
