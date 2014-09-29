public class ColaPrioridad  <E>{

	private Nodo primerNodo;
	private Nodo ultimoNodo;
	private int tamaño;
	private int maxTamaño;

	public ColaPrioridad(){
		this.primerNodo = null;
		this.ultimoNodo = null;
		this.tamaño = 0;
	}

	public ColaPrioridad(int maximoTamaño){
		this.primerNodo = null;
		this.ultimoNodo = null;
		this.tamaño = 0;
		this.maxTamaño = maximoTamaño;
	}

	// Clase interna de la Cola para el manejo
	// por medio de nodos

	public class Nodo{

		// Atributos
		private E dato;
		private int prioridad;
		private Nodo siguiente;
		private Nodo anterior;

		// Constructor con un elemento
		// Persona con discapacidad = 1
		// Adulto Mayor = 2
		// Mujer embarazada = 3
		// Cliente corporativo  = 4
		// Cliente regular = 5
		public Nodo(E elemento,String prioridad){

			this.dato = elemento;
			if(prioridad == "Persona con discapacidad")this.prioridad = 1;
			else if(prioridad == "Adulto Mayor")this.prioridad = 2;
			else if(prioridad == "Mujer embarazada")this.prioridad = 3;
			else if(prioridad == "Cliente corporativo")this.prioridad = 4;
			else if(prioridad == "Cliente regular")this.prioridad = 5;

			this.siguiente = null;
			this.anterior = null;

		}

		public Nodo(E elemento){
			this.dato = elemento;
			this.siguiente = null;
			this.anterior = null;
			this.prioridad = 0;
		}

		// Constructor de un nodo vacio
		public Nodo(){

			this.dato = null;
			this.prioridad = 0;
			this.siguiente = null;
			this.anterior = null;
		}

		// Tomar el dato de un nodo
		public E getDato(){
			return this.dato;
		}

		// Poner elemento en dato
		public void setDato(E elemento){
			this.dato = elemento;
		}


		// Toma el siguiente nodo de un nodo
		public Nodo getSiguiente(){
			return this.siguiente;
		}

		// Obtener el nodo proximo de un nodo
		public void setSiguiente(Nodo proximo){
			this.siguiente = proximo;
		}

		public Nodo getAnterior(){
			return this.anterior;
		}

		public void setAnterior(Nodo antes){
			this.anterior = antes;
		}

		public int getPrioridad(){
			return this.prioridad;
		}

	}

	public boolean estaVacia(){
		if(this.tamaño == 0){
			return true;
		}
		else{
			return false;
		}
	}

	public E getElemento(int posicion){
		if (posicion < this.tamaño){
			Nodo nodoActual = this.primerNodo;
			for(int i = 0; i < posicion; i++){
				nodoActual = nodoActual.getSiguiente();
			}
			return nodoActual.getDato();
		}
		return null;
		
	}

	public int getTamaño(){
		return this.tamaño;
	}


	// Si la cola es de personas, se añade con este metodo
	public void añadirColaPersonas(E elemento,String prioridad){
		Nodo nodoNuevo = new Nodo(elemento,prioridad);
		Nodo nodoActual = this.primerNodo;
		if(nodoActual == null){
			this.primerNodo = nodoNuevo;
			tamaño ++;
		}
		else{

			for (int i = 0; i < this.tamaño; i++){
				if (nodoActual.getPrioridad() <= nodoNuevo.getPrioridad()){
					if(nodoActual.getSiguiente() == null){
						nodoActual.setSiguiente(nodoNuevo);
						nodoNuevo.setAnterior(nodoActual);
						tamaño ++;
						break;
					}
					nodoActual = nodoActual.getSiguiente();
				}
				else{
					Nodo nodoAnterior = nodoActual.getAnterior();
					if(nodoAnterior == null){
						nodoActual.setAnterior(nodoNuevo);
						nodoNuevo.setSiguiente(nodoActual);
						this.primerNodo = nodoNuevo;
						tamaño++;
						break;
					}

					else{

						// cambio de nodos
						nodoAnterior.setSiguiente(nodoNuevo);
						nodoNuevo.setAnterior(nodoAnterior);
						nodoNuevo.setSiguiente(nodoActual);
						nodoActual.setAnterior(nodoNuevo);
						tamaño++;
						break;
					}
				}
			}

		}
	}

	//Si la cola es de cajeros se añade con este metodo

	public void añadirColaCajeros(E elemento){
		Nodo nodoNuevo = new Nodo(elemento);
		Nodo nodoActual = this.primerNodo;

		if(tamaño < maxTamaño){

			if(nodoActual == null){
				this.primerNodo = nodoNuevo;
				this.ultimoNodo = nodoNuevo;
				tamaño++;
			}
			else{ 
				this.ultimoNodo.setSiguiente(nodoNuevo);
				nodoNuevo.setAnterior(this.ultimoNodo);
				this.ultimoNodo = nodoNuevo;
				tamaño ++;
			}
		}
	}

	public void descolar(){
		if(primerNodo != null){
			this.primerNodo = primerNodo.getSiguiente();
			tamaño--;
		}
	}
	public static void main(String[] args) {
		Persona personita1 = new Persona("correo","nombre","Ciego");
		Persona personita2 = new Persona("correo","nombre","Kenneth");
		Persona personita3 = new Persona("correo","nombre","Bernal");
		Persona personita4 = new Persona("correo","nombre","Ciego2");
		Persona personita5 = new Persona("correo","nombre","Kenneth2");
		Persona personita6 = new Persona("correo","nombre","Choco");
		Persona personita7 = new Persona("correo","nombre","Hugo");
		Persona personita8 = new Persona("correo","nombre","Ciego3");
		Persona personita9 = new Persona("correo","nombre","Kenneth3");

		ColaPrioridad colita =  new ColaPrioridad();

		colita.añadirColaPersonas(personita1,"Persona con discapacidad");
		colita.añadirColaPersonas(personita2,"Cliente regular");
		colita.añadirColaPersonas(personita3,"Cliente corporativo");
		colita.añadirColaPersonas(personita4,"Persona con discapacidad");
		colita.añadirColaPersonas(personita5,"Cliente regular");
		colita.añadirColaPersonas(personita6,"Mujer embarazada");
		colita.añadirColaPersonas(personita7,"Adulto Mayor");
		colita.añadirColaPersonas(personita8,"Persona con discapacidad");
		colita.añadirColaPersonas(personita9,"Cliente regular");

		System.out.println("Ordenada");

		for(int i = 0; i < colita.getTamaño(); i++ ){
			Persona per = (Persona)colita.getElemento(i);
			System.out.println(per.getTipo());
		}

		colita.descolar();
		colita.descolar();
		colita.descolar();
		colita.descolar();
		colita.descolar();
		colita.descolar();
		colita.descolar();
		colita.descolar();
		System.out.println("desconalada");
		for(int i = 0; i < colita.getTamaño(); i++ ){
			Persona per = (Persona)colita.getElemento(i);
			System.out.println(per.getTipo());
		}
		colita.descolar();
		System.out.println(colita.getTamaño());

		Cajero cajerito = new Cajero();

		ColaPrioridad colaCajeros = new ColaPrioridad(10);

		colaCajeros.añadirColaCajeros(cajerito);

		System.out.println(colaCajeros.getElemento(0));
		System.out.println(colaCajeros.getTamaño());
	}

}





	