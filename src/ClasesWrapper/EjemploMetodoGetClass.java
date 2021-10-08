package ClasesWrapper;

import java.lang.reflect.Method;

public class EjemploMetodoGetClass {
    public static void main(String[] args) {

        String texto = "Hola que tal";

        Class strClass = texto.getClass();

        System.out.println("strClass = " + strClass.getName());
        System.out.println("strClass = " + strClass.getSimpleName());
        System.out.println("strClass = " + strClass.getPackage());
        System.out.println("strClass = " + strClass.getPackageName());
        System.out.println("strClass = " + strClass);

        for (Method method: strClass.getMethods()) {
            System.out.println("method = " + method.getName());
        }

        Integer num = 42;

        Class intClass = num.getClass();
        Class objClass = intClass.getSuperclass().getSuperclass();
        System.out.println("intClass = " + objClass);

        for (Method methodsObject: objClass.getMethods()) {
            System.out.println("methodsObject = " + methodsObject.getName());
        }


    }
}
