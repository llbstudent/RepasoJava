package POO_2_Herencia_Empleados;

// Es una clase abstracta ya que tiene métodos abstractos
public abstract class Empleado {
	private String nombre;
	private int edad;
	private Double salario;
	public final Double PLUS = 300.00;

	// Const
	public Empleado() {
	}

	public Empleado(String nombre, int edad, Double salario) {
		this.nombre = nombre;
		this.edad = edad;
		this.salario = salario;
	}

	// SETTERS Y GETTERS
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public Double getPLUS() {
		return PLUS;
	}

	// ToString
	@Override
	public String toString() {
		return "Datos del empleado:\t" + nombre + "\t\t" + edad + "años\t\t" + salario + "\t\t";
	}

	// Metodo abstracto, obliga a las clases hijas que implementen esta función
	public abstract boolean plus();

}
