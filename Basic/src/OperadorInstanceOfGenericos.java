public class OperadorInstanceOfGenericos {
    public static void main(String[] args) {

        /*La operación instanceof es utilizada para determinar si un objeto es una instancia de una clase determinada o de una de sus subclases.
        Devuelve un valor true si el objeto es una instancia de la clase o una de sus subclases, o false en caso contrario.*/

        String texto = new String("Creando un objeto de la clase String... que tal?!");  // NO PRIMITIVO
        Integer num = 7; // NO PRIMITIVO

        Boolean b1 = texto instanceof String;
        System.out.println("Texto del tipo String = " + b1);

        b1 = texto instanceof Object;  // Object es el padre de todos los objetos
        System.out.println("Texto del tipo Object = " + b1);

        b1 = num instanceof Integer;
        System.out.println("num del tipo Integer = " + b1);

        b1 = num instanceof Number;
        System.out.println("num del tipo Number = " + b1);

        b1 = num instanceof Object;  // Object es el padre de todos los objetos
        System.out.println("num del tipo Object = " + b1);


        Double decimal = 45.44;
        b1 = decimal instanceof Number;
        System.out.println("decimal del tipo Number = " + b1);

        b1 = b1 instanceof Boolean;
        System.out.println("b1 del tipo Boolean = " + b1);


    }
}
