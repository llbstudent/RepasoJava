package T6_Collections__Introduccion;

public abstract class Libro {
	private int numPaginas;
	private boolean reservado;
	private String nombre;
	
	//Constructor
	public Libro() {
		
	}
	public Libro(int numPaginas,  boolean reservado, String nombre) {
		this.numPaginas = numPaginas;
		this.reservado = reservado;
		this.nombre = nombre;
	}
	
	//Setter Y Getter
	public int getNumPaginas() {
		return numPaginas;
	}
	public void setNumPaginas(int numPaginas) {
		this.numPaginas = numPaginas;
	}
	public boolean isReservado() {
		return reservado;
	}
	public void setReservado(boolean reservado) {
		this.reservado = reservado;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	//------------------
	//M�todos
	//------------------
	
	public void verReserva() {
		if(this.reservado)
			System.out.println("El libro est� reservado");
		else
			System.out.println("El libro no est� reservado, puede alquilarlo");
	}
	
	//m�todo abstracto
	public abstract void resumen(String txt);

}
