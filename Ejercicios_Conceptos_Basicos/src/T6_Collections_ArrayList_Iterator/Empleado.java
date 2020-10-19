package T6_Collections_ArrayList_Iterator;

public class Empleado {
	//atributos
	private String ID;
	private String nombre;
	private String dep;
	
	//Constructor
	public Empleado(String iD, String nombre, String dep) {
		this.ID = iD;
		this.nombre = nombre;
		this.dep = dep;
	}
	
	//Getters y Setters
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDep() {
		return dep;
	}
	public void setDep(String dep) {
		this.dep = dep;
	}

	//toString
	@Override
	public String toString() {
		return "Empleado [ID=" + ID + ", " + nombre + ", dep=" + dep + "]";
	}	
}
