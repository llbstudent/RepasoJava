

package L6_Strings.cadenas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class EjerciciosCadenas {
	//Métodos
	
	
	//-------------------
	// Opción 2
	//-------------------
	public static void longitudPalabra1(Scanner in) {
		System.out.print("Escriba la primera palabra: ");
		String ej2Palabra1 = in.nextLine();
		System.out.print("\nEscriba la segunda palabra: ");
		String ej2Palabra2 = in.nextLine();
		
		if(ej2Palabra1.length() > ej2Palabra2.length()) {
			System.out.println("La primera palabra tiene más caracteres que la segunda");
			
		}else if(ej2Palabra1.length() < ej2Palabra2.length()){
			System.out.println("La segunda palabra tiene más caracteres que la primera");
			
		}else {
			System.out.println("Las dos palabras tienen la misma longitud");
		}
		
	}
	
	

	private static void longitudPalabra2ConListado(Scanner in) {
		int contadorPalabras = 1;
		String palabraInsertar = "";
		ArrayList<String> palabrasLst = new ArrayList<String>();
		
		System.out.println("Inserte todas las palaras que desee"
				+ "\nPara dejar de insertar palabras introduzca el símbolo '*'");
		
		do {
			System.out.print("\nPalabra número [" + contadorPalabras + "]: ");
			palabraInsertar = in.nextLine();
			contadorPalabras++;
			
			if(!palabraInsertar.equalsIgnoreCase("*")) 
				palabrasLst.add(palabraInsertar);
			
		}while(!palabraInsertar.equalsIgnoreCase("*"));
		
		imprimeListado(ordenarListadoPalabras(palabrasLst));
	}
	
	
	//Nos ordena el listado de palabras por su longitud
	private static ArrayList<String> ordenarListadoPalabras(ArrayList<String> listado) {
		boolean intercambioRealizado = false;
		
		do {
			intercambioRealizado = false;	
			for(int i=0; i < (listado.size()-1); i++) {			
				if(listado.get(i).length() > listado.get(i+1).length()) {
					String palabraAux = listado.get(i);
					listado.remove(i);
					listado.add(palabraAux);
					intercambioRealizado = true;
				}
			}			
		}while(intercambioRealizado);
		
		return listado;
	}
	
	//Nos imprime un listado de 'Strings'
	private static void imprimeListado(ArrayList<String> listado) {
		System.out.println("========================="
				+ "\nPalabras ordenadas:");
		for(String palabra : listado) {
			System.out.print(palabra + " ");
		}
		System.out.print("\n=========================");
	}
	
	
	//-------------------
	// Opción 3
	//-------------------
	private static String invertirCadena(String cadena) {
		char[] palabraInvertida = cadena.toCharArray();
		
		for(int i=0; i < (palabraInvertida.length/2); i++) {
			
			char aux = palabraInvertida[i];
			palabraInvertida[i] = palabraInvertida[palabraInvertida.length -i -1];
			palabraInvertida[palabraInvertida.length -i -1] = aux;
		}
		return new String(palabraInvertida);
		
	}
	
	
	//-------------------
	// Opción 4
	//-------------------
	private static void buscarPalabraEnFrase(String frase, String palabraEncontrar) {
		boolean palabraEncontrada = false;
		int posicionPalabra = 0;
		String[] fraseDes = frase.split(" ");
		
		for(int i=0; i < fraseDes.length; i++) {
			if(fraseDes[i].equalsIgnoreCase(palabraEncontrar)) {
				palabraEncontrada = true;
				posicionPalabra = i+1;
			}							
		}
		
		if(palabraEncontrada) {
			System.out.println("La palabra '" + palabraEncontrar + "' si se encuentra en la frase en la posición " + posicionPalabra);
		}else {
			System.out.println("La palabra no se encontro en la frase");
		}
		
		/*
		 Búsqueda con 'foreach'
		 
		 for(String palabra : fraseDes) {
			if(palabra.equalsIgnoreCase(palabraEncontrar))
				palabraEncontrada = true;			
		}*/
	}
	
	
	//-------------------
	// Opción 5
	//-------------------
		private static void buscarLetraEnFrase(String frase, char letraEncontrar) {
			boolean letraEncontrada = false;
			int contadorLetra = 0;
			char[] fraseDes = frase.toCharArray();
			
			for(int i=0; i < fraseDes.length; i++) {
				if(fraseDes[i] == letraEncontrar) {
					letraEncontrada = true;
					contadorLetra++;
				}							
			}
			
			if(letraEncontrada) {
				System.out.println("La letra '" + letraEncontrar + "' se encuentra en la frase " + contadorLetra + " veces");
			}else {
				System.out.println("La letra no se encontro en la frase");
			}
		}
		
		
		//-------------------
		// Opción 6
		//-------------------
		private static void buscarNumeroPalabrasYLetrasEnFrase(String frase) {
			String[] palabrasFrase = frase.split(" ");
			char[] fraseDes = frase.replace(" ","").toCharArray();
			
			System.out.println("La frase tiene: " + palabrasFrase.length + " palabras");
			System.out.println("La frase tiene: " + fraseDes.length + " palabras");			
		}
		
		
		//-------------------
		// Opción 7
		//-------------------
		private static void contarNumLetrasEspecificas(String frase) {
			char[] fraseDesChar = frase.replace(" ","").toCharArray();
			List<String> miListaDePalabras = new ArrayList<String>();
			
			//Transformamos la lista de 'char' en 'String' para poder trabajas con listas
			String[] fraseDesStrg = new String[fraseDesChar.length];
			trasnformarEnArrayString(fraseDesChar, fraseDesStrg);
			 //Transformamos el listado
			//TODO: ERROR
			 miListaDePalabras = new ArrayList<>(Arrays.asList(fraseDesStrg));

			//Eliminamos elementos duplicados
			 eliminarDuplicidadElementos(miListaDePalabras);
			 
			 //Para contar el núm de letras
			 int[] contadorNumLetras = new int[miListaDePalabras.size()];
			 
			 //Buscamos cuantas palabras y el número de palabras que hay
			 for(int i=0; i < miListaDePalabras.size(); i++) {
				 for(int j=0; j < fraseDesChar.length; j++) {
					 
					 if(miListaDePalabras.get(i).equalsIgnoreCase(Character.toString(fraseDesChar[j]))){
						 contadorNumLetras[i]++;
					 }					 
				 }
			 }
			 imprimirResultados(miListaDePalabras, contadorNumLetras);
		}
	
	
	private static void imprimirResultados(List<String> miListaDePalabras, int[] contadorNumLetras) {
		System.out.println("---------------------------------------------"
				+ "\nNúmero de letras:"
				+ "\n---------------------------------------------");
		for(int i=0; i < contadorNumLetras.length; i++) {
			System.out.println(miListaDePalabras.get(i) + " =\t" + contadorNumLetras[i]);
		}
		System.out.println("---------------------------------------------");
	}



	private static void eliminarDuplicidadElementos(List<String> listaPalabras) {
		 Set<String> hashSet = new HashSet<String>(listaPalabras);
		 listaPalabras.clear();
		 listaPalabras.addAll(hashSet);
	}



	private static void trasnformarEnArrayString(char[] fraseDesChar, String[] fraseDesStrg) {
		for(int i=0; i < fraseDesStrg.length; i++) {
			fraseDesStrg[i] = Character.toString(fraseDesChar[i]);
		}		
	}



	//MAIN
	public static void main(String[] args) {
		//Para el menu principal
		boolean menuBucle = true;
		int opcionMenu = 0;
		//Para la entrada de datos
		boolean opcionOk;
		//AUX
		char[] vocales = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
		
		do {
			System.out.println("\n\n-----------------------------");
			System.out.println("1- Quitar vocales"
					+ "\n2- Ordenar palabras por longuitud"
					+ "\n3- Invertir Palabra/Cadena"
					+ "\n4- Buscar palabra en una frase"
					+ "\n5- Buscar una letra en una frase"
					+ "\n6- Contar número de palabras y letras que tiene una frase"
					+ "\n7- Contar el número de letras específicas que tiene una frase"
					+ "\n8- SALIR");
			System.out.println("-----------------------------");
			
			Scanner in = new Scanner(System.in);
			//Opción bucle
			//Excepción al introducir un carácter no válido:
			do {
				System.out.print("Seleccione: ");
				try {
					opcionMenu = in.nextInt();   //Integer.parseInt(in.next());
					in.nextLine();
					opcionOk = true;
					
				}catch(NumberFormatException e) {
					System.out.println("¡Inserte un número entero para el menú por favor!");
					opcionOk = false;
				}
			}while(!opcionOk);
			
			
			//Opciones
			switch(opcionMenu) {
			
			// OPCIÓN 1: QUITAR VOCALES DE UNA PALABRA/CADENA
			case 1:
				System.out.println("==============================="
						+ "\nHA ELEGIDO QUITAR LAS VOCALES DE UNA CADENA"
						+ "\n===============================");
				
				System.out.print("Inserte una frase/cadena: ");
				String frase1 = in.nextLine();
				String fraseSinVocales = "";
				char[] letrasFrase = frase1.toCharArray();
				
				for(int i=0; i < letrasFrase.length; i++) {
					boolean vocalEncontrada = false;
					
					for(int j=0; j < vocales.length; j++) {
						if(letrasFrase[i] == vocales[j]) {
							vocalEncontrada = true;
						}
					}					
					if(!vocalEncontrada)
						fraseSinVocales += letrasFrase[i];
				}
				
				System.out.println("Frase con vocales: " +frase1);
				System.out.println("Frase sin vocales: " + fraseSinVocales);
				break;
				
				
				
			// OPCIÓN 2: ORDENAR PALABRAS/CADENAS POR SU LONGITUD	
			case 2:
				System.out.println("==============================="
						+ "\nHA ELEGIDO ORDENAR PALABRAS POR SU LONGITUD"
						+ "\n[1] Opción con 2 palabras"
						+ "\n[2] Opción con un listado de palabras"
						+ "\n===============================");
				
				int opcionEj2 = 0;
				boolean opcionOkEj2 = true;
				
				//Opción bucle
				//Excepción al introducir un carácter no válido:
				do {
					System.out.print("Seleccione [1 | 2]: ");
					try {
						opcionEj2 = in.nextInt();   //Integer.parseInt(in.next());
						in.nextLine();
						opcionOkEj2 = true;
						
					}catch(NumberFormatException e) {
						System.out.println("¡Inserte un número entero para el menú por favor!");
						opcionOkEj2 = false;
					}
				}while(!opcionOkEj2);
				
				
				switch(opcionEj2) {
				case 1:
					EjerciciosCadenas.longitudPalabra1(in);
					break;
					
				case 2:
					EjerciciosCadenas.longitudPalabra2ConListado(in);
					break;
					
				default:
					System.out.println("Opción no válida");
				}
				break;
				
				
			// OPCIÓN 3: INVERTIR UNA PALABRA/CADENA	
			case 3:
				System.out.println("==============================="
						+ "\nHA ELEGIDO INVERTIR LAS LETRAS DE UNA CADENA"
						+ "\n===============================");
				
				System.out.print("Inserte la palabra/frase que desea invertir: ");
				String ej3Palabra = in.nextLine();
				System.out.println("Cadena invertida: " + EjerciciosCadenas.invertirCadena(ej3Palabra));
				break;
				
			
			// OPCIÓN 4: BUSCAR UNA PALABRA EN UNA FRASE/CADENA
			case 4:
				System.out.println("==============================="
						+ "\nHA ELEGIDO BUSCAR UNA PALABRA EN UNA FRASE/CADENA"
						+ "\n===============================");
				System.out.print("\nInserte la frase completa: ");
				String ej4Frase = in.nextLine();
				System.out.print("\nInserte la palabra que desea buscar en la frase anterior ");
				String ej4palabra = in.nextLine();
				
				EjerciciosCadenas.buscarPalabraEnFrase(ej4Frase, ej4palabra);
				break;
				
				
				
			// OPCIÓN 5: BUSCAR UNA LETRA EN UNA FRASE
			case 5:
				System.out.println("==============================="
						+ "\nHA ELEGIDO BUSCAR UNA LETRA EN UNA FRASE/CADENA"
						+ "\n===============================");
				System.out.print("\nInserte la frase completa: ");
				String ej5Frase = in.nextLine();
				System.out.print("\nInserte la palabra que desea buscar en la frase anterior ");
				char ej5letra = in.next().charAt(0);
				
				EjerciciosCadenas.buscarLetraEnFrase(ej5Frase, ej5letra);
				break;
				
				
			// OPCIÓN 6: CONTAR EL NÚMERO DE PALABRAS Y LETRAS QUE TIENE UNA FRASE
			case 6:
				System.out.println("==============================="
						+ "\nHA ELEGIDO CONTAR EL NÚMERO DE PALABRAS Y LETRAS QUE TIENE UNA FRASE/CADENA"
						+ "\n===============================");
				
				System.out.print("\nInserte la frase completa: ");
				String ej6Frase = in.nextLine();
				EjerciciosCadenas.buscarNumeroPalabrasYLetrasEnFrase(ej6Frase);
				break;
				
				
			// OPCIÓN 7: CONTAR EL NÚMERO DE LETRAS ESPECÍFICAS QUE TIENE UNA FRASE
			case 7:
				System.out.println("==============================="
						+ "\nHA ELEGIDO CONTAR EL NÚMERO DE LETRAS ESPECÍFICAS QUE TIENE UNA FRASE"
						+ "\n===============================");
				System.out.print("\nInserte la frase completa: ");
				String ej7Frase = in.nextLine();
				EjerciciosCadenas.contarNumLetrasEspecificas(ej7Frase);
				break;
				
			case 8:
				menuBucle = false;
				in.close();
				System.out.println("Hasta prontoooo");
				break;
				
			default: System.out.println("No existe una opción "+opcionMenu+". Por favor, introduzca un número válido.");
			break;
			
			}
			
		}while(menuBucle); //Mientras 'menuBucle = true' se ejecutará el bucle
		
	}	
}
