package POO_3_Herencia_Clases_Abstractas;


//Una Clase Abstracta es una clase que no se puede instanciar
//Se usa únicamente para definir subclases

//Se usan cuando deseamos definir una abstracción
//que englobe objetos de distintos tipos y hacemos uso del polimorfismo
public abstract class Figura_Abstracta {
	protected double x;
	protected double y;
	protected double area;
	protected String tipo;
	
	//Constructores
	public Figura_Abstracta() {}
	
	public Figura_Abstracta(double x, double y, String tipo) {
		this.x = x;
		this.y = y;
		this.tipo = tipo;
	}
	
	
	//Métodos abstractos
	public abstract double calcularArea();
	public abstract void datos_Figura();
	

	//SETTER Y GETTERS
	public double getX() {
		return x;
	}
	
	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

}
