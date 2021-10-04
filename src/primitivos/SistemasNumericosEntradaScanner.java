package primitivos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SistemasNumericosEntradaScanner {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa un numero");

        //String  numeroStr = scanner.nextLine();

        int numeroDecimal = 0;

        try {
            numeroDecimal = scanner.nextInt();//Integer.parseInt(numeroStr);
        }catch (InputMismatchException e ){
            System.out.println("Debe ingresar un numero");
            main(args);
            System.exit(0);
        }

        System.out.println("numeroDecimal = " + numeroDecimal);

        String resultadoBinario = "numero binario = " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);

        String resultadoOctal = "numero octal = " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal);

        String resultadoHexa = "numero hexadecimal "+numeroDecimal+" = " + Integer.toHexString(numeroDecimal);


        String resultado = resultadoBinario;

        resultado +="\n"+ resultadoOctal;

        resultado += "\n"+ resultadoHexa;

        System.out.println(resultado);

    }
}
