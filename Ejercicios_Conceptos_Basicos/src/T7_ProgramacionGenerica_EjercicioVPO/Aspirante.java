package T7_ProgramacionGenerica_EjercicioVPO;

public class Aspirante {
	private String nombre;
	
	//Constructores
	public Aspirante() {}
	
	public Aspirante(String nombre) {
		this.nombre = nombre;
	}
	
	
	// Getters y Setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	//to String
	@Override
	public String toString() {
		return " [nombre=" + nombre + "]";
	}
}
