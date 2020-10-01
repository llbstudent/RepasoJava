package POO_3_Herencia_Clases_Abstractas;

//Heredan de su Padre/Figura_Abstracta
public class Figura_Circulo extends Figura_Abstracta{
	private Double radio;

	//Constructores
	public Figura_Circulo() {
		super(1, 1, "Círculo");
		this.radio = 7.18;
		System.out.println("Círculo creado correctamente");
	}
	
	public Figura_Circulo(double x, double y, double radio) {
		super(x, y, "Círculo");
		this.radio = radio;
		this.area = calcularArea();
		
		System.out.println("Círculo creado correctamente");
	}
	
	//GETTER Y SETTER
		public Double getRadio() {
			return radio;
		}

		public void setRadio(Double radio) {
			this.radio = radio;
		}

	
	//Sobrescribir métodos
	@Override
	public double calcularArea() {
		return (Math.PI * this.radio) * this.radio;
	}

	@Override
	public void datos_Figura() {
		System.out.println(this.tipo + "\t" + this.area);
	}
}
