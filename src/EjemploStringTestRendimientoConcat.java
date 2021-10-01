public class EjemploStringTestRendimientoConcat {

    public static void main(String[] args) {

        String a ="a";

        String b ="b";

        String c ="a";

        StringBuilder sb = new StringBuilder(a);



        long inicio = System.currentTimeMillis();

        for(int i = 0; i < 100000; i++){
            //c= c.concat(a).concat(b).concat("\n");//0,0,111,3798
            //c+= a+b +"\n";//15,16,63,1484
            sb.append(a).append(b).append("\n"); //0,0.0,0
        }

        long fin = System.currentTimeMillis();

        System.out.println((fin-inicio));

        System.out.println("c = " + c);

        System.out.println("sb = " + sb.toString());


    }
}
