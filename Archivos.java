import java.io.*;
import java.io.FileReader;
import java.io.BufferedReader;

/** 
*Una clase que permite el manejo de archivos necesarios para el reproductor
*@author Kenneth Martínez Avendaño
*/

public class Archivos{


	// Directorio donde se encuentra la carpeta
	private String directorioFinal;

    /**
    * Constructor para la clase Archivos
    */

	public Archivos(){

	}


	/** 
	*Método que permite generar una carpeta en donde se almacenarán los datos
	*/

	public void generarDirectorio(){

		File archivo = new File("Banco");
		if (archivo.exists()){ // Revisa si existe la carpeta
			this.directorioFinal = this.obtenerDireccion();
		}
		else{
			archivo.mkdir();
			this.directorioFinal = this.obtenerDireccion();
		}
	}


	/**
	*Crea un archivo de texto dentro de la carpeta banco
	*@param nombre Es el nombre del archivo que se quiere crear
	*dentro de la carpeta "Banco"	
	*/

	public void archivoTxt(String nombre){
		try{

			File archivo = new File(this.directorioFinal  + nombre);

			if(archivo.createNewFile()){
				System.out.println("Se creo");
			}
		}
		catch(IOException e){
			System.out.println("No se pudo crear");
		}

	}

	public void escribirTxt(String texto, String archivo){
		try{

		FileWriter escribir = new FileWriter(this.directorioFinal + archivo,true);

		escribir.write(texto);
		escribir.close();

		}
		catch(Exception e){
			System.out.println("Error al escribir");
		}
	}

	public void leerTxt(String archivo){
		String texto = "";
		try {

			FileReader lectura = new FileReader(this.directorioFinal + archivo);
			BufferedReader contenido = new BufferedReader(lectura);

			String temp;
			while((temp = contenido.readLine()) != null){
				System.out.println("entre");
				texto = texto + "\n" + temp;
				System.out.println(texto);
			}
		}
		catch(Exception e){
			System.out.println("Error en la lectura");
		}

	}

	/**
    *Obtiene la direccion del archivo segun su ruta
    *@return Devuelve un string de la ruta completa de un fichero
	*/

    public String obtenerDireccion(){
    	File temp = new File("Banco");
    	return temp.getAbsolutePath()+File.separator; //obtener ruta completa
    }

	/**
	*Metodo que revisa si existe algun fichero en la carpeta del banco
	*@param nombre Recibe el nombre del fichero
	*/

    public boolean revisarFichero(String nombre){

        File archivo = new File(this.directorioFinal + nombre);
        return archivo.exists();
    }

    /**
    *Obtiene el nombre del archivo segun su ruta
    *@return Devuelve un string del nombre de un fichero
	*/

    public String obtenerNombre(){
    	File temp = new File(this.directorioFinal);
    	return temp.getName(); //obtener nombre
    }
    
    public static void main(String[] args) {
    	Archivos archivo = new Archivos();
    	archivo.generarDirectorio();
    	archivo.archivoTxt("prueba.txt");
    	archivo.escribirTxt("\nSegunda Linea", "prueba.txt");
    	archivo.leerTxt("prueba.txt");
    }
}
