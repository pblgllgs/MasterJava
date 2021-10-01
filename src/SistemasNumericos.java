import javax.swing.*;

public class SistemasNumericos {

    public static void main(String[] args) {

        String  numeroStr = JOptionPane.showInputDialog(null,"Ingrese un numero entero:");

        int numeroDecimal = 0;

        try {
            numeroDecimal = Integer.parseInt(numeroStr);
        }catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null,"Debe ingresar un numero");
            main(args);
            System.exit(0);
        }

        System.out.println("numeroDecimal = " + numeroDecimal);

        String resultadoBinario = " numero binario = " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);

        System.out.println(resultadoBinario);

        int numeroBinario = 0b11110;

        System.out.println("numero decimal = " + numeroBinario);

        String resultadoOctal = " numero octal = " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal);

        System.out.println(resultadoOctal);

        int numeroOctal = 036;

        System.out.println("numeroOctal = " + numeroOctal);

        String resultadoHexa = " numero hexadecimal "+numeroDecimal+" = " + Integer.toHexString(numeroDecimal);

        System.out.println(resultadoHexa);

        int numeroHex = 0x1e;

        System.out.println("numeroHex = " + numeroHex);

        String resultado = resultadoBinario;

        resultado +="\n"+ resultadoOctal;

        resultado += "\n"+ resultadoHexa;

        JOptionPane.showMessageDialog(null,resultado);
    }
}
