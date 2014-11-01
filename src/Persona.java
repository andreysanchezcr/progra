


import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

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
    private String fechaActual;
    private String horaActual;
    private String tiquete;

    
    /**
     * Constructor de la clase Persona
     * @param nombre Almacena el nombre del cliente
     * @param correo Almacena el correo electronico del cliente
     * @param prioridad Almacena la prioridad del cliente 
     */
    public Persona(String nombre, String correo, String prioridad, String tiquete) {
        this.nombre = nombre;
        this.correo = correo;
        this.prioridad = prioridad;
        this.fechaActual= this.obtenerFecha();
        this.horaActual= this.obtenerHoraActual();
        this.tiquete = tiquete;
        
    }

    
    /**
     * Obtiene el nombre del cliente
     * @return El nombre del cliente
     */
    public String getNombre() {
        return nombre;
    }
    
    /**
     * Obtiene el tiquete del cliente
     * @return El tiquete del cliente
     */
    public String getTiquete() {
        return this.tiquete;
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
    
     /**
     * Método que obtiene la fecha actual del sistema
     * @return La fecha actual del sistema
     */
    public static String obtenerFecha(){
        Date fecha = new Date(); //variable tipo fecha
        Calendar c = new GregorianCalendar(); // variable tipo calendario
        c.setTime(fecha); 
        String dia = c.get(Calendar.DATE) > 9 ? "" + c.get(Calendar.DATE) : "0" 
                + c.get(Calendar.DATE); // optencion del día
        String mes = c.get(Calendar.MONTH) > 9 ? "" + c.get(Calendar.MONTH) : "0" 
                + Integer.toString(c.get(Calendar.MONTH)+1); //optencion del mes 
        String annio = Integer.toString(c.get(Calendar.YEAR));
        String fechaActual = dia + "/" + mes + "/" + annio; // optencion de año
        return fechaActual;
    }
    
    
    
    /**
     * Método que obtiene la hora actual del sistema
     * @return La hora actual del sistema
     */
    public static String obtenerHoraActual() {
        Date ahora = new Date();
        SimpleDateFormat formateador = new SimpleDateFormat("hh:mm:ss");
        return formateador.format(ahora);
    }
}
