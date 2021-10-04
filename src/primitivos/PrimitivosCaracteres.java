package primitivos;

public class PrimitivosCaracteres {

    public static void main(String[] args) {

        char caracter = '\u0040';
        char decimal = 64;
        System.out.println("caracter = " + caracter);
        System.out.println("decimal = " + decimal);
        System.out.println("decimal = caracter: " + (decimal  == caracter));

        char simbolo = '@';
        System.out.println("simbolo = " + simbolo);
        System.out.println("simbolo = caracter " + (simbolo == caracter));

        char espacio = ' ';
        char retroceso = '\b';
        char tabulador = '\t';


        System.out.println("tipo char corresponde en byte a"+espacio+ Character.BYTES);
        System.out.println("tipo char corresponde en bites a " + Character.SIZE);
        System.out.println("valor maximo de un float: " +Character.MAX_VALUE);
        System.out.println("valor minimo de un float: " +Character.MIN_VALUE);



    }
}
