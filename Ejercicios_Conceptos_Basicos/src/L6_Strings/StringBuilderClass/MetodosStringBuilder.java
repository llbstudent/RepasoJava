


package L6_Strings.StringBuilderClass;

public class MetodosStringBuilder {

	public static void main(String[] args) {
		
		System.out.println("\n//Constructores");
		System.out.println("StringBuilder() -> StringBuilder sb = new StringBuilder()");
		System.out.println("StringBuilder() -> StringBuilder sb = new StringBuilder(CharSequence cs)");
		System.out.println("StringBuilder() -> StringBuilder sb = new StringBuilder(String str)");
		System.out.println("StringBuilder() -> StringBuilder sb = new StringBuilder(int capacity)");
		
		
		System.out.println("\n\n--------------------------");
		System.out.println("//Métodos");
		System.out.println("--------------------------");
		
		//append
		System.out.println("\n\nappend(String s): Añade caracteres");
		StringBuilder sb = new StringBuilder("Hola");
		sb.append(". Que tal");
		System.out.println("StringBuilder sb = new StringBuilder(\"Hola\");\r\n"
				+ "sb.append(\". Que tal\"); -> " + sb);
		
		
		//delete
		System.out.println("\ndelete(int start, int end)\r\n"
				+ "Elimina una franja de caracteres.");
		StringBuilder sb2 = new StringBuilder("Holaaaaaaaaaaa, me llamo Laura");
		sb2.delete(5, 12);
		System.out.println("StringBuilder sb2 = new StringBuilder(\"Holaaaaaaaaaaa, me llamo Laura\");\r\n"
				+ "sb2.delete(5, 12);");
		System.out.println(sb2);
		
		
		//deleteCharAt
		StringBuilder sb3 = new StringBuilder("Holaa");
		sb3.deleteCharAt(4);
		System.out.println("\ndeleteCharAt(int index)\r\n"
				+ "Elimina sólo una letra.");
		System.out.println("StringBuilder sb3 = new StringBuilder(\"Holaa\");\r\n"
				+ "	sb3.deleteCharAt(4);");
		System.out.println(sb3);
		
		//insert
		StringBuilder sb4 = new StringBuilder("HolaLaura");
		sb4.insert(3, ". Qué tal, soy ");
		System.out.println("\ninsert(int offset, float f): Nos inserta un dato donde le dígamos con el índice");
		System.out.println("StringBuilder sb4 = new StringBuilder(\"HolaLaura\");\r\n"
				+ "sb4.insert(3, \". Qué tal, soy \");");
		System.out.println(sb4);
		
		//length
		System.out.println("\nlength(): Nos devuelve la longitud (character count).");
		System.out.println("StringBuilder sb4 = new StringBuilder(\"HolaLaura\"); - sb4.length(): " + sb4.length());
		
		//replace
		System.out.println("\nreplace(int start, int end, String str): Replaces the characters in a substring of this sequence with characters in the specified String.");
		StringBuilder sb5 = new StringBuilder("Hemos vivido demasiado. "
				+ "Para quien sabe tanto como nosotras nada es importante ya. "
				+ "Todo se repite eternamente: el día y la noche, el verano y el invierno; el mundo está vacío y no tiene sentido");
		
		sb5.replace(10, 20, "¿Cómo puedo descubrir mi verdadera voluntad?");
		System.out.println("StringBuilder sb5 = new StringBuilder(\"Hemos vivido demasiado. \"\r\n"
				+ "+ \"Para quien sabe tanto como nosotras nada es importante ya. \"\r\n"
				+ "+ \"Todo se repite eternamente: el día y la noche, el verano y el invierno; el mundo está vacío y no tiene sentido\");\r\n"
				+ "\r\n"
				+ "sb5.replace(10, 20, \"¿Cómo puedo descubrir mi verdadera voluntad?\");");
		System.out.println(sb5);
		
		
		//Reverse
		System.out.println("\nreverse(): Nos cambia el orden de los caracteres");
		System.out.println(sb4 + "-Reverse -> " + sb4.reverse());
		
		
		//setCharAt
		StringBuilder sb6 = new StringBuilder("Laura Lucena Buendia");
		sb6.setCharAt(6,'a');
		System.out.println("\nsetCharAt(int index, char ch):");
		System.out.println("StringBuilder sb6 = new StringBuilder(\"Laura Lucena Buendia\");\r\n"
				+ "sb6.setCharAt(6,'a');");
		System.out.println(sb6);
		
		//subsequence
		System.out.println("\nSubsequence:");
		System.out.println("StringBuilder string = new StringBuilder(\"Hello\");\r\n"
				+ "String subSequence = (String) string.subSequence(0, 5);");
		
		//
		System.out.println("\n	substring(int start) / substring(int start, int end)");
	}
}
