package T7_ProgramacionGenerica_EjercicioVPO;

public class Vivienda {
	private int numRegistro;
	private String direccion;
	private Enum_TipoVivienda tipo;

	// Constructor
	public Vivienda(int numRegistro, String direccion, Enum_TipoVivienda tipo) {
		this.numRegistro = numRegistro;
		this.direccion = direccion;
		this.tipo = tipo;
	}

	// Getters y Setters
	public int getNumRegistro() {
		return numRegistro;
	}

	public void setNumRegistro(int numRegistro) {
		this.numRegistro = numRegistro;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Enum_TipoVivienda getTipo() {
		return tipo;
	}

	public void setTipo(Enum_TipoVivienda tipo) {
		this.tipo = tipo;
	}

	// ToString
	@Override
	public String toString() {
		return "Vivienda [numRegistro=" + numRegistro + ", direccion=" + direccion + ", tipo=" + tipo + "]";
	}

}
