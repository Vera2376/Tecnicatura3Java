
package test;


public class TestAutoboxingUnboxing {
    public static void main(String[] args) {
        //Clases envolventes o Wrapper
        /*
            Clases envolventes de tipos primitivos
            int = la clase envolvente es Integer
            long = la clase envolvente es Long
            float = la clase envolvente es Float
            double= la clase envolvente es Double
            boolean = la clase envolvente es Boolean
            byte = la clase envolvente es Byte
            char = la clase envolvente es Character
            short = la clase envolvente es Short
        */
        int enteroPrim = 10;  //Tipo primitivo
        Integer entero = 10;  //Tipo Object con la clase Integer
        System.out.println("enteroPrim = " + enteroPrim);  //Autoboxing
        System.out.println("entero = " + entero);
        
        int entero2 = entero; //Unboxing
        System.out.println("entero2 = " + entero2);
        
        
    }
    
}