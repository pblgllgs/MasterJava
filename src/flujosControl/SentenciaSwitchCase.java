package flujosControl;

import javax.swing.*;

public class SentenciaSwitchCase {

    public static void main(String[] args) {

        int mes = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el numero del mes"));

        String nombreMes = null;


        switch (mes) {
            case 1:
                nombreMes = "enero";
                break;
            case 2:
                nombreMes = "febrero";
                break;
            case 3:
                nombreMes = "marzo";
                break;
            case 4:
                nombreMes = "abril";
                break;
            case 5:
                nombreMes = "mayo";
                break;
            case 6:
                nombreMes = "junio";
                break;
            case 7:
                nombreMes = "julio";
                break;
            case 8:
                nombreMes = "agosto";
                break;
            case 9:
                nombreMes = "septiembre";
                break;
            case 10:
                nombreMes = "octubre";
                break;
            case 11:
                nombreMes = "noviembre";
                break;
            case 12:
                nombreMes = "diciembre";
                break;
            default:
                nombreMes = "indefinido";
        }

        JOptionPane.showMessageDialog(null,"el mes es: " + nombreMes);

        char num =2;

        switch (num){
            case 0:
                System.out.println("el valor es 0");
                break;
            case 1:
                System.out.println("el valor es 1");
                break;
            case 2:
                System.out.println("el valor es 2");
                break;
            case 3:
                System.out.println("el valor es 3");
                break;
            default:
                System.out.println("no hay coinsidencias");
        }

        String admin ="pablo";

        switch (admin){
            case "pablo":
                System.out.println("Bienvenido pablo");
                break;
            case "victor":
                System.out.println("Bienvenido victor");
                break;
            default:
                System.out.println("Usuario desconocido");
        }
    }
}
