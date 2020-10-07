package POO_5__ClasesAbstractas__Interfaces_ENUM;

import java.util.Date;

public abstract class Electrodomestico_Padre implements Dispositivo_Interf{

	protected int ID_Electrodomestico;
	protected boolean corrienteActiva;
	protected boolean garantia;
	protected Date fechaCompra;
	protected Consumo_ENUM consumoEnergetico;
	protected String tipo;
	protected static int NUM_ELECTRODOMESTICO = 1; 
	
	//Constructores
	public Electrodomestico_Padre() {
		this.ID_Electrodomestico = this.NUM_ELECTRODOMESTICO;
		this.NUM_ELECTRODOMESTICO++;
	}
	
	public Electrodomestico_Padre(Date fecha, String tipo, Consumo_ENUM consumoEnergetico) {
		this.ID_Electrodomestico = this.NUM_ELECTRODOMESTICO;
		this.NUM_ELECTRODOMESTICO++;
		this.fechaCompra = fecha;
		this.tipo = tipo;
		this.consumoEnergetico = consumoEnergetico;
	}

	//SETTER Y GETTER
	public int getID_Electrodomestico() {
		return ID_Electrodomestico;
	}

	public void setID_Electrodomestico(int iD_Electrodomestico) {
		ID_Electrodomestico = iD_Electrodomestico;
	}

	public static int getNUM_ELECTRODOMESTICO() {
		return NUM_ELECTRODOMESTICO;
	}

	public static void setNUM_ELECTRODOMESTICO(int nUM_ELECTRODOMESTICO) {
		NUM_ELECTRODOMESTICO = nUM_ELECTRODOMESTICO;
	}
	
	public boolean isCorrienteActiva() {
		return corrienteActiva;
	}

	public void setCorrienteActiva(boolean corrienteActiva) {
		this.corrienteActiva = corrienteActiva;
	}

	public boolean isGarantia() {
		return garantia;
	}

	public void setGarantia(boolean garantia) {
		this.garantia = garantia;
	}

	public Date getFechaCompra() {
		return fechaCompra;
	}

	public void setFechaCompra(Date fechaCompra) {
		this.fechaCompra = fechaCompra;
	}

	public Consumo_ENUM getConsumoEnergetico() {
		return consumoEnergetico;
	}

	public void setConsumoEnergetico(Consumo_ENUM consumoEnergetico) {
		this.consumoEnergetico = consumoEnergetico;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	
	//--------------------------
	//Sobreescribir métodos
	//--------------------------
	
	//Si el consumo es 'A' o mayor tiene una garatía de 3 años, sino 2
	@Override
	public void estadoGarantia(Date fechaActual) {
		//Fechas correctas
		if(fechaActual.after(this.fechaCompra) || fechaActual.equals(this.fechaCompra)) {
			int diasDesdeLaCompra = (int) ((fechaActual.getTime() - this.fechaCompra.getTime())/86400000);
			//Tipo de consumo
			if(this.consumoEnergetico.toString().contains("A")) {
				//3 años
				if(diasDesdeLaCompra <= 1096) {
					System.out.println("El producto aún tiene garantía");
				}else {
					System.out.println("El producto no dispone garantía");
				}				
			}else {
				//2 años
				if(diasDesdeLaCompra <= 731) {
					System.out.println("El producto aún tiene garantía");
				}else {
					System.out.println("El producto no dispone garantía");
				}					
			}			
		}else {
			System.out.println("La fecha no puede ser anterior a la fecha de compra");
		}		
	}

	@Override
	public void funcionamientoOK(boolean estado) {
		if(this.corrienteActiva) {
			if(estado) {
				System.out.println("El aparato funciona correctamente");
			}else {
				System.out.println("El aparato dispone de una avería, póngase en contacto con el servicio técnico");
			}			
		}else {
			System.out.println("El aparato no dispone de corriente, asegúrese de que está conectado a una fuente de energía (enchufe)");
		}				
	}
	

	@Override
	public void funcionamiento() {}

	@Override
	public void verDatos() {
		System.out.println("Electrodoméstico ID-" + this.ID_Electrodomestico + "\tTipo: " + this.tipo + "\tConsumo: " + this.consumoEnergetico);
	}

}
