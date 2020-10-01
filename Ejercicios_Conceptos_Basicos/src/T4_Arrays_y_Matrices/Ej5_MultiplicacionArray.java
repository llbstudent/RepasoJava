package T4_Arrays_y_Matrices;

import java.util.Scanner;

public class Ej5_MultiplicacionArray {
	//Funciones
	
	//Rellenar array
	public static void rellenarArrayManual(int[] arr, Scanner in) {
		for(int i=0; i < arr.length; i++) {
			System.out.print("\nPosición[" +i+ "] = ");
			arr[i] = in.nextInt();
		}		
	}
	
	
	//Multiplicación Array
	public static int[] multiplicacionArrays(int[] arr1, int[] arr2) {
		int[] res = new int[arr1.length];
		
		for(int i=0; i < arr1.length; i++) {
			res[i] = arr1[i] * arr2[i];
		}
		return res;
	}
	
	//Imprimir Array
	public static void imprimirArray(int[] arr) {
		System.out.print("{");
		for(int i=0; i < arr.length; i++) {
			System.out.print(arr[i]);
			
			if(i != arr.length-1) {
				System.out.print(" ");
			}
		}
		System.out.print("}");
	}
	
	//MAIN
	public static void main(String[] args) {
		int[] arr1;
		int[] arr2;
		int[] resultadoTotal;
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Inserte el tamaño de los Arrays (Escriba un número entero): ");
		int tam = in.nextInt();
		arr1 = new int[tam];
		arr2 = new int[tam];
		resultadoTotal = new int[tam];
		
		System.out.println("Rellena el primer Array: ");
		rellenarArrayManual(arr1, in);
		System.out.println("Rellena el segundo Array: ");
		rellenarArrayManual(arr2, in);
		
		System.out.println("Primer ARRAY:");
		imprimirArray(arr1);
		System.out.println("\nSegundo ARRAY:");
		imprimirArray(arr2);
		System.out.println("\nMultiplicación ARRAY:");
		imprimirArray(multiplicacionArrays(arr1, arr2));
		
		in.close();
	}
}
