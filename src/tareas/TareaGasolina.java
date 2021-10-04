package tareas;

import javax.swing.*;

public class TareaGasolina {

    public static void main(String[] args) {

        double estanque = 0;

        estanque = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa la medida actual del estanque:"));

        if (estanque >= 70) {
            JOptionPane.showMessageDialog(null,"Estanque lleno");
        }else if(estanque >=60 && estanque <70){
            JOptionPane.showMessageDialog(null,"Estanque casi lleno");
        }else if(estanque >=40 && estanque <60){
            JOptionPane.showMessageDialog(null,"Estanque 3/4");
        }else if(estanque >= 35 && estanque <40){
            JOptionPane.showMessageDialog(null,"Medio estanque");
        }else if(estanque >= 20 && estanque <35){
            JOptionPane.showMessageDialog(null,"Suficiente");
        }else if(estanque >=1 && estanque <20){
            JOptionPane.showMessageDialog(null,"Insuficiente");
        }
    }
}

