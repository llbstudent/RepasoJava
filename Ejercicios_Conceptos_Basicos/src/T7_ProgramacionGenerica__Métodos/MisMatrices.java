package T7_ProgramacionGenerica__Métodos;

public class MisMatrices {
	
	//Método genérico
	public static <T> String getElementos(T[] arr) {
		return "El array tiene " + arr.length;
	}
}
