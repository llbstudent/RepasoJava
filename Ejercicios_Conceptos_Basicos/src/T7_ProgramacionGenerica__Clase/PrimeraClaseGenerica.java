package T7_ProgramacionGenerica__Clase;

public class PrimeraClaseGenerica<T> {
	private T tipo;
	
	//Constructor
	public PrimeraClaseGenerica() {
		this.tipo = null;
	}
	
	//Setter y Getter
	public void setTipo(T nuevoValor) {
		this.tipo = nuevoValor;
	}
	
	public T getTipo() {
		return this.tipo;
	}
}
