package L5_metodos.y.funciones;

import java.util.Scanner;

public class AreasFiguras {
	//M�TODOS
	
	//�rea C�rculo
	private static double calcularAreaCirculo(String radioStr) {
		double radio = Double.parseDouble(radioStr);
		return Math.pow(radio, 2)*Math.PI;	
	}
	
	
	//�rea Tri�ngulo
	private static double calcularAreaTriangulo(String baseStr, String alturaStr) {
		double base = Double.parseDouble(baseStr);
		double altura = Double.parseDouble(alturaStr);
		return (base * altura)/2;
	}
	
	// �rea Cuadrado
	private static double calcularAreaCuadrado(String ladoStr) {
		double lado = Double.parseDouble(ladoStr);
		return lado * lado;
	}
	
	
	// MAIN
	public static void main(String[] args) {
		boolean menuActivo = true;
		Scanner in = new Scanner(System.in);
		
		do {
			System.out.println("\nDe que desea calcular el �rea"
					+ "\n[1]- C�rculo"
					+ "\n[2]- Tri�ngulo"
					+ "\n[3]- Cuadrado"
					+ "\n[4]- SALIR");
			
			
			System.out.print("Seleccione:");
			int opcionMenu = in.nextInt();
			in.nextLine();
			
			switch(opcionMenu) {
			// Recogeremos los n�mero como 'String' ya que as� podremos sustituir el decimal de'.' por ','
			case 1:
				System.out.print("\nInserte el radio: ");
				String radio = in.nextLine();
				radio = radio.replace(",", ".");
				System.out.println("El �rea del c�rculo es: " + calcularAreaCirculo(radio));			
				break;
				
			case 2:
				System.out.print("\nInserte la base : ");
				String base = in.nextLine();
				System.out.print("\nInserte la altura : ");
				String altura = in.nextLine();
				base = base.replace(",", ".");
				altura = altura.replace(",", ".");
				System.out.println("El �rea del tri�ngulo es: " + calcularAreaTriangulo(base, altura));	
				break;
			
			case 3:
				System.out.print("\nInserte el lado: ");
				String lado = in.nextLine();
				lado = lado.replace(",", ".");
				System.out.println("El �rea del cuadrado es: " + calcularAreaCuadrado(lado));	
				break;
				
			case 4:
				menuActivo = false;
				System.out.println("Hasta pronto");
				in.close();
				break;
				
				default:
					System.out.println("Elija una opci�n v�lida");			
			}
			
		}while(menuActivo);		
	}	
}
