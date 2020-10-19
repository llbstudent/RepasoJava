package T6_Collections_ArrayList_Iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class UsoClase {

	//MAIN
	public static void main(String[] args) {
		//Importamos de java.util y nos creamos el 'listado'
		ArrayList<Empleado> empleadosLst = new ArrayList<Empleado>();
		
		//Insertamos algunos empleados
		empleadosLst.add(new Empleado ("A234", "Juan Gómez", "Administrativo"));
		empleadosLst.add(new Empleado ("A412", "Pedro Pérez", "RRHH"));
		empleadosLst.add(new Empleado ("A654", "María Muñoz", "Directivo"));
		empleadosLst.add(new Empleado ("A144", "Luis López", "Ejecutivo"));
		empleadosLst.add(new Empleado ("A789", "Ana Almendro", "Administrativo"));
		
		//Iterador, que nos imprime gracias al 'toString'
		Iterator<Empleado> miIter = empleadosLst.iterator();
		while(miIter.hasNext()) {
			System.out.println(miIter.next());
		}
	}
}
