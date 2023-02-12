public class EjemploStringConcatenacion {
    public static void main(String[] args) {
        String curso  = "Programación JAVA"; // Objeto de tipo de String (NO PRIMITIVO) Implícita
        String profesor = "Kevin Ortega";

        String detalle = curso + " con el instructor " + profesor;
        System.out.println(detalle);

        int numeroA = 10;
        int numeroB = 5;

        System.out.println(detalle + (numeroA + numeroB));
        System.out.println(numeroA + numeroB + detalle);  // Primero hace la operación y al ver que detalle no se puede operar, lo concatena

        // String detalle2 = curso.concat(" con ".concat(profesor)); // .concat, es una manera para concatenar String, retorna otra instancia y la asigna a detalle
        String detalle2 = curso.concat(" con ").concat(profesor);
        System.out.println("detalle2 = " + detalle2);


    }
}
