import java.io.IOException;

public class EjemploEjecutarProgramaSO {
    public static void main(String[] args) {
        Runtime rt = java.lang.Runtime.getRuntime();

        Process process;

        try {
             if (System.getProperty("os.name").toLowerCase().contains("windows")) {
                process = rt.exec("cmd");
             }else if (System.getProperty("os.name").toLowerCase().contains("mac")) {
                process = rt.exec("textedit");
             }else if (System.getProperty("os.name").toLowerCase().contains("nux") ||
                     System.getProperty("os.name").toLowerCase().contains("nix")) {
                 process = rt.exec("gedit");
             }else{
                 process = rt.exec("gedit");
             }
             process.waitFor();
        } catch (IOException | InterruptedException e) {
                e.printStackTrace();
                System.err.println("El comando es desconocido"+ e.getMessage());
        }

        System.out.println("Se ha cerrado el editor");
    }
}
