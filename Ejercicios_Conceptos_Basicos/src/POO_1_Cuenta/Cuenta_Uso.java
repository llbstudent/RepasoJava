package POO_1_Cuenta;

import java.util.Scanner;

public class Cuenta_Uso {

	public static void main(String[] args) {
		boolean menuPrincipalActivo = true;
		Scanner in = new Scanner(System.in);
		// Instancias
		Cuenta c1 = new Cuenta("Andrés Luque", 300.25);
		Cuenta c2 = new Cuenta("Adriana Luque", 480.25);
		Cuenta c3 = new Cuenta("Miguel Luque", 1250.25);
		
		//Bucle menú principal
		do {
			//Menú
			System.out.println("\n============================="
					+ "\nInserte su nombre"
					+ "\n[1]-Andrés Luque"
					+ "\n[2]-Adriana Luque"
					+ "\n[3]-Miguel Luque"
					+ "\n[4]-VER TODOS"
					+ "\n[5]-SALIR");
			
			System.out.print("Seleccione número: ");
			int opcionCliente = in.nextInt();
			
			
			//Opción cliente
			switch(opcionCliente) {
			
				//Cliente 1
				case 1:
					boolean menuCliente1 = true;
						do {
							System.out.println("\n[1]-Ingresar Dinero"
									+ "\n[2]-Retirar Dinero"
									+ "\n[3]-Ver ingresos de mi cuenta"
									+ "\n[4]-REGRESO MENÚ PRINCIPAL");
							System.out.print("Qué desea hacer: ");
							int opcionCliente1 = in.nextInt();
							in.nextLine(); //Evitar salto de línea que luego viene in 'line'
							
							switch(opcionCliente1) {
							case 1:
								System.out.print("Cuánto desea ingresar: ");
								String ingreso = in.nextLine();
								System.out.print(ingreso);
								Double ingresoDoub = Double.parseDouble(ingreso.replace(",", ".")); //Para que pueda obtener decimales tanto con '.' como con ','
								c1.ingresar(ingresoDoub);
								break;
							
							case 2:
								System.out.print("Cuánto desea extraer: ");
								String extracto = in.nextLine();
								Double extractoD = Double.parseDouble(extracto.replace(",", "."));
								c1.retirar(extractoD);
								break;
								
							case 3:
								System.out.println("Datos del cliente" + "\n" + c1.toString());
								break;
								
							case 4:
								menuCliente1 = false;
								break;
								
							default:
								System.out.println("Opción no válida");					
							}						
					}while(menuCliente1);			
				break;
				
			//Cliente 2	
			case 2:
				boolean menuCliente2 = true;
				do {
					System.out.println("\n[1]-Ingresar Dinero"
							+ "\n[2]-Retirar Dinero"
							+ "\n[3]-Ver ingresos de mi cuenta"
							+ "\n[4]-REGRESO MENÚ PRINCIPAL");
					System.out.print("Qué desea hacer: ");
					int opcionCliente2 = in.nextInt();
					in.nextLine();
					
					switch(opcionCliente2) {
					case 1:
						System.out.print("Cuánto desea ingresar: ");
						String ingreso = in.nextLine();
						Double ingresoDoub = Double.parseDouble(ingreso.replace(",", "."));
						c2.ingresar(ingresoDoub);
						break;
					
					case 2:
						System.out.print("Cuánto desea extraer: ");
						String extracto = in.nextLine();
						Double extractoD = Double.parseDouble(extracto.replace(",", "."));
						c2.retirar(extractoD);
						break;
						
					case 3:
						System.out.println("Datos del cliente \n" + c2.toString());
						break;
						
					case 4:
						menuCliente2 = false;
						break;
						
					default:
						System.out.println("Opción no válida");					
					}						
			}while(menuCliente2);	
				break;
				
			//Cliente 3
			case 3:
				boolean menuCliente3 = true;
				do {
					System.out.println("\n[1]-Ingresar Dinero"
							+ "\n[2]-Retirar Dinero"
							+ "\n[3]-Ver ingresos de mi cuenta"
							+ "\n[4]-REGRESO MENÚ PRINCIPAL");
					System.out.print("Qué desea hacer: ");
					int opcionCliente3 = in.nextInt();
					in.nextLine();
					
					switch(opcionCliente3) {
					case 1:
						System.out.print("Cuánto desea ingresar: ");
						String ingreso = in.nextLine();
						Double ingresoDoub = Double.parseDouble(ingreso.replace(",", "."));
						c3.ingresar(ingresoDoub);
						break;
					
					case 2:
						System.out.print("Cuánto desea extraer: ");
						String extracto = in.nextLine();
						Double extractoD = Double.parseDouble(extracto.replace(",", "."));
						c3.retirar(extractoD);
						break;
						
					case 3:
						System.out.println("Datos del cliente \n" + c3.toString());
						break;
						
					case 4:
						menuCliente3 = false;
						break;
						
					default:
						System.out.println("Opción no válida");					
					}						
			}while(menuCliente3);	
				break;
				
			// VER TODOS
			case 4:
				System.out.println("Clientes"
						+ "\n" + c1.toString()
						+ "\n" + c2.toString()
						+ "\n" + c3.toString());
				break;
				
			case 5:
				menuCliente3 = false;
				in.close();
				break;
				
			default:
				System.out.println("Opción no válida");
			}
			
		}while(menuPrincipalActivo);
	}
}
