package T4_Recursividad;

//Que nos diga si hay, nos devuelve verdaderos si alguno de los objeto es integer o Persona

//Contar que todos sean personas
public class Recursividad {
	
	
	/**
	 * Método
	 * 
	 * */
	public static boolean contieneInteger(Object[] arr, int index, boolean res) {
		if(index < 0) {
			return false;
			
		}else {
			//Integer.class.isInstance(arr[index])
			if(Integer.class.isInstance(arr[index])) {
				return true;
				
			}else {
				res = contieneInteger(arr, index-1, false);
				return res;				
			}
		}		
	}
	
	
	//.getClass().getName()
	public static void main(String[] args) {
		boolean res = false;
		Object[] arr1 = {"Pepe", "Pedro", 3.15, 9866, 3.151648, "Juan"};
		Object[] arr2 = {"Pepe", "Pedro", 3.15, 98.66, 3.151648, "Juan"};
		
		boolean res1 = contieneInteger(arr1, arr1.length-1, res);
		boolean res2 = contieneInteger(arr2, arr2.length-1, res);
		
		//1Res
		if(res1) {
			System.out.println("El primer Array Contiene un integer");
			
		}else {
			System.out.println("El primer Array NO Contiene un integer");
		}
		
		//2Res
		if(res2) {
			System.out.println("El segundo Array Contiene un integer");
			
		}else {
			System.out.println("El segundo Array NO Contiene un integer");
		}
	}

}
