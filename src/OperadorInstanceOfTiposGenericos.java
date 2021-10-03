public class OperadorInstanceOfTiposGenericos {

    public static void main(String[] args) {

        Object texto = "Creando un objeto de la clase string";

        Number num = 10;

        boolean b1 = texto instanceof String;

        System.out.println("b1  es de la clase String= " + b1);

        b1 = texto instanceof Object;

        System.out.println("b1  es de la clase Object= " + b1);

        b1 = texto instanceof Integer;

        System.out.println("b1  es de la clase Integer= " + b1);

        b1 = num instanceof Integer;

        System.out.println("b1 es de la clase de Integer= " + b1);

        b1 = num instanceof Long;

        System.out.println("b1 es de la clase de Long= " + b1);

    }
}
