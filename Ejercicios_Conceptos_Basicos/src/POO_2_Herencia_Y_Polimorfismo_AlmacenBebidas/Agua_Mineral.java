package POO_2_Herencia_Y_Polimorfismo_AlmacenBebidas;

public class Agua_Mineral extends Bebida {
	private String origenManantial;

	// Constructores
	public Agua_Mineral() {
		super();
	}

	public Agua_Mineral(double cantidad, double precio, String marca, String origenManantial) {
		super(cantidad, precio, marca);
		this.origenManantial = origenManantial;
	}

	// GETTER Y SETTER
	public String getOrigenManantial() {
		return origenManantial;
	}

	public void setOrigenManantial(String origenManantial) {
		this.origenManantial = origenManantial;
	}
	
	@Override
	public String toString() {
		return super.toString() + "Manantial: " + this.origenManantial;
	}

}
