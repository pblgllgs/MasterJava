package math;

import java.util.Random;

public class EjemploClaseMathRandom {
    public static void main(String[] args) {

        String [] colores = {"azul","amarillo","rojo","verde","blanco","negro"};


        double random = Math.random();
        System.out.println("random = " + random);

        random *= colores.length;
        System.out.println("random = " + random);

        random = Math.floor(random);
        System.out.println("random = " + random);

        System.out.println("colores = " + colores[(int) random]);

        Random rand = new Random();
        int randomInt = 15 + rand.nextInt(10);
        System.out.println("randomInt = " + randomInt);

        randomInt = rand.nextInt(colores.length);

        System.out.println("randomInt = " + randomInt);
        System.out.println("colores = " + colores[randomInt]);

    }
}
