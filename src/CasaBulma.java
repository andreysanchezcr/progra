

import java.io.Serializable; // |-> Esto es obligatorio
 // |/  Obligatorio
 
/* Se debe de crear una clase implementada con Serializable
 * en este caso la clase Dato (class CasaBulma implements Serializable)
 * Esto es unicamente con las clases creadas por nosotros
 * las que pertencen a java (JPanel, ArrayList, String etc)
 * por defecto estan Serializadas
 */
 
public class CasaBulma implements Serializable {
 
    public CasaBulma( int cantidad_habitaciones, String nombre_casa ){
        this.cantidad_habitaciones = cantidad_habitaciones;
        this.nombre_casa = nombre_casa;
    }
    
    public String nombre_casa;
    public int cantidad_habitaciones;
}

 
//Entiendase que aqui ya es otra clase

 
