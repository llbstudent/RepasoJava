package POO_Repaso_TierraMedia;

public class Elfo extends Habitantes{
	/**
	* Atributos de la clase Elfo
	*/

	private int numFlechas;

	/**
	* Constructor por defecto
	*/
	Elfo(){
		super();
		this.numFlechas = 30;
	}

	/**
	*Constructor por parametro
	*/
	Elfo(String nombre, String padre, String zonita, boolean vivito, int flechas) throws TierraMediaException, Exception{
		super(nombre, padre, zonita, vivito);

		if(flechas < 0 || flechas > 50){
			throw new TierraMediaException("Cantidad de flechas no valida, debe introducir un numero comprendido entre 0 y 50");
		}else{
			this.numFlechas = flechas;
		}
		
	}

	/**
	* Metodo cargar flechas de los Elfos
	* Pueden ser valores positivos o negativos, es decir tambien puede restar el numero de flechas
	*/
	public void cargarFlechasElfo(int nflechas) throws TierraMediaException, Exception{
		//Condicion
		if(this.numFlechas + nflechas > 50){
			throw new TierraMediaException("Superado el limite de flechas");

		}else if(this.numFlechas + nflechas < 0){
			throw new TierraMediaException("Imposible que haya un numero de flechas negativo");
		
		}else{
			this.numFlechas += nflechas;
		}
	}


	/**
	* Metodo  que nos devolvera el numero de flachas que tiene el elfo
	*/
	public int getFlechas(){ return this.numFlechas; }
	
	public String toStringTipo(){
		return "Elfo";
	}
}