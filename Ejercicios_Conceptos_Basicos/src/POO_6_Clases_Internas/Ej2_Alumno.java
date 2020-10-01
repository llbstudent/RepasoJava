package POO_6_Clases_Internas;

public class Ej2_Alumno {

	private String nombre;
	private String apellidos;
	private int anyoNacimiento;
	private Direccion direccion;

	//Constructor
	public Ej2_Alumno(String nombre, String apellidos, int anyoNacimiento, Direccion direccion) {
	        this.nombre = nombre;
	        this.apellidos = apellidos;
	        this.anyoNacimiento = anyoNacimiento;
	        this.direccion = direccion;
	    }
	
	//SETTER Y GETTER
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getAnyoNacimiento() {
		return anyoNacimiento;
	}

	public void setAnyoNacimiento(int anyoNacimiento) {
		this.anyoNacimiento = anyoNacimiento;
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	@Override
	    public String toString() {
	        return "Alumno [nombre" + nombre + ", apellidos=" + apellidos + ", anyoNacimiento=" + anyoNacimiento
	                + ", direccion=" + direccion + "]";
	    }

	//Clase interna Dirección
	static class Direccion {
		String calle;
		int numero;

		public Direccion(String calle, int numero) {
			this.calle = calle;
			this.numero = numero;
		}

		@Override
	        public String toString() {
	            return "Direccion [calle=" + calle + ", numero=" + numero + "]";
	        }

	}//FIN Dirección
}//Fin Alumno
