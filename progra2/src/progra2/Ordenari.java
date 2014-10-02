package progra2;


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
    
    if(Integer.parseInt(Ordenari.getMes(arreglo[j][0].toString()))>Integer.parseInt(Ordenari.getMes(arreglo[j+1][0].toString()))){
       System.out.println("Messssss");

        Object[] temp=arreglo[j];
        arreglo[j]=arreglo[j+1];
        arreglo[j+1]=temp;
        contador=1;
        break;
    }
            
    else if(Integer.parseInt(Ordenari.getDia(arreglo[j][0].toString()))>Integer.parseInt(Ordenari.getDia(arreglo[j+1][0].toString()))){
        System.out.println("diaaaa");

     Object[] temp=arreglo[j];
        arreglo[j]=arreglo[j+1];
        arreglo[j+1]=temp;   
        contador=1;
        break;
    }   
    else if(Integer.parseInt(Ordenari.getHora(arreglo[j][0].toString()))>Integer.parseInt(Ordenari.getHora(arreglo[j+1][0].toString()))){
     System.out.println("horaaaaa");

     Object[] temp=arreglo[j];
        arreglo[j]=arreglo[j+1];
        arreglo[j+1]=temp;   
        contador=1;
        break;
    }    
    if(Integer.parseInt(Ordenari.getMinutos(arreglo[j][0].toString()))>Integer.parseInt(Ordenari.getMinutos(arreglo[j+1][0].toString()))){
                System.out.println("minuuuutoooooss");

     Object[] temp=arreglo[j];
        arreglo[j]=arreglo[j+1];
        arreglo[j+1]=temp;   
        contador=1;
    break;
    }    
    if(Integer.parseInt(Ordenari.getSegundos(arreglo[j][0].toString()))>Integer.parseInt(Ordenari.getSegundos(arreglo[j+1][0].toString()))){
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
        if(Integer.parseInt(Ordenari.getDia(arreglo[t][0].toString()))>Integer.parseInt(Ordenari.getDia(arreglo[t+1][0].toString()))){
        System.out.println("Fechaaaaaaaa");
        Object[] temp=arreglo[t];
        arreglo[t]=arreglo[t+1];
        arreglo[t+1]=temp;
        
        break;}
        
    }
        }
    for(int i =0;i<arreglo.length;i++){
        for(int t=0;t<arreglo.length-1;t++){
        if(Integer.parseInt(Ordenari.getMes(arreglo[t][0].toString()))>Integer.parseInt(Ordenari.getMes(arreglo[t+1][0].toString()))){
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
        if(Integer.parseInt(Ordenari.getFecha(arreglo[t][0].toString()))>Integer.parseInt(Ordenari.getFecha(arreglo[t+1][0].toString()))){
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
        static String[][] Alfabeticamente(String[][] arreglo){
            
            System.out.println(arreglo[0][0]+"Valor del arreglo");
         int i=0, j=0;
         String[] aux;
         System.out.println(arreglo.length);
         for(i=0;i<arreglo.length-1;i++)
              for(j=0;j<arreglo.length-i-1;j++)
                  System.out.println(arreglo[j][0]);
                   if(arreglo[j][0].compareTo(arreglo[j][0])<=0&&arreglo[j][0]!=null){
                      aux=arreglo[j+1];
                      arreglo[j+1]=arreglo[j];
                      arreglo[j]=aux;
                   }
         return arreglo;
}  
  



        



}