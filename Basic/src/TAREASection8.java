import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class TAREASection8 {
    public static void main(String[] args) {
        /*Para esta tarea se pide ingresar una fecha de nacimiento en formato string, convertirla a una fecha del tipo java.util.Date y
         calcular la edad de la persona de acuerdo a la fecha actual.

        Intentar usar solo lo visto hasta el momento, no el api de java 8 que lo veremos mas adelante, también se pueden apoyar de google que hay varios ejemplos.*/

        Scanner scanner = new Scanner(System.in);

        // Pedimos ingresar la fecha de nacimiento en formato String
        System.out.print("Ingresa tu fecha de nacimiento (dd/MM/yyyy): ");
        String fechaNacimientoString = scanner.next();

        // Creamos un objeto SimpleDateFormat para convertir la fecha String a Date
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date fechaNacimiento = null;

        try {
            fechaNacimiento = formatter.parse(fechaNacimientoString);
        } catch (Exception e) {
            System.out.println("Error al convertir la fecha de nacimiento");
            return;
        }

        // Creamos un objeto Calendar con la fecha actual
        Calendar fechaActual = Calendar.getInstance();

        // Creamos un objeto Calendar con la fecha de nacimiento
        Calendar fechaNac = Calendar.getInstance();
        fechaNac.setTime(fechaNacimiento);

        // Calculamos la edad de la persona
        int edad = fechaActual.get(Calendar.YEAR) - fechaNac.get(Calendar.YEAR);
        if (fechaActual.get(Calendar.DAY_OF_YEAR) < fechaNac.get(Calendar.DAY_OF_YEAR)){
            edad--;
        }

        // Imprimimos la edad de la persona
        System.out.println("Tienes " + edad + " años");
    }
}