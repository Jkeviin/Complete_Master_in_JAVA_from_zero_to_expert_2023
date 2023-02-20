public class EjemploStringMetodos {
    public static void main(String[] args) {
        String nombre = "Kevin";

        System.out.println("nombre.length() = " + nombre.length()); // nombre.length() = 5

        System.out.println("nombre.toUpperCase() = " + nombre.toUpperCase());  // MAYÚSCULA
        System.out.println("nombre.toLowerCase() = " + nombre.toLowerCase());  // MINÚSCULA

        System.out.println("nombre.equals(\"Kevin\") = " + nombre.equals("Kevin")); // COMPARAR Contenido (true)
        System.out.println("nombre.equals(\"KEVIN\") = " + nombre.equals("KEVIN")); // COMPARAR Contenido (false)
        System.out.println("nombre.equalsIgnoreCase(\"KeViN\") = " + nombre.equalsIgnoreCase("KeViN"));  // COMPARAR Ignorando Mayúsculas (true)

        System.out.println("nombre.compareTo(\"Kevin\") = " + nombre.compareTo("Kevin"));  // Orden Lexico Gráfico (si es 0 es Igual)
        System.out.println("nombre.compareTo(\"kevin\") = " + nombre.compareTo("kevin"));  // Orden Lexico Gráfico (-32) Unicode

        System.out.println("nombre.charAt(0) = " + nombre.charAt(0)); // Trae la letra del índice del String (En este caso 0 es K)
        System.out.println("nombre.charAt(nombre.length() - 1) = " + nombre.charAt(nombre.length() - 1)); // Trae la última letra (En este caso N)

        System.out.println("nombre.substring(1) = " + nombre.substring(1)); // Trae el texto desde el índice hacia la última (En este caso evin)
        System.out.println("nombre.substring(1, 3) = " + nombre.substring(1, 3)); // Desde - Hasta el 3 no se incluye (En este caso ev)
        System.out.println("nombre.substring(nombre.length() - 2) = " + nombre.substring(nombre.length() - 2)); // Traería los 2 últimos del String (En este caso in)

        String trabalenguas = "trabalenguas";
        System.out.println("trabalenguas.replace(\"a\", \".\") = " + trabalenguas.replace("a", ".")); //Remplaza algo del String por algo que quiera
        System.out.println("trabalenguas = " + trabalenguas);  // No cambia el contenido del String
        
        System.out.println("trabalenguas.indexOf('a') = " + trabalenguas.indexOf('a')); // Muestra la PRIMERA posición de lo que encontró
        System.out.println("trabalenguas.lastIndexOf('a') = " + trabalenguas.lastIndexOf('a')); // Muestra la ÚLTIMA posición de lo que encontró
        System.out.println("trabalenguas.indexOf('z') = " + trabalenguas.indexOf('z'));  // Si NO encuentra saldría -1
        System.out.println("trabalenguas.contains(\"traba\") = " + trabalenguas.contains("traba")); // Este obligatoriamente debe ser una CADENA (True o False)

        System.out.println("trabalenguas.startsWith(\"a\") = " + trabalenguas.startsWith("traba")); // Si EMPIEZA, retorna true o false
        System.out.println("trabalenguas.endsWith(\"lenguas\") = " + trabalenguas.endsWith("lenguas")); // Si TERMINA, retorna true o false

        System.out.println("  TRABALENGUAS  ");
        System.out.println("  TRABALENGUAS  ".trim());  // Elimina espacio inicio y final
    }
}
