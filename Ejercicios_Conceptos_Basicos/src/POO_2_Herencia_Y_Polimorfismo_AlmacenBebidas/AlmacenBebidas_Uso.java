package POO_2_Herencia_Y_Polimorfismo_AlmacenBebidas;

import java.util.Scanner;

public class AlmacenBebidas_Uso {

	// Método para rellenar el almacén
	public static void rellenarAlmacen(AlmacenBebidas almacen) {
		Bebida bebida;
		// Añado bebidas (un poco de todo)
		// La forma de hacerlo es opcional
		for (int i = 0; i < 10; i++) {
			switch (i % 2) {
			// 2 Maneras diferentes de insertar objeto (Interpolacion)
			case 0:
				almacen.agregarBebida(new Agua_Mineral(1.5, 5, "Lanjaron", "Sierra Nevada"));
				break;
			case 1:
				bebida = new Refresco(10, 1.5, "Coca-Cola", 0.9, true);
				almacen.agregarBebida(bebida);
				break;
			}
		}
		
		System.out.println("Se añadieron unas bebidas de 'prueba'");

	}

	public static void main(String[] args) {
		// Creo el almacen
		AlmacenBebidas almacen = new AlmacenBebidas();
		// Relleno el almacen
		rellenarAlmacen(almacen);
		boolean activacionMenu = true;
		
		do {
			System.out.println("\n====================" 
					+ "\n[1]-Ver Precio todas las bebidas" 
					+ "\n[2]-Ver precio total por fila"
					+ "\n[3]-Ver precio total por columna" 
					+ "\n[4]-Insertar bebida" 
					+ "\n[5]-Eliminar bebida"
					+ "\n[6]-Mostrar bebidas" 
					+ "\n[7]-SALIR");		
					
					Scanner in = new Scanner(System.in);
					System.out.print("Seleccione: ");
					int opcionMenu = in.nextInt();

					switch (opcionMenu) {
					case 1:
						almacen.mostrarBebidasYPrecio();
						break;

					case 2:
						System.out.print("Insertre la fila: ");
						int filaAlmacen = in.nextInt();
						System.out.println("El precio de la fila '" + filaAlmacen + "' es: " 
								+ almacen.calcularPrecioBebidasFila(filaAlmacen));	
						break;

					case 3:
						System.out.print("Insertre la columna: ");
						int columnaAlmacen = in.nextInt();
						System.out.println("El precio de la columna '" + columnaAlmacen + "' es: " 
								+ almacen.calcularPrecioBebidasColumna(columnaAlmacen));
						break;

					case 4:
						System.out.print("\n[1]- Agua mineral"
								+ "\n[2]- Refresco"
								+ "\nInserte el tipo de bebida: ");
						int tipoBebida = in.nextInt();
						
						switch(tipoBebida) {
						
						case 1:
							System.out.print("\nCantidad (Double): ");
							double cantidad = in.nextDouble();
							System.out.print("\nPrecio (Double): ");
							double precio = in.nextDouble();
							in.nextLine();
							System.out.print("\nMarca: ");
							String marca = in.nextLine();
							System.out.print("\nManantial de origen: ");
							String origenManantial = in.nextLine();
							
							Agua_Mineral am = new Agua_Mineral(cantidad, precio, marca, origenManantial);
							almacen.agregarBebida(am);
							break;
							
						case 2:
							System.out.print("\nCantidad (Double): ");
							double cantidadRef = in.nextDouble();
							System.out.print("\nPrecio (Double): ");
							double precioRef = in.nextDouble();
							in.next();
							System.out.print("\nMarca: ");
							String marcaRef = in.nextLine();
							System.out.print("\nPorcentaje Azúcar(Double): ");
							Double azucar = in.nextDouble();
							System.out.print("Promoción (Si/No): ");
							String promocion = in.nextLine();
							
							boolean promocionbool;
							
							if(promocion.equalsIgnoreCase("si")) {
								promocionbool = true;
							}else {
								promocionbool = false;
							}
							
							Refresco ref = new Refresco(cantidadRef, precioRef, marcaRef, azucar, promocionbool);
							almacen.agregarBebida(ref);
							break;
							
							default:
								System.out.println("Opción no disponible por el momento");
						
						}
						break;

					case 5:
						System.out.print("Inserte el 'ID de la bebida: ");
						int idBebida = in.nextInt();
						almacen.eliminarBebida(idBebida);;
						break;

					case 6:
						almacen.mostrarBebidas();;
						break;

					case 7:
						System.out.println("Hasta prontoooo");
						in.close();
						activacionMenu = false;
						break;

					default:
						System.out.println("Opción no disponible todavía");

					}
			
		}while(activacionMenu);		
	}
}
