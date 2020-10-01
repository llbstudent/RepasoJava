package POO_2_Herencia_Y_Polimorfismo_AlmacenBebidas;

public class AlmacenBebidas {
	private Bebida[][] estanteria;

	// Constructores
	public AlmacenBebidas(int filas, int columnas) {
		estanteria = new Bebida[filas][columnas];
	}

	// Defecto
	public AlmacenBebidas() {
		estanteria = new Bebida[5][5];
	}

	// GETTER Y SETTER
	public Bebida[][] getEstanteria() {
		return estanteria;
	}

	public void setEstanteria(Bebida[][] estanteria) {
		this.estanteria = estanteria;
	}

	// ---------------
	// Métodos de la clase
	// ---------------

	// Inserta/Agrega bebidas al almacén
	public void agregarBebida(Bebida nuevaBebida) {
		boolean encontrado = false;
		for (int i = 0; i < estanteria.length && !encontrado; i++) {
			for (int j = 0; j < estanteria[0].length && !encontrado; j++) {

				if (estanteria[i][j] == null) {
					estanteria[i][j] = nuevaBebida;
					encontrado = true;
				}
			}
		}

		// Indico si se ha añadiddo la bebida o no
		if (encontrado) {
			System.out.println("Bebida añadida");
		} else {
			System.out.println("No se ha podido añadir la bebida, estantería completa");
		}

	}

	// Elimina bebidas al almacén dependiendo del 'ID' que se le pase
	public void eliminarBebida(int idBebida) {
		boolean encontrado = false;
		for (int i = 0; i < estanteria.length && !encontrado; i++) {
			for (int j = 0; j < estanteria[0].length && !encontrado; j++) {
				if (estanteria[i][j] != null) {
					if (estanteria[i][j].getId() == idBebida) {
						estanteria[i][j] = null;
						encontrado = true;
					}
				}
			}
		}
		if (encontrado) {
			System.out.println("Bebida eliminada");
		} else {
			System.out.println("No existe la bebida");
		}
	}

	// Mostramos todas las bebidas
	public void mostrarBebidas() {
		for (int i = 0; i < estanteria.length; i++) {
			for (int j = 0; j < estanteria[0].length; j++) {
				if (estanteria[i][j] != null) {// controlo nulos
					System.out.println("fila " + i + ", columna: " + j + " Bebida: " + estanteria[i][j].getMarca());
				}
			}
		}
	}
	
	// Mostramos todas las bebidas con su precio
		public void mostrarBebidasYPrecio() {
			for (int i = 0; i < estanteria.length; i++) {
				for (int j = 0; j < estanteria[0].length; j++) {
					if (estanteria[i][j] != null) {// controlo nulos
						System.out.println("fila " + i + ", columna: " + j + " Bebida: " + estanteria[i][j].toString());
					}
				}
			}
		}

	// Calcular el precio de todas las bebidas
	public double calcularPrecioBebidas() {

		double precioTotal = 0;
		for (int i = 0; i < estanteria.length; i++) {
			for (int j = 0; j < estanteria[0].length; j++) {
				if (estanteria[i][j] != null) {// controlo nulos
					precioTotal += estanteria[i][j].getPrecio();// acumulo el precio
				}
			}
		}

		return precioTotal;

	}

	// Calculo el precio de las bebidas de una marca
	public double calcularPrecioBebidas(String marca) {

		double precioTotal = 0;
		for (int i = 0; i < estanteria.length; i++) {
			for (int j = 0; j < estanteria[0].length; j++) {
				if (estanteria[i][j] != null) {// controlo nulos

					if (estanteria[i][j].getMarca().equalsIgnoreCase(marca)) {
						precioTotal += estanteria[i][j].getPrecio(); // acumulo el precio
					}

				}
			}

		}

		return precioTotal;
	}

	// Calcular precio columna
	public double calcularPrecioBebidasColumna(int columna) {

		double precioTotal = 0;
		if (columna >= 0 && columna < estanteria[0].length) {

			for (int i = 0; i < estanteria.length; i++) {

				if (estanteria[i][columna] != null) { // controlo nulos
					precioTotal += estanteria[i][columna].getPrecio(); // acumulo el precio
				}

			}

		} else {
			System.out.println("La columna debe estar entre 0 y " + estanteria[0].length);
		}

		return precioTotal;

	}

	
	// Calcular el precio de la fila
	public double calcularPrecioBebidasFila(int columna) {

		double precioTotal = 0;
		if (columna >= 0 && columna < estanteria.length) {

			for (int i = 0; i < estanteria.length; i++) {

				if (estanteria[i][columna] != null) { // controlo nulos
					precioTotal += estanteria[i][columna].getPrecio(); // acumulo el precio
				}

			}

		} else {
			System.out.println("La columna debe estar entre 0 y " + estanteria[0].length);
		}

		return precioTotal;

	}
}
