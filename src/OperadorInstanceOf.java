public class OperadorInstanceOf {

    public static void main(String[] args) {

        String texto = "Creando un objeto de la clase string";

        Integer num = 10;

        boolean b1 = texto instanceof String;

        System.out.println("b1  es de la clase String= " + b1);

        b1 = texto instanceof Object;

        System.out.println("b1  es de la clase Object= " + b1);

        b1 = num instanceof Integer;

        System.out.println("b1 es de la clase de Integer= " + b1);

        b1 = num instanceof Number;

        System.out.println("b1 es de la clase de Number= " + b1);

    }
}
