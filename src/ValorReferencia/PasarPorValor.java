package ValorReferencia;

public class PasarPorValor {
    public static void main(String[] args) {
        int i = 10;

        System.out.println("iniciamos en el main con i = " + i);

        test(i);

        System.out.println("Finaliza el metodo main con el i = " + i);

    }

    public static void test(int i ){
        System.out.println("Iniciamos el metodo test con i = " +i);
        i=35;
        System.out.println("Finaliza el metodo test con valor de i = " + i);
    }
}
