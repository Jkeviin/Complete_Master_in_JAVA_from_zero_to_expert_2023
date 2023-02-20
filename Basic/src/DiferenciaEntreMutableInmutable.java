public class DiferenciaEntreMutableInmutable {
    public static void main(String[] args) {
    /* En Java, una cadena de texto es un objeto de la clase String. Hay dos tipos de cadenas en Java: inmutables y mutables.

    CADENAS INMUTABLES: Una cadena inmutable es una cadena cuyo valor no puede ser modificado después de su creación. Por ejemplo: */

         String str = "Hola mundo";
         str.concat("!");
         System.out.println(str);

        /* Este caso, el valor de la variable str sigue siendo "Hola mundo", ya que la concatenación se realiza en un nuevo objeto de la clase String, sin modificar el objeto original.

    CADENAS MUTABLES: Una cadena mutable es una cadena cuyo valor puede ser modificado después de su creación. Para crear una cadena mutable en Java, se puede usar la clase StringBuilder. Por ejemplo: */

         StringBuilder sb = new StringBuilder("Hola mundo");
         sb.append("!");
         System.out.println(sb);

        /*En este caso, el valor de la variable sb es "Hola mundo!", ya que la concatenación se realiza en el mismo objeto de la clase StringBuilder.

    En resumen, la principal diferencia entre las cadenas inmutables y mutables en Java es que las cadenas inmutables no pueden ser modificadas después de su creación,
    mientras que las cadenas mutables pueden ser modificadas después de su creación. Las cadenas inmutables son útiles cuando se requiere un valor de cadena constante,
    mientras que las cadenas mutables son útiles cuando se requiere un valor de cadena que pueda ser modificado.*/

    }
}
