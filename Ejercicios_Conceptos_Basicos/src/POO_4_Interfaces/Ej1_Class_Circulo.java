package POO_4_Interfaces;


//  Una interfaz es �til para definir qu� debe hacer una clase
public class Ej1_Class_Circulo implements Ej1_Interfaz_Figura{
	private double radio;
	private double area;

	//Constructores
	public Ej1_Class_Circulo() {}
	
	public Ej1_Class_Circulo(double radio) {
		this.radio = radio;
		this.area = calcularArea();
	}

	
	//Se a�aden los m�todos
	@Override
	public double calcularArea() {
		return (Math.PI * this.radio) * this.radio;
		
	}

	@Override
	public void implrimirDatos() {
		System.out.println("Datos C�rculo | \tRADIO: " + this.radio + "\t\t�REA: " + this.area);
	}

}
