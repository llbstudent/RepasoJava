package L1_Condicionales;

import java.util.Scanner;

public class DiaSemanaSwitch {
	public static void main(String[] args) {
		String dia;
		boolean bucleActivo = true;
        Scanner sc = new Scanner(System.in);
        
        do {
        	System.out.print("\nIntroduce un dia de la semana: ");
            dia = sc.next();
             
            switch(dia.toLowerCase()){
                case "lunes":
                case "martes":
                case "miercoles":
                case "jueves":
                case "viernes":
                    System.out.println("Es un dia laboral");
                    break;
                    
                case "sabado":
                case "domingo":
                    System.out.println("Es un dia festivo");
                    break;
                    
                default:
                	bucleActivo = false;
                    System.out.println("No has introducido un dia de la semana, hasta pronto");
            }
        	
        }while(!dia.equalsIgnoreCase("domingo") && bucleActivo); //Para que se ejecute el bucle
         
        
	}
}
