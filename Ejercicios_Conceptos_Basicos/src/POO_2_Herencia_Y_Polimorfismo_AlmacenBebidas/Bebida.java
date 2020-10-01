package POO_2_Herencia_Y_Polimorfismo_AlmacenBebidas;

public class Bebida {

	private static int idActual = 1;
	private int id;
	private double cantidad;
	private double precio;
	private String marca;
	
	//Constructores
	public Bebida() {}

	public Bebida(double cantidad, double precio, String marca) {
		this.id = idActual++;
		this.cantidad = cantidad;
		this.precio = precio;
		this.marca = marca;

	}
	
	//SETTER Y GETTER

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getCantidad() {
		return cantidad;
	}

	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	
	//ToString
	@Override
	public String toString() {
		return "Bebida: id=" + id + ", cantidad=" + cantidad + ", precio=" + precio + ", marca=" + marca + " ";
	}

}
