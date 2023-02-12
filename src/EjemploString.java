public class EjemploString {
    public static void main(String[] args) {
        String curso  = "Programación JAVA"; // Objeto de tipo de String (NO PRIMITIVO) Implícita
        String curso2 =  new String("Programación JAVA");  // Otra forma Explicita

        // Al ser objetos, todos los objetos son unicos (distintos) y cada uno tiene su identificador.
        boolean esIgual = curso == curso2;  // Esto debería retornar FALSE porque son 2 instancias distintas.
        System.out.println("curso == curso2 = " + esIgual);

        // esIgual = curso.equals(curso2); // Eso debería retornar TRUE porque Equals compara el valor (el texto)
        esIgual = curso.equalsIgnoreCase(curso2); // (equalsIgnoreCase) Ignora minúscula y mayúscula.
        System.out.println("curso.equals(curso2) = " + esIgual);

        String curso3 = "Programación JAVA";
        esIgual = curso == curso3;  // Esto debería retornar TRUE porque los dos (curso3 y curso) son variables Implícitas
        System.out.println("curso == curso3 = " + esIgual);


    }
}
