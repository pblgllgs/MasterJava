import java.util.Scanner;

public class ProgramaManejoDeNombres {

    public static void main(String[] args) {

        System.out.println("Ingresa Nombre 1");

        Scanner scanner1 = new Scanner(System.in);

        String nombre1 = scanner1.next();

        System.out.println("Ingresa Nombre 2");

        Scanner scanner2 = new Scanner(System.in);

        String nombre2 = scanner2.next();

        System.out.println("Ingresa Nombre 3");

        Scanner scanner3 = new Scanner(System.in);

        String nombre3 = scanner3.next();


        String n1 = nombre1
                .substring(nombre1.length()-(nombre1.length()-1),nombre1.length()-(nombre1.length()-2))
                .toUpperCase()
                .concat(".")
                .concat(nombre1.substring(nombre1.length()-2));

        String n2 = nombre2
                .substring(nombre2.length()-(nombre2.length()-1),nombre2.length()-(nombre2.length()-2))
                .toUpperCase()
                .concat(".")
                .concat(nombre2.substring(nombre2.length()-2));

        String n3 = nombre3
                .substring(nombre3.length()-(nombre3.length()-1),nombre3.length()-(nombre3.length()-2))
                .toUpperCase()
                .concat(".")
                .concat(nombre3.substring(nombre3.length()-2));

        System.out.println(n1.concat("_").concat(n2).concat("_").concat(n3));
    }
}
