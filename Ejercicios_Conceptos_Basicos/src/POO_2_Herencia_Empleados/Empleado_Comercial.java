package POO_2_Herencia_Empleados;

public class Empleado_Comercial extends Empleado{
	private Double comision;

	//Constructores
	public Empleado_Comercial() {
		super();
	}
	
	public Empleado_Comercial(String nombre, int edad, Double salario, Double comision) {
		super(nombre, edad, salario);
		this.comision = comision;
	}
	
	//SETTER Y GETTER
	public Double getComision() {
		return comision;
	}

	public void setComision(Double comision) {
		this.comision = comision;
	}
	
	//ToString
	@Override
	public String toString() {
		 return super.toString() + "comision=" + comision;
	}
	
	 /**
     * Si tiene +30 años y comision +200, al emepleado le añadimos el plus
     */
    @Override
    public boolean plus() {
 
        if (super.getEdad() > 30 && this.comision > 200) {
            double nuevoSalario = super.getSalario() + super.PLUS;
            super.setSalario(nuevoSalario);
            System.out.println("Se le añadido el plus, al empleado " + super.getNombre());
            return true;
        }else {
        	return false;
        }        
    }

}
