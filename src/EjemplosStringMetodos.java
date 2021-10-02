public class EjemplosStringMetodos {

    public static void main(String[] args) {

        String nombre = "Pablo";
        System.out.println("nombre = " + nombre);
        System.out.println("nombre.length() = " + nombre.length());
        System.out.println("nombre.toLowerCase() = " + nombre.toLowerCase());
        System.out.println("nombre.toUpperCase() = " + nombre.toUpperCase());
        System.out.println("nombre.equals(\"Pablo\") = " + nombre.equals("Pablo"));
        System.out.println("nombre.equals(\"pablo\") = " + nombre.equals("pablo"));
        System.out.println("nombre.equalsIgnoreCase(\"pablo\") = " + nombre.equalsIgnoreCase("pablo"));
        System.out.println("nombre.compareTo(\"\") = " + nombre.compareTo("Pablo"));
        System.out.println("nombre.charAt(0) = " + nombre.charAt(0));
        System.out.println("nombre.charAt(nombre.length()-1) = " + nombre.charAt(nombre.length()-1));
        System.out.println("nombre.substring(3) = " + nombre.substring(3));
        System.out.println("nombre.substring(2,4) = " + nombre.substring(2,4));
        System.out.println(" nombre.substring(nombre.length()-1,nombre.length()) = " + nombre.substring(nombre.length()-1,nombre.length()));
        
        String trabalengua = "trabalenguas";
        System.out.println("trabalenguas = " + trabalengua.replace("a","i"));
        System.out.println("trabalengua.indexOf(\"e\") = " + trabalengua.indexOf("e"));
        System.out.println("trabalengua.lastIndexOf('a') = " + trabalengua.lastIndexOf('a'));
        System.out.println("trabalengua.lastIndexOf('z') = " + trabalengua.lastIndexOf('z'));
        System.out.println("trabalengua.indexOf('z') = " + trabalengua.indexOf('z'));
        System.out.println("trabalengua.contains(\"lengua\") = " + trabalengua.contains("lengua"));
        System.out.println("trabalengua.startsWith(\"lenguas\") = " + trabalengua.startsWith("lenguas"));
        System.out.println("trabalengua.startsWith(\"traba\") = " + trabalengua.startsWith("traba"));
        System.out.println("trabalengua.endsWith(\"uas\") = " + trabalengua.endsWith("uas"));
        System.out.println("trabalengua.endsWith(\"tra\") = " + trabalengua.endsWith("tra"));
        System.out.println("  trabalenguas  ");
        System.out.println("  trabalenguas  ".trim());
    }
}
