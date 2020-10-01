package POO_6_Clases_Internas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ej3_Pizza {
	//Valores enum
	public enum TAMANNO {
		Mediana, Grande, Xxl
	};

	public enum TIPOMASA {
		Fina, Gruesa
	};

	//Variables
	private TIPOMASA masa;
	private TAMANNO tamPizza;
	private int numIngredientes;
	private Ingredientes ingredientesPizza;

	
	//-----
	// Constructores
	public Ej3_Pizza() {}
	
	
	//Sólo tipo de masa y tamaño
	public Ej3_Pizza(TIPOMASA masa, TAMANNO tamPizza, Scanner in) {
		boolean tamannoCorrecto = true;
		this.numIngredientes = 0;
		this.masa = masa;
		this.tamPizza = tamPizza;
		
		do {
			switch(this.tamPizza) {
			
			case Mediana:
				this.numIngredientes = 4;
				break;
				
			case Grande:
				this.numIngredientes = 5;
				break;
				
			case Xxl:
				this.numIngredientes = 6;
				break;
				
				default:
					System.out.println("Tamaño no disponible");
					tamannoCorrecto = false;
			}			
		}while(!tamannoCorrecto);
		
		if(this.masa != null && this.tamPizza != null && this.numIngredientes != 0) {
			this.ingredientesPizza = new Ingredientes(this.numIngredientes, in);
		}else {
			System.out.println("No pudo hacerse su pedido");
		}
	}
	
	
	//Constructor donde ya le pasas el listado de ingredientes
	public Ej3_Pizza(TIPOMASA masa, TAMANNO tamPizza, List<String> lstIngredientes) {
		this.masa = masa;
		this.tamPizza = tamPizza;
		String[] misIngredientes = null;
		boolean tamannoCorrecto = true;
		
		do {
			switch(this.tamPizza) {
			
			case Mediana:
				this.numIngredientes = 4;
				System.out.println("Sólo puede tener 4 ingredientes. Eliminaremos los que sobren");
				misIngredientes = obtenerArrayIngredientes(this.numIngredientes, lstIngredientes);
				this.numIngredientes = misIngredientes.length;
				break;
				
			case Grande:
				this.numIngredientes = 5;
				System.out.println("Sólo puede tener 5 ingredientes. Eliminaremos los que sobren");
				misIngredientes = obtenerArrayIngredientes(this.numIngredientes, lstIngredientes);
				this.numIngredientes = misIngredientes.length;
				break;
				
			case Xxl:
				this.numIngredientes = 6;
				System.out.println("Sólo puede tener 6 ingredientes. Eliminaremos los que sobren");
				misIngredientes = obtenerArrayIngredientes(this.numIngredientes, lstIngredientes);
				this.numIngredientes = misIngredientes.length;
				break;
				
				default:
					System.out.println("Tamaño no disponible");
					tamannoCorrecto = false;
			}			
		}while(!tamannoCorrecto);
		
		if(misIngredientes != null) {
			this.ingredientesPizza = new Ingredientes(misIngredientes);
			System.out.println("Petición de su pizza realizado correctamente");
		}else {
			System.out.println("No pudo hacerse su pedido");
		}
		
	}


	//SETTER Y GETTER
	public TIPOMASA getMasa() {
		return masa;
	}


	public void setMasa(TIPOMASA masa) {
		this.masa = masa;
	}


	public TAMANNO getTamPizza() {
		return tamPizza;
	}


	public void setTamPizza(TAMANNO tamPizza) {
		this.tamPizza = tamPizza;
	}


	public int getNumIngredientes() {
		return numIngredientes;
	}


	public void setNumIngredientes(int numIngredientes) {
		this.numIngredientes = numIngredientes;
	}


	public Ingredientes getIngredientesPizza() {
		return ingredientesPizza;
	}


	public void setIngredientesPizza(Ingredientes ingredientesPizza) {
		this.ingredientesPizza = ingredientesPizza;
	}
	
	//Método ToString
	@Override
    public String toString() {
        return "Pizza [Tipo de  masa=" + this.masa + ", Tamaño=" + this.tamPizza + this.ingredientesPizza.toStringIngredientes2();
    }
	
	//-------
	// Clase interna
	//-------
	class Ingredientes {
		private String[] lstIngredientes;

		// Constructores
		Ingredientes() {}

		//Constructor sólo con el núm de ingredientes
		// Luego se añaden
		Ingredientes(int numIngredientes, Scanner in) {
			// this.lstIngredientes = new String[numIngredientes];
			this.lstIngredientes = escribirIngredientes(numIngredientes, in);
		}

		//Se le pasa la lista de ingredientes
		Ingredientes(String[] lstIngredientes) {
			this.lstIngredientes = lstIngredientes;
		}
		
		//SETTER Y GETTER
		public String[] getLstIngredientes() {
			return lstIngredientes;
		}

		public void setLstIngredientes(String[] lstIngredientes) {
			this.lstIngredientes = lstIngredientes;
		}
		
		//-----
		//Métodos
		//-----
		//Para escribir los ingredeintes que tendrá nuestra pizza
		private String[] escribirIngredientes(int numIngredientes, Scanner in) {
			boolean conformeConLosIngredientes = true;
			String[] misIngredientes = new String[numIngredientes];
			
			do {
				for(int i=0; i < numIngredientes; i++) {
					System.out.print("Ingrediente [" + (i+1)+ "]: ");
					misIngredientes[i] = in.nextLine();
				}
				
				if(misIngredientes != null) {
					System.out.println("Ingredientes seleccionados");
					imprimirIngredientes1(misIngredientes);
					
					System.out.print("\n¿Está conforme (SI) o desearía otros ingredientes (NO)?");
					String respuestaConformidad = in.nextLine();
					
					if(respuestaConformidad.equalsIgnoreCase("no")) {
						conformeConLosIngredientes = false;
					}
				}else {
					System.out.println("No se pudieron obtener los ingredientes");
				}				
			}while(!conformeConLosIngredientes);
			
			return misIngredientes;
		}
		
		//Método que nos imprime los ingrediente que hemos seleccionado
		private void imprimirIngredientes1(String[] ingredientes) {
			System.out.println("Ingredientes: ");
			for(int i=0; i < ingredientes.length; i++) {
				System.out.println(ingredientes[i] + " ");
			}
		}
		
		public String toStringIngredientes2() {
			String msj = "\tIngredientes: ";
			for(int i=0; i < this.lstIngredientes.length; i++) {
				msj += this.lstIngredientes[i] + " ";
			}
			return msj;
		}
	}
	
	
	//Métodos útiles
	private String[] obtenerArrayIngredientes(int numIngredientes, List<String> lstIngredientes) {
		String[] misIngredientes = new String[numIngredientes];
		
		for(int i=0; i < numIngredientes; i++) {
			misIngredientes[i] = lstIngredientes.get(i);
		}		
		return misIngredientes;
	}
	

}
