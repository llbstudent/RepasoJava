package L1_Condicionales;

import java.util.Scanner;

public class AlumnosNotas {
	
	public static void main(String[] args) {
		//VAR
		String[] alumnos;
		double[] notasAlumnos;
		
		Scanner ent = new Scanner(System.in);
		System.out.print("Inserte el número de alumnos: ");
		int tamArray = Integer.parseInt(ent.nextLine()); //Para el salto de línea
		
		alumnos = new String[tamArray];
		notasAlumnos = new double[tamArray];
		
		//Introducimos los valores
		for(int i=0; i < tamArray; i++) {
			System.out.print("\nNombre del " + (i+1) + " alumno: ");
			alumnos[i] = ent.nextLine();
			System.out.print("\nNota media del " + (i+1) + " alumno: ");
			notasAlumnos[i] = Double.parseDouble(ent.nextLine());
		}
		
		//Imprimimos
		for(int i=0; i < tamArray; i++) {
			//Si el alumno está aprobado
			if(notasAlumnos[i] >= 5) {
				System.out.println("El alumno, " + alumnos[i] + " ha aprobado con una nota media de: " + notasAlumnos[i]);
				
			}else {
				//Si el alumno está suspenso
				System.out.println("El alumno, " + alumnos[i] + " no ha aproado, tiene de media: " + notasAlumnos[i]);
			}			
		}
		
		ent.close();
	}
}
