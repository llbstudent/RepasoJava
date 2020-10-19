package T7_ProgramacionGenerica__Métodos;

import T7_ProgramacionGenerica__Clase.Persona;

public class MetodosGenericos {

	public static void main(String[] args) {
		//Con Strings
		String nombres[] = {"Jose", "María", "Pepe"};
		String elementos = MisMatrices.<String>getElementos(nombres);
		System.out.println(elementos);
		
		//Con instancias tipo Persona
		Persona lstPersonas[] = {new Persona("Ana", 22),
				new Persona("Pedro", 24),
				new Persona("Rocío", 23),
				new Persona("Jesús", 25)
		};
		
		System.out.println( MisMatrices.getElementos(lstPersonas));
	}
}
