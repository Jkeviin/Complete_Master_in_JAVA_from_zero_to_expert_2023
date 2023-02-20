public class HolaMundo { // Cabecera

    /*  "public" es un modificador de acceso que indica que este método puede ser accedido desde cualquier lugar del programa.

        "static" significa que este método puede ser llamado sin necesidad de crear una instancia de la clase que lo contiene.

        "void" es el tipo de retorno del método, lo que significa que no devuelve ningún valor.

        "main" es el nombre del método, que es el punto de inicio de todo programa Java.

        "(String[] args)" es la lista de argumentos del método, que consiste en un arreglo de cadenas (String) llamado "args".
             */
    public static void main(String[] args){ // Cuerpo
        String saludar = "Hola Mundo desde Java";
       System.out.println("Variable Saludar = " + saludar.toUpperCase());

       Integer numero = 10;
       int numero2 = 20;


       boolean valor = true;

       if(valor){
           System.out.println("resultado = " + (numero + numero2));
       }

    }
}
