public class SentenciaSwitchCase {

    public static void main(String[] args) {

        char num =1 ;

        switch (num){
            case 0:
                System.out.println("el valor es 0");
                break;
            case 1:
                System.out.println("el valor es 1");
                break;
            case 2:
                System.out.println("el valor es 2");
                break;
            case 3:
                System.out.println("el valor es 3");
                break;
            default:
                System.out.println("no hay coinsidencias");
        }

        String admin ="adsasd";

        switch (admin){
            case "pablo":
                System.out.println("Bienvenido pablo");
                break;
            case "victor":
                System.out.println("Bienvenido victor");
                break;
            default:
                System.out.println("Usuario desconocido");
        }
    }
}
