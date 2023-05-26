
package test;

import enumeraciones.Continentes;
import enumeraciones.Dias;


public class TestEnumeraciones {
    public static void main(String[] args) {
        System.out.println("Dia1: "+Dias.LUNES);  //Las enumeraciones se tratan como cadenas
        //Ahora no se deben utilizar comillas, se accede a traves de el operador a punto
        System.out.println("Continentes Nª 4: "+Continentes.AMERICA);
        System.out.println("Nª de Paises en el 4to.continente: "+Continentes.AMERICA.getHabitantes());
    }
    
private static void IndicarDiaSemana(Dias dias){
    switch(dias){
        case LUNES:
            System.out.print("Primer dia de la semana");
            break;
        case MARTES:
            System.out.print("Segundo dia de la semana");
            break;
            //Agregar todos los dias de la semana
            //Agregar default
        case MIERCOLES:
            System.out.print("Tercer dia de la semana");
            break;
        case JUEVES:
            System.out.print("Cuarto dia de la semana");
            break;
        case VIERNES:
            System.out.print("Quinto dia de la semana");
            break;
        case SABADO:
            System.out.print("Sexto dia de la semana");
            break;
        case DOMINGO:
            System.out.print("Septimo dia de la semana");
            break;
         
        }
    }
    
}
