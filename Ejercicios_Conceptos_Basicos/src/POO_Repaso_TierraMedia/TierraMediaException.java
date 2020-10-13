package POO_Repaso_TierraMedia;

public class TierraMediaException extends Exception{
	//Constructores
	//DEF
	TierraMediaException(){
		super("ERROR DESCONOCIDO");
	}

	//CONTRUCTOR PARAMETROS
	TierraMediaException(String msj){
		super(msj);
	}

}
