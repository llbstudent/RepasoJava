package L3_OperacionesMath;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		int resultado = 1;
		Scanner in = new Scanner(System.in);
		System.out.print("Introduce el número para calcular su factorial: ");
		int num = in.nextInt();
		
		while(num != 0){
			resultado *= num;
			num--;
		}
		
		System.out.println("El resultado es: " + resultado);
	}
}
