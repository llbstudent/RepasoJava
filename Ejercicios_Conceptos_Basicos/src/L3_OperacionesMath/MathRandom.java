package L3_OperacionesMath;

import java.util.Scanner;

/**
 * Pide por teclado dos n�meros 
 * y genera 10 n�meros aleatorios entre esos n�meros.
 * */
public class MathRandom {
	 public static void main(String[] args) {
		  
	        Scanner sc = new Scanner(System.in);
	        System.out.print("\nIntroduce el primer n�mero: ");
	        int num1=sc.nextInt();
	  
	        System.out.print("\nIntroduce el segundo n�mero: ");
	        int num2=sc.nextInt();
	  
	        System.out.println("\n===========================");
	        System.out.println("N�meros aleatorios:");
	        for (int i=0;i<10;i++){
	            //Generamos un numero aleatorio
	            int numAleatorio=(int)Math.floor(Math.random()*(num1-num2)+num2);
	            System.out.println(numAleatorio);
	        }
	        System.out.println("===========================");
	    }

}
