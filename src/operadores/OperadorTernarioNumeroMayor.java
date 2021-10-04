package operadores;

import java.util.Scanner;

public class OperadorTernarioNumeroMayor {

    public static void main(String[] args) {

        int max = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("ingresa un numero");

        int num1 =  scanner.nextInt();

        System.out.println("ingresa sdo. numero");

        int num2 =  scanner.nextInt();

        System.out.println("ingresa ter. numero");

        int num3 =  scanner.nextInt();

        System.out.println("ingresa cto. numero");

        int num4 =  scanner.nextInt();

        max = num1>num2 ? num1 :num2;
        max = max >num3 ? max :num3;
        max = max >num4 ? max : num4;

        System.out.println("max = " + max);

    }
}
