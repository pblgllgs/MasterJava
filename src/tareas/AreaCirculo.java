package tareas;

import javax.swing.*;

public class AreaCirculo {
    public static void main(String[] args) {

        double radio = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el radio del circulo para calcular su área"));

        double area = Math.PI * Math.pow(radio,2);

        JOptionPane.showMessageDialog(null,"El valor del radio es: " + area);
    }
}
