package T7_ProgramacionGenerica__M�todos;

public class MisMatrices {
	
	//M�todo gen�rico
	public static <T> String getElementos(T[] arr) {
		return "El array tiene " + arr.length;
	}
}
