import java.util.Date;

public class CompararFechas {
    public static void main(String[] args) {
        Date fecha1 = new Date();
        Date fecha2 = new Date();

        // comparar si fecha1 es igual a fecha2
        if (fecha1.equals(fecha2)) {
            System.out.println("Las fechas son iguales.");
        } else {
            System.out.println("Las fechas son diferentes.");
        }

        // comparar si fecha1 es anterior a fecha2
        if (fecha1.compareTo(fecha2) < 0) {
            System.out.println("fecha1 es anterior a fecha2.");
        } else {
            System.out.println("fecha1 es posterior o igual a fecha2.");
        }

        // comparar si fecha1 es anterior a fecha2
        if (fecha1.before(fecha2)) {
            System.out.println("fecha1 es anterior a fecha2.");
        } else {
            System.out.println("fecha1 es posterior o igual a fecha2.");
        }

        /*
        Ambos métodos (compareTo y before) se utilizan para comparar fechas en Java, pero tienen algunas diferencias clave:

            El método compareTo compara dos fechas y devuelve un entero que indica si la fecha actual es anterior, posterior o igual a la otra fecha. Si devuelve un número negativo, la fecha actual es anterior a la otra fecha. Si devuelve cero, ambas fechas son iguales. Si devuelve un número positivo, la fecha actual es posterior a la otra fecha.

            El método before, por otro lado, es un método booleano que devuelve true si la fecha actual es anterior a la otra fecha, y false en caso contrario.

        En resumen, compareTo es más versátil, ya que puede indicar si dos fechas son iguales, así como si una fecha es anterior o posterior a otra, mientras que before solo indica si una fecha es anterior a otra.
        */
    }
}
