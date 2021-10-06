package tareas;

import java.util.Scanner;

public class MenorDeMultiples {

    public static void main(String[] args) {

        System.out.println("Igresa la cantidad de numeros que deceas comparar");

        Scanner scanner = new Scanner(System.in);

        int cantidadDeNumeros = scanner.nextInt();

        int [] numeros = new int[cantidadDeNumeros];

        for(int i = 0;i<cantidadDeNumeros; i++){
            System.out.println("ingresa el numero "+(i+1)+" a comparar.");
            numeros[i]= scanner.nextInt();
        }

        int min = numeros[0];

        for(int i =1; i< cantidadDeNumeros; i++){
            if (min > numeros[i]) {
                min = numeros[i];
            }
        }

        if (min<10) {
            System.out.println("el numero menor es menor que 10");
        }else{
            System.out.println("el numero menor es igual o mayor que 10");
        }

    }
}
