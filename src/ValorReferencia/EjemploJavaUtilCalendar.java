package ValorReferencia;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class EjemploJavaUtilCalendar {

    public static void main(String[] args) {

        Calendar cal = Calendar.getInstance();
        //cal.set(2020,Calendar.MARCH,21,13,55,20);
        cal.set(Calendar.YEAR,2020);
        cal.set(Calendar.MONTH,Calendar.MARCH);
        cal.set(Calendar.DAY_OF_MONTH,21);
        //cal.set(Calendar.HOUR,13);

        cal.set(Calendar.HOUR,1);
        cal.set(Calendar.AM_PM,Calendar.PM);

        cal.set(Calendar.MINUTE,55);
        cal.set(Calendar.SECOND,20);
        cal.set(Calendar.MILLISECOND,696);
        Date fecha = cal.getTime();

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss:SSS aaa");

        String fechaFinalformato= dateFormat.format(fecha);

        System.out.println("fechan sin formato = " + fecha);

        System.out.println("fecha con formato= " + fechaFinalformato);


    }
}
