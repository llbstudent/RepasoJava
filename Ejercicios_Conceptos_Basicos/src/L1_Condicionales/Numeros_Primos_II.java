package L1_Condicionales;

import java.util.ArrayList;
import java.util.List;
//Importamos la clase Scanner para leer datos
import java.util.Scanner;


/**
 * Aplicación por consola que nos pide un número 'N'
 *  Y  nos dice cuantos números primos hay entre '1' y 'N'
 *  Además de decirnos qué números son
 * */
public class Numeros_Primos_II {
	
	public static void main(String[] args) {
		//Variables
		int numero;
		int contadorPrimos = 0;
		//Listado para guardar los números
		List<Integer> numPrimosList = new ArrayList<Integer>();
		//Declaramos el escáner 
		Scanner ent = new Scanner(System.in);
		
		//Obtenemos el número
		System.out.print("Inserte el número: ");
		numero = ent.nextInt();
		
		//Reccorremos hasta 'número'
		for(int  indiceNumero = 2; indiceNumero <= numero; indiceNumero++) {
			boolean esPrimo = true;
			//Recorremos hasta que el divisor sea la mitad de número y se haya encontrado una coincidencia
			for(int divisor = 2; divisor <= indiceNumero/2 && esPrimo; divisor++) {
				if(indiceNumero%divisor == 0) {
					esPrimo = false;
				}				
			}
			
			if(esPrimo) {
				contadorPrimos += 1;
				numPrimosList.add(indiceNumero);
			}
		}
		//Mostramos resultado
		System.out.println("El total de número primos hasta " + numero + " es de: " + contadorPrimos);
		System.out.println("Los números son:");
		//Mostramos todos los números
		for (int numPrimo : numPrimosList){
			System.out.println(numPrimo);
		}
	}
}
