package primitivos;

public class ConversionDeTipos {

    public static void main(String[] args) {

        String numeroStr = "50";

        int numeroInt = Integer.parseInt(numeroStr);

        System.out.println("numeroInt = " + numeroInt);

        String realStr = "3216.54e-3";

        double realDouble = Double.parseDouble(realStr);

        System.out.println("realDouble = " + realDouble);

        String logico = "false";

        boolean bool = Boolean.parseBoolean(logico);

        System.out.println("bool = " + bool);


        int otroNumeroInt = 100;

        System.out.println("otroNumero = " + otroNumeroInt);

        String otroNumeroStr =Integer.toString(otroNumeroInt);

        System.out.println("otroNumeroStr = toString " + otroNumeroStr);

        otroNumeroStr = String.valueOf(otroNumeroInt + 100);

        System.out.println("otroNumeroStr = valueOf " + otroNumeroStr);

        String otroRealStr = Double.toString(1.23456d);

        System.out.println("otroRealStr = " + otroRealStr);

        otroRealStr = String.valueOf(1.23456e2f);

        System.out.println("otroRealStr = " + otroRealStr);

        int i = 100000;

        short s = (short) i;

        System.out.println("s = " + s);

        long l = i;
        System.out.println("l = " + l);

        System.out.println(Short.MAX_VALUE);

        char c = (char)i;
        System.out.println("c = " + c);

        float f = (float) i;
        System.out.println("f = " + f);

    }
}
