package flujosControl;

import javax.swing.*;
import java.util.Locale;

public class SentenciaForArreglo {

    public static void main(String[] args) {

        String[] nombres = {"andres","pepe","maria","paco","lalo","bea","pato","pepa"};
        int count = nombres.length;
        for(int i =1; i< count-1;i++){
            System.out.println("nombres = "+ i +" " + nombres[i]);
        }

        for(int i =0; i< count;i++){
            if(nombres[i].equalsIgnoreCase("andres")||nombres[i].equalsIgnoreCase("pepa") ){
                continue;
            }
            System.out.println("nombres = "+ i +" " + nombres[i]);
        }

        for(int i =0; i< count;i++){
            if(nombres[i].toLowerCase().contains("andres")||nombres[i].toLowerCase().contains("pepa") ){
                continue;
            }
            System.out.println("nombres = "+ i +" " + nombres[i]);
        }

        String buscar = JOptionPane.showInputDialog(null,"Ingresa un nombre ej: \"pepe\". ");

        boolean encontrado = false;

        for(int i =0;i< count; i++){
            if(nombres[i].equalsIgnoreCase(buscar)){
                encontrado = true;
                break;
            }
        }

        if (encontrado) {
            JOptionPane.showMessageDialog(null,"El nombre se encontró en el arreglo");
        }else{
            JOptionPane.showMessageDialog(null,"El nombre se no encontró  en el arreglo");
        }



    }
}
