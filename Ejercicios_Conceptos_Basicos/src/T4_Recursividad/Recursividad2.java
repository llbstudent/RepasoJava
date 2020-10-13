package T4_Recursividad;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Recursividad2 {

	public static void main(String[] args) {
		// VARIABLES
		int opcion, numero, resultado;
		final int contador = 0;

		try {
			// Declaracion Escaner
			Scanner in = new Scanner(System.in);

			// MENU
			System.out.println("-----------------------------------------------");
			System.out.println("SELECCIONE:");
			System.out.println("0- SALIR ");
			System.out.println("1- SUMA 'N' PRIMEROS NUMEROS ENTEROS");
			System.out.println("2- MOSTRAR ELEMENTOS DE UN VECTOR");
			System.out.println("3- CALCULAR EL 'N-ESIMO' NUM DE FIBONACCI");
			System.out.println("4- CALCULAR EL FACTORIAL DE UN NUMERO DADO");
			System.out.println("5- CALCULAR LA POTENCIA DE UN NUMERO DADO ");
			System.out.println("6- SUMA DE LOS DIGITOS DE UN NUMERO. EJ(540 - 5+4+0=9)");
			System.out.println("7- CONOCER SI EL NÚMERO ES PRIMO");
			System.out.println("-----------------------------------------------");
			opcion = Integer.parseInt(in.nextLine());

			switch (opcion) {
			case 1:
				System.out.print("Inserte el numero hasta el cual quiere que se sume desde '0' : ");
				numero = in.nextInt();
				System.out.println("La solucion es: " + suma_N_Primeros(contador, numero));
				break;

			case 2:
				// Nos creamos el vector con una determinada longitud y le damos valores
				System.out.print("De cuanto es el tamanno del Vector, insertelo: ");
				int longitud = Integer.parseInt(in.nextLine());
				// Creacion del Vector
				String vector_nombres[] = new String[longitud];

				// Le añadimos valores al vector
				for (int i = 0; i < longitud; i++) {
					System.out.print("Valor " + i + "= ");
					vector_nombres[i] = in.nextLine();
					System.out.print("\n");
				}
				// Llamamos a la funcion
				mostrar_Elementos_Vector(0, vector_nombres);

			case 3:
				System.out.print("INSERTE EL NUMERO: ");
				numero = in.nextInt();
				resultado = fibonacci_calculo(numero);
				System.out.println("El resultado es: " + resultado);
				break;

			case 4:
				System.out.print("INSERTE EL NUMERO: ");
				numero = in.nextInt();
				int resultado_potencia = factorial_numero(1, numero);
				System.out.println("El resultado es: " + resultado_potencia);
				break;

			case 5:
				System.out.print("INSERTE EL NUMERO: ");
				numero = in.nextInt();
				System.out.print("INSERTE LA POTENCIA DEL NUMERO DADO: ");
				int potencia = in.nextInt();
				resultado = calcular_potencia(potencia, numero);
				System.out.println("El resultado es: " + resultado);
				break;

			case 6:
				System.out.print("INSERTE EL NUMERO: ");
				numero = in.nextInt();
				resultado = suma_digitos_numeros(numero);
				System.out.println("El resultado es: " + resultado);

				break;
				
			case 7:
				int num;
		 		int contadorEj7 = 2;
		 		boolean esPrimo;
		 		
		 		System.out.println("INTRODUCE EL SIGUIENTE NUMERO PARA SABER SI ES O NO PRIMO");
		 		num = in.nextInt();

		 		esPrimo = esPrimo(num, contador);
		 		
		 		if(esPrimo){
		 			System.out.println("Es primo");
		 		}else{
		 			System.out.println("No es primo");
		 		}
				break;
			}

		} catch (InputMismatchException e) {
			System.out.println("INSERTE UN VALOR VALIDO, POR FAVOR");

		} catch (NumberFormatException e) {
			System.out.println("INSERTE UN NUMERO, POR FAVOR");
		}

	}

	// ----------------------------------------
	// MÉTODOS
	// ----------------------------------------
	/**
	 * Metodo que suma los 'N' primeros numeros enteros
	 * 
	 * @param int cont. VALOR '0' que irá incrementando con cda iteracion recursiva
	 * @param int num. VALOR MAXIMO AL QUE LLEGARA
	 */
	public static int suma_N_Primeros(int cont, int num) {
		// CASO RECURSIVO
		if (cont <= num) {
			return cont + suma_N_Primeros(++cont, num);
			// CASO BASE
		} else {
			return 0;
		}
	}

	/**
	 * Metodo que mostrara los elementos de un vector de forma recursiva
	 * 
	 * @param int      index. Valor por defecto '0'. Necesario para recorrer el
	 *                 Vector
	 * @param String[] array. Contendra valores de tipo String/Palabras
	 */
	public static void mostrar_Elementos_Vector(int index, String[] array) {
		if (index < array.length) {
			System.out.print(array[index] + " ");
			mostrar_Elementos_Vector(++index, array);

		} // CASO BASE INEXISTENTE
	}

	/**
	 * Metodo que nos calculara el n-esimo numero de fibonacci
	 * 
	 * @param int num. El numero hasta cual calcularemos
	 */
	public static int fibonacci_calculo(int num) {
		if (num == 0) {
			return 0;

		} else if (num == 1) {
			return 1;

		} else {
			return fibonacci_calculo(num - 1) + fibonacci_calculo(num - 2);
		}
	}

	/**
	 * Metodo que calculara el factorial de un numero
	 * 
	 * @return un entero
	 */
	public static int factorial_numero(int cont, int num) {
		if (cont <= num) {
			return cont * factorial_numero(++cont, num);
		}
		return 1;
	}

	/**
	 * Metodo que calcula la potencia de un
	 * 
	 * @return un numero entero que sera el resultado de la potencia
	 */
	public static int calcular_potencia(int cont, int num) {
		int aux = num;
		// CASO BASE
		if (cont == 0) {
			return 1;

			// CASO RECURSIVO
		} else {
			return aux * calcular_potencia(--cont, num);

		}

		/*
		 * ITERATIVO: int result = 1;
		 * 
		 * while(cont > 0){ result *= num; cont--; }
		 * 
		 * return result;
		 */
	}

	/**
	 * Metodo recursivo que sumara los digitos de un numero
	 */
	public static int suma_digitos_numeros(int num) {
		if (num > 0) {
			return num % 10 + suma_digitos_numeros(num / 10);

		} else {
			return 0;
		}
	}
	
	
	// Método para saber si es un número primo
	public static boolean esPrimo(int num, int contador){

 		if(num == 2){ //CASO BASE 1
 			return false;
 		
 		}else if(contador > num/2){ //CASO BASE PRINCIPAL
 			return true;

 		}else{
 			if(num%contador == 0){ //CASO BASE SEC
 				return false;

 			}else{
 				return esPrimo(num, ++contador); //CASO RECURSIVO
 			}
 		}
 	}

}
