package POO_4_Interfaces;

//Una interfaz es una clase completamente abstracta

//No encapsula datos, sólo definen los métodos que han de implementar los objetos de aqullas clases que la usen
public interface Ej1_Interfaz_Figura {
	
	//Todos los métodos de una interfaz se declaran implícitamente como abstractos y públicos.
	public double calcularArea();
	public void implrimirDatos();

}
