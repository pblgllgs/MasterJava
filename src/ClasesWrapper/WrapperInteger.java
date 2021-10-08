package ClasesWrapper;

public class WrapperInteger {
    public static void main(String[] args) {

        int intPrimitivo = 128;

        Integer intObjeto1 = Integer.valueOf(intPrimitivo);

        Integer intObjeto2 = 32;

        int num = Integer.parseInt(intObjeto2.toString());

        int num1 = intObjeto2;

        int num2 = intObjeto2.intValue();

        System.out.println("num = " + num2 + " "+ num1 +" "+num);

        String valorTv = "67000";

        Integer valor = Integer.valueOf(valorTv);

        System.out.println("valor = " + valor);

        //perdida de datos, el intObjeto es de un tipo que soporta un valor mas alto que el short/Short
        Short shortObjeto = intObjeto1.shortValue();
        System.out.println("shortObjeto = " + shortObjeto);

        //perdida de datos tambien, igual que en el caso anterior
        Byte byteObjeto = intObjeto1.byteValue();
        System.out.println("byteObjeto = " + byteObjeto);



    }
}
