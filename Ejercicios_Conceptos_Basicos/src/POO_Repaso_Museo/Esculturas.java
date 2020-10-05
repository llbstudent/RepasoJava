package POO_Repaso_Museo;

public class Esculturas extends Obras{
	 /**
	 * He preferido hacer este atributo privado
	 */
	 private String informacion_material;



	/**
	* Constructor por parametros
	*@param String titulo
	*@param String autor
	*@param int num_inventario
	*@param String informacion
	*/
	Esculturas(String titulo, String autor, int num_inventario, String informacion){
		super(titulo, autor, num_inventario);
		this.informacion_material = informacion;
	}

	//METODOS SET y GET
	public String getInformacion_Material(){ return this.informacion_material; }

	public void setInformacion_Material(String informacion_material){ this.informacion_material = informacion_material;}


	/**
	* Metodo toString
	*@return String texto
	*/
	public String toString(){
		String texto = super.toString() +
			"\nMaterial: " + this.informacion_material +
			"\nTipo de Obra: Escultura" +
			"\n-----------------------------------";
		return texto;
	}	

}