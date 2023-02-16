public class PasarPorValor {


    /*En Java, el tipo Integer es un objeto en lugar de un tipo primitivo, por lo que al pasar un objeto Integer a una función, se está pasando por referencia.
    Sin embargo, a diferencia de otros objetos, el valor de un objeto Integer no se puede cambiar directamente, ya que Integer es un objeto inmutable.

Si intentas cambiar el valor de un objeto Integer dentro de una función, lo que realmente estás haciendo es reasignar la referencia
a un nuevo objeto con un valor diferente, pero esto no afectará al objeto original.*/

    public static void main(String[] args) {

        int i = 10;

        System.out.println("iniciamos el método main con i = " + i);

        test (i);

        System.out.println("Finaliza el método main con el valor de i (se mantiene igual) = "+ i);
    }

    public static void test(int i){
        System.out.println("Iniciamos el método test con i = " + i);
        i = 35;
        System.out.println("Finaliza el método test con i = " + i);
    }
}
