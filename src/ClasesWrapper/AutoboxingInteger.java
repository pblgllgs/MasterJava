package ClasesWrapper;

public class AutoboxingInteger {
    public static void main(String[] args) {

        Integer [] enteros = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};

        int suma =0;

        for(Integer arr : enteros){
            if (arr % 2 ==0) {
                suma += arr;
            }
        }

        System.out.println("suma = " + suma);

        suma = 0;

        for(Integer arr : enteros){
            if (arr.intValue() % 2 ==0) {
                suma += arr.intValue();
            }
        }

        System.out.println("suma = " + suma);
    }
}
