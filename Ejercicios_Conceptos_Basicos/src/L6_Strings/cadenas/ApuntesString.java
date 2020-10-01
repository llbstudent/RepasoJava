package L6_Strings.cadenas;

public class ApuntesString {
	public static void main(String[] args) {
		// Primera letra en mayúscula
		String palabraEj1 = "hola pepe";
		char[] letras1 = palabraEj1.toCharArray();
		letras1[0] = Character.toUpperCase(letras1[0]);

		System.out.println(letras1);

		//-------------
		// Primera letra de cada palabra en mayúscula
		String palabraEj2 = "hola pepe cómo te encuentras";
		char[] letras2 = palabraEj2.toCharArray();

		//La primera letra en mayúscula
		letras1[0] = Character.toUpperCase(letras1[0]);
		
		// el -2 es para evitar una excepción al caernos del arreglo
		for (int i = 0; i < palabraEj2.length() - 2; i++)
			// Es 'palabra'
			if (letras2[i] == ' ' || letras2[i] == '.' || letras2[i] == ',')
				// Reemplazamos
				letras2[i + 1] = Character.toUpperCase(letras2[i + 1]);

		System.out.println(letras2);
	}

}
