package T6_Collections__Introduccion;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class UsoColecciones {
	
	public static void main(String[] args) {
		
		//Nos creamos las instancias
		//3 Novelas
		Novela n1 = new Novela(250, true, "El Valle sordo", 14, "Hist�rico-Drama");
		Novela n2 = new Novela(180, false, "El gran Berlinski", 22, "Fantas�a");
		Novela n3 = new Novela(80, true, "Canci�n para un ping�ino", 7, "Comedia");
		
		//3 Tomos
		Tomo t1 = new Tomo(80, true, "Tekkenent", 2, 5);
		Tomo t2 = new Tomo(90, true, "Bakuto, el ninja", 10, 6);
		Tomo t3 = new Tomo(80, false, "Una Pieza de Pirata", 1000, 4);
		
		//---------------------
		//List
		//---------------------
		
		//-----------
		//ArrayList
		//-----------
		List librosLista = new ArrayList();
		
		//A�adir elemntos:
		librosLista.add(t1);
		librosLista.add(t2);
		librosLista.add(t3);
		librosLista.add(n2);
		
		//Eliminar un elemento
		librosLista.remove(t1);
		
		//Vaciar el listado
		librosLista.clear();
		
		//Tama�o de la lista
		int tam = librosLista.size();
		
		//Convertir en Array:
		// Libro[] arrLibros = (Libro[]) librosLista.toArray();
		
		//Nos dice si la lista est� vacia o no
		boolean estaVacia = librosLista.isEmpty();
		
		//-----------
		//LinkedList
		//-----------
		//A diferencia de ArrayList en LinkedList se pueden insertar elementos en muchos mas lugares:
		// add()			A�ade normal
		// addAll()			A�ade varios
		// add(i, objeto)	A�ade a el objeto en una posicion concreta 'i'
		// addFirst()		Adds an item to the beginning of the list.	
		// addLast()		Add an item to the end of the list	
		// removeFirst()	Remove an item from the beginning of the list.	
		// removeLast()		Remove an item from the end of the list	
		// getFirst()		Get the item at the beginning of the list	
		// getLast()		Get the item at the end of the list
		
		
		//Tanto los ArrayList como los LinkedList se recorren con 'for' o con el listIterator
		System.out.println("Recorrer un LinkedList con ListIterator");
		
		//Nos creamos el linkedList
		LinkedList<String> nombreAlumnos = new LinkedList<String>();
		nombreAlumnos.add("Pedro");
		nombreAlumnos.add("Elisa");
		nombreAlumnos.add("Eva");
		nombreAlumnos.addFirst("Laura");
		nombreAlumnos.addLast("Israel");
		
		ListIterator<String> listaIt = nombreAlumnos.listIterator();
		
		while(listaIt.hasNext()) {
			System.out.println(listaIt.next());
		}
		
		
	}

	
}
