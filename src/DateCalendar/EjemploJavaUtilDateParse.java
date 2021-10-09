package DateCalendar;

import javax.swing.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class EjemploJavaUtilDateParse {
    public static void main(String[] args) {

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

        Date fecha = null;
        try {
            fecha = dateFormat.parse(JOptionPane.showInputDialog(null,"Ingresa una fecha: yyyy-MM-dd"));

            System.out.println("fecha = " + dateFormat.format(fecha));

            Date fecha2 = new Date();
            System.out.println("fecha2 = " + dateFormat.format(fecha2));

            if (fecha.after(fecha2)) {
                System.out.println("Fecha es en el futuro de fecha 2");
            }else if(fecha.before(fecha2)){
                System.out.println("Fecha es el pasado de fecha2");
            }else if(fecha.equals(fecha2)){
                System.out.println("son iguales");
            }

            if(fecha.compareTo(fecha2) > 0){
                System.out.println("Fecha es en el futuro de fecha 2");
            }else if(fecha.compareTo(fecha2) < 0){
                System.out.println("Fecha es el pasado de fecha2");
            } else if (fecha.compareTo(fecha2) == 0) {
                System.out.println("son iguales");
            }
        } catch (ParseException e) {
            System.err.println("La fecha no tiene un formato correcto" + e.getMessage());
            System.err.println("El formato debe ser: yyyy-MM-dd");
            main(args);
        }


    }
}
