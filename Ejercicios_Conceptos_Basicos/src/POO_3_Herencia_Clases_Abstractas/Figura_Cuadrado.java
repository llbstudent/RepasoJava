package POO_3_Herencia_Clases_Abstractas;

//Heredan de su Padre/Figura_Abstracta
public class Figura_Cuadrado extends Figura_Abstracta {
	private double lado;

	//Constructores
	public Figura_Cuadrado() {
		super(1, 1, "Cuadrado");
		this.lado = 4.5;
		System.out.println("Cuadrado creado correctamente");
	}
	
	public Figura_Cuadrado(double x, double y, double lado) {
		super(x, y, "Cuadrado");
		this.lado = lado;
		this.area = calcularArea();
		
		System.out.println("Cuadrado creado correctamente");
	}

	@Override
	public double calcularArea() {
		return lado * lado;
	}

	@Override
	public void datos_Figura() {
		System.out.println(this.tipo + "\t" + this.area);
	}

}
