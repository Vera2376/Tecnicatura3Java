
package domain;


public class Rectangulo extends FiguraGeometrica {
    
//Constuctor

    public Rectangulo(String tipoFigura){
        super(tipoFigura);
      
    }

  

    public void dibujar(){  //Implementamos el método
        System.out.println("Se imprime un: "+this.getClass().getSimpleName());
    }
    
    






  
}
    

