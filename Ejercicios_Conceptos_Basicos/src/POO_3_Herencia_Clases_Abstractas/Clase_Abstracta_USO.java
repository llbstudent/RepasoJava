package POO_3_Herencia_Clases_Abstractas;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

// Nos creamos diferentes tipos de figuras y calculamos su área
// Se añaden al listado y las mostramos
public class Clase_Abstracta_USO {

	// Método que nos imprime el listado de figuras
	public static void imprimeFiguras(List<Figura_Abstracta> list) {
		for (Figura_Abstracta figura : list) {
			figura.datos_Figura();
		}
	}

	
	//MAIN
	public static void main(String[] args) {
		boolean menuActivo = true;
		boolean opcionOkMenu = true;
		List<Figura_Abstracta> figuras_List = new ArrayList<Figura_Abstracta>();

		do {
			System.out.print("\n[1]-Crear Circulo" 
					+ "\n[2]-Crear Cuadrado" 
					+ "\n[3]-Mostrar listado de figuras"
					+ "\n[4]-SALIR" + "\n\nSeleccione: ");

			Scanner in = new Scanner(System.in);
			int opcionMenu = 0;
			
			//Comprobación entrada al menú/número entero
			do {
				System.out.print("Inserte un número: ");
				try {
					opcionMenu = in.nextInt();
					opcionOkMenu = true;
					
				}catch(NumberFormatException e) {
					System.out.println("¡Inserte un número entero para el menú por favor!");
					opcionOkMenu = false;
					in.nextLine();
				
				}catch(InputMismatchException ex) {
					System.out.println("¡Inserte un número entero para el menú por favor!");
					opcionOkMenu = false;
					in.nextLine();
				}
			}while(!opcionOkMenu);

			
			//MENÚ PPL
			switch (opcionMenu) {

			// Creamos Circulo
			case 1:
				System.out.print("\n[1]-Circulo por defecto" 
						+ "\n[2]-Circulo con medidas" 
						+ "\n\nSeleccione: ");

				int opcionCirculo = in.nextInt();

				switch (opcionCirculo) {
					case 1:
						Figura_Circulo fCir = new Figura_Circulo();
						figuras_List.add(fCir);
						break;
	
					case 2:
						in.nextLine();
						System.out.print("Cuál es el radio: ");
						String radio = in.nextLine();
						Double radioCirc = Double.parseDouble(radio.replace(",", ".")); //Para que pueda obtener decimales tanto con '.' como con ','
						Figura_Circulo fCir2 = new Figura_Circulo(1, 1, radioCirc);
						figuras_List.add(fCir2);
						break;
	
					default:
						System.out.println("Opción no válida");

				}
				break;

			// Creamos cuadrado
			case 2:
				System.out.print("\n[1]-Cuadrado por defecto" 
						+ "\n[2]-Cuadrado con medidas" 
						+ "\n\nSeleccione: ");

				int opcionCuadrado = in.nextInt();

				switch (opcionCuadrado) {

					case 1:
						Figura_Cuadrado fCuad = new Figura_Cuadrado();
						figuras_List.add(fCuad);
						break;
	
					case 2:
						System.out.print("Cuál es el lado: ");
						String lado = in.nextLine();
						Double ladoCuad = Double.parseDouble(lado.replace(",", ".")); 
						Figura_Circulo fCuad2 = new Figura_Circulo(1, 1, ladoCuad);
						figuras_List.add(fCuad2);
						break;
	
					default:
						System.out.println("Opción no válida");

				}
				break;

			case 3:
				imprimeFiguras(figuras_List);
				break;

			case 4:
				menuActivo = false;
				in.close();
				System.out.print("Hasta pronto");
				break;

			default:
				System.out.println("Opción no válida");
			}

		} while (menuActivo);

	}

}
