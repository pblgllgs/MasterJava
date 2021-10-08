package DateCalendar;

import java.text.SimpleDateFormat;
import java.util.Date;

public class EjemploJavaUtilDate {
    public static void main(String[] args) {
        Date fecha = new Date();

        System.out.println("fecha = " + fecha);

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEEE dd 'de' MMMM, yyyy");

        String fechaStr = simpleDateFormat.format(fecha);

        int suma = 0;
        Date inicio = new Date();
        for(int i =0 ; i<1000000000;i++){
            suma +=i;
        }
        Date fin = new Date();

        long resta = fin.getTime() - inicio.getTime();

        System.out.println("resta = " + resta);

        System.out.println("suma = " + suma);

        System.out.println("fechaStr = " + fechaStr);
    }
}
