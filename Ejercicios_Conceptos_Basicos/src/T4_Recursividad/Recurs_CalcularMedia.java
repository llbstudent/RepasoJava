package T4_Recursividad;
/*
 * Calcular la media de los números pares de un ArrayList
 * */
public class Recurs_CalcularMedia {
	public static void main(String[] args) {
		int[] numeros = {5, 5, 10, 9, 7, 4, 6, 6, 2, 1, 8, 7};
		int sumaMedia = 0;
		int contador = 0;
		//Media con void
		mediaPAresArrayVoid(numeros, numeros.length-1, sumaMedia, contador);
		int mediaRes = mediaPAresArrayReturn(numeros, numeros.length-1, sumaMedia, contador);
		System.out.println("La media hecha con return es: " + mediaRes);
		
		int mediaTotal = mediaTodos(numeros, numeros.length-1, sumaMedia, contador);
		System.out.println("La media de todos es: " + mediaTotal);
		}
	
	
	//Metodo con return
	private static int mediaPAresArrayReturn(int[] arr, int index, int media, int contadorNumPares) {
		if(index < 0){
			return media / contadorNumPares;

		}else{
			if(arr[index] % 2 == 0) {
				media += arr[index];
				contadorNumPares++;
				return mediaPAresArrayReturn(arr, index-1, media, contadorNumPares);
				
			}else {
				return mediaPAresArrayReturn(arr, index-1, media, contadorNumPares);
			}
		}
	}


	//Metodo con void
	public static void mediaPAresArrayVoid(int[] arr, int index, int media, int contadorNumPares){
		if(index < 0){
			media = media / contadorNumPares;
			System.out.println("La media con 'void' es: " + media);

		}else{
			if(arr[index] % 2 == 0) {
				media += arr[index];
				contadorNumPares++;
				mediaPAresArrayVoid(arr, index-1, media, contadorNumPares);
				
			}else {
				mediaPAresArrayVoid(arr, index-1, media, contadorNumPares);
			}
			
		}

	}
	
	//Media de todos con return
	public static int mediaTodos(int[] arr, int index, int media, int contador) {
		if(index < 0){
			return media / contador;

		}else{
				media += arr[index];
				contador++;
				return mediaTodos(arr, index-1, media, contador);
		}		
	}
	
	/*
	 * int suma = media(lista, ind+1);
	 * suma += lista.get[0];
	 * return suma/lista.size;
	 * */
}
