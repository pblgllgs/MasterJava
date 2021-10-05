package flujosControl;

public class SentenciaFor {

    public static void main(String[] args) {

        for (int i = 0;i< 5 ;i++){
            System.out.println("i = " + i);
        }

        System.out.println("pares");
        for (int i = 0; i < 10; i++){
            if (i%2 == 0){

                System.out.println("i = " + i);
            }
        }

        System.out.println("impares");
        for (int i = 0; i < 10; i++){
            if (i%2 != 0){
                System.out.println("i = " + i);
            }
        }
    }
}
