package tareas;

import javax.swing.*;

public class Multiplicacion {

    public static void main(String[] args) {

        int num1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa el primer numero"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa el segundo numero"));

        int aux= 0,aux1 = num1,aux2= num2;

        if(num1<0){
            aux1= -(num1);
        }
        if(num2<0){
            aux2= -(num2);
        }

        for(int i = aux1; i>0;i--){
            aux += aux2;
        }

        if(num1>0 && num2<0 || num1<0 && num2>0){
            aux = -(aux);
        }

        JOptionPane.showMessageDialog(null,aux);

    }
}
