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
    public Object parser(String nombredearchivo) {
        
        try ( //Abro el stream, el fichero debe existir
            FileReader fr = new FileReader(nombredearchivo)) {
                //Leemos el fichero y lo mostramos por pantalla
            
            int valor=fr.read()
                    ;
            String acumulador="";
            int contador=0;
            int temp=0;
            Object[][] arreglo=new Object[100][5]; 
            Object[] temp2=new Object[5];
            int actual=0;
            int actual2=0;
            String acumulador2="";
            while(valor!=-1){
                
                
                if((char)valor=='}'&&contador==1){
                    System.out.println(acumulador);
                    acumulador="";
                    //contador=0;
                    System.out.println("Esta en el acumuldor"+acumulador);
                    System.out.println("Parte");
                    for(int i =0;arreglo[i].length>i;i++){
                        if(arreglo[i]==null){
                            System.out.println("Es nulo");
                        break;}
                        System.out.println("Esto esta en el arreglo"+arreglo[0][i]);
                    }
                    
                    
                    
                    return null;
                }
                else if((char)valor=='}'){
                    arreglo[actual2]=temp2;
                    actual2++;
                    //System.out.println(acumulador);
                    //acumulador="";
                    contador--;
                    System.out.println("Comtador--");
                }
                else if((char)valor=='{'){
                    System.out.println("Contador++");

                    System.out.println(acumulador);
                    //acumulador="";
                    contador++;}
                else if((char)valor==','){
                    temp2[actual]=acumulador;
                    acumulador2="";
                    actual++;
                }


                else if((char)valor!='{'||(char)valor!='}'){
                    acumulador = acumulador+(char)valor;
                    acumulador2=acumulador+(char)valor;
                    System.out.println(acumulador);
                } 
                //System.out.print((char)valor);
                valor=fr.read();
                }
            
            
            }
        catch(Exception a){
            System.out.println("Lista no encontrada");
        }
        return null;
    
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
        String agreg="{{1,2,3}}";
        x.agregar(agreg, "Prueba");
        x.parser("Prueba.txt");
    }
        
        
        
        
        
    }
    

