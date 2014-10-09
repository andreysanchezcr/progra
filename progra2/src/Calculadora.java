
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

//Ricardo Andrey Sánchez Delgado;


public class Calculadora <E>{
    ArbolBB arbol =new ArbolBB();
    public static void main(String[] args) throws ScriptException{
        Calculadora a = new Calculadora();
        //a.CalculadoraR("2+4+5+6*7-9");
        System.out.println(a.parA("2+4+5+6*7-9", 3));
        System.out.println(a.parD("2+4+5+6*7-9", 3));

  //      a.parA("2+4+5+6*7-9", 3);
//         a.parD("2+4+5+6*7-9", 3);
String f="2*6+4*4";
        a.Calculador(f,true,a.arbol.getNodoA());
        a.res(f);
        a.arbol.inorden(a.arbol.raiz);
    }
    String parD(String a, int indice){
        String acumulador1="";
        for(int i=indice+1;i<a.length();i++){
            acumulador1=acumulador1+a.charAt(i);
            
        }
        return acumulador1;
                
       
        
    }
    String parA(String a, int indice){
        String acumulador1="";
        for(int i=0;i<indice;i++){
            acumulador1=acumulador1+a.charAt(i);
            
        }
        return acumulador1;
                
       
        
    }
    public void res(String h) throws ScriptException{
        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine engine = manager.getEngineByName("js");
        //engine.put("X", 3);
 
       // Object operation = engine.eval("5*X+3*2");
        Object operacion = engine.eval(h);
 
       // System.out.println("Evaluado operacion 1: " + operation);
        System.out.println("-----------------------------------------------------------");
        System.out.println("El resultado de la operación es:        " + operacion);
 
        
    }
    
    String[] operaciones={"(",")","+","-","*","/","**"};
    void Calculador(String a, boolean verdad,E nodo) throws ScriptException{
        String acumulador1="";
        String acumulador2="";
        Calculadora b = new Calculadora();

        for(int j=0;j<operaciones.length;j++){
            for(int i=0;i+1<a.length();i++){
            if(a.length()==3){
                arbol.insertarD(b.parA(a, i));
                arbol.insertarI(b.parD(a, i));
            
        }


            if(a.charAt(i)==operaciones[j].charAt(0)){
                System.out.println(acumulador1);
                System.out.println("Antes: "+b.parA(a, i));
                if(b.parA(a, i).length()==1){
                    System.out.println("el valor es: "+b.parA(a, i));
                }
                System.out.println("DEspues: "+b.parD(a, i));

                    if(verdad==true){
                        arbol.insertarD(a.charAt(i));
                    }
                    else{
                        arbol.insertarI(a.charAt(i));
                    
                Calculador(b.parA(a, i),true,nodo);
                Calculador(b.parD(a, i),false,nodo);
                
                return;}

            }

                
            }
            
            //acumulador1=acumulador1+a.charAt(j);
            
        }
        System.out.println(acumulador1);
        
    }
       /* void CalculadoR(String a){
        String acumulador1="";
        String acumulador2="";
        Calculadora b = new Calculadora();
        for(int j=0;j<operaciones.length;j++){
            for(int i=0;i+1<a.length();i++){
                if(a.charAt(i+1)=='('){
                Calculador(b.parA(a, i));
                Calculador(b.parD(a, i));
                return;
                    
                }
                if(a.charAt(i+1)==')'){
                return;
                    
                }
            if(a.charAt(i)==operaciones[j].charAt(0)){
                System.out.println(acumulador1);
                System.out.println("Antes: "+b.parA(a, i));
                System.out.println("DEspues: "+b.parD(a, i));
                Calculador(b.parA(a, i));
                Calculador(b.parD(a, i));
                return;

            }

                
            }
            
            //acumulador1=acumulador1+a.charAt(j);
            
        }
        System.out.println(acumulador1);
        
    }*/
        
        
    void analisis(String a){
        
    }
    
    
}
