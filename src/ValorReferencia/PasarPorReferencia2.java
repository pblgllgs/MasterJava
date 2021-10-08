package ValorReferencia;

public class PasarPorReferencia2 {
    public static void main(String[] args) {
        Persona persona;

        persona = Persona.builder().nombre("mario").build();

        System.out.println("iniciamos en el main");

        System.out.println("persona = " + persona.getNombre());

        System.out.println("Antes del invocar el metodo test");
        test(persona);
        System.out.println("despues del invocar el metodo test " +persona.getNombre());


        System.out.println("finaliza el metodo main con los datos modificados");

    }

    public static void test(Persona persona ){
        System.out.println("inicia el metodo test");
        persona.cambiaNombre("pablo");
        System.out.println("finaliza el metodo test");
    }
}
