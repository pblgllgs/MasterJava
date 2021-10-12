import java.io.IOException;

public class ArgumentosLineaComandoCalculadora {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.err.println("Debe ingresar 3 parametros");
            System.exit(-1);
        }

        String operacion = args[0];
        int a = 0;
        int b = 0;
        double resultado = 0.0;
        try {
             a = Integer.parseInt(args[1]);
             b = Integer.parseInt(args[2]);
        }catch (NumberFormatException e){
            System.err.println("A y b deben ser enteros");
        }

        switch (operacion) {
            case "suma" :
                resultado = a+b;
                break;
            case "resta":
                resultado = a-b;
                break;
            case "multi":
                resultado = a*b;
                break;
            case "div":
                if (b ==0){
                    System.err.println("no se puede dividir por 0");
                    System.exit(-1);
                }else{
                    resultado = a/b;
                    break;
                }
            default:
                resultado = a+b;
                break;

        }
        System.out.println("Resultado de la operacion: "+ resultado);
    }
}
