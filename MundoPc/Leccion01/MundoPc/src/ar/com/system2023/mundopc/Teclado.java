
package ar.com.system2023.mundopc;


public class Teclado extends DispositivoEntrada{
     private final int idTeclado;
    private static int contadorTeclados;
    
    public Teclado(String tipoEntrada, String marca){
        super(tipoEntrada, marca);
        this.idTeclado = ++Teclado.contadorTeclados;
    }

    @Override
    public String toString() {
         String idteclado = null;
        return "Raton{" + "idRaton=" + idteclado + ", "+super.toString()+ '}';
    }
    
}
