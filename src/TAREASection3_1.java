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

        String resultado = "";

        for (int i = 0; i < 3 ; i++ ){
            System.out.println("Ingrese el nombre del integrante " + i + " de la familia: ");
            String nombre = scanner.nextLine();

            resultado += transformar(nombre);

            if(i<2){
                resultado = resultado.concat("_");
            }
        }
        System.out.println("resultado = " + resultado);
    }

    static String transformar(String nombre){
        return nombre.substring(1, 2).toUpperCase().concat(".").concat(nombre.substring(nombre.length() - 2));
    }
}
