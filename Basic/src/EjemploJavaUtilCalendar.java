
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class EjemploJavaUtilCalendar {
    public static void main(String[] args) {

        Calendar calendario = Calendar.getInstance();

        calendario.set(2023, 0, 16, 19, 20, 10);

        calendario.set(Calendar.YEAR, 2023);
        calendario.set(Calendar .MONTH, Calendar .JULY);
        calendario .set(Calendar.DAY_OF_MONTH, 16);

        calendario.set(Calendar.HOUR_OF_DAY, 21);
        calendario.set(Calendar.MINUTE, 20);
        calendario.set(Calendar.SECOND, 10);

        Date fecha = calendario.getTime();
        System.out.println("calendario = " + fecha);

        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        String fechaFormato = formato.format(fecha);

        System.out.println("fechaFormato = " + fechaFormato);

    }
}
