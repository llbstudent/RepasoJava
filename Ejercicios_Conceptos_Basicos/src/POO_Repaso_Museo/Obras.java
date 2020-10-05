package POO_Repaso_Museo;

public abstract class Obras{

	public String titulo, autor;
	public int num_inventario;
	//Las var-estaticas siempre se inicializan en la Clase
	//Nunca en el constructor
	public static int num_total_obras = 0;


/**
* CONSTRUCTOR POR PARAMETROS
*/
	Obras(String titulo, String autor, int num_inventario){
		this.titulo = titulo;
		this.autor = autor;
		this.num_inventario = num_inventario;

		this.num_total_obras++;
	}

	//METODOS SET Y GET
	public String getTitulo(){ return this.titulo;}
	public String getAutor(){ return this.autor; }
	public int getNumeroinventario(){ return this.num_inventario; }

	public void setTitulo(String titulo){ this.titulo = titulo;}
	public void setAutor(String autor){ this.autor = autor; }
	public void setNumeroinventario(int num_inventario){ this.num_inventario = num_inventario; }


	/**
	* Metodo toString
	*@return String texto
	*/
	public String toString(){
		String texto = "Inventario: " + this.num_inventario +
			"\nAutor: " + this.autor +
			"\n------------------";

		return texto;
	}


}

