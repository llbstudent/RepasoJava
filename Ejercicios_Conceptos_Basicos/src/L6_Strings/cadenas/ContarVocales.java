package L6_Strings.cadenas;

import java.util.Scanner;

public class ContarVocales {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Introduce una cadena: ");		  
        String cadena = entrada.nextLine();
  
        int contador=0;
        for (int i=0;i<cadena.length();i++){
            //Comprobamos si el caracter es una vocal
            if(cadena.charAt(i)=='a' || 
                    cadena.charAt(i)=='e' || 
                    cadena.charAt(i)=='i' || 
                    cadena.charAt(i)=='o' || 
                    cadena.charAt(i)=='u'){
                contador++;
            }
        }
  
        System.out.println("Hay "+contador+" vocales");
    }

}
