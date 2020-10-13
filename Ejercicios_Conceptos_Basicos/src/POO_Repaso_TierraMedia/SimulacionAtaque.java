package POO_Repaso_TierraMedia;

import java.util.Scanner;
import java.util.Random;

public class SimulacionAtaque {

	/**
	 * Metodo que recibe un numero al azar y dependiendo de cual sea te devuelve un
	 * objeto u otro
	 */
	private static Habitantes crearInstancia() throws TierraMediaException, Exception {
		int num = numeroAleatorio();

		switch (num) {

		case 1:
			Hobbit h1 = new Hobbit();
			return h1;

		case 2:
			Uruk u1 = new Uruk();
			return u1;

		case 3:
			Elfo e1 = new Elfo();
			return e1;

		default:
			throw new TierraMediaException("Habitante no disponible aun");
		}
	}

	/**
	 * Metodo que devuelve un numero al azar entre el 1 y el 3
	 */
	private static int numeroAleatorio() {
		Random rnd = new Random();
		int num = rnd.nextInt(3) + 1;
		return num;
	}

	// MET MAIN
	public static void main(String[] args) {
		// Declaracion de variables
		int longMatriz, num, opciones;
		Habitantes personajes[][];

		try {
			// Declaramos Escaner
			Scanner ent = new Scanner(System.in);

			System.out.println("Inserte el numero de filas y columnas que tendra la matriz."
					+ "\nSera una Matriz cuadrada rellena de los Habitantes de la Tierra Media");
			longMatriz = ent.nextInt();

			// Declaracion Matriz
			personajes = new Habitantes[longMatriz][longMatriz];

			// Recorreremos la Matriz añadiendo un metodo que Aleatoriamente
			// Creara un
			for (int i = 0; i < personajes.length; i++) {
				for (int j = 0; j < personajes[0].length; j++) {
					personajes[i][j] = crearInstancia();
				}
			}

			// Pequeño menu de opciones
			System.out.println("---------------------");
			System.out.println("SELECCIONE QUE DESEA HACER: ");
			System.out.println("0-MIRAR PERSONAJES POR DEFECTO");
			System.out.println("1-SIMULACION DE ATAQUE");
			System.out.println("---------------------");
			opciones = ent.nextInt();

			// SWITCH con las opciones
			switch (opciones) {
			case 0:
				for (int i = 0; i < personajes.length; i++) {
					for (int j = 0; j < personajes.length; j++) {
						System.out.print(personajes[i][j]);
					}
				}
				break;

			case 1:
				// PRIMERO VEMOS LA MATRIZ ORIGEN
				System.out.println("ANTES DEL ATAQUE");
				for (int i = 0; i < personajes.length; i++) {
					for (int j = 0; j < personajes.length; j++) {
						Habitantes habitante = personajes[i][j];
						System.out.print(habitante.toStringTipo() + "  ");
						System.out.println(habitante.toStringVida()); // CASO ALTERN:
																		// System.out.print(personajes[i][j].toStringVida());
						if (j == personajes.length - 1) {
							System.out.println(" ");
						}
					}
				}

				// LUEGO, HACEMOS LA SIMULACION DEL ATAQUE
				for (int i = 0; i < personajes.length; i++) {
					for (int j = 0; j < personajes.length; j++) {
						// EMPEZAMOS CON LAS CONDICIONES
						// Comprobamos si es un Hobbit
						if (personajes[i][j] instanceof Hobbit) {
							// Comprobamos que no de un error de longitud y que sea URUK
							if (j > 0 && personajes[i][j - 1] instanceof Uruk) {
								// Hacemos un CASTING
								Uruk u2 = (Uruk) personajes[i][j - 1];

								if (u2.getFuerza() > 50) {
									// Comprobamos que haya un elfo a la dch y us flechas
									if (j < personajes.length - 1 && personajes[i][j + 1] instanceof Elfo) {
										// CASTING
										Elfo e2 = (Elfo) personajes[i][j + 1];

										// Menos flechas que vida del Uruk
										if (e2.getFlechas() < u2.getFuerza()) {
											// CASTING A HOBBIT
											Hobbit h2 = (Hobbit) personajes[i][j];

											// CAPA ELFICA
											if (!h2.getcapa()) {
												h2.matarPersonaje();
											}
										}

									}
								}

							}
						}
					}
				}

				// DESPUES DEL ATAQUE
				System.out.println("\nDESPUES DEL ATAQUE");
				for (int i = 0; i < personajes.length; i++) {
					for (int j = 0; j < personajes.length; j++) {
						Habitantes habitante = personajes[i][j];
						System.out.print(habitante.toStringTipo() + "  ");
						System.out.println(habitante.toStringVida());
						if (j == personajes.length - 1) {
							System.out.println(" ");
						}
					}
				}

				break;

			default:
				throw new TierraMediaException("OPCION NO VALIDA");
			}

			ent.close();

		} catch (TierraMediaException e) {
			System.out.println("Error: " + e.getMessage());

		} catch (Exception e) {
			System.out.println("ERROR INDEFINIDO");
		}
	}

	/*
	 * OTRAS OPCIONES:
	 * 
	 * METODO NUM_ALEATORIO:
	 * 
	 * public static numeroAleatroio(){ return (int) 1 + (3-1) * Math.random(); }
	 * 
	 * 
	 * METODO CREAR OBJETO:
	 * 
	 * public static Habitantes crearInstancia(int num){ if(num == 1){ Hobbit h1 =
	 * new Hobbit(); return h1;
	 * 
	 * }else if(num == 2){ Uruk u1 = new Uruk(); return u1;
	 * 
	 * }else if(num == 3){ Elfo e1 = new Elfo(); return e1;
	 * 
	 * }else{ throw new TierraMediaException("Habitante no disponible aun"); } }
	 * __________________________________________________________________
	 * 
	 * LLAMADA DESDE EL MAIN:
	 * 
	 * for(int i=0; i < personajes.length; i++){ for(int j=0; j <
	 * personajes[0].length; j++){ personajes[i][j] =
	 * crearInstancia(numeroAleatroio());
	 */
}