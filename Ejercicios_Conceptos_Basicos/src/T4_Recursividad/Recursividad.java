package T4_Recursividad;

import java.util.Scanner;

public class Recursividad {
	
	//-------------------------------
	// MÉTODOS
	//-------------------------------
	
	// 1 RECURSIVIDAD: Imprime de 0 hasta 'num' número
	private static void imprimirHasta_x_Numero(int num, int numeroImprimir) {
		
		if(numeroImprimir <= num) {
			System.out.println(numeroImprimir);
			numeroImprimir++;
			imprimirHasta_x_Numero(num, numeroImprimir);
			
		}else {
			System.out.println("Fin");
		}
		
	}
	
	
	// 2 RECURSIVIDAD: suma todos los números de 1 hasta 'num' 
	private static int sumaHastaX_numero(int num) {
		if(num == 0) {
			return 0;
			
		}else {
			num += sumaHastaX_numero(num -1);
			return num;
		}		
	}
	
	// 3 RECURSIVIDAD: el factorial de 'num' 
	public static int factorial(int num){
		if(num == 1){
			return 1;
		}else{
			num *= factorial(num-1);
			return num;
		}
	}
	
	
	// 4 RECURSIVIDAD: Calcular la suma de todos los número pares hasta 'n'
	private static int calcularSumaNumPares(int num) {
		if(num == 0) {
			return 0;
		
		}else {
			if(num % 2 == 0) {
				num += calcularSumaNumPares(num-1);
				return num;
				
			}else {
				return calcularSumaNumPares(num-1);
			}
		}
	}	
	
	
	// 5 RECURSIVIDAD: Calcular la media de un Array
	public static void calcularMediaArray(int[] arr, int index, int media) {
		if(index < 0) {
			media = media/ (arr.length-1);
			System.out.println("LA media de todos los números es: " + media);
		}else {
			media += arr[index];
			calcularMediaArray(arr, index-1, media);
		}		
	}
	
	// 5 RECURSIVIDAD: Calcular la media de un Array de los números pares. Con void
	public static void mediaPAresArrayVoid(int[] arr, int index, int media, int contadorNumPares){
		if(index < 0){
			media = media / contadorNumPares;
			System.out.println("La media con 'void' es: " + media);

		}else{
			if(arr[index] % 2 == 0) {
				media += arr[index];
				contadorNumPares++;
				mediaPAresArrayVoid(arr, index-1, media, contadorNumPares);
						
			}else {
				mediaPAresArrayVoid(arr, index-1, media, contadorNumPares);
			}				
		}
	}
	
	
	// 6 RECURSIVIDAD: Calcular la media de un Array
	public static int mediaTodos(int[] arr, int index, int media, int contador) {
		if(index < 0){
			return media / contador;

		}else{
				media += arr[index];
				contador++;
				return mediaTodos(arr, index-1, media, contador);
		}		
	}
			
	
	// 6 RECURSIVIDAD: Calcular la media de un Array, sólo números pares. Con return
		private static int mediaPAresArrayReturn(int[] arr, int index, int media, int contadorNumPares) {
			if(index < 0){
				return media / contadorNumPares;

			}else{
				if(arr[index] % 2 == 0) {
					media += arr[index];
					contadorNumPares++;
					return mediaPAresArrayReturn(arr, index-1, media, contadorNumPares);
					
				}else {
					return mediaPAresArrayReturn(arr, index-1, media, contadorNumPares);
				}
			}
		}


		
	
	// 7 RECURSIVIDAD: Método que nos imprime el array de personas
	public static void recorresArray(String[] arr, int index){
		if(index < 0){
			System.out.println("FIN");

		}else{
			System.out.println(arr[index]);
				recorresArray(arr, index-1);
		}

	}
	
	
	// 8 RECURSIVIDAD: Método recursivo que nos dice si un array de tipo 'Object' contiene un elemnto de tipo 'Integer' 
	//.getClass().getName()
	public static boolean contieneInteger(Object[] arr, int index, boolean res) {
		if(index < 0) {
			return false;
			
		}else {
			//Integer.class.isInstance(arr[index])
			if(Integer.class.isInstance(arr[index])) {
				return true;
				
			}else {
				res = contieneInteger(arr, index-1, false);
				return res;				
			}
		}		
	}
	
	
	
	// 9 RECURSIVIDAD: Método recursivo que nos dice si un array de tipo 'Object' contiene un elemnto de tipo 'Integer'
	private static boolean comprobacionExistePersona(Object[] arr, int tam) {
		if(tam < 0) {
			return false;
			
		}else {
			if(arr[tam] instanceof Persona) {
				return true;
				
			}else {
				return comprobacionExistePersona(arr, tam-1);
			}
		}
	}
	
	
	
	
	//Método principal / MAIN
	public static void main(String[] args) {
		boolean menuActivo = true;
		Scanner in = new Scanner(System.in);
		
		do {
			System.out.println("\n***********************************.:. EJEMPLOS DE RECURSIVIDAD .:.******************************************************"
					+ "\n\n[1]-Insertar un número 'x' e imprime todos ellos desde el '0' hasta el que hayas introducido."
					+ "\n[2]-Insertar un número 'x' y qué el método nos devuelva la suma de todos los números hasta el que has introducido"
					+ "\n[3]-Factorial de un número que hayas introducido"
					+ "\n[4]-Sumar todos los números pares hasta 'n' números"
					+ "\n[5]-Calcular la media de un Array completo y de los númPares (void)"
					+ "\n[6]-Calcular la media de un Array completo y de los númPares (return)"
					+ "\n[7]-Método Recursivo que nos imprime el array de personas"
					+ "\n[8]-Método Recursivo que nos dice si un array contiene un elemento de tipo 'int'"
					+ "\n[9]-Método que nos dice que Array tiene una instancia de tipo'Persona'"
					+ "\n[10]-SALIR" 
					+ "\n**************************************************************************************************************************");
			
			System.out.print("Seleccione: ");
			int opcionNum = in.nextInt();
			
			switch(opcionNum) {
			
			// 1 Recursividad -> Insertar un número 'x' e imprime todos ellos desde el '0' hasta el que hayas introducido
			case 1:
				System.out.print("Insertar un número 'x' e imprime todos ellos desde el '0' hasta el que hayas introducido: ");
				int numEj1 = in.nextInt();
				imprimirHasta_x_Numero(numEj1, 0);
				break;
				
			
			// 2 Recursividad -> Insertar un número 'x' y qué el método nos devuelva la suma de todos los números hasta el que has introducido
			case 2:
				System.out.print("\nInserte un número para saber la suma de '0' hasta este: ");
				int numEj2 = in.nextInt();
				System.out.println("Resultado: " + sumaHastaX_numero(numEj2));
				break;
				
				
			//3 Recursividad. Factorial
			case 3:
				int numero;
				System.out.print("\nSelecciona el numero del cual deseas calcular el factorial: ");
				numero = in.nextInt();
				System.out.println("El resultado es: " + factorial(numero));
				break;
				
				
			// 4 Recursividad. Sumar todos los números pares hasta 'n' números	
			case 4:
				System.out.print("Inserte el número: ");
				int numEj4 = in.nextInt();
				System.out.println("Resultado: " + calcularSumaNumPares(numEj4));
				break;

				
			// 5 Recursividad. Calcular la media (con void)	
			case 5:
				int[] numeros = {5, 5, 10, 9, 7, 4, 6, 6, 2, 1, 8, 7};
				int sumaMedia = 0;
				int contadorPares = 0;
				
				calcularMediaArray(numeros, numeros.length-1, sumaMedia);
				mediaPAresArrayVoid(numeros, numeros.length-1, sumaMedia, contadorPares);
				break;
				
				
			// 6 Recursividad. Calcular la media (con return)
			case 6:
				int[] numeros2 = {5, 5, 10, 9, 7, 4, 6, 6, 2, 1, 8, 7};
				int sumaMedia2 = 0;
				int contador2 = 0;
				
				int mediaTotal = mediaTodos(numeros2, numeros2.length-1, sumaMedia2, contador2);
				System.out.println("La media de todos con return es: " + mediaTotal);
				
				mediaPAresArrayVoid(numeros2, numeros2.length-1, sumaMedia2, contador2);
				int mediaRes = mediaPAresArrayReturn(numeros2, numeros2.length-1, sumaMedia2, contador2);
				System.out.println("La media hecha con return es: " + mediaRes);
				break;
				
				
			// 7 Recursividad. Método que nos imprime el array de personas	
			case 7:
				String[] personas ={"Laura", "David", "Javier", "Pepe", "Pedro"};
				recorresArray(personas, personas.length-1);
				break;
			
				
			//8 Recursividad. Método que nos dice si un array contiene un elemento de tipo 'int'
			case 8:
				boolean res = false;
				Object[] arr1 = {"Pepe", "Pedro", 3.15, 9866, 3.151648, "Juan"};
				Object[] arr2 = {"Pepe", "Pedro", 3.15, 98.66, 3.151648, "Juan"};
				
				boolean res1 = contieneInteger(arr1, arr1.length-1, res);
				boolean res2 = contieneInteger(arr2, arr2.length-1, res);
				
				//1Res
				if(res1) {
					System.out.println("El primer Array Contiene un integer");
					
				}else {
					System.out.println("El primer Array NO Contiene un integer");
				}
				
				//2Res
				if(res2) {
					System.out.println("El segundo Array Contiene un integer");
					
				}else {
					System.out.println("El segundo Array NO Contiene un integer");
				}
				break;
				
				
			// 9 Recursividad. Método que nos devuelve sólo objetos de tipo Coche
			case 9:
				Object[] arrConPersona = {
						new Coche("Seat Ibiza"),
						new Coche("BMW X4"),
						new Persona("Pedro Pérez"),
						new Coche("Alfa Romeo"),
						new Coche("Citroen Cactur")
					};
				
				Object[] arrSinPersona = {
						new Coche("Seat Ibiza"),
						new Coche("BMW X4"),
						new Coche("Peugeot 2008"),
						new Coche("Alfa Romeo"),
						new Coche("Citroen Cactur")
					};
				
				boolean rep1 = comprobacionExistePersona(arrConPersona, arrConPersona.length-1);
				boolean rep2 = comprobacionExistePersona(arrSinPersona, arrSinPersona.length-1);
				
				// 1 Respuesta
				if(rep1) {
					System.out.println("El primer Array si contiene una persona");
				}else {
					System.out.println("El primer Array no contiene una persona");
				}
				
				// 2 Respuesta
				if(rep2) {
					System.out.println("El segundo Array si contiene una persona");
				}else {
					System.out.println("El segundo Array no contiene una persona");
				}
				break;
				
				
			//Salida del Menú y finalización de programa
			case 10:
				menuActivo = false;
				System.out.println("Hasta pronto");
				break;
				
				
				
			default:
				System.out.println("Opción no disponible");
				break;			
			}			
		}while(menuActivo);		
	}



	// CLASES INTERNAS - Ayuda ejercicio '10'
	
	//Coche
	public static class Coche{
		private String nombreCoche;
		
		//Constructores
		public Coche() {}
		
		public Coche(String nombreCoche) {
			this.nombreCoche = nombreCoche;
		}

		///Getters y Setters
		public String getNombreCoche() {return nombreCoche;	}
		public void setNombreCoche(String nombreCoche) {this.nombreCoche = nombreCoche;	}
		
	}

	
	//Persona
	public static class Persona{
		private String nombrePersona;
		
		//Constructores
		public Persona() {}
		
		public Persona(String nombrePersona) {
			this.nombrePersona = nombrePersona;
		}
		
		//Getter y Setter
		public String getNombrePersona() { return this.nombrePersona;}
		public void setNombrePersona(String newName) {this.nombrePersona = newName;}
	}

	
}
