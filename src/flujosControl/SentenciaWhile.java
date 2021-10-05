package flujosControl;

public class SentenciaWhile {

    public static void main(String[] args) {

        int i = 0;

        while (i<5){
            System.out.println("i while = " + i);
            i++;
        }

        boolean prueba = true;
        i =0;
        while (prueba) {
            if (i == 7) {
                prueba = false;
            }
            System.out.println("i = " + i);
            i++;
        }

        prueba = false;

        while (prueba){
            System.out.println("nunca se va a ejecutar");
        }

        prueba = true;
        i = 0;
        do{
            if (i == 7) {
                prueba = false;
            }
            System.out.println("i do while = " + i);
            i++;
        } while (prueba);



    }
}
