package T7_ProgramacionGenerica_EjercicioVPO;

/*
 * Emparejará a la vivienda con el propietario
 * */
public class Ganador<T, E> {
	T vivienda;
	E ganador;

	// Constructores

	// Vacío
	public Ganador() {
		this.vivienda = null;
		this.ganador = null;
	}

	// Parametros
	public Ganador(T ob1, E ob2) {
		this.vivienda = ob1;
		this.ganador = ob2;
	}

	// Getters
	T get1Param() {
		return this.vivienda;
	}

	E get2Param() {
		return this.ganador;
	}
	
	
	//Muestra el tipo de T y V
    void mostrarTipo(){
        System.out.println("El tipo de T es: " + this.vivienda.getClass().getName());
        System.out.println("El tipo de E es: " + this.ganador.getClass().getName());
    }

    //toString
	@Override
	public String toString() {
		return "Vivienda=" + vivienda.toString() + "\nGanador=" + ganador.toString() + "]";
	}
}
