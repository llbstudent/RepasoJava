package L3_Operaciones_Metodos_Random;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class RandomClassTest {
	
	public static void main(String[] args) {
		//---------------------------------------------------
		// Llamada Math.random
		//---------------------------------------------------
		//Ejemplos de como usar random/Obtener número aleatorios
		System.out.println("Números del '0' al '6' (Excluyendo al '6')");
		int num1 = (int) (Math.random()*6);
		System.out.println("El resultado es el número '" + num1 + "'");
		
		System.out.println("\nNúmeros del '0' al '7' (Excluyendo al '7')");
		int num2 = (int) (Math.random()*6 + 1);
		System.out.println("El resultado es el número '" + num2 + "'");
		
		System.out.println("\nConseguir un número entero entre M y N con M menor que N y ambos incluídos, debemos usar esta fórmula");
		int M = 1;
		int N = 10;
		// para conseguir un número entero entre M y N con M menor que N y ambos incluídos, debemos usar esta fórmula
		int valorEntero = (int)(Math.random()*(N-M+1)+M);
		System.out.println(valorEntero);
		
		System.out.println("\nSi no queremos un valor entero sino double, la fórmula es sin el +1:");
		double valorAleatorio = Math.random()*(N-M)+M;
		System.out.println(valorAleatorio);
		
		
		//---------------------------------------------------
		// Clase java.util.Random
		//---------------------------------------------------
		// Debemos instanciarla, a diferencia del método Math.random(). A cambio, tendremos bastantes más posibilidades.
		Random r2 = new Random(4234);
		Random r3 = new Random(4234); // r2 y r3 darán la misma secuencia.
		
		//Obtener la cara aleatoria de un dado
		Random r = new Random();
		int valorDado = r.nextInt(6)+1;  // Entre 0 y 5, más 1.
		System.out.println("\nObtenemos un número aleatorio de un dado: " + valorDado);
		
		
		//---------------------------------------------------
		// Elegir y eliminar aleatoriamente de un conjunto
		//---------------------------------------------------
		// Imagina que estamos haciendo un juego de cartas y queremos repartir las cartas de forma aleatoria entre los jugadores. 
		// Para evitar repeticiones, el algoritmo que podemos usar puede ser como el siguiente:
		List<String> cartas = new ArrayList<>(40);
		System.out.println("Repartimos una baraja de cartas: ");
		repartirBarajaCartas(cartas);
		
		
	}

	//Método que nos hace repartir una baraja de cartas
	private static void repartirBarajaCartas(List<String> cartas) {
		Scanner in = new Scanner(System.in);
		
		for (int i=0; i < 40; i++){
			String carta = in.nextLine();
			cartas.add(carta);
		}
		// Instanciamos la clase Random
		Random random = new Random();

		// Mientras queden cartas en el mazo (en la lista de numbers)
		while (cartas.size()>1){
			// Elegimos un índice al azar, entre 0 y el número de cartas que quedan por sacar
			int randomIndex = random.nextInt(cartas.size());

		   // Damos la carta al jugador (sacamos el número por pantalla)			   
			System.out.println("Not Repeated Random Number "+ cartas.get(randomIndex));
			
			// Y eliminamos la carta del mazo (la borramos de la lista)
			cartas.remove(randomIndex);
		}
	}
	
}
