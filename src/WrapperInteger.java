public class WrapperInteger {
    public static void main(String[] args) {
        /*Un wrapper es una clase que envuelve o "empaqueta" un valor primitivo de Java en un objeto.
        Los valores primitivos son tipos de datos simples que no son objetos, como int, float, char, etc.
        Los wrappers proporcionan una forma de trabajar con valores primitivos como objetos en Java, lo que es útil en muchas situaciones.

        Hay una clase wrapper para cada tipo primitivo en Java:

        Byte
        Short
        Integer
        Long
        Float
        Double
        Character
        Boolean
        Cada una de estas clases tiene métodos útiles para trabajar con los valores primitivos, como conversiones de tipos, comparaciones, etc.
        También puedes crear objetos wrapper a partir de valores primitivos y viceversa.

        Por ejemplo, puedes generar un objeto Integer a partir de un int usando el método valueOf, y puedes obtener un int a partir de un objeto Integer usando el método intValue.
        Esto es útil porque muchos métodos y estructuras de datos en Java requieren objetos en lugar de valores primitivos.*/

        //--------------------------------------------------------------------------------------//

        // De la siguiente manera se puede convetir un número primitivo a un objeto

        int intPrimitivo = 32768;

        Integer intObjecto = intPrimitivo; // Automática implícita
        Integer intObjecto2 = Integer.valueOf(intPrimitivo);  // Explícita
        // Las dos formas es exactamente lo mismo, solo que una es explícita y la otra implícita, pero las dos formas es correcta

        //--------------------------------------------------------------------------------------//

        // De la siguiente manera se puede convetir un objeto en primitivo

        int num = intObjecto; // Automática implícita
        int num2 = intObjecto2.intValue(); // Explícita
        // Las dos formas es exactamente lo mismo, solo que una es explícita y la otra implícita, pero las dos formas es correcta

        //--------------------------------------------------------------------------------------//

        // Integer.valueOf() Recibe un String también, entonces de esa manera puede convertir un String en un Integer:

        String valorTvLcd = "67000";
        Integer valor = Integer.valueOf(valorTvLcd);

        //--------------------------------------------------------------------------------------//

        Short shortObjeto = intObjecto.shortValue(); // Habría perdida de información, ya que Short solo recibe 32767 y intObjeto es 32768
        System.out.println("shortObjeto = " + shortObjeto);
        
        Byte byteObjeto = intObjecto.byteValue();
        System.out.println("byteObjeto = " + byteObjeto); // Igualmente tendrá perdida de información





    }
}
