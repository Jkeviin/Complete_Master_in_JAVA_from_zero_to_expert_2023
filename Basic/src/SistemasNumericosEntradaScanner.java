import java.util.InputMismatchException;
import java.util.Scanner;
public class SistemasNumericosEntradaScanner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);  // Inicialización para el uso de Scanner

        System.out.println("Ingrese un número entero:");

        //String numeroStr =  scanner.nextLine();  // Pide valor en consola.

        int numeroDecimal = 0;

        try{

            numeroDecimal = scanner.nextInt();

        } catch (InputMismatchException e) {
            System.out.println("Error debe ingresar un número entero");
            main(args);
            System.exit(0);
        }

        String resultadoBinario = "numero binario de " + numeroDecimal + " es " + Integer.toBinaryString(numeroDecimal);
        // Integer.toBinaryString(variable) Lo que hace es mostrar el número en binario

        String resultadoOctal = "numero Octal de " + numeroDecimal + " es " + Integer.toOctalString(numeroDecimal);

        String resultadoHex = "numero Hexadecimal de " + numeroDecimal + " es " + Integer.toHexString(numeroDecimal);

        String mensaje = resultadoBinario;
        mensaje += "\n"+resultadoOctal;
        mensaje += "\n"+resultadoHex;

        System.out.println(mensaje);
    }
}
