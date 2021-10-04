package operadores;

import java.util.Scanner;

public class OperadoresLogicosLogin {

    public static void main(String[] args) {

        String [] users = new String[3];

        String [] pass = new String[3];

        users[0] = "Pablo";
        pass[0] = "12345";

        users[1] = "Rafa";
        pass[1] = "1234";

        users[2] = "Admin";
        pass[2] = "123";


        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el username");

        String u = scanner.next();

        System.out.println("ingresa el password");

        String p = scanner.next();

        boolean esAutenticado = false;

        for(int i =0; i<users.length; i++){
            if(users[i].equals(u) && pass[i].equals(p)){
                esAutenticado = true;
                break;
            }
        }

        if(esAutenticado){
            System.out.println("Usuario Autenticado exitosamente");
        }else{
            System.out.println("Error de credenciales");
        }

    }
}
