import javax.swing.*;

public class SentenciaIfElseNumDiasMes {

    public static void main(String[] args) {

        int mes = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa el mes"));
        int anio = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa el año"));

        String mensaje ="";

        int numeroDias = 0;

        if (mes == 1 || mes ==3|| mes ==5 || mes ==7 ||mes ==8 ||mes == 10 || mes ==12) {
            numeroDias = 31;
        } else if (mes == 4 || mes ==6|| mes ==9 || mes ==11) {
            numeroDias = 30;
        }else if (mes == 2){
            if(anio % 400 == 0 || (anio % 4 == 0 && anio % 100 !=0)){
                numeroDias = 29;
                mensaje="Año bisiesto";
            }else{
                numeroDias = 28;
            }
        }

        JOptionPane.showMessageDialog(null,"numeroDias = " + numeroDias +" "+mensaje);

    }
}
