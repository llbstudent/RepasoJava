package POO_Repaso_TierraMedia;

public class Hobbit extends Habitantes{
	/**
	* Atributos clase Elfo
	*/
	private boolean capaElfica;

	/**
	* Constructor por defecto
	*/
	Hobbit(){
		super();
		this.capaElfica = false;
	}

	/**
	* Constructor por parametros
	*/
	Hobbit(String nombre, String padre, String zona, boolean vivo, boolean capita){
		super(nombre, padre, zona, vivo);
		this.capaElfica = capita;
	}

	//METODO GET CAPA
	public boolean getcapa(){ return this.capaElfica;  }

	public String toStringTipo(){
		return "Hobbit";
	}
}