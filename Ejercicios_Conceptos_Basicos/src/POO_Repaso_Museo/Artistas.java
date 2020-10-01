public class Artistas{

public String nombre, nacionalidad;

/**
* Constructor por parametros
*/
	Artistas(String nombre, String nacionalidad){
		this.nombre = nombre;
		this.nacionalidad = nacionalidad;
	}

	//METODOS SET y GET
	public String getNombre(){ return this.nombre;}
	public String getNacionalidad(){ return this.nacionalidad; }

	public void setNombre(String nombre){ this.nombre = nombre;}
	public void setNacionalidad(String nacionalidad){ this.nacionalidad = nacionalidad;}


}