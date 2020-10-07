package POO_5__ClasesAbstractas__Interfaces_ENUM;

import java.util.Date;

public class Nevera_Hija extends Electrodomestico_Padre{
	private boolean tieneCongelador;
	private int numPuertas;

	//Constructores
	public Nevera_Hija() {}
	
	public Nevera_Hija(Date fecha, Consumo_ENUM consumoEnergetico, boolean tieneCongelador, int numPuertas) {
		super(fecha, "Nevera", consumoEnergetico);
		this.tieneCongelador = tieneCongelador;
		this.numPuertas = numPuertas;
	}
	
	//SETTER Y GETTER
	public boolean isTieneCongelador() {
		return tieneCongelador;
	}

	public void setTieneCongelador(boolean tieneCongelador) {
		this.tieneCongelador = tieneCongelador;
	}

	public int getNumPuertas() {
		return numPuertas;
	}

	public void setNumPuertas(int numPuertas) {
		this.numPuertas = numPuertas;
	}
	
	//Sobreescribir
	@Override
	public void verDatos() {
		String datosCongelador = "";
		if(this.tieneCongelador) {
			datosCongelador = "Tiene congelador";
		}else {
			datosCongelador = "No tiene congelador";
		}
		System.out.println("-------------------");
		super.verDatos();
		System.out.println(datosCongelador + "\n-------------------");
	}
	
	
	@Override
	public void funcionamiento() {
		System.out.println("Refrigera alimentos. Inserte dentro los alimentos que quiera conservar");
	}
	

}
