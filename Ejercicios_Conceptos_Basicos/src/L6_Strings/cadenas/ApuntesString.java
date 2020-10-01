package L6_Strings.cadenas;

public class ApuntesString {
	public static void main(String[] args) {
		// Primera letra en may�scula
		String palabraEj1 = "hola pepe";
		char[] letras1 = palabraEj1.toCharArray();
		letras1[0] = Character.toUpperCase(letras1[0]);

		System.out.println(letras1);

		//-------------
		// Primera letra de cada palabra en may�scula
		String palabraEj2 = "hola pepe c�mo te encuentras";
		char[] letras2 = palabraEj2.toCharArray();

		//La primera letra en may�scula
		letras1[0] = Character.toUpperCase(letras1[0]);
		
		// el -2 es para evitar una excepci�n al caernos del arreglo
		for (int i = 0; i < palabraEj2.length() - 2; i++)
			// Es 'palabra'
			if (letras2[i] == ' ' || letras2[i] == '.' || letras2[i] == ',')
				// Reemplazamos
				letras2[i + 1] = Character.toUpperCase(letras2[i + 1]);

		System.out.println(letras2);
	}

}
