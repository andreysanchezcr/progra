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
    
    }return minutos;}
    
    static String[][] fecha(String[][] arreglo){
    for(int i=0;i<arreglo.length;i++){
        for(int j = 0;j<arreglo.length-1;j++){
            String total="";
            String fecha="";
            String dia="";
            String mes="";
            String hora="";
            String minutos="";
            String segundos="";

            System.out.println(Ordenari.getFecha(arreglo[j][0])+"Fecha1");
            System.out.println(Ordenari.getFecha(arreglo[j+1][0])+"Fecha2");
    if(Integer.parseInt(Ordenari.getFecha(arreglo[j][0]))>Integer.parseInt(Ordenari.getFecha(arreglo[j+1][0]))){
        System.out.println("Fechaaaaaaaa");
        String[] temp=arreglo[j];
        arreglo[j]=arreglo[j+1];
        arreglo[j+1]=temp;
        
    }
    else if(Integer.parseInt(Ordenari.getMes(arreglo[j][0]))>Integer.parseInt(Ordenari.getMes(arreglo[j+1][0]))){
       System.out.println("Messssss");

        String[] temp=arreglo[j];
        arreglo[j]=arreglo[j+1];
        arreglo[j+1]=temp;
    }
    else if(Integer.parseInt(Ordenari.getDia(arreglo[j][0]))>Integer.parseInt(Ordenari.getDia(arreglo[j+1][0]))){
        System.out.println("diaaaa");

     String[] temp=arreglo[j];
        arreglo[j]=arreglo[j+1];
        arreglo[j+1]=temp;   
    }   
    else if(Integer.parseInt(Ordenari.getHora(arreglo[j][0]))>Integer.parseInt(Ordenari.getHora(arreglo[j+1][0]))){
     System.out.println("horaaaaa");

     String[] temp=arreglo[j];
        arreglo[j]=arreglo[j+1];
        arreglo[j+1]=temp;   
    }    
    else if(Integer.parseInt(Ordenari.getMinutos(arreglo[j][0]))>Integer.parseInt(Ordenari.getMinutos(arreglo[j+1][0]))){
                System.out.println("minuuuutoooooss");

     String[] temp=arreglo[j];
        arreglo[j]=arreglo[j+1];
        arreglo[j+1]=temp;   
    }    
    else if(Integer.parseInt(Ordenari.getSegundos(arreglo[j][0]))>Integer.parseInt(Ordenari.getSegundos(arreglo[j+1][0]))){
                System.out.println("segundos");

     String[] temp=arreglo[j];
        arreglo[j]=arreglo[j+1];
        arreglo[j+1]=temp;   
    }

        
        }
        System.out.println(arreglo[0]);
}
    return arreglo;
        
    }
    static String[][] copia(String[][] a){
        return a;
    } 
    
        static String[][] Alfabeticamente(String[][] arreglo){
            try{
            Vector<String> arregloo = new Vector<>();
            for(int i=0;i<arreglo.length;i++){
            arregloo.add((String)arreglo[i][0]+i);}
        
        Collections.sort(arregloo,new Comparador());
        String[][] a = new String[arreglo.length][5];
        String[][] h;
        for(int j=0;j<arregloo.size();j++){
        a[j][0]=arregloo.get(j);
        
        }
        h=Ordenari.copia(a);
        for(int u=0;u<arreglo.length;u++){
            System.out.println(a[u][0].length()-1);
            System.out.println(a[u][0]);

            
            String acumulador=a[u][0].charAt(a[u][0].length()-1)+"";
            System.out.println(acumulador+"Valor del acumulador");
            int numero=Integer.parseInt(acumulador);
            System.out.println("El numero es: "+numero);
            if(numero<arreglo.length){
            //String[] tem = arreglo[numero];
            arreglo[numero]=h[numero];
            //arreglo[0]=tem;}
           // String[] temp=arreglo[Integer.toString(a[u][0].charAt(a[u][0].length()+""))];
            
        }return arreglo;}
        for(int y = 0;y<arreglo.length;y++){
            System.out.println(arreglo[y][0]);
        }}catch(Exception ae){
            System.out.println("HA ocurrido un error");
        }
        
        return arreglo;
        
}
        

        public static void main(String[] args) {
            String[][] fechas={{"11/10/2014|22:20:26"},{"22/20/2004|22:22:22"},{"89/22/2000|22:20:26"},{"22/20/2091|22:22:22"}};
            fechas=Ordenari.fecha(fechas);

                String[][] aa={{"azandrey","pepe","fsdfs","fsafs","ffsa"},{"aandrey","pepe","fsdfs","fsafs","ffsa"},{"aandrey","pepe","fsdfs","fsafs","ffsa"}};
                aa=Ordenari.Alfabeticamente(aa);
                for(int p=0;p<fechas.length;p++){
                        System.out.println("Este es el resultado"+fechas[p][0]);  
                }
                                
        }

}