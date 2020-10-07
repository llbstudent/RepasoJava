package T6_Collections_Ejercicio_SO;

import java.util.LinkedList;
import java.util.ListIterator;

public class Cola {
	private	LinkedList<Proceso> procesosListado;
	int prioridadProcesosCola;
	
	//Constructores, tiene que ser privado
	private Cola(int prioridadProcesosCola) {
		this.prioridadProcesosCola = prioridadProcesosCola;
		this.procesosListado = new LinkedList<Proceso>();
	}
	
	//Setter y Getters
	public LinkedList<Proceso> getProcesosListado() {
		return procesosListado;
	}
	public void setProcesosListado(LinkedList<Proceso> procesosListado) {
		this.procesosListado = procesosListado;
	}
	public int getPrioridadProcesosCola() {
		return prioridadProcesosCola;
	}
	public void setPrioridadProcesosCola(int prioridadProcesosCola) {
		this.prioridadProcesosCola = prioridadProcesosCola;
	}

	
	//M�todos
	
	//Nos inserta un proceso en la cola correspondiente
	public boolean insertCola(Proceso proceso) {
        if (this.procesosListado.size() < 10) {
            this.procesosListado.add(proceso);
            return true;
        } else {
            return false;
        }
    }
	
	
	// Retorna un proceso para ser antendido y lo borra de la cola
	public Proceso desenCola() {
		return this.procesosListado.remove();
	}
	
	
	//Nos dice si est� vac�a la cola
	public boolean esVaciaCola() {
		return this.procesosListado.isEmpty();
	}
	
	//Nos muestra todos los elementos existentes de la cola
	public String toString() {
		String data = "";
		ListIterator<Proceso> listaIt = this.procesosListado.listIterator();
		
		while(listaIt.hasNext()) {
			data += listaIt.next();
		}
		return data;
	}
	
	//Nos crea una cola vac�a instanciando el LinkedList
	public static  Cola creaCola(int prioridad) {
		return new Cola(prioridad);
	}
	
}
