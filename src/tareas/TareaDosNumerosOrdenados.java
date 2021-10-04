package tareas;

import java.util.Scanner;

public class TareaDosNumerosOrdenados {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("ingresa el primer numero");

        int num1 = scanner.nextInt();

        System.out.println("ingresa el segundo numero");
        int num2 = scanner.nextInt();

        String numtext1 = Integer.toString(num1);
        String numtext2 = Integer.toString(num2);

        String resultado = num1 > num2 ? numtext1.concat(",").concat(numtext2) : numtext2.concat(",").concat(numtext1);

        System.out.println("numeros ordendos = " + resultado);

    }
}
