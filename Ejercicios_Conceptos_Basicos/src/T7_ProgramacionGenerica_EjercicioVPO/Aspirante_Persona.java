package T7_ProgramacionGenerica_EjercicioVPO;

public class Aspirante_Persona extends Aspirante{
	private String dni;
	private Enum_TipoPersona tipo;
	
	//Constructor
	public Aspirante_Persona(String dni, String nombre, Enum_TipoPersona tipo) {
		super(nombre);
		this.dni = dni;
		this.tipo = tipo;
	}

	//Getters Y Setters
	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}


	public Enum_TipoPersona getTipo() {
		return tipo;
	}

	public void setTipo(Enum_TipoPersona tipo) {
		this.tipo = tipo;
	}

	//ToString
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder(super.toString());
		return "-PERSONA [dni=" + dni + ", tipo=" + tipo + "]";
	}

}
