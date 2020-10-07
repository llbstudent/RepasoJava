package T6_Collections__Introduccion;

public class Tomo extends Libro{
	private int numTomo;
	private int episodios;
	
	//Constructores
	public Tomo() {
		super();
	}
	
	public Tomo(int numPaginas,  boolean reservado, String nombre, int numTomo, int episodios) {
		super(numPaginas, reservado, nombre);
		this.numTomo = numTomo;
		this.episodios = episodios;
	}
	
	//Getter Y Setter
	public int getNumTomo() {
		return numTomo;
	}

	public void setNumTomo(int numTomo) {
		this.numTomo = numTomo;
	}

	public int getEpisodios() {
		return episodios;
	}

	public void setEpisodios(int episodios) {
		this.episodios = episodios;
	}
	
	//Métodos
	@Override
	public void resumen(String txt) {
		System.out.println(txt);
	}
}
