package flujosControl;

import javax.swing.*;

public class SentenciaSwithCaseNumDiasMes {

    public static void main(String[] args) {

        int mes = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa el mes"));
        int anio = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa el año"));

        String mensaje ="";

        int numeroDias = 0;

        switch (mes){
            case 1,3,5,7,8,10,12:
                numeroDias = 31;
                break;
            case 4,6,9,11:
                numeroDias = 30;
                break;
            case 2:
                if(anio % 400 == 0 || (anio % 4 == 0 && anio % 100 !=0)){
                    numeroDias = 29;
                    mensaje="Año bisiesto";
                }else{
                    numeroDias = 28;
                }
                break;
        }
        JOptionPane.showMessageDialog(null,"numeroDias = " + numeroDias +" "+mensaje);
    }
}
