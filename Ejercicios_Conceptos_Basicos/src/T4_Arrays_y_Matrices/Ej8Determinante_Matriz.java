package T4_Arrays_y_Matrices;

public class Ej8Determinante_Matriz {
	//Funcion
	private static void calcularDeterminante(int[][] matriz) {
		
		/*
		 * 	int res = 1;
		int numFilas = matriz.length;
		int numColumnas = matriz[0].length;
		
		for(int contadorFilas = 0; contadorFilas < numFilas; contadorFilas++) {
			if(contadorFilas == 0) {
				for(int i = 0; i < numFilas; i++) {
					int resMult = 1;
					for(int j = 0; j < numColumnas; j++) {
						resMult *= matriz[i][j]; 
					}
				}
			}else {
				int resMult = 1;
				for(int i = contadorFilas; i < numFilas - contadorFilas; i++) {
					for(int j = 0; i < numColumnas; j++) {
						resMult *= matriz[i][j]; 
					}
				
			}
			
		}
		}
		 *
		 * */
	
		

	}
	
	public static void main(String[] args) {
		int[][] matriz = {
				{1, 2, 3},
				{4, 5, 6},
				{7, 8, 8}
		};
		
		int resultado = 3;
		
		calcularDeterminante(matriz);
		
	}

	
}
