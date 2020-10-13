package POO_Repaso_TierraMedia;

public class Uruk extends Habitantes{
	/**
	* Atributos de la clase URUK
	*/
	private int numCaries;
	private int fuerza;

	/**
	* Constructor por defecto
	*/
	Uruk(){
		super();
		this.fuerza = 60;
	}

	/**
	* Constructor por parametros
	*/
	Uruk(String nombre, String padre, String zonita, boolean vivito, int caries, int fuerza) 
		throws TierraMediaException, Exception{
		
		super(nombre, padre, zonita, vivito);

		//Condicion Caries
		if(caries > 30){
			throw new TierraMediaException("El Uruk no puede superar las 30 caries");
		}else{
			this.numCaries = caries;
		}

		//Condicion Fuerza
		if(fuerza < 0 || fuerza > 100){
			throw new TierraMediaException("Este Uruk no tiene la fuerza requerida");
		}else{
			this.fuerza = fuerza;
		}
	}

	//METODOS
	/**
	* Restablecera la salud de los uruk
	*/
	public void cargarFuerza(int fuerza) throws TierraMediaException, Exception{
		if(this.fuerza + fuerza > 100){
			throw new TierraMediaException("Demasiada fuerza, no permitimos berserks");

		}else if(this.fuerza + fuerza < 0){
			throw new TierraMediaException("Un Uruk demasiado debilucho, a la basura!");

		}else{
			this.fuerza += fuerza;
		}
	}

	/**
	* Metodo para obtener la fuerza del uruk
	*/
	public int getFuerza(){ return this.fuerza; }
	
	public String toStringTipo(){
		return "Uruk";
	}
}