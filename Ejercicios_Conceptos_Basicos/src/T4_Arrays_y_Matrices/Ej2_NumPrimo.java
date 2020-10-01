package T4_Arrays_y_Matrices;

import java.util.Scanner;

public class Ej2_NumPrimo {

	public static void main(String[] args) {
		boolean esPrimo = true;
		Scanner in = new Scanner(System.in);
		
		System.out.print("Inserte un número entero: ");
		int num = in.nextInt();
		
		for(int div = 2; div <= num/2; div++) {
			if(num % div == 0)
				esPrimo = false;
		}
		
		//Resultado
		if(esPrimo) {
			System.out.print("El número '" +num+ "', es primo ");
		}else {
			System.out.print("El número '" +num+ "', NO es primo ");
		}
	}

}
