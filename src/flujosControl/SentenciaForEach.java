package flujosControl;

public class SentenciaForEach {
    public static void main(String[] args) {

        int [] primos = {1,3,5,7,11,13,17};

        String[] nombres = {"andres","pepe","maria","paco","lalo","bea","pato","pepa"};

        for (int numero : primos) {
            System.out.println(numero);
        }

        for (String nombre:
             nombres) {
            System.out.print(" "+nombre);
        }

    }
}
