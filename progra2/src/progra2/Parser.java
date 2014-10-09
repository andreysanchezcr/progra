package progra2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author ricardo
 */
public class Parser <E> {
    public Object parser(String nombredearchivo) throws IOException {
        
        try ( //Abro el stream, el fichero debe existir
            FileReader fr = new FileReader(nombredearchivo)) {
                //Leemos el fichero y lo mostramos por pantalla
            
            int valor=fr.read()
                    ;
            String acumulador="";
            
            int temp=0;
            int c=0;
            Object[][] arreglo=new Object[100][5]; 
            Object[] temp2=new Object[5];
            int actual=0;
            int actual2=0;
            String acumulador2="";
            int act=0;
            int contador =0;
            int cont=0;
            int conti=0;
            int condicional=0;
            while(valor!=-1){
                
                
                if((char)valor=='{'&&contador==0){
                    contador=1;
                }
                else if((char)valor=='{'){
                    cont=0;
                    
                    
                }
                else if((char)valor=='}'&&cont==1){
                System.out.println("Resultado: ");
                for(int i = 0;i<arreglo[0].length;i++){
                    System.out.println(arreglo[0][i]);
                }
            }
                else if((char)valor=='}'){
                    cont=1;
                }

                

                else if((char)valor==','){
                    
                    if(act==5){
                        System.out.println("Entro una vez");
                        act=0;
                        arreglo[c]=temp2;
                        c++;
                        condicional=1;
                        continue;
                    }
                    temp2[act]=acumulador;

                    System.out.println("Valor de act: "+act);
                    act++;
                    acumulador="";
                }
                else{
                    acumulador=acumulador+(char)valor;
                    
                }
            valor=fr.read();
            
            }
        
        }
        return null;
    
    }
    public Object[][] leerArchivo(String nombredearchivo) throws IOException {
        Object[][] resultado=new Object[100][5];
        
        try ( //Abro el stream, el fichero debe existir
            FileReader fr = new FileReader(nombredearchivo+".txt")) {
                //Leemos el fichero y lo mostramos por pantalla
            
            int valor=fr.read()
                    ;
            String acumulador="";
            int indice;
            int contador=0;
            int contador2=0;
            Object[] temp= new Object[5];
 
            while(valor!=-1){
                if(contador==5){
                    contador=0;
                    resultado[contador2]=temp;
                    acumulador="";
                    contador2++;
                    
                }
                else if((char)valor==','){

                    temp[contador]=acumulador;
                    System.out.println("Se agrego esto al acumulador"+acumulador);
                    acumulador="";
                    
                    
                }
                                    contador++;


                
            acumulador=acumulador+(char)valor;
                   
                    
                
            valor=fr.read();
            
            }
            return resultado;
        
        }
    
    }    
    public void agregar(String agregar,String nombre) throws IOException{
        
                   try ( //Abro stream, crea el fichero si no existe
                    FileWriter fw = new FileWriter(nombre+".txt")) {
                //Escribimos en el fichero un String y un caracter 97 (a)
                fw.write(agregar); 
                //fw.write("aaa.aaaaaa.aaaa.aaaaaaaaa.aaaaaaa.aaaaaaaaaaaaaa.aaaaaaaaa.aaaaaaa");
                //ejemplo de escritura
                System.out.println("SE agrego correctamente: "+agregar);
            }
   
        }
    public static void main(String[] args) throws IOException{
        Parser x = new Parser();
        String agreg="ola,perro,gallina,hhh,fff,";
        x.agregar(agreg, "Prueba");
        System.out.println("Este es el valor del archivo"+x.leerArchivo("Prueba")[0][1]);
                
        x.parser("Prueba.txt");
    }
        
        
        
        
        
    }
    

