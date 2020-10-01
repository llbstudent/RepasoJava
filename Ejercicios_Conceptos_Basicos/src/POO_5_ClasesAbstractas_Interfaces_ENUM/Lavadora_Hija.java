package POO_5_ClasesAbstractas_Interfaces_ENUM;

import java.util.Date;

public class Lavadora_Hija extends Electrodomestico_Padre{
	private boolean secadoraIncluida;
	private boolean incluyeModoAhorro;
	private double numKilos;

	//Constructores
	public Lavadora_Hija() {}
	
	public Lavadora_Hija(Date fecha, Consumo_ENUM consumoEnergetico, boolean secadora, double numKilos) {
		super(fecha, "Lavadora", consumoEnergetico);
		this.secadoraIncluida = secadora;
		this.numKilos =numKilos;
	}

	
	//SETTERS Y GETTERS
	public boolean isSecadoraIncluida() {
		return secadoraIncluida;
	}

	public void setSecadoraIncluida(boolean secadoraIncluida) {
		this.secadoraIncluida = secadoraIncluida;
	}

	public double getNumKilos() {
		return numKilos;
	}

	public void setNumKilos(double numKilos) {
		this.numKilos = numKilos;
	}
	
	//Sobreescribir Métodos
	@Override
	public void verDatos() {
		String datosSecadora = "";
		String datosConsumo = "";
		
		if(this.secadoraIncluida) {
			datosSecadora = "Tiene secadora";
		}else {
			datosSecadora = "No tiene secadora";
		}
		
		if(this.getConsumoEnergetico().toString().contains("A")) {
			this.incluyeModoAhorro = true;
			datosConsumo = "Tiene modo ahorro/eco";
		}else {
			this.incluyeModoAhorro = false;
			datosConsumo = "no tiene modo ahorro/eco";
		}
		System.out.println("-------------------");
		super.verDatos();
		System.out.println(datosSecadora + "\n" + datosConsumo +"\n-------------------");
	}
	
	
	@Override
	public void funcionamiento() {
		System.out.println("Lava la ropa. Inserta la ropa sucia clasificandola por tejidos y/o colores y eche el detergente correspondiente");
	}

}
