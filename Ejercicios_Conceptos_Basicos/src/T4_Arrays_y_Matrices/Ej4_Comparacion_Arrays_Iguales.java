package T4_Arrays_y_Matrices;



public class Ej4_Comparacion_Arrays_Iguales {
	
	private static void comparacionArrays(int[] a, int[] b) {
		boolean sonIguales = true;
		
		if(a.length == b.length) {
			for(int i=0; i < a.length; i++) {
				if(a[i] != b[i]) {
					sonIguales = false;
					System.out.println("El interior de los elementos del vector no coinciden");
				}
			}
			
		}else {
			System.out.println("Los vectores no tienen la misma dimensión");
			sonIguales = false;
		}
		
		if(sonIguales) {
			System.out.println("Los vectores SON IGUALES");
		}else {
			System.out.println("Los vectores NO SON IGUALES");
		}
	}
	
	public static void main(String[] args) {
		int[] array1_1 = {1, 2, 3};
		int[] array1_2 = {1, 2, 3};
		
		int[] array2_1 = {1, 2, 3, 4};
		int[] array2_2 = {1, 2, 3};
		
		int[] array3_1 = {1, 2, 3};
		int[] array3_2 = {1, 2, 2};
		
		
		System.out.println("Primera pareja");
		comparacionArrays(array1_1, array1_2);
		
		System.out.println("Segunda pareja");
		comparacionArrays(array2_1, array2_2);
		
		System.out.println("Tercera pareja");
		comparacionArrays(array3_1, array3_1);
	}
}
