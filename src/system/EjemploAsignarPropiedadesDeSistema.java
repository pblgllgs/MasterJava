package system;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class EjemploAsignarPropiedadesDeSistema {

    public static void main(String[] args) {

        try {
            FileInputStream fis = new FileInputStream("src/system/config.properties");

            Properties p = new Properties(System.getProperties());

            p.load(fis);

            p.setProperty("mi.propiedad.personalizada","El valor de mi propiedad");

            System.setProperties(p);

            Properties ps = System.getProperties();

            System.out.println("ps.getProperty(\"mi.propiedad.personalizada\") = " + ps.getProperty("mi.propiedad.personalizada"));

            System.out.println(System.getProperty("mi.propiedad.personalizada"));
            System.out.println(System.getProperty("config.autor.email"));
            System.out.println(System.getProperty("config.puerto.servidor"));
            System.out.println(System.getProperty("otra"));

            ps.list(System.out);
        } catch (IOException e) {
            System.err.println("No existe el archivo. " + e);;
            System.exit(1);
        }

    }
}
