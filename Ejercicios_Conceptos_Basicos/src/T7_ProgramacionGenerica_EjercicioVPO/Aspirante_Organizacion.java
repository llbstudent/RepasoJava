package T7_ProgramacionGenerica_EjercicioVPO;

public class Aspirante_Organizacion extends Aspirante{
	private String nombre;
	private String nif;
	private Enum_TipoVecinal nombreBarriada;
	
	//Constructor
	public Aspirante_Organizacion(String nombre, String nif, Enum_TipoVecinal nombreBarriada) {
		super(nombre);
		this.nif = nif;
		this.nombreBarriada = nombreBarriada;
	}
	
	
	//Getters Y Setters
	public String getNif() {
		return nif;
	}
	public void setNif(String nif) {
		this.nif = nif;
	}
	public Enum_TipoVecinal getNombreBarriada() {
		return nombreBarriada;
	}
	public void setNombreBarriada(Enum_TipoVecinal nombreBarriada) {
		this.nombreBarriada = nombreBarriada;
	}


	//ToString
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder(super.toString());
		sb.append("-ORGANIZACIÓN nif=" + nif + ", nombreBarriada=" + nombreBarriada + "]");
		return sb.toString();
	}
}
