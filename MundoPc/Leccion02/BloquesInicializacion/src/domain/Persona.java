package domain;

public class Persona{
    private final int idPersona;
    private static int contadorPersonas;
    
    static{  //Bloque de inicialización estático
        System.out.println("Ejecución del bloque estático");
        ++Persona.contadorPersonas;
        //IdPersona = 10; No es estático un atributo, por eso tenemos un error
    }
    
    //Bloque de inicialización NO estático (Contexto dinámico)
    {
        System.out.println("Ejecución del bloque no estático");
        this.idPersona = Persona.contadorPersonas++; //Incrementamos el atributo
    }
    
    
    //Los bloques de inicialización se ejecutan antes del constructor
    
    public Persona(){
        System.out.println("Ejecución del constructor");
    }
    
    public int getIdPersona(){
        return this.idPersona;
    }

    @Override
    public String toString() {
        return "Persona{" + "idPersona=" + idPersona + '}';
    }

    
}

        
    

