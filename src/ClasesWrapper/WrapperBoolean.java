package ClasesWrapper;

public class WrapperBoolean {
    public static void main(String[] args) {

        Integer num1,num2;

        num1 = 1;
        num2 = 2;

        boolean primBoolean = num1>num2;
        Boolean objBoolean1 = Boolean.valueOf(primBoolean);
        Boolean objBoolean2 = Boolean.valueOf("false");
        Boolean objBoolean3 = false;

        System.out.println("primBoolean = " + primBoolean);
        System.out.println("objBoolean1 = " + objBoolean1);
        System.out.println("objBoolean2 = " + objBoolean2);

        //caracteristica exclusiva de los boolean son iguales tanto por instancia que por valor
        System.out.println("Comparando 2 obj boolean " + (objBoolean2 == objBoolean1));
        System.out.println("Comparando 2 obj boolean " + (objBoolean2.equals(objBoolean1)));
        System.out.println("Comparando 2 obj boolean " + (objBoolean2 == objBoolean3));
        System.out.println("Comparando 2 obj boolean " + (objBoolean2.equals(objBoolean3)));
        System.out.println("Comparando 2 obj boolean " + (objBoolean1 == objBoolean3));
        System.out.println("Comparando 2 obj boolean " + (objBoolean1.equals(objBoolean3)));

        boolean primBoolean2 = objBoolean2.booleanValue();
        System.out.println("primBoolean2 = " + primBoolean2);

    }
}
