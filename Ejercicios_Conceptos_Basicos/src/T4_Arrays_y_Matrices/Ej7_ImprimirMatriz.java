package T4_Arrays_y_Matrices;

public class Ej7_ImprimirMatriz {
	
	public static void main(String[] args) {
		int[][] ejemploMatriz = {
				{1, 2, 3},
				{4, 5, 6}};
		
		imprimirArrayMatriz(ejemploMatriz);
		
	}

	private static void imprimirArrayMatriz(int[][] matriz) {
		System.out.print("\n{");
		for(int i = 0; i < matriz.length; i++) {
			System.out.print("\n{");
			for(int j = 0; j < matriz[0].length; j++) {
				System.out.print(matriz[i][j]);
				
				if(j != matriz[0].length-1) {
					System.out.print(", ");
				}
			}
			System.out.print("}\n");
		}System.out.print("}\n");
		
	}
}
