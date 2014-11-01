package progra2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Implementacion de la clase RevisarEntradas que verificara que los datos que
 * ingrese el usuario sean correctos
 *
 * @author Familia Alpizar R
 */
public class RevisarEntradas {

    /**
     * Atributos de la clase Revisar entradas
     */
    private String nombre;
    private String correo;
    private static final String patronCorreo = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
            + "[A-Za-z]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";//formato del correo

    public RevisarEntradas(String nombre) {
        this.nombre = nombre;
    }

    public RevisarEntradas(String nombre, String correo) {
        this.nombre = nombre;
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }


    /**
     * Metodo que revisa si el correo ingresado cumple con la expresion regular
     * de todo correo electronico
     *
     * @return True o False si la expresion ingresada coincide o no con el
     * patron del correo electronico
     */
    public boolean validarCorreo() {
        String email = this.getCorreo();
        // Compila la expresión regular dada por el  patrón.
        Pattern pattern = Pattern.compile(patronCorreo);
        // Revisa que la expresion ingresada coinsida con el patron dado
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
    
    
    public boolean validarNombre() {
        String nombreB = this.getNombre();
        String patternvalidation = "[A-ZÁÉÍÓÚ][a-záéíóú]+( [A-ZÁÉÍÓÚa-z][a-záéíóú]+)+( [A-ZÁÉÍÓÚa-z][a-záéíóú]+)+( [A-ZÁÉÍÓÚa-z][a-záéíóú]+)+( [A-ZÁÉÍÓÚa-z][a-záéíóú]+)";// This pattern Validates like “Gowtham Raam” First Letter to be in InitCaps
        Pattern pattern = Pattern.compile(patternvalidation);
        Matcher matcher = pattern.matcher(nombreB);
        return matcher.matches();
    }
    public boolean validarNombrePersona() {
        String nombreP = this.getNombre();
        String patternvalidation = "[A-ZÁÉÍÓÚ][a-záéíóú]+( [A-ZÁÉÍÓÚ][a-záéíóú]+)+( [A-ZÁÉÍÓÚ][a-záéíóú]+)";// This pattern Validates like “Gowtham Raam” First Letter to be in InitCaps
        Pattern pattern = Pattern.compile(patternvalidation);
        Matcher matcher = pattern.matcher(nombreP);
        return matcher.matches();
    }

    public static void main(String[] args) {
        RevisarEntradas entrada = new RevisarEntradas("Elian ValverdeRivera", "example@yahoo.com");
        RevisarEntradas a = new RevisarEntradas("Banco Nacional de Costa Rica", "example@hotmail.com");
        RevisarEntradas b = new RevisarEntradas("Bamco Anglosagón", "example@365.com");
        RevisarEntradas c = new RevisarEntradas("Silvia Alpizar", "example@gm.ail.com");
        //System.out.println(entrada.validarCorreo());
       // System.out.println(entrada.validarNombre());
        //System.out.println(a.validarCorreo());
        //System.out.println("PERSONA: " + a.validarNombrePersona());
        System.out.println("BANCO: " + a.validarNombre());
        //System.out.println(b.validarCorreo());
        System.out.println("BANCO ANGLOSAGÓN: " +b.validarNombre());
        //System.out.println(c.validarCorreo());
        //System.out.println(c.validarNombrePersona());
    }
}
