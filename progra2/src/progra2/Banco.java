
package progra2;

/**
 * Implementacion de la clase banco
 * @author Familia Alpizar R
 */
public class Banco {
    
    /**
     * Atributos de la clase
     */
    public String nombre;
    public int cantidadCajas;
    public int cantidadDisponibles;
    public int cantidadCajasOcupadas;

    /**
     * Costructor predeterminado
     */
    public Banco() {
    }

    /**
     * Costructor de la clase banco
     * @param nombre Se refiere al nombre del banco
     * @param cajas Cantidas de cajas que contiene el banco 
     */
    public Banco(String nombre, int cajas) {
        this.nombre = nombre;
        this.cantidadCajas = cajas;
        this.cantidadDisponibles = cajas;
        this.cantidadCajasOcupadas = 0;
    }

    /**
     * Obtiene el nombre del banco
     * @return El nombre del banco
     */
    public String getNombre() {
        return nombre;
    }
    
     /**
     * Obtiene la cantidad de cajas disponibles
     * @return La cantidad de cajas disponibles
     */
    public int getDisponibles(){
        return this.cantidadDisponibles;
    }
    
     /**
     * Establecer la cantidad de cajas disponibles
     * @param numero La cantidad de cajas disponibles
     */
    public void setDisponibles(int numero){
        if(numero <= this.cantidadCajas){
            this.cantidadDisponibles = numero;
        }
    }
    
    /**
     * Establecer el nombre del banco
     * @param nombre Nombre del banco establecido por el usuario
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    /**
     * Obtiene la cantidad de cajas que posee el banco
     * @return La cantidas de cajas que tiene el banco
     */
    public int getCantidadCajas() {
        return cantidadCajas;
    }

    
    /**
     * Establece la cantidad de cajas que tiene el banco
     * @param cajas Cantidad de cajas establecidas por el usuario
     */
    public void setCantidadCajas(int cajas) {
        this.cantidadCajas = cajas;
    }
    
    public int getCantidadOcupadas(){
        return this.cantidadCajasOcupadas;
    }
    
    public void sumarOcupadas(){
        cantidadCajasOcupadas++;
    }
    
    public void restarOcupadas(){
        if(cantidadCajasOcupadas >= 0){
            cantidadCajasOcupadas--;
        }   
    }
}
