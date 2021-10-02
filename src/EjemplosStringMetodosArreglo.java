import java.util.Arrays;

public class EjemplosStringMetodosArreglo {

    public static void main(String[] args) {

        String trabalengua = "trabalenguas";

        System.out.println("trabalengua.toCharArray() = " + Arrays.toString(trabalengua.toCharArray()));

        char[] arreglo = trabalengua.toCharArray();

        for(int i=0;i<arreglo.length;i++){
            System.out.println("caracter en posicion "+i +" : "+ arreglo[i]);
        }

        System.out.println("trabalengua = " + Arrays.toString(trabalengua.split("a")));

        String[] arrSplit = trabalengua.split("a");

        for(int i=0;i<arrSplit.length;i++){
            System.out.println("caracter en posicion "+i +" : "+ arrSplit[i]);
        }

        String archivoTypescript = "app.component.ts";

        String[] arrSplitTypescript = archivoTypescript.split("\\.");

        System.out.println("arrSplitTypescript.toString() = " + Arrays.toString(arrSplitTypescript));

        for(int i=0;i<arrSplitTypescript.length;i++){
            System.out.println("caracter en posicion "+ i +" : "+ arrSplitTypescript[i]);
        }


    }
}
