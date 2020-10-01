package L6_Array_Matrices;

import java.util.InputMismatchException;
import java.util.Scanner;

public class OrdenarMatriz {
	//Métodos

	//Para rellenar el array
	public static boolean rellenarArray(int[] array, Scanner scanner) {
		boolean todoOK = true;
		
		for(int i=0; i < array.length; i++) {
			System.out.print("\nPosición " + i + ": ");
			array[i] = scanner.nextInt();
		}
		return todoOK;		
	}
	
	
	//Para imprimir el Array
	public static void imprimirArray(int[] array) {
		System.out.print("[ ");
		for(int i=0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.print("] ");
	}
	
	public static void imprimirArrayByPosiciones(int[] array) {
		for(int i=0; i < array.length; i++) {
			System.out.print("\nPosición " + i + ": " + array[i]);
		}
	}
	
	//Para ordenarlo a la inversa
	public static void OrdenarArrayInversa(int[] array) {
		for(int i=0; i<(array.length / 2); i++) {
			int posAux = array[i];
			array[i] = array[(array.length - 1) - i];
			array[(array.length - 1) - i] = posAux;				
		}
	}
		
	//Para ordenarlo de mayor a menor
	public static void OrdenarArrayMayorMenor(int[] array) {
		boolean estaOrdenado = false;
		
		while(!estaOrdenado) {
			estaOrdenado = true;
			
			for(int i=0; i < (array.length - 1); i++) {
				if(array[i] < array[i+1]) {
					int aux = array[i];
					array[i] = array[i+1];
					array[i+1] = aux;
					
					estaOrdenado = false;
				}
			}
		}		
	}
	
				
	//Para ordenarlo de menor a mayor
	public static void OrdenarArrayMenorMayor(int[] array) {
		boolean estaOrdenado = false;
		
		while(!estaOrdenado) {
			estaOrdenado = true;
			
			for(int i=0; i < (array.length - 1); i++) {
				if(array[i] > array[i+1]) {
					int aux = array[i];
					array[i] = array[i+1];
					array[i+1] = aux;
					
					estaOrdenado = false;
				}
			}
		}				
	}
	
	
	
	//Método principal
	public static void main(String[] args) {
		boolean bucleActivo = true;
		boolean opcionOk = true;
		int opcionMenu = 0;
		int[] arrayNumGuardado = null;
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Seleccione el tamaño de su Array: ");
		int tam = in.nextInt();
		
		int[] arrayNum = new int[tam];
		
		//Rellenamos
		if(OrdenarMatriz.rellenarArray(arrayNum, in)) {
			System.out.println("Array rellenado correctamente:");
			arrayNumGuardado = arrayNum;
			
		}else {
			System.out.println("Error al rellenar el array.");
		}
		
		//Imprimimos
		OrdenarMatriz.imprimirArrayByPosiciones(arrayNum);
		
		//Bucle del menú
		do {
			System.out.println("\n---------------------------------");
			System.out.println("1- Ordenar un Array a la inversa"
					+ "\n2- Ordenar de menor a mayor"
					+ "\n3- Ordenar de mayor a menor"
					+ "\n4- Reestablecer Array"
					+ "\n5- SALIR");
			System.out.println("---------------------------------");
			
			
			//Excepción al introducir un carácter no válido:
			do {
				System.out.print("Seleccione: ");
				try {
					opcionMenu = Integer.parseInt(in.next());
					opcionOk = true;
					
				}catch(NumberFormatException e) {
					System.out.println("¡Inserte un número entero para el menú por favor!");
					opcionOk = false;
				}
			}while(!opcionOk);
			
			
					
			//Condicional
			switch(opcionMenu) {
			
			//Ordenar Array a la inversa
			case 1:
				System.out.println("ARRAY NORMAL:");
				OrdenarMatriz.imprimirArray(arrayNum);
				
				OrdenarArrayInversa(arrayNum);
				System.out.println("\nARRAY A LA INVERSA:");
				OrdenarMatriz.imprimirArray(arrayNum);
				break;
				
			//Ordenar de menor a mayor
			case 2:
				System.out.println("ARRAY ACTUAL:");
				OrdenarMatriz.imprimirArray(arrayNum);
				
				OrdenarMatriz.OrdenarArrayMenorMayor(arrayNum);
				System.out.println("\nARRAY ORDENADO DE MENOR A MAYOR:");
				OrdenarMatriz.imprimirArray(arrayNum);
				break;
				
			
			//Ordenar de mayor a menor
			case 3:
				System.out.println("ARRAY ACTUAL:");
				OrdenarMatriz.imprimirArray(arrayNum);
				
				OrdenarMatriz.OrdenarArrayMayorMenor(arrayNum);
				System.out.println("\nARRAY ORDENADO DE MAYOR A MENOR:");
				OrdenarMatriz.imprimirArray(arrayNum);
				break;
			
			//Reestablecer Array
			case 4:				
				if(arrayNumGuardado != null) {
					arrayNum = arrayNumGuardado;
					System.out.println("Array reestablecido:");
					OrdenarMatriz.imprimirArray(arrayNum);
				}else {
					System.out.println("No se ha podido realizar el guardado");
				}
				break;
				
			case 5:
				bucleActivo = false;
				System.out.print("Hasta prontoooo");
					break;
					
			default: System.out.println("No existe una opción "+opcionMenu+". Por favor, introduzca un número válido.");
				break;
			}
				
			}while(bucleActivo);
			
		}
	
	}
