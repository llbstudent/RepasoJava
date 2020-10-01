package POO_5_ClasesAbstractas_Interfaces_ENUM;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import POO_3_Herencia_Clases_Abstractas.Figura_Abstracta;

public class Electrodomestico_USO {
	
	//Para imprimir el listado de electrodomésticos
	private static void imprimirPorPantallaElectrodomesticos(List<Electrodomestico_Padre> listado) {
		System.out.println("----------------------"
				+ "\n LISTADO ELECTRODOMÉSTICOS");
		for(Electrodomestico_Padre electrodomestico : listado) {
			electrodomestico.verDatos();
		}
		System.out.println("----------------------");
	}
	
	
	//MAIN
	//Método principal
	public static void main(String[] args) {
		boolean menuActivo = true;
		boolean opcionOkMenu = true;
		List<Electrodomestico_Padre> listadoElectrodomesticos = new ArrayList<Electrodomestico_Padre>();

		do {
			System.out.print("\n[1]-Insertar Lavadora" 
					+ "\n[2]-Insertar Nevera"
					+ "\n[3]-Ver Electrodomésticos" 
					+ "\n[4]-SALIR");

			Scanner in = new Scanner(System.in);
			int opcionMenu = 0;
			
			//Comprobación entrada al menú/número entero
			do {
				System.out.print("\nInserte un número: ");
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
			
			// INSTANCIA DE LAVADORA
			case 1:
				//-------
				//Fecha
				//-------
				boolean formatoFechaCorrecto = true;
				//Fecha del sistema por defecto
				Date fechaLav = new Date(); // Sistema actual La fecha y la hora se asignan a fechaLav 
				do {
					//Insercción de fecha
					try {
						System.out.println("Inserte los datos de la lavadora");
						System.out.println("Fecha completa (Inserte sólo valores numéricos)");
						System.out.print("Día: ");
						int diaLav = in.nextInt();
						System.out.print("Mes: ");
						int mesLav = in.nextInt();
						System.out.print("Año: ");
						int annoLav = in.nextInt();
						try {
							fechaLav = new SimpleDateFormat("dd/MM/yyyy").parse(diaLav + "/" + mesLav + "/" + annoLav);
						} catch (ParseException e) {
							System.out.println("Formato de fecha incorrecto");
							formatoFechaCorrecto = false;
							in.nextLine();
							e.printStackTrace();
						}					
					}catch(InputMismatchException e) {
						System.out.println("¡ERROR!¡Inserte sólo valores numéricos, por favor!");
						formatoFechaCorrecto = false;
						in.nextLine();
					}					
				}while(!formatoFechaCorrecto);
				//Salto de línea necesario
				in.nextLine();
				//-------
				//Consumo ENUM
				System.out.print("Tipo de consumo: ");
				String consumo = in.nextLine();
				Consumo_ENUM consumoEnergetico = Consumo_ENUM.valueOf(consumo);
				//-------
				//Secadora
				System.out.print("Secadora (Si/No): ");
				String respuestaSecadora = in.nextLine();
				boolean tieneSecadora = false;
				
				if(respuestaSecadora.equalsIgnoreCase("si")) {
					tieneSecadora = true;
				}else {
					tieneSecadora = false;
				}
				//-------
				//NúmKilos
				System.out.print("Número de Kilos: ");
				String numKilogramos = in.nextLine();
				double numKilos = Double.parseDouble(numKilogramos.replace(",", "."));;
				//-------
				//Construcción del objeto y añadimos al listado
				Lavadora_Hija lav = new Lavadora_Hija(fechaLav, consumoEnergetico, tieneSecadora, numKilos);
				listadoElectrodomesticos.add(lav);
				break;
			
			// NEVERA
			case 2:
				Date fechaNev = new Date(); // Sistema actual La fecha y la hora se asignan a fechaLav 
				System.out.println("Inserte los datos de la nevera");
				System.out.println("Fecha completa (Inserte sólo valores numéricos)");
				System.out.print("Día: ");
				int diaNev = in.nextInt();
				System.out.print("Mes: ");
				int mesNev = in.nextInt();
				System.out.print("Año: ");
				int annoNev = in.nextInt();
				try {
					fechaNev = new SimpleDateFormat("dd/MM/yyyy").parse(diaNev + "/" + mesNev + "/" + annoNev);
				} catch (ParseException e) {
					System.out.println("Formato de fecha incorrecto");
					e.printStackTrace();
				}
				in.nextLine();
				//Consumo ENUM
				System.out.print("Tipo de consumo: ");
				String consumoNev = in.nextLine();
				Consumo_ENUM consumoEnergeticoNev = Consumo_ENUM.valueOf(consumoNev);
				//Congelador
				System.out.print("Congelador (Si/No): ");
				String respuestaCong = in.nextLine();
				boolean tieneCong = false;
				
				if(respuestaCong.equalsIgnoreCase("si")) {
					tieneCong = true;
				}else {
					tieneCong = false;
				}
				//Puertas
				System.out.print("Número de Puertas: ");
				String puertas = in.nextLine();
				int numPuertas = Integer.parseInt(puertas.replace(",", "."));;
				
				Nevera_Hija nev1 = new Nevera_Hija(fechaNev, consumoEnergeticoNev, tieneCong, numPuertas);
				listadoElectrodomesticos.add(nev1);
				break;
				
			case 3:
				imprimirPorPantallaElectrodomesticos(listadoElectrodomesticos);
				break;
				
			case 4:
				System.out.println("¡Adios!");
				in.close();
				menuActivo = false;
			break;
			
			default:
			}
		}while(menuActivo);
	}

	
}
