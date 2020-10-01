package POO_2_Herencia_Y_Polimorfismo_AlmacenBebidas;

public class Refresco extends Bebida {
	private Double porcentajeAzucar;
	private boolean promocion;

	// Cosntructores
	public Refresco() {
		super();
	}

	public Refresco(double cantidad, double precio, String marca, Double azucar, boolean promocion) {
		super(cantidad, precio, marca);
		this.porcentajeAzucar = azucar;
		this.promocion = promocion;
	}

	// SETTER Y GETTER
	public Double getPorcentajeAzucar() {
		return porcentajeAzucar;
	}

	public void setPorcentajeAzucar(Double porcentajeAzucar) {
		this.porcentajeAzucar = porcentajeAzucar;
	}

	public boolean isPromocion() {
		return promocion;
	}

	public void setPromocion(boolean promocion) {
		this.promocion = promocion;
	}

	//Métodos
	
	@Override
	public double getPrecio() {
		if (isPromocion()) {
			return super.getPrecio() * 0.9;
		} else {
			return super.getPrecio();
		}
	}

	@Override
	public String toString() {
		return super.toString() + "porcentajeAzucar=" + porcentajeAzucar + ", promocion=" + promocion;
	}

}
