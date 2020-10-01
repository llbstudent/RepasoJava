public class ObraRepetidaException extends Exception{
	//Constructores
	// DEFECTO
	ObraRepetidaException(){
		super("Error, esta obra ya se encuentra en nuestro catalogo");
	}

	//PARAMETRO
	ObraRepetidaException(String msj){
		super(msj);
	}

}