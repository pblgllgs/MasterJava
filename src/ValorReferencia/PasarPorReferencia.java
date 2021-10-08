package ValorReferencia;

public class PasarPorReferencia {
    public static void main(String[] args) {
        int []edades = {10,11,12};

        System.out.println("iniciamos en el main");

        for (int edad : edades) {
            System.out.println("edad = " + edad);
        }

        System.out.println("Antes del invocar el metodo test");
        test(edades);
        System.out.println("despues del invocar el metodo test");
        for (int i = 0;i<edades.length;i++) {
            System.out.println("edad = " + edades[i]);
        }

        System.out.println("finaliza el metodo main con los datos modificados");

    }

    public static void test(int[] edades ){
        System.out.println("inicia el metodo test");
        for (int i = 0 ; i< edades.length;i++) {
            edades[i] +=10;
        }
        System.out.println("finaliza el metodo test");
    }
}
