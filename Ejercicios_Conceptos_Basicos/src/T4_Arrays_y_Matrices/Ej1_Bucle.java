package T4_Arrays_y_Matrices;

import java.util.Scanner;

public class Ej1_Bucle {

	public static void main(String[] args) {
		int lim = 10; 
		int c = 1; 
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < lim; i++, c = sc.nextInt()) {
			if( c == 0) {
				i = lim;
			}
			System.out.print(i + ".Iteración - Número:"+ c + "\nInserte otro número:");
		}

	}

}