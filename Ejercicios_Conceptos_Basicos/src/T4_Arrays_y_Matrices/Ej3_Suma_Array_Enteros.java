package T4_Arrays_y_Matrices;

public class Ej3_Suma_Array_Enteros {
	
	public static void main(String[] args) {
		int sumaTotal = 0;
		int[] a = {1, 2, 3, 4, 5, 6};
		
		for(int num : a) {
			sumaTotal += num;
		}
		System.out.println("La suma total de los elementos del vector es: " + sumaTotal);
	}
}
