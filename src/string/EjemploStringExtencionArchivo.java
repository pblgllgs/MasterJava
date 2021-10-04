package string;

public class EjemploStringExtencionArchivo {

    public static void main(String[] args) {

        String archivo = "app.component.ts";
        int i = archivo.lastIndexOf(".");
        System.out.println("i = " + i);
        String extencion = archivo.substring(i+1);
        System.out.println("La extencion del archivo es = " + extencion);
    }
}
