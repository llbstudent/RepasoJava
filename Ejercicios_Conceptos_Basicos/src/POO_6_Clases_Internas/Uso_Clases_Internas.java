package POO_6_Clases_Internas;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import POO_6_Clases_Internas.Ej2_Alumno.Direccion;
import POO_6_Clases_Internas.Ej3_Pizza.TAMANNO;
import POO_6_Clases_Internas.Ej3_Pizza.TIPOMASA;

public class Uso_Clases_Internas {

	// Método para escribir el listado de ingredientes
	private static List<String> insertarIngredientesParaPizza(String tamPizza, Scanner in) {
		List<String> listadoIngredientes = new ArrayList<>();
		int contador = 0;

		switch (tamPizza) {
		case "Mediana":
			contador = 4;

			break;

		case "Grande":
			contador = 5;
			break;

		case "XXL":
			contador = 6;
			break;

		default:
			listadoIngredientes = null;

		}

		if (contador == 4 || contador == 5 || contador == 6) {
			for (int i = 0; i < contador; i++) {
				System.out.print("\nIngrediente [" + (i+1) + "] : ");
				String ingrediente = in.nextLine();
				listadoIngredientes.add(ingrediente);
			}
		}
		return listadoIngredientes;
	}
	
	//Método para imprimir por pantalla las instancias
	private static void imprimirInstanciasPorPantalla(List<Object> listado) {
		for(Object instancia : listado) {
			if(instancia instanceof Ej3_Pizza) {
				System.out.println("Instancia de tipo Pizza");
				Ej3_Pizza inst = (Ej3_Pizza)instancia;
				System.out.println(inst.toString());
				System.out.println("---------");
			}
			
			if(instancia instanceof Ej2_Alumno) {
				System.out.println("Instancia de tipo Alumno");
				Ej2_Alumno inst = (Ej2_Alumno)instancia;
				System.out.println(inst.toString());
				System.out.println("---------");
			}
		}
	}

	// MAIN
	// Método principal
	public static void main(String[] args) {
		List<Object> listadoInstancias = new ArrayList<>();
		boolean menuActivo = true;
		boolean inserccionOpcionMenuCorrecta = true;
		int opcionMenu = 0;

		Scanner in = new Scanner(System.in);

		// Menu principal
		do {
			do {
				System.out.print(
						"\n[1]-Crear Alumno" 
						+ "\n[2]-Crear Pizza" 
						+ "\n[3]-Ver elementos del listado de instancias"
						+ "\n[4]-SALIR" 
						+ "\n\nSeleccione que desea hacer:");

				try {
					opcionMenu = in.nextInt();
					inserccionOpcionMenuCorrecta = true;

				} catch (NumberFormatException e) {
					System.out.println("¡Inserte un número entero para el menú por favor!");
					in.nextLine();
					inserccionOpcionMenuCorrecta = false;

				} catch (InputMismatchException e) {
					System.out.println("¡Inserte un número entero para el menú por favor!");
					in.nextLine();
					inserccionOpcionMenuCorrecta = false;
				}
			} while (!inserccionOpcionMenuCorrecta);
			in.nextLine();

			switch (opcionMenu) {
			case 1:
				System.out.println("DATOS DE LOS ALUMNOS");
				System.out.print("Nombre: ");
				String nombre = in.nextLine();
				System.out.print("Apellidos: ");
				String apellido = in.nextLine();
				System.out.print("Año de nacimiento: ");
				int anoNacimiento = Integer.parseInt(in.nextLine());
				System.out.println("-----\nDirección");
				System.out.print("Calle: ");
				String calle = in.nextLine();
				System.out.print("Numéro: ");
				int numero = Integer.parseInt(in.nextLine());

				Ej2_Alumno alumno = new Ej2_Alumno(nombre, apellido, anoNacimiento, new Direccion(calle, numero));
				listadoInstancias.add(alumno);
				break;

			case 2:
				System.out.print("¿Cómo desea hacer la pizza?" 
						+ "\n[1]-Masa y tamaño"
						+ "\n[2]-Masa, tamaño e ingredientes" 
						+ "\n\nSeleccione:");

				int opcionPizza = Integer.parseInt(in.nextLine());
				String masa, tamPizza;

				switch (opcionPizza) {

				case 1:
					System.out.print("\nDATOS DE LA PIZZA" + "\nTipo de masa (Fina | Gruesa): ");
					masa = in.nextLine();
					char[] letrasmasa = masa.toCharArray();
					letrasmasa[0] = Character.toUpperCase(letrasmasa[0]);
					TIPOMASA tipoMasa = TIPOMASA.valueOf(String.valueOf(letrasmasa));

					System.out.print("Tamaño (Mediana | Grande | XXL): ");
					tamPizza = in.nextLine();
					//Poner la primera letra en mayusc
					char[] letrastamPizza = tamPizza.toCharArray();
					letrastamPizza[0] = Character.toUpperCase(letrastamPizza[0]);
					//Casting a Enum_Tamanno
					TAMANNO pizzaTamanno = TAMANNO.valueOf(String.valueOf(letrastamPizza));

					Ej3_Pizza pizza1 = new Ej3_Pizza(tipoMasa, pizzaTamanno, in);
					listadoInstancias.add(pizza1);
					break;

				case 2:
					System.out.print("\nDATOS DE LA PIZZA" + "\nTipo de masa (Fina | Gruesa): ");
					masa = in.nextLine();
					char[] letrasmasa2 = masa.toCharArray();
					letrasmasa2[0] = Character.toUpperCase(letrasmasa2[0]);
					TIPOMASA tipoMasa2 = TIPOMASA.valueOf(String.valueOf(letrasmasa2));

					System.out.print("Tamaño (Mediana | Grande | Xxl): ");
					tamPizza = in.nextLine();
					char[] letrastamPizza2 = tamPizza.toCharArray();
					letrastamPizza2[0] = Character.toUpperCase(letrastamPizza2[0]);
					TAMANNO pizzaTamanno2 = TAMANNO.valueOf(String.valueOf(letrastamPizza2));

					List<String> listadoIngredientes = insertarIngredientesParaPizza(String.valueOf(letrastamPizza2), in);

					Ej3_Pizza pizza2 = new Ej3_Pizza(tipoMasa2, pizzaTamanno2, listadoIngredientes);
					listadoInstancias.add(pizza2);
					break;
				}
				break;

			case 3:
				imprimirInstanciasPorPantalla(listadoInstancias);
				break;

			case 4:
				System.out.println("Hasta pronto");
				in.close();
				menuActivo = false;
				break;

			default:
				System.out.println("Opción no disponible por ahora");
			}

		} while (menuActivo);
	}
}
