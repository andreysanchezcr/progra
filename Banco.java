
package tp2;

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
    }

    /**
     * Obtiene el nombre del banco
     * @return El nombre del banco
     */
    public String getNombre() {
        return nombre;
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
}
