package flujosControl;

public class SentenciaIfElse {

    public static void main(String[] args) {

        float promedio = 6.0f;

        if (promedio >= 6.5) {
            System.out.println("Excelente promedio");
        }else if(promedio >= 6.0 ){
            System.out.println("Muy buen promedio");
        } else if (promedio >= 5.5) {
            System.out.println("Buen promedio");
        } else if (promedio >= 5.0) {
            System.out.println("Regular");
        }else if (promedio >= 4.0) {
            System.out.println("Insuficiente");
        }else{
            System.out.println("Reprovado");
        }

    }
}
