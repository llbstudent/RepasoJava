import java.util.Scanner;

public class ProbarMuseo{


	public static void main(String[] args){
		//Variables
		int opcion;

		//Nos creamos la instancia/objeto Catalogo
		Catalogo c1 = new Catalogo();

		Scanner ent = new Scanner(System.in);

		do{
			System.out.println("_______________________________________");
			System.out.println("Seleccione que desea realizar");
			System.out.println("1- Annadir obra");
			System.out.println("2- Eliminar obra a traves del numero de inventario");
			System.out.println("3- Buscar Obra a partir del numero de inventario");
			System.out.println("4- Mostrar Superficie de las Pinturas");
			System.out.println("5- Mostrar Listado de Obras");
			System.out.println("6- Buscar/Contar obras dado el Material");
			System.out.println("7- SALIR");
			System.out.println("_______________________________________");

			opcion = ent.nextInt();

			switch(opcion){
				case 1:
					int opcion2;

					do{
						System.out.println("Que tipo de obra desea annadir: " + 
						"\n1-Escultura. " + "\n2-Pintural." + "\n3-Finalizar ");

						opcion2 = ent.nextInt();

						//Condicion
						if(opcion2 == 1){
							System.out.println("Inserte los siguientes datos en orden (4 datos): " +
									"\nTitulo, Autor, Numero de inventario, Informacion del material. Pulse 'intro' por cada dato insertado");
							String titulo 			= 	ent.next();
							String autor 			= 	ent.next();
							int numero_inventario 	= 	ent.nextInt();
							String informacion_material = ent.next();
							//Creacion del objeto/instancia
							Esculturas e1 = new Esculturas(titulo, autor, numero_inventario, informacion_material);
							//Introducimos en el catalogo
							c1.annadeObras(e1);
							System.out.println("Datos introducidos correctamente");

						}else if(opcion2 == 2){
							System.out.println("Inserte los siguientes datos en orden (4 datos): " +
									"\nTitulo, Autor, Numero de inventario, Informacion de las Dimensiones. Pulse 'intro' por cada dato insertado");
							String titulo 			= 	ent.next();
							String autor 			= 	ent.next();
							int numero_inventario 	= 	ent.nextInt();
							int informacion_dimensiones = 	ent.nextInt();
							//Creacion del objeto/instancia
							Pinturas p1 = new Pinturas(titulo, autor, numero_inventario, informacion_dimensiones);
							//Introducimos en el catalogo
							c1.annadeObras(p1);
							System.out.println("Datos introducidos correctamente");

						}else{
							System.out.println("Opcion incorrecta");
						}

					}while(opcion2 !=3);
				break;

				case 2:
					try{
						int num_inventario;
						System.out.print("Introduce el numero de inventario: ");
						num_inventario = ent.nextInt();

						c1.eliminaObra(num_inventario);

					}catch(MiExcepcionObras e){
						System.out.println(e.getMessage());
					}
					
				break;

				case 3:
					try{
						int numero_inventario;
						System.out.print("Introduce el numero de inventario: ");
						numero_inventario = ent.nextInt();

						Obras obra_aux = c1.buscaObra(numero_inventario); //c1.buscaObra(numero_inventario).toString();
						//Imprimimos obra
						System.out.println(obra_aux.toString());

					}catch(MiExcepcionObras e){
						System.out.println(e.getMessage());
					}
					
				break;

				case 4:
					int superficie = c1.superficie();
					System.out.println("La superficie de las pinturas que posee el museo" +
						"es de: " + superficie);
				break;

				case 5:
					try{
						c1.mostrar();
					}catch(MiExcepcionObras e){
						System.out.println(e.getMessage());
					}
				break;

				case 6:
					String material_aux;
					int numero_obras;

					System.out.println("Introduce el material del cual quieres saber cuantas obras existen: ");
					material_aux = ent.next();

					numero_obras = c1.cuentaMaterial(material_aux);

					System.out.println("Existen " + numero_obras + " realizadas con este material");
				break;

			}

		}while(opcion != 7);

	ent.close();

	}
}