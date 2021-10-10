import java.util.Locale;

public class HolaMundo {
    public static void main(String[] args) {

        String saludo= "Hola Toki Leftraru!!!";

        System.out.println(saludo.toUpperCase(Locale.ROOT));

        int numero = 10;

        System.out.println("numero = " + numero);

        boolean valor = false;

        if(valor){
            System.out.println("es verdadero");
        }else {
            System.out.println("es falso");
        }
    }
}