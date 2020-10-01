package POO_4_Interfaces;


//  Una interfaz es útil para definir qué debe hacer una clase
public class Ej1_Interfaz_Circulo implements Ej1_Interfaz_Figura{
	private double radio;
	private double area;

	//Constructores
	public Ej1_Interfaz_Circulo() {}
	
	public Ej1_Interfaz_Circulo(double radio) {
		this.radio = radio;
		this.area = calcularArea();
	}

	
	//Se añaden los métodos
	@Override
	public double calcularArea() {
		return (Math.PI * this.radio) * this.radio;
		
	}

	@Override
	public void implrimirDatos() {
		System.out.println("Datos Círculo | \tRADIO: " + this.radio + "\t\tÁREA: " + this.area);
	}

}
