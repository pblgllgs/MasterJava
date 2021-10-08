package tareas;

import javax.swing.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CalcularEdad {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");

        Date nacimiento = dateFormat.parse(JOptionPane.showInputDialog(null,"Ingresa una fecha: dd-MM-yyyy"));

        System.out.println("fecha = " + dateFormat.format(nacimiento));

        Date aux = new Date();
        double millisANacimiento = nacimiento.getTime();
        System.out.println("millisANacimiento = " + millisANacimiento);
        double millisALaActualidad = aux.getTime();
        System.out.println("millisActuales = " + millisALaActualidad);

        double edadEnMilisegundos = millisALaActualidad-millisANacimiento;

        Double edadEnAnios = edadEnMilisegundos/3.154e+10;

        int edadFinal = edadEnAnios.intValue();
        String mensajeAnios = (edadFinal!= 1)?"años":"año";

        System.out.println("Tienes " + edadFinal +" "+mensajeAnios);

    }
}
