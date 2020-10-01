public class MiExcepcionObras extends Exception{
	//Constructores
	// DEFECTO
	MiExcepcionObras(){
		super("Error, indefinido");
	}

	//PARAMETRO
	MiExcepcionObras(String msj){
		super(msj);
	}

}