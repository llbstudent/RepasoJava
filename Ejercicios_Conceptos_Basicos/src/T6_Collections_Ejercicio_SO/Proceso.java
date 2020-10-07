package T6_Collections_Ejercicio_SO;

public class Proceso {
	private int id;
	private int tiempo;
	private int prioridad;
	
	//Constructor
	public Proceso() {
		this.id = (int) (Math.random()*(0-999+1) + 999);
		this.tiempo = (int) (Math.random()*(300 - 2000 +1)+2000);
		this.prioridad = (int) (Math.random()*(3-1+1)+1);
	}
	

	//Setter y Getter
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getTiempo() {
		return tiempo;
	}
	public void setTiempo(int tiempo) {
		this.tiempo = tiempo;
	}
	public int getPrioridad() {
		return prioridad;
	}
	public void setPrioridad(int prioridad) {
		this.prioridad = prioridad;
	}
	
	@Override
	public String toString() {
		return "\nProceso [id=" + id + ", prioridadProceso=" + prioridad 
				+ "\ntiempoRestante=" + tiempo + "]";
	}

}
