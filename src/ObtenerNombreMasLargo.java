import javax.swing.*;

public class ObtenerNombreMasLargo {

    public static void main(String[] args) {

        int count1 = 0,count2 = 0,count3 = 0;

        String [] nombre1 = (JOptionPane.showInputDialog(null,"Ingresa el nombre 1:")).split(" ");
        String [] nombre2 = (JOptionPane.showInputDialog(null,"Ingresa el nombre 2:")).split(" ");
        String [] nombre3 = (JOptionPane.showInputDialog(null,"Ingresa el nombre 3:")).split(" ");

        count1 = nombre1[0].length() + nombre1[1].length();
        count2 = nombre2[0].length() + nombre2[1].length();
        count3 = nombre3[0].length() + nombre3[1].length();

        String mensajeFinal = count1 > count2 && count1 > count3 ?
                nombre1[0].concat(" ").concat(nombre1[1]) :
                (count2 > count3 ?
                        nombre2[0].concat(" ").concat(nombre2[1]) :
                        nombre3[0].concat(" ").concat(nombre3[1]));

        JOptionPane.showMessageDialog(null,mensajeFinal + " tiene el nombre mas largo.");

    }
}
