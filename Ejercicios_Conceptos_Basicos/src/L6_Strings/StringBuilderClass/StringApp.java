/*
 * *********************************************
 * PROBLEMAS EN LA MEMORIA CON 'STRING'
 * *********************************************
 * Los objetos String son CONSTANTES e INMUTABLES
 * Una vez creados, los objetos Strings no pueden ser modificados. 
 * Para entender esto analicemos el siguiente c�digo:
 * 		String s = "Hello";
 * 		s = s + "edu";
 * 
 * En la primer l�nea, se crea un objeto String �Hello� y se guarda una referencia a �l en la variable s.
 * En la segunda l�nea se crea otro objeto String �edu� y se realiza la operaci�n concatenaci�n de los objetos �Hello � y �edu�. La concatenaci�n produce un nuevo objeto String �Hello edu� cuya referencia ser� guardada en la variable s.
 * 
 * 
 * EJEMPLO
 * */
package L6_Strings.StringBuilderClass;
/*
 * La diferencia entre StringBuffer y StringBuilder es que los m�todos de StringBuffer est�n sincronizados 
 * y los de StringBuilder no lo est�n. 
 * Por este motivo StringBuilder ofrece mejor rendimiento que StringBuffer 
 * y la utilizaremos cuando la aplicaci�n tenga un solo hilo de ejecuci�n.
 * */

public class StringApp {

	public static void main(String[] args) {
		//A veces no es recomendable hacer '+' a un String por rendimiento
		StringBuilder sb1 = new StringBuilder("Hola");
		
		StringBuilder sb2 = new StringBuilder();
		sb2.append(" que tal, soy Laura");

		//Se pueden a�adir (append) tanto otros String/chars[]/StringBuilder
		System.out.println("APPEND");
		System.out.println(sb1.append(sb2));
		
		
		//capacity(): Te devuelve la capacidad
		System.out.println("\nCAPACITY");
		System.out.println(sb1.capacity());
		
		//trimToSize(): Reduce la capacidad para ser m�s eficiente
		System.out.println("\nTRIM_TO_SIZE");
		sb1.trimToSize();
		System.out.println(sb1.capacity());
		
		//length(): Longitud de la cadena
		System.out.println("\nLENGTH");
		System.out.println(sb1.length());
		System.out.println();
		
		//insert(): Inserta 'cadena' en la posicion indicada. 
		//Dejar un espacio al principio, pero no al final
		System.out.println("INSERT");
		sb1.insert(5, "a todos ");
		System.out.println(sb1);
		
		//delete(): Elimina el contenido
		System.out.println("DELETE");
		System.out.println(sb1.delete(0, 5));
		System.out.println("Han borrado una parte de la cadena '" + sb1.toString() + "'");
		System.out.println(sb1.delete(0, sb1.length()));
		System.out.println("Han borrado el contenido completo '" + sb1.toString() + "'");
		System.out.println(sb1.append("Hola de nuevo"));
		
		//reverse(): Invierte el contenido de la cadena
		System.out.println("\nREVERSE");
		System.out.println(sb1.reverse().toString());
		
	}

}
