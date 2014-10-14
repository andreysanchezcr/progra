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
    public Object[][] parser(String nombredearchivo) throws IOException {
        Object[][] resultado=new Object[100][5];
        
        try ( //Abro el stream, el fichero debe existir
            FileReader fr = new FileReader(nombredearchivo+".txt")) {
                //Leemos el fichero y lo mostramos por pantalla
            int contador=0;
            int valor=fr.read()
                    ;
            String acumulador="";
            
            int indice1=0;
            int indice2=0;
            
            while(valor!=-1){
                

                if((char)valor==','){
                    
                    if(contador==5){
                       // System.out.println("Entro una vez");
                        contador=0;
                        indice1++;
                        indice2=0;

                        continue;
                    }
                    resultado[indice1][indice2]=acumulador;

                    //System.out.println("Valor de act: "+act);
                    //act++;
                    indice2++;
                    contador++;
                    acumulador="";
                }
                else{
                    acumulador=acumulador+(char)valor;
                    
                }
            valor=fr.read();
            
            }
        
        }
        int cantidad =0;
        for(int q=0;resultado[q][0]!=null;q++);{
        cantidad ++;
    }
        //System.out.println("Esta es la cnatidad"+cantidad);
        Object[][] res=new Object[averiguarTamaño(resultado)][5];
        for(int v=0;v<res.length;v++){
            
            res[v]=resultado[v];
        }
        Parser hola = new Parser();
        //System.out.println();
        return res;
    
    }
    static int averiguarTamaño(Object[][] arreglo){
        int contador=0;
        for(int i =0;arreglo[i][0]!=null;i++){
            contador++;
            
        }
        return contador;
        
    }
    
    public void agregar(String agregar,String nombre) throws IOException{
        ///////////7
                try ( //Abro el stream, el fichero debe existir
            FileReader fr = new FileReader(nombre+".txt")) {
                //Leemos el fichero y lo mostramos por pantalla
            int valor=fr.read()
                    ;
            String acumulador="";
                         
            
            while(valor!=-1){
                


            acumulador=acumulador+(char)valor;
                    
                
            valor=fr.read();
            
            }
        
        
        
        /////////7
        
                   try ( //Abro stream, crea el fichero si no existe
                    FileWriter fw = new FileWriter(nombre+".txt")) {
                //Escribimos en el fichero un String y un caracter 97 (a)
                fw.write(acumulador+agregar); 
                //fw.write("aaa.aaaaaa.aaaa.aaaaaaaaa.aaaaaaa.aaaaaaaaaaaaaa.aaaaaaaaa.aaaaaaa");
                //ejemplo de escritura
                System.out.println("SE agrego correctamente: "+agregar);
            }
   
        }}
    public static void main(String[] args) throws IOException{
        Parser x = new Parser();
        String agreg="ola,perro,gallina,hhh,fff,olaoala,perro,gallina,hhh,fff,ola,perro,gallina,hhh,fff,olaoala,perro,gallina,hhh,fff,";
        x.agregar(agreg, "Prueba");
        Object[][] r = x.parser("Prueba");
        System.out.println(r.length+"que tan largo es el arreglo");
        for(int e =0;e<r.length;e++){
        System.out.println("Este es el valor del archivo"+r[e][0]);
        }
       // x.parser("Prueba.txt");
    }
        
        
        
        
        
    }
    

