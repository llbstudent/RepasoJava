package POO_Repaso_TierraMedia;

public abstract class Habitantes{
	/**
	*Atributos de la clase
	*/
	protected String nombre, padre, zona;
	protected boolean vivo;

	public static int num_Habitantes = 0;	

	/**
	* Constructor por defecto
	*/
	Habitantes(){
		this.nombre = "Frodo";
		this.padre = "Hijo del churrero de la esquina del bosque maldito";
		this.zona = "Chiclana";
		this.vivo = true;

		num_Habitantes++;
	}

	/**
	* Constructor por parametros
	*/
	Habitantes(String nombre, String padre, String zonita, boolean vivito){
		this.nombre = nombre;
		this.padre = padre;
		this.zona = zonita;
		this.vivo = vivito; 

		num_Habitantes++;
	}

	/**
	* Metodo que matara a un personaje de la tierra media
	*/
	public void matarPersonaje()throws TierraMediaException, Exception{
		if(this.vivo){
			this.vivo = false;

		}else{
			throw new TierraMediaException("Lo que esta muerto no puede morir");
		}
	}

	/**
	* Metodo toString que nos imprimira cualquier objeto del sistema
	*/
	public String toString(){
		String msj, vida;

		//Condicion si esta vivo o muerto
		if(this.vivo){
			vida = "VIVO";
		}else{
			vida = "MUERTO";
		}

		msj = "-----------------------"
		+ "\nNombre: " + this.nombre
		+ "\nPadre: " + this.padre
		+ "\nZona: " + this.zona
		+ "\nVivo: " + vida +
		"\n-----------------------";

		return msj;
	}

	/**
	* Metodo toString que nos devolvera una cadena de caracteres
	* en la que nos dira si esta vivo o muerto el personaje
	*/
	public String toStringVida(){
		String respuesta;
		//Cond
		if(this.vivo){
			respuesta = "VIVO ";
		}else{
			respuesta = "MUERTO ";
		}

		return respuesta;
	}

	/*public String toStringTipo(){
		if(this instanceof Uruk){
            return "Uruk";

		}else if(this instanceof Elfo){
			return "Elfo";
		
		}else if(this instanceof Hobbit){
			return "Hobbit";

		}else{
			return "Habitante";
		}
	}*/

	public abstract String toStringTipo();

}