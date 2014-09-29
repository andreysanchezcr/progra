
package tareaprogramada2;

/**
 *
 * @author Familia Alpizar R
 */
public class Persona {
    
    /**
     * Atributos de la clase Persona
     */
    public String nombre;
    private String correo;
    public String prioridad;

    
    /**
     * Constructor de la clase Persona
     * @param nombre Almacena el nombre del cliente
     * @param correo Almacena el correo electronico del cliente
     * @param prioridad Almacena la prioridad del cliente 
     */
    public Persona(String nombre, String correo, String prioridad) {
        this.nombre = nombre;
        this.correo = correo;
        this.prioridad = prioridad;
    }

    
    /**
     * Obtiene el nombre del cliente
     * @return El nombre del cliente
     */
    public String getNombre() {
        return nombre;
    }

    
    /**
     * Establece un nuevo nombre del cliente
     * @param nombre Almacena el nombre establecido por el usuario
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    /**
     * Obtiene el correo electronico del cliente
     * @return El correo electronico
     */
    public String getCorreo() {
        return correo;
    }

    
    /**
     * Establece el valor de la variable correo  
     * @param correo Almacena el nuevo valor del correo electronico del cliente
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    
    /**
     * Obtiene el tipo de prioridad que tiene el cliente
     * @return La prioridad del cliente
     */
    public String getPrioridad() {
        return prioridad;
    }

    
    /**
     * Establece una nueva priodidad del cliente
     * @param prioridad Almacena la prioridad que se asignara al cliente
     */
    public void setPrioridad(String prioridad) {
        this.prioridad = prioridad;
    }
    
}
