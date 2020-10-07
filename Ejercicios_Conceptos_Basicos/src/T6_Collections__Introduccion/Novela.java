package T6_Collections__Introduccion;

public class Novela extends Libro{
	private int numCapitulos;
	private String genero;
	
	//Constructores
	public Novela() {
		super();
	}
	
	public Novela(int numPaginas,  boolean reservado, String nombre, int numCap, String gen) {
		super(numPaginas, reservado, nombre);
		this.numCapitulos = numCap;
		this.genero = gen;
	}
	
	
	//Setter y Getter
	public int getNumCapitulos() {
		return numCapitulos;
	}

	public void setNumCapitulos(int numCapitulos) {
		this.numCapitulos = numCapitulos;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	//Métodos
	@Override
	public void resumen(String txt) {
		System.out.println(txt);
	}

}
