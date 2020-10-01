package L6_Strings.cadenas;

import java.util.Scanner;

public class SustitucionVocales {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("\nInserte una cadena: ");		 
        String cadena = in.nextLine();
        System.out.print("\nInserte la letra que quiere remplazar: ");
        char letraRemplazada = in.next().charAt(0);
        System.out.print("\nInserte la letra que sustituirá la remplazada: ");
        char letraNueva = in.next().charAt(0);
 
        //Aviso, de esta forma no modifica el String original
        System.out.print(cadena.replace(letraRemplazada, letraNueva));
        
        in.close();
 
    }

}
