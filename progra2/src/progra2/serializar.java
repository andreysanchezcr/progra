package progra2;

import java.io.File;               // |-> Opcional
import java.io.FileInputStream;
import java.io.FileOutputStream;   // |\  Esto es
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
public class serializar{
    public static void main(String[] args){
        CasaBulma casa = new CasaBulma(3,"Prueba");
        prueba u = new prueba();
        
    }
    public void leer(){
    //El archivo puede tener cualquier extension (.bin, .src, .cap, .capsule, etc), o no colocarle extension
    File f = new File("capsula.bin");
 
    //Esto siempre debe de ir el FileInputStream y ObjectInputStream
    FileInputStream fis = null;
    ObjectInputStream leerObjeto = null;
 
    try{
        /* Sabemos muy bien que en lugar de 'f' que es de tipo file
         * puede tambien colocarse un variable tipo String o una cadena como tal
         * Ejemplo: fis = new FileInputStream( "capsula.bin" );
         * Ejemplo: String s = "capsula.bin";
         *          fis = new FileInputStream( s );
         */
        fis = new FileInputStream( f );
        leerObjeto = new ObjectInputStream( fis );
 
        /* Se lee el archivo y lo que devuelve es el objeto guardado
         * este por estar guardado como tipo Object hay que castearlo
         * en nuestro caso es la clase Dato por lo tanto "CasaBulma casa_bulma = (CasaBulma)leerObjeto.readObject();"
         * si fuese un JPanel seria
         * Ejemplo: JPanel tablero = (JPanel)leerObjeto.readObject();
         */
        CasaBulma casa_bulma = (CasaBulma)leerObjeto.readObject();
	System.out.println("No. Habitaciones: " + casa_bulma.cantidad_habitaciones + ", " + "Nombre: " + casa_bulma.nombre_casa);
    }
    catch( Exception e ){ }
    finally
    {
        try{
            //Se cierra el archivo y listo.
            if( leerObjeto != null ) leerObjeto.close();
        }catch( Exception ex ){}
    }
}

public void guardar( CasaBulma casa_bulma ){
    //El archivo puede tener cualquier extension (.bin, .src, .cap, .capsule, etc), o no colocarle extension
    File f = new File("capsula.bin");
 
    //Esto siempre debe de ir el FileOutputStream y ObjectOutputStream
    FileOutputStream fos = null;
    ObjectOutputStream escribirObjeto = null;
 
    try{
        /* Sabemos muy bien que en lugar de 'f' que es de tipo file
         * puede tambien colocarse un variable tipo String o una cadena como tal
         * Ejemplo: fos = new FileOutputStream( "capsula.bin" );
         * Ejemplo: String s = "capsula.bin";
         *          fos = new FileOutputStream( s );
         */
        fos = new FileOutputStream( f );
        escribirObjeto = new ObjectOutputStream( fos );
 
        //Se escribe la instancia de la clase CasaBulma
        escribirObjeto.writeObject( casa_bulma );
    }
    catch( Exception e ){ }
    finally
    {
        try{
            //Se cierra el archivo y listo.
            if( escribirObjeto != null ) escribirObjeto.close();
        }catch( Exception ex ){}
    }
}}