package Recursividad;

import java.util.Scanner;

public class RecursividadFactorial {
	//METODO
	//Metodos
		public static int factorial(int num){
			if(num == 1){
				return 1;

			}else{
				num *= factorial(num-1);
				return num;
			}
		}
	
	public static void main(String[] args) {
		int numero;

		Scanner in = new Scanner(System.in);

		System.out.print("Selecciona el numero del cual deseas calcular el factorial: ");
		numero = in.nextInt();
		
		System.out.println("El resultado es: " + factorial(numero));
	}
}
