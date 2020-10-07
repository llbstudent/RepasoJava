package T6_Collections_Ejercicio_SO;

import java.util.LinkedList;
import java.util.Vector;

public class SO_Uso extends Thread{

	public static void main(String[] args) throws InterruptedException {
		//Nos creamos los Vectores
		Vector<Proceso> primerosProcesos = new Vector<Proceso>(10);
		Vector<Proceso> segundosProcesos = new Vector<Proceso>(10);
		
		//Nos creamos las colas con sus diferentes prioridades
		Cola cola1 = Cola.creaCola(1);
		Cola cola2 = Cola.creaCola(2);
		Cola cola3 = Cola.creaCola(3);
		
		//Rellenamos los vectores con procesos aleatorios
		rellenaProceso(primerosProcesos);
		rellenaProceso(segundosProcesos);
		
		//Imprimir Vector
		//imprimirVector(primerosProcesos);
		
		// Insertamos los procesos en sus colas correspondientes
		insertarProcesos(cola1, cola2, cola3, primerosProcesos);
		
		//Simulacion de la ejecución de los procesos
		atencionProcesos(cola1, cola2, cola3, segundosProcesos);

	}

	//Nos ejecuta los procesos dependiendo del orden de las colas
	private static void atencionProcesos (Cola c1, Cola c2, Cola c3, Vector<Proceso> procesos) throws InterruptedException {
		Proceso procesoAux;
		boolean todoVacio = false;
		
		do {
			todoVacio = false;
			//Comprobamos cuales no están vacías
			 if (!c1.esVaciaCola()) {
				 procesoAux = c1.desenCola();
				 System.out.println(procesoAux.toString());
			     Thread.sleep(procesoAux.getTiempo());
				 
			 } else if (!c2.esVaciaCola()) {
				 procesoAux = c2.desenCola();
				 System.out.println(procesoAux.toString());
			     Thread.sleep(procesoAux.getTiempo());
	            	
			 } else if (!c3.esVaciaCola()) {
				 procesoAux = c3.desenCola();
				 System.out.println(procesoAux.toString());
			     Thread.sleep(procesoAux.getTiempo());
	            	
			 }else if(!procesos.isEmpty()) {
				 //Cogeremos siempre el primero de la lista
				 switch(procesos.get(0).getPrioridad()) {
	            	
					 case 1:
						 c1.insertCola(procesos.get(0));
						 procesos.remove(0);
						 break;
	            		
	            	case 2:
	            		c2.insertCola(procesos.get(0));
						procesos.remove(0);
	            		break;
	            		
	            	case 3:
	            		c3.insertCola(procesos.get(0));
						procesos.remove(0);
	            		break;
	            	}
	            	
	            } else {
	            	todoVacio = true;
	                System.out.println("\n****************************"
	                		+ "Ya no hay más procesos que ejecutar"
	                		+ "****************************");
	            }
		}while(!todoVacio);
	}

	//Nos inserta los procesos en las diferentes colas dependiendo de la prioridad
	private static void insertarProcesos(Cola c1, Cola c2, Cola c3, Vector<Proceso> procesos) {
		while(!procesos.isEmpty()) {
			switch(procesos.get(0).getPrioridad()) {
			
			case 1:
				c1.insertCola(procesos.get(0));
				procesos.remove(0);
				break;
				
			case 2:
				c2.insertCola(procesos.get(0));
				procesos.remove(0);
				break;
				
			case 3:
				c3.insertCola(procesos.get(0));
				procesos.remove(0);
				break;
			}			
		}
	}

	//Método  que nos permite ver el contenido del 'Vector' para ver 
	// si lo hemos rellenado correctamente
	private static void rellenaProceso(Vector<Proceso> vector) {
		for(int i=0; i < vector.capacity(); i++) {
			vector.addElement(new Proceso());
		}			
	}

	//Método que nos rellenará el 'Vector' con procesos aleatorios
	private static void imprimirVector(Vector<Proceso> vector) {
		for(int i=0; i < vector.size(); i++) {
			System.out.println(vector.get(i).toString());
		}		
	}
	
	
	//-------------------
	//Métodos caca
	/* 
	 
	 public static void imprimeRandonNum() {
		for(int i=0; i< 100; i++) {
			System.out.println((int) (Math.random()*(3-1+1)+1));
		}
	}
	 * 
	 * */

	
}
