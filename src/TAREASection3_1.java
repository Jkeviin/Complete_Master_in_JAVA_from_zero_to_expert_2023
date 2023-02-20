import java.util.Scanner;

public class TAREASection3_1 {
    public static void main(String[] args) {
        /*
                EJERCICIO

            La tarea consiste en crear una clase llamada ProgramaManejoDeNombres de la siguiente manera:

            Se requiere desarrollar un programa que reciba los nombres de 3 integrantes de tu familia o amigos como argumentos de línea de comandos.

            Se pide por cada nombre de la persona una nueva variable del tipo String al tomar el segundo carácter pero convertido en mayúscula y se le concatena un punto y los dos últimos caracteres de la persona. Por ejemplo para Andres debe quedar como N.es

            Debe imprimir como resultado los tres nuevos nombres separado con guion bajo (como una única variable).

            Ejemplo, un resultado final esperado para los nombres Andres, Maria y Pepe podría ser:

            N.es_A.ia_E.pe
         */

        Scanner scanner = new Scanner(System.in);  // Inicialización para el uso de Scanner

        System.out.println("Ingrese el nombre del PRIMER integrante de la familia: ");
        String integrante1 = scanner.nextLine();

        System.out.println("Ingrese el nombre del SEGUNDO integrante de la familia: ");
        String integrante2 = scanner.nextLine();

        System.out.println("Ingrese el nombre del TERCERO integrante de la familia: ");
        String integrante3 = scanner.nextLine();


        String p1 = integrante1.substring(1, 2).toUpperCase().concat(".").concat(integrante1.substring(integrante1.length() - 2));
        String p2 = integrante2.substring(1, 2).toUpperCase().concat(".").concat(integrante2.substring(integrante2.length() - 2));
        String p3 = integrante3.substring(1, 2).toUpperCase().concat(".").concat(integrante3.substring(integrante3.length() - 2));

        String resultado = p1.concat("_" + p2.concat("_" + p3));

        System.out.println("resultado = " + resultado);

    }
}