package operadores;

import java.util.Scanner;

public class OperadorTernario {

    public static void main(String[] args) {

        int variable = 10<5 ? 15:20;

        System.out.println("variable = " + variable);


        String resultado = "";

        int nota1 = 30, nota2 = 20;

        int promedio = (nota1 +nota2)/2;


        resultado = promedio >=40 ? "Aprovado" : "Reprovado";

        System.out.println("resultado = " + resultado);

        String user = "Pablo";
        String pass = "12345";

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el username");

        String u = scanner.next();

        System.out.println("ingresa el password");

        String p = scanner.next();

        boolean esAutenticado = false;

        esAutenticado = user.equals(u) && pass.equals(p) || esAutenticado;

        String mensaje = esAutenticado ? "autenticado exitosamente": "Error en la autenticacion";

        System.out.println("mensaje = " + mensaje);

    }
}
