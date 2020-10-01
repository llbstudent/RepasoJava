package Recursividad;

public class RecorrerVector {
	//Metodo
	public static void recorresArray(String[] arr, int index){
		if(index < 0){
			System.out.println("FIN");

		}else{
			System.out.println(arr[index]);
			recorresArray(arr, index-1);
		}

	}
			
	//MAIN
	public static void main(String[] args){
		String[] personas ={"Laura", "David", "Javier", "Pepe", "Pedro"};
		recorresArray(personas, personas.length-1);
	}
}
