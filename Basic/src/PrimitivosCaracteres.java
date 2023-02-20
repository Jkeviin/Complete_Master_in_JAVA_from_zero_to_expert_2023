public class PrimitivosCaracteres {
    public static void main(String[] args) {
        char caracter = '\u0040';  //  @ Un solo caracter o (códigos de caracteres, "Mapa de caracteres" inicializado con \
        char decimal = 64; // @ Cara
        char simbolo = '@';
        System.out.println("caracter = " + caracter);
        System.out.println("decimal = " + decimal);
        System.out.println("simbolo = " + simbolo);
        System.out.println("decimal = caracter = simbolo ? " + (decimal == caracter && caracter == simbolo));

        System.out.println("Char corresponde en byte a = " + Character.BYTES);
        System.out.println("Char corresponde en bites a = " + Character.SIZE);
        System.out.println("Máximo valor para Char = " + Character.MAX_VALUE);
        System.out.println("Mínimo valor para Char = " + Character.MIN_VALUE);

        char espacio = '\uu0020'; // Esto es lo mismo a = ' '
        char retroceder = '\b'; // Elimina un caracter ejemplo "Hola" = "Hol"
        char tabulador = '\t'; // Tabular como presionar TAB
        char nuevaLinea = '\n'; // Salto de linea


        
    }
}
