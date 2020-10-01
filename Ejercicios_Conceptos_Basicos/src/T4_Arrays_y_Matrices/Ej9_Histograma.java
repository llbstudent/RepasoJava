package T4_Arrays_y_Matrices;

import java.util.Scanner;

public class Ej9_Histograma {
	
	//Ordenar
	private static int[] ordenarArray(int[] arr) {
		boolean estaOrdenado = true;
		
		do {
			estaOrdenado = true;
			
			for(int i=0; i < arr.length-1; i++) {
				if(arr[i] > arr[i+1]) {
					int aux = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = aux;
					
					estaOrdenado = false;
				}
			}
		}while(!estaOrdenado);
		return arr;		
	}
	
	//Eliminar Repetidos
	private static int[] quitarElemtosRepetidosArray(int[] arr) {
		int[] arrOK;
		int contadorRepet = 0;
		
		for(int i=0; i < arr.length-1; i++) {
			if(arr[i] == arr[i+1]) {
				contadorRepet += 1;
			}
		}
		arrOK = new int[arr.length - contadorRepet];
		
		
		return arrOK;
	}
	
	
	//Impresion Completa
	private static void impresionCompleta(int[] arr, int[] arrCompleto) {
		//buscar núm coincidencias
		for(int i=0; i < arr.length; i++) {
			int contador = 0;
			for(int j=0; j < arrCompleto.length; j++) {
				if(arr[i] == arrCompleto[j]) {
					contador += 1;
				}
			}
			//Impresion
			System.out.print("\n" + arr[i] +": ");
			for(int k=0; k < contador; k++) {
				System.out.print("*");
			}
		}
	}
	
	
	
	//MAIN
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Inserte el tamanno del Array (número enteros): ");
		int tam = in.nextInt();
		int[] arr = new int[tam];
		
		
		in.nextLine();
		for(int i=0; i < tam; i++) {
			boolean formatoCorrecto;
			do {
				formatoCorrecto = true;
				System.out.print("\nPosicion [" +i+ "] = ");
				String variable = in.nextLine();
				try {
					if(variable != null || variable.length() >= 0 || !variable.equalsIgnoreCase(" ")) {
						int num  = Integer.parseInt(variable);
						
						if(num > 0 && num <= 100) {
							arr[i] = num;
						}else {
							formatoCorrecto = false;
						}
						
					}else {
						System.out.println("Debe insertar datos");
					}
					
				}catch(NumberFormatException excepcion) {
					formatoCorrecto = false;
				}				
			}while(!formatoCorrecto);
		}
		
		System.out.println("\n\n1.Paso. Array normal: ");
		Ej5_MultiplicacionArray.imprimirArray(arr);
		
		//Ordenar Array
		int[] arrCopia = ordenarArray(arr);
		System.out.println("\n\n2.Paso. Array ordenado: ");
		Ej5_MultiplicacionArray.imprimirArray(arrCopia);
		
		//Quitar Elementos Repetidos
		System.out.println("\n\n3.Paso. Array sin elementos repetidos: ");
		int[] arr2 = quitarElemtosRepetidosArray(arrCopia);
		Ej5_MultiplicacionArray.imprimirArray(arr2);
		
		//Buscar Elementos Repetidos e imprimir
		System.out.print("\n\n4.Paso. Impresión '*': ");
		impresionCompleta(arr2, arrCopia);
		
		in.close();
	}
}
