package progra2;


import java.io.IOException;
import java.util.Collections;
import java.util.Comparator;
import java.util.Vector;

class Comparador implements Comparator<String> {
    public int compare(String s1, String s2)
    {           
                return s1.toLowerCase().compareTo(s2.toLowerCase());
    }
}
 


public abstract class Ordenari {
    
    static String getDia(String arreglo){
      String dia="";

    
    for(int u =0;u<arreglo.length();u++){
    if(u<2){
        dia=dia+arreglo.charAt(u);
        System.out.println("DIA"+dia);
                    
        
    }
    
}       return dia;
}
    static String getHora(String arreglo){
      String hora="";
   
    for(int u =0;u<arreglo.length();u++){
    if(u>10&&u<13){
        hora=hora+arreglo.charAt(u);
        System.out.println("DIA"+hora);
                    
        
    }
    
}       return hora;
}
    static Object[][] tipo(Object[][] arreglo){
        int contador=0;
        Object[][] resultado=new Object[100][5];
        Object[] temp;
        int indice=0;
            for(int j=0;j<arreglo.length;j++){
                
                for(int u=0;u<arreglo.length;u++){
                    if(arreglo[u][2].equals("Persona con dicapacidad")&&contador==0){
                        temp=arreglo[indice];
                        arreglo[indice]=arreglo[u];
                        arreglo[u]=temp;
                        indice++;
                        
                    }
                    if(arreglo[u][2].equals("Adulto Mayor")&&contador==1){
                        temp=arreglo[indice];
                        arreglo[indice]=arreglo[u];
                        arreglo[u]=temp;
                        indice++;
                        
                    }
                    if(arreglo[u][2].equals("Mujer embarazada")&&contador==2){
                        temp=arreglo[indice];
                        arreglo[indice]=arreglo[u];
                        arreglo[u]=temp;
                        indice++;
                        
                    }
                    if(arreglo[u][2].equals("Cliente corporativo")&&contador==3){
                        temp=arreglo[indice];
                        arreglo[indice]=arreglo[u];
                        arreglo[u]=temp;
                        indice++;
                        
                    }
                    if(arreglo[u][2].equals("Cliente Regular")&&contador==4){
                        temp=arreglo[indice];
                        arreglo[indice]=arreglo[u];
                        arreglo[u]=temp;
                        indice++;
                        
                    }
                    
                    
                }
                contador++;
                
            }
            
        
        
        
        return arreglo;
        
        
        
    }
       static int averiguarCantidadTipo(Object[][] arreglo, String tipo){
        int contador=0;
        for(int i =0;i<arreglo.length;i++){
            if(arreglo[i][2].equals(tipo)){
                contador++;
            }
        }
        return contador;
        
        
    }
        static String getFecha(String arreglo){
      String fecha="";
   
    for(int u =0;u<arreglo.length();u++){
    if(u>5&&u<10){
        fecha=fecha+arreglo.charAt(u);
        System.out.println("DIA"+fecha);
                    
        
    }
    
    
}       return fecha;
}
    static String getMes(String arreglo){
      String mes="";
   
    for(int u =0;u<arreglo.length();u++){
    if(u>2&&u<5){
        mes=mes+arreglo.charAt(u);
        System.out.println("DIA"+mes);
                    
        
    }
    
}       return mes;
}
    static String getMinutos(String arreglo){
      String minutos="";
   
    for(int u =0;u<arreglo.length();u++){
    if(u<16&&u>13){
        minutos=minutos+arreglo.charAt(u);
        System.out.println("DIA"+minutos);
                    
        
    }
    
    }return minutos;}
    static String getSegundos(String arreglo){
      String segundos="";
   
    for(int u =0;u<arreglo.length();u++){
    if(u>16){
        segundos=segundos+arreglo.charAt(u);
        System.out.println("DIA"+segundos);
                    
        
    }
    
    }return segundos;}
    
    static Object[][] fecha(Object[][] arreglo){
    for(int i=0;i<arreglo.length;i++){
        
        for(int j = 0;j<arreglo.length-1;j++){
            int contador=0;
            String total="";
            String fecha="";
            String dia="";
            String mes="";
            String hora="";
            String minutos="";
            String segundos="";

         //   System.out.println(Ordenari.getFecha(arreglo[j][0])+"Fecha1");
         //   System.out.println(Ordenari.getFecha(arreglo[j+1][0])+"Fecha2");
    
    if(Integer.parseInt(Ordenari.getMes(arreglo[j][4].toString()))>Integer.parseInt(Ordenari.getMes(arreglo[j+1][4].toString()))){
       System.out.println("Messssss");

        Object[] temp=arreglo[j];
        arreglo[j]=arreglo[j+1];
        arreglo[j+1]=temp;
        contador=1;
        break;
    }
            
    else if(Integer.parseInt(Ordenari.getDia(arreglo[j][4].toString()))>Integer.parseInt(Ordenari.getDia(arreglo[j+1][4].toString()))){
        System.out.println("diaaaa");

     Object[] temp=arreglo[j];
        arreglo[j]=arreglo[j+1];
        arreglo[j+1]=temp;   
        contador=1;
        break;
    }   
    else if(Integer.parseInt(Ordenari.getHora(arreglo[j][4].toString()))>Integer.parseInt(Ordenari.getHora(arreglo[j+1][4].toString()))){
     System.out.println("horaaaaa");

     Object[] temp=arreglo[j];
        arreglo[j]=arreglo[j+1];
        arreglo[j+1]=temp;   
        contador=1;
        break;
    }    
    if(Integer.parseInt(Ordenari.getMinutos(arreglo[j][4].toString()))>Integer.parseInt(Ordenari.getMinutos(arreglo[j+1][4].toString()))){
                System.out.println("minuuuutoooooss");

     Object[] temp=arreglo[j];
        arreglo[j]=arreglo[j+1];
        arreglo[j+1]=temp;   
        contador=1;
    break;
    }    
    if(Integer.parseInt(Ordenari.getSegundos(arreglo[j][4].toString()))>Integer.parseInt(Ordenari.getSegundos(arreglo[j+1][4].toString()))){
                System.out.println("segundos");

     Object[] temp=arreglo[j];
        arreglo[j]=arreglo[j+1];
        arreglo[j+1]=temp;   
        contador=1;
        break;
    }
    /*if(Integer.parseInt(Ordenari.getFecha(arreglo[j][0]))>Integer.parseInt(Ordenari.getFecha(arreglo[j+1][0]))){
        System.out.println("Fechaaaaaaaa");
        String[] temp=arreglo[j];
        arreglo[j]=arreglo[j+1];
        arreglo[j+1]=temp;
        contador=1;
        break;
        
    }*/

        
        }
        System.out.println(arreglo[0]);
}
    for(int r =0;r<arreglo.length;r++){
        for(int t=0;t<arreglo.length-1;t++){
        if(Integer.parseInt(Ordenari.getDia(arreglo[t][4].toString()))>Integer.parseInt(Ordenari.getDia(arreglo[t+1][4].toString()))){
        System.out.println("Fechaaaaaaaa");
        Object[] temp=arreglo[t];
        arreglo[t]=arreglo[t+1];
        arreglo[t+1]=temp;
        
        break;}
        
    }
        }
    for(int i =0;i<arreglo.length;i++){
        for(int t=0;t<arreglo.length-1;t++){
        if(Integer.parseInt(Ordenari.getMes(arreglo[t][4].toString()))>Integer.parseInt(Ordenari.getMes(arreglo[t+1][4].toString()))){
        System.out.println("Fechaaaaaaaa");
        Object[] temp=arreglo[t];
        arreglo[t]=arreglo[t+1];
        arreglo[t+1]=temp;
        
        break;
        
    }
        }
    }
    for(int i =0;i<arreglo.length;i++){
        for(int t=0;t<arreglo.length-1;t++){
        if(Integer.parseInt(Ordenari.getFecha(arreglo[t][4].toString()))>Integer.parseInt(Ordenari.getFecha(arreglo[t+1][4].toString()))){
        System.out.println("Fechaaaaaaaa");
        Object[] temp=arreglo[t];
        arreglo[t]=arreglo[t+1];
        arreglo[t+1]=temp;
        
        break;
        
    }
        }
    }
    
    return arreglo;
        
    }
    static String[][] copia(String[][] a){
        return a;
    } 
    


/**
 *
 * @author Usuario
 */
  public static Object[][] Alfabeticamente(Object [][] arreglo){
         int i=0, j=0;
         Object[] aux;
         for(i=0;i<arreglo.length-1;i++)
              for(j=0;j<arreglo.length-i-1;j++)
                 
                   if(arreglo[1+j][0].toString().compareTo(arreglo[j][0].toString())<=0){
                      aux=arreglo[j+1];
                      arreglo[j+1]=arreglo[j];
                      arreglo[j]=aux;
                   }
         return arreglo;
}  
        public static void main(String[] args) throws IOException{
            Parser pa=new Parser();
            Object[][] t = pa.parser("Lista de clientes");
            String[][] a={{"fsafa","fsafa","fsafa","fsafa","fsafa"},{"aaa","aaa","aaa","aaa"},{"fsafa","fsafa","fsafa","fsafa","fsafa",},{"fsafa","fsafa","fsafa","fsafa","fsafa",}};
            String[][] u=(String[][]) Ordenari.Alfabeticamente(a);
            System.out.println(Ordenari.averiguarCantidadTipo(t, "Mujer embarazada"));
            for(int i =0;i<t.length;i++){
                System.out.println(t[i][2]);
            }
            
        }
  



        



}