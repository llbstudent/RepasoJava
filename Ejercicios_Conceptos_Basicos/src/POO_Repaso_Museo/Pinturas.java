public class Pinturas extends Obras{
	 /**
	 * He preferido hacer este atributo privado al igual que el de las 
	 * esculturas
	 */
	 private int informacion_dimensiones;

/**
* Constructor por parametros
*/
	Pinturas(String titulo, String autor, int num_inventario, int informacion){
		super(titulo, autor, num_inventario);
		this.informacion_dimensiones = informacion;
	}

	/**
	* Metodo SET, para modificar la informacion de las dimensiones
	*@param int informacion
	*/
	public void setDimensiones(int informacion){ this.informacion_dimensiones = informacion;}

	/**
	* Metodo GET, para obtener las dimensiones
	*@return int informacion_dimensiones
	*/
	public int getDimensiones(){ return this.informacion_dimensiones;}

	/**
	* Metodo toString
	*@return String texto
	*/
	public String toString(){
		String texto = super.toString() +
			"\nDimensiones: " + this.informacion_dimensiones +
			"\nTipo de Obra: Pintura/Lienzo" +
			"\n-----------------------------------";

		return texto;
	}	
}