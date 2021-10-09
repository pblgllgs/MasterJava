package system;

import java.util.Map;

public class EjemploVariablesDeEntorno {
    public static void main(String[] args) {
        Map<String, String> varEnv = System.getenv();

        System.out.println("Variables de entorno del sistema"+ varEnv);

        String  username = System.getenv("USERNAME");
        System.out.println("username = " + username);

        String  jH = System.getenv("JAVA_HOME");
        System.out.println("jH = " + jH);

        String tempDir = System.getenv("TEMP");
        System.out.println("tempDir = " + tempDir);

        String path = System.getenv("PATH");
        System.out.println("path = " + path);

        String path2 = varEnv.get("Path");
        System.out.println("path = " + path2);

        String hola = varEnv.get("HOLA_SALUDO");
        System.out.println("Saludo = " + hola);

        for (String key: varEnv.keySet()) {
            System.out.println( key +"=>" + varEnv.get(key));
        }

    }
}
