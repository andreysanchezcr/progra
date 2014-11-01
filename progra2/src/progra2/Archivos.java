package progra2;

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
        private File archivo;

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
                        this.archivo = archivo;

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

	public String[] leerTxt(String archivo){
                String[] arreglo = new String[3];

                try {
 
			FileReader lectura = new FileReader(this.directorioFinal + archivo);

			BufferedReader contenido = new BufferedReader(lectura);

			String temp;
                        int i = 0;
                        
			while((temp = contenido.readLine()) != null){
                            
                                arreglo[i] = (String)temp;
                                i++;

			}
                        contenido.close();
                        lectura.close();

                        

   
		}
		catch(Exception e){
			System.out.println("Error en la lectura");
		}

                return arreglo;

	}
        
        public void borrarLineaTxt(String archivo, String linea) {
 
            try {
 
                File archivito = new File(this.directorioFinal  + archivo);
      
                 if (!archivito.isFile()) {
                    System.out.println("No existe");
                    return;
                }
       
                //Construct the new file that will later be renamed to the original filename. 
                File tempArchivo = new File(this.directorioFinal  + ".tmp");
      
                BufferedReader br = new BufferedReader(new FileReader(archivito));
                PrintWriter pw = new PrintWriter(new FileWriter(tempArchivo));
      
                String line = null;
 
                //Read from the original file and write to the new 
                //unless content matches data to be removed.
                while ((line = br.readLine()) != null) {
        
                    if (!line.trim().equals(linea)) {
 
                        pw.println(line);
                        pw.flush();
                    }
                }
                pw.close();
                br.close();
                
      
                //Delete the original file
                if (!archivito.delete()) {
                    System.out.println("No pudo borrar");
                    return;
                } 
      
                //Rename the new file to the filename the original file had.
                if (!tempArchivo.renameTo(archivito))
                    System.out.println("No pudo renombrar");
      
                }
                catch (FileNotFoundException ex) {
                    ex.printStackTrace();
                }
                catch (IOException ex) {
                    ex.printStackTrace();
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
    
    public String getDirectorioFinal(){
        return this.directorioFinal;
    }
    
    public File getArchivo(){
        return this.archivo;
    }
    
    public void borrarTxt(){
        this.archivo.delete();
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
    
    /** 
    *Crea una copia del archivo entrada y lo redirecciona a la carpeta del programa
    * @param direccion direccion de la carpeta
    * @param carpeta carpeta
    */

    public void redireccionarImagen(String imagen){
        
            File archivoImagen = new File(imagen);
            String nombre = archivoImagen.getName();

            // Une una direccion con nombre de carpeta y nombre de archivo

            File destino = new File(this.directorioFinal + nombre );
                
            try {
                OutputStream salida; 
                try (InputStream entrada = new FileInputStream(archivoImagen) //Obtiene los bytes del directorio
                ) {                                
                    salida = new FileOutputStream(destino); //Lee los flujos de bytes
                    byte[] contenido = new byte[1024];
                    int iniciador;
                    // Va leyendo el contenido de entrada y escribiendo en el de salida
                    while ((iniciador = entrada.read(contenido)) > 0) {
                        salida.write(contenido, 0, iniciador);
                    }
                } //Lee los flujos de bytes
                salida.close();

            } catch (IOException ioe){
                ioe.printStackTrace();
            }
        }
    
    public static void main(String[] args) {
    	Archivos archivo = new Archivos();
    	archivo.generarDirectorio();
    	archivo.archivoTxt("prueba.txt");
    	archivo.escribirTxt("Segunda Linea", "prueba.txt");
    	archivo.leerTxt("prueba.txt");
    }
}
