package L3_OperacionesMath;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TransformacionesBinarias {
	
	
	 public static String decimalBinario (int numero){
	        String binario = "";
	        String digito;
	        //Hasta que 'i' es '0'
	        for(int i = numero; i > 0; i/=2){
	            if(i % 2 == 1){
	                digito="1";
	            }else{
	                digito="0";
	            }
	            binario = digito+binario;
	        }
	        return binario;
	    }
	 
	 
	 //MAIN
	public static void main(String[] args) {
		boolean opcionOk = true;
		int num = 0;
		Scanner in = new Scanner(System.in);
		
		//Comprobaci�n entrada n�mero entero
		do {
			System.out.print("Inserte un n�mero: ");
			try {
				num = in.nextInt();
				opcionOk = true;
				
			}catch(NumberFormatException e) {
				System.out.println("�Inserte un n�mero entero para el men� por favor!");
				opcionOk = false;
				in.nextLine();
				
			}catch(InputMismatchException e) {
				System.out.println("�Inserte un n�mero entero para el men� por favor!");
				opcionOk = false;
				in.nextLine();
			}
		}while(!opcionOk);
		
		System.out.println("El n�mero '" + num + "' es en binario: " + decimalBinario(num));
		
	}

}
