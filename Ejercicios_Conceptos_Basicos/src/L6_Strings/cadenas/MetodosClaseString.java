package L6_Strings.cadenas;

public class MetodosClaseString {
	
	public static void main(String[] args) {
		String c1 = "Hola";
		String c2 = "Hola";
		String c3 = "hola";
		String c4 = "Holaaaa";
		
		System.out.println("//CONSTRUCTORES:");
		System.out.println("String c1 = 'Hola';");
		System.out.println("String c2 = new String('Hola');");
		System.out.println("String(StringBuilder builder);");
		System.out.println("String(char[] value)");
		System.out.println("String(StringBuffer buffer)");
		
		
		//length()-int : Nos devuelve la longitud de un String
		System.out.println("\n//LENGTH():");
		System.out.println("La cadena '" +c1+ "' mide: " + c1.length());
		System.out.println("La cadena '" +c4+ "' mide: " + c4.length());
		
		System.out.println("\n//ChartAt(int index);");
		System.out.println("La posición '0' de '" +c1+ "' es: '" + c1.charAt(0) + "'" +
				"\nY su posición '3' es: '" +c1.charAt(3));
		
		//CompareTo: Compara otra cadena lexicográficamente
		System.out.println("\n//CompareTo(String s)");
		System.out.println("La cadena '" +c1+ "' con '" +c2+ "': " + c1.compareTo(c2));
		System.out.println("La cadena '" +c1+ "' con '" +c3+ "': " + c1.compareTo(c3));
		System.out.println("La cadena '" +c1+ "' con '" +c4+ "': " + c1.compareTo(c4));
		
		System.out.println("\n//concat(String str)");
		System.out.println("Concatenamos '.Que tal' a '" +c1+ "': " + c1.concat(". Qué tal"));
		
		System.out.println("\n//contains(CharSequence s)");
		System.out.println("'" +c1+ "' contiene 'a': " + c1.contains("a"));
		System.out.println("'" +c1+ "' contiene 'h': " + c1.contains("h"));
		System.out.println("'" +c1+ "' contiene 'H': " + c1.contains("H"));
		System.out.println("'" +c1+ "' contiene 'al': " + c1.contains("al"));
		System.out.println("'" +c1+ "' contiene 'la': " + c1.contains("la"));
		
		
		System.out.println("\n//endsWith(String s)");
		System.out.println("'" +c1+ "' termina e 'a': " + c1.endsWith("a"));
		System.out.println("'" +c1+ "' termina e 'l': " + c1.endsWith("l"));
		System.out.println("'" +c1+ "' termina e 'la': " + c1.endsWith("la"));
		
		System.out.println("\n//equals");
		System.out.println("comparamos '" +c1+ "' con '" +c2+ "': " + c1.equals(c2));
		System.out.println("comparamos '" +c1+ "' con '" +c3+ "': " + c1.equals(c3));
		System.out.println("comparamos '" +c1+ "' con '" +c4+ "': " + c1.equals(c4));
		
		System.out.println("\n//equalsIgnoreCase: Ignora las mayúsc");
		System.out.println("comparamos '" +c1+ "' con '" +c2+ "': " + c1.equalsIgnoreCase(c2));
		System.out.println("comparamos '" +c1+ "' con '" +c3+ "': " + c1.equalsIgnoreCase(c3));
		System.out.println("comparamos '" +c1+ "' con '" +c4+ "': " + c1.equalsIgnoreCase(c4));
		
		System.out.println("\n//hashCode():");
		System.out.println("'" +c1+"' hashCode: " + c1.hashCode());
		System.out.println("'" +c2+"' hashCode: " + c2.hashCode());
		System.out.println("'" +c3+"' hashCode: " + c3.hashCode());
		System.out.println("'" +c4+"' hashCode: " + c4.hashCode());
		
		System.out.println("\n//isEmpty(): Returns true if, and only if, length() is 0.");
		System.out.println(c1 + ": " + c1.isEmpty());
		
		System.out.println("\n//lastIndexOf(int ch)");
		System.out.println(c1.lastIndexOf("a"));
		System.out.println(c1.lastIndexOf('b'));
		System.out.println(c1.lastIndexOf("la"));
		System.out.println(c1.lastIndexOf(1));
		
		
		System.out.println("\n//replace(char oldChar, char newChar)");
		System.out.println("Antes: '" +c1+ "' -Después: '" +c1.replace('a', 'o')+ "'");
		
		
		System.out.println("\n//split()");
		System.out.println("String string = \"004-034-556\";");
		System.out.println("String[] parts = string.split(\"-\");");
		
		
		System.out.println("\n//toCharArray()");
		System.out.println("char letras = cadena1.toCharArray();");
		
		System.out.println("\n//toLowerCase(: Transformar a minúscula)");
		System.out.println("\n//toUpperCase: Transforma a mayúscula");
		
		System.out.println("\n//	toString(): Nos transforma a objeto String");
		
		System.out.println("\n//trim():Elimina los espacios");
		String cadena1 = "Me llamo Laura"; 
		System.out.println("Cadena '" +cadena1+ "' -trim: " + cadena1.trim());
		
		System.out.println("\n//valueOf(double d): Returns the string representation of the 'x' argument.");
		System.out.println("entero (1): " + String.valueOf(1));
		System.out.println("boolean (true): " + String.valueOf(true));
		System.out.println("double (2.5): " + String.valueOf(2.5));
		
	}
}
