package T4_Arrays_y_Matrices;

import java.util.Scanner;

public class Ej6_Array_NumAsteriscos {
	//Funciones
	public static void asteriscosArray(int[] arr) {
		for(int i=0; i < arr.length; i++) {
			System.out.print("\n");
			for(int ast = 1; ast <= arr[i]; ast++) {
				System.out.print("*");
			}
		}
		
	}
	

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Inserte el tamaño del Array: ");
		int tam = in.nextInt();
		int[] arr = new int[tam];
		
		Ej5_MultiplicacionArray.rellenarArrayManual(arr, in);
		
		System.out.print("\nArray Normal:");
		Ej5_MultiplicacionArray.imprimirArray(arr);
		
		System.out.print("\nArray Asteriscos:");
		asteriscosArray(arr);
		
		in.close();
	}

}
