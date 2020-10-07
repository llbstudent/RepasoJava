package POO_5_ClasesAbstracctas_2;

public class Persona {
	private String nombre; 
	private String apellidos; 
	private int edad;

	//Cosntructores
	public Persona() { 
		nombre = ""; 
		apellidos = ""; 
		edad = 0; 
	}

	public Persona (String nombre, String apellidos, int edad) { 
		this.nombre = nombre; 
		this.apellidos = apellidos; 
		this.edad = edad; 
	}

	//Setter Y Getter
	public void setNombre(String nombre) { this.nombre = nombre;}
	public String getNombre() { return nombre;  }
	

	public void setApellidos(String apellidos) {this.apellidos = apellidos;}
	public String getApellidos() { return apellidos;  }

	public void setEdad(int edad) { this.edad = edad; }
	public int getEdad() { return edad;  }

	
	 //toString
	public String toString() {
		Integer edadInteger = this.edad;
		
		return "-Nombre: ".concat(this.nombre)
				.concat(" -Apellidos: ").concat(apellidos)
				.concat(" -Edad: ").concat(edadInteger.toString()); 
	}  
}
