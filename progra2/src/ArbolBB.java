

/**
 *
 * @author Ricardo Andrey Sánchez Delgado
 */

/*
Los atributos de la clase son:
Raiz
Los metodos de la clase ArbolBB son:
Constructor;
insertar(dato)// Recibe como parametro el dato a insertar(ints)
BE(elemento) // El elemento a buscar y a eliminar ///////// "BusquedaElimina"
inorden(Nodo x) //Despliega en modo en orden apartir de un nodo raiz(Se asume nodo raiz el que se recibe como parametro);
indiceNivelMenor()// Despliega la cantidad de niveles disponibles hacia la izquierda////////apartir de un nodo raiz(Se asume nodo raiz el que se recibe como parametro);
Busqueda(elemento)// Busca un elemento en especifico dentro del arbol, retorna como nodo raiz donde se encontro
obtenerMayor()// retorna el elemento mayor del arbol
obtenerMenor()// retorna el elemento menor del arbol

Sub-clase Nodo:
De caracter privada
Cuenta con un constructor
Atributos:
Nodo p;//Nodo raiz
Nodo derecha;
Nodo izquierda;
int llave;

Metodos:
constructor()

*/
public class ArbolBB <E>{
    public void inRaiz(E dato){
        Nodo n = new Nodo(dato);
        this.raiz=n;
    
    }
    public boolean getRaiz(){
        if(this.raiz!=null){
            return true;
        }
        else
            return false;
    }
    public Nodo getNodoA(){
        return actual;
    }
    public Nodo generar(E dato){
        Nodo nodo = new Nodo(dato);
        return nodo;
    }
    
    Nodo actual;
    Nodo raiz=new Nodo((E) "");
    Nodo temp;
    public ArbolBB(){
        Nodo hola = new Nodo((E) "");
        raiz=null;
        
    }
    public void insertarI(E valor){
        if(this.raiz==null){
            Nodo no = new Nodo(valor);
            this.raiz=no;
            actual=this.raiz;
            return;
        }
        Nodo nuevo = new Nodo(valor);
        Nodo temporal=raiz;
        if(temporal!=null){
            temporal.izquierda=nuevo;
            System.out.println("IZquierda");
        }
        actual=nuevo;

    }
    public void insertarD(E valor){
        if(this.raiz==null){
            Nodo no = new Nodo(valor);
            this.raiz=no;
            actual=this.raiz;
            return;
        }
        Nodo nuevo = new Nodo(valor);
        Nodo temporal=raiz;
        if(temporal!=null){
            temporal.derecha=nuevo;
            System.out.println("Derecha");

        }
        actual=nuevo;

    }

    
    public void inorden(Nodo x){
        if(x!=null){
            inorden(x.izquierda);
            System.out.println("Esto es parte del recorrido"+x.llave);
            inorden(x.derecha);
        }
        
    }


    private class Nodo{
        public Nodo p;//Nodo padre
        public Nodo derecha;
        public Nodo izquierda;
        public E llave;
    
    public Nodo(E llave){
        this.llave =llave;
        derecha=null;
        izquierda=null;
        p=null;
    }
  }
        public static void main(String args[]) throws Exception{
 
  
        ArbolBB arbol = new ArbolBB();
        arbol.insertarD(29);
        arbol.insertarD(45);
        arbol.insertarI(33);
                System.out.println(arbol.raiz.llave);
                System.out.println(arbol.raiz.izquierda.llave+"Esta es la llave");
                System.out.println(arbol.actual.llave+"Esta es la llave");

        arbol.inorden(arbol.raiz);

  

    }
}