package tareas;

import java.util.Scanner;

public class SistemaDeNotas {

    public static void main(String[] args) {

        int cant = 20;

        double[] notas = new double[cant];

        System.out.println(" ingresa nota: " + (1) + " de 20");

        Scanner scanner = new Scanner(System.in);
        int i;
        for (i = 0; i < cant; i++) {
            if (i > 0) {
                System.out.println(" ingresa nota: " + (i + 1) + " de 20");
            }
            notas[i] = scanner.nextInt();
            if (notas[i] == 0) {
                i = 20;
            }
        }

        if (i == 21) {
            System.out.println("Error finalizando programa");
        } else {

            //promedio mayores a 5
            double sumaPromedio5 = 0;
            int contador1 = 0;

            for (i = 0; i < notas.length; i++) {
                if (notas[i] > 5) {
                    sumaPromedio5 += notas[i];
                    contador1++;
                }
            }
            double promedio = sumaPromedio5/contador1;

            System.out.println("El promedio de las notas mayores a 5 es: " + promedio);


            //promedio menores a 4
            double sumaPromedio4 = 0;
            int contador2 = 0;

            for (i = 0; i < notas.length; i++) {
                if (notas[i] <4) {
                    sumaPromedio4 += notas[i];
                    contador2++;
                }
            }
            double promedio2 = sumaPromedio4/contador2;

            System.out.println("El promedio de las notas menores a 4 es: " + promedio2);

            int cantNotasUno = 0;

            for(i = 0; i<notas.length;i++){
                if(notas[i] == 1){
                    cantNotasUno++;
                }
            }

            System.out.println("La cantidad de notas 1 es: " +cantNotasUno);
        }
    }
}