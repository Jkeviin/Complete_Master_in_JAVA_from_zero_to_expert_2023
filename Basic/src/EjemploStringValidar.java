public class EjemploStringValidar {
    public static void main(String[] args) {
        String curso = null;

        boolean esNulo = curso == null;

        System.out.println("esNulo = " + esNulo);

        if(esNulo) {
            curso = "Programación JAVA";
        }

        boolean esVacio = curso.length() == 0;
        System.out.println("esVacio = " + esVacio);

        boolean esVacio2 = curso.isEmpty(); // Segunda forma para verificar si es está vacío (Mas sencillo)
        System.out.println("esVacio2 = " + esVacio2);

        boolean esBlanco = curso.isBlank(); // Lo mismo que el anterior pero más estricto
        System.out.println("esBlanco = " + esBlanco);

        if(!esBlanco){
            System.out.println(curso.toUpperCase());
            System.out.println("Bienvenido al curso ".concat(curso));
        }
    }
}
