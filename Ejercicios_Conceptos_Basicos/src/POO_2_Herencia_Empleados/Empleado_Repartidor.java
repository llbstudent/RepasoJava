package POO_2_Herencia_Empleados;

public class Empleado_Repartidor extends Empleado{
	private String zona;

	// Constructores
	public Empleado_Repartidor() {
		super();
	}

	public Empleado_Repartidor(String nombre, int edad, Double salario, String zona) {
		super(nombre, edad, salario);
		this.zona = zona;
	}

	// SETTER Y GETTER
	public void setZona(String zona) {
		this.zona = zona;
	}

	public String getZona() {
		return zona;
	}

	// ToString
	@Override
	public String toString() {
		return super.toString() + "zona=" + zona;
	}
	
	 /**
     * Si tiene <25 años y trabaja en la zona 3
     */
    @Override
    public boolean plus() {
    	if(super.getEdad() < 25 && this.zona.equalsIgnoreCase("3")) {
    		super.setSalario(super.getSalario() + super.getPLUS());
    		return true;    
    	}else {
    		return false;    
    	}    		
    }

}
