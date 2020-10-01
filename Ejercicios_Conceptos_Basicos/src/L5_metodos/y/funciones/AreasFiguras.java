package L5_metodos.y.funciones;

import java.util.Scanner;

public class AreasFiguras {
	//MÉTODOS
	
	//Área Círculo
	private static double calcularAreaCirculo(String radioStr) {
		double radio = Double.parseDouble(radioStr);
		return Math.pow(radio, 2)*Math.PI;	
	}
	
	
	//Área Triángulo
	private static double calcularAreaTriangulo(String baseStr, String alturaStr) {
		double base = Double.parseDouble(baseStr);
		double altura = Double.parseDouble(alturaStr);
		return (base * altura)/2;
	}
	
	// Área Cuadrado
	private static double calcularAreaCuadrado(String ladoStr) {
		double lado = Double.parseDouble(ladoStr);
		return lado * lado;
	}
	
	
	// MAIN
	public static void main(String[] args) {
		boolean menuActivo = true;
		Scanner in = new Scanner(System.in);
		
		do {
			System.out.println("\nDe que desea calcular el área"
					+ "\n[1]- Círculo"
					+ "\n[2]- Triángulo"
					+ "\n[3]- Cuadrado"
					+ "\n[4]- SALIR");
			
			
			System.out.print("Seleccione:");
			int opcionMenu = in.nextInt();
			in.nextLine();
			
			switch(opcionMenu) {
			// Recogeremos los número como 'String' ya que así podremos sustituir el decimal de'.' por ','
			case 1:
				System.out.print("\nInserte el radio: ");
				String radio = in.nextLine();
				radio = radio.replace(",", ".");
				System.out.println("El área del círculo es: " + calcularAreaCirculo(radio));			
				break;
				
			case 2:
				System.out.print("\nInserte la base : ");
				String base = in.nextLine();
				System.out.print("\nInserte la altura : ");
				String altura = in.nextLine();
				base = base.replace(",", ".");
				altura = altura.replace(",", ".");
				System.out.println("El área del triángulo es: " + calcularAreaTriangulo(base, altura));	
				break;
			
			case 3:
				System.out.print("\nInserte el lado: ");
				String lado = in.nextLine();
				lado = lado.replace(",", ".");
				System.out.println("El área del cuadrado es: " + calcularAreaCuadrado(lado));	
				break;
				
			case 4:
				menuActivo = false;
				System.out.println("Hasta pronto");
				in.close();
				break;
				
				default:
					System.out.println("Elija una opción válida");			
			}
			
		}while(menuActivo);		
	}	
}
