package L1_Condicionales;

import java.util.ArrayList;
import java.util.List;
//Importamos la clase Scanner para leer datos
import java.util.Scanner;


/**
 * Aplicaci�n por consola que nos pide un n�mero 'N'
 *  Y  nos dice cuantos n�meros primos hay entre '1' y 'N'
 *  Adem�s de decirnos qu� n�meros son
 * */
public class Numeros_Primos_II {
	
	public static void main(String[] args) {
		//Variables
		int numero;
		int contadorPrimos = 0;
		//Listado para guardar los n�meros
		List<Integer> numPrimosList = new ArrayList<Integer>();
		//Declaramos el esc�ner 
		Scanner ent = new Scanner(System.in);
		
		//Obtenemos el n�mero
		System.out.print("Inserte el n�mero: ");
		numero = ent.nextInt();
		
		//Reccorremos hasta 'n�mero'
		for(int  indiceNumero = 2; indiceNumero <= numero; indiceNumero++) {
			boolean esPrimo = true;
			//Recorremos hasta que el divisor sea la mitad de n�mero y se haya encontrado una coincidencia
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
		System.out.println("El total de n�mero primos hasta " + numero + " es de: " + contadorPrimos);
		System.out.println("Los n�meros son:");
		//Mostramos todos los n�meros
		for (int numPrimo : numPrimosList){
			System.out.println(numPrimo);
		}
	}
}
