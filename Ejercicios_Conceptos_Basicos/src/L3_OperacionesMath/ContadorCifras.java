package L3_OperacionesMath;

import java.util.Scanner;

public class ContadorCifras {
	  public static void main(String[] args) {
		  
	        Scanner sc = new Scanner(System.in);
	        int numero=0;
	        
	        do{
	            System.out.println("\nIntroduce un número: ");
	            numero = sc.nextInt();
	        }while(numero<0); 
	        
	        int contador=0; 
	        // Se divide entre 10 y se sigue contando hasta que el resultado de la división sea '0'
	        // i se divide entre '10' y se le da ese resultado
	        for (int i = numero; i > 0; i/=10){
	            contador++;
	        }
	  
	        //Para una cifra
	        if (contador == 1){
	            System.out.println("El numero "+numero+ " tiene "+contador+" cifra");
	            
	        }else{
	            System.out.println("El numero "+numero+ " tiene "+contador+" cifras");
	        }
	        
	        sc.close();
	  
	    }

}
