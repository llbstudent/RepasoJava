package POO_1_Cuenta;

import java.util.Scanner;

public class Cuenta {
	private String titular;
	private Double cantidad;
	
		
	//Constructores
	public Cuenta() {}
	
	public Cuenta(String titular, Double cantidad) {
		this.titular = titular;
		this.cantidad = cantidad;
	}
	
	//Setters Y Getters
		public String getTitular() {
			return titular;
		}
		public void setTitular(String titular) {
			this.titular = titular;
		}
		public Double getCantidad() {
			return cantidad;
		}
		public void setCantidad(Double cantidad) {
			this.cantidad = cantidad;
		}
		
		//To String
		@Override
		public String toString() {
			return "\nCuenta titular " + titular + "\nTotal cantidad=" + cantidad + "\n----------------";
		}
		
		//Métodos
		
		//Nos ingresa dinero
		public void ingresar(double ingreso) {
			this.cantidad += ingreso;
			System.out.println("Ingresos actuales en su cuenta: " + this.cantidad);
		}
		
		
		//Nos retira dinero de la cuenta, tiene una serie de condiciones
		public void retirar(double extraccion) {
			if(this.cantidad < extraccion) {
				Scanner in = new Scanner(System.in);
				
				System.out.println("ERROR, no tiene suficiente dinero en la cuenta"
						+ "\nSi desea continuar, sé le cobrará un interés"
						+ "\n[1]- Sí"
						+ "\n[2]- No");
				
				System.out.print("Seleccione: ");
				int opcion = in.nextInt();
				
				switch(opcion) {
				
				case 1:
					this.cantidad = 0.0;
					System.out.println("Su cuenta esta a " + this.cantidad);					
					break;
					
				case 2:
					System.out.println("A elegido no extraer dinero, vuelva a acceder cuando lo necesite");	
					break;
					
				default:
					System.out.println("Opción no válida. \nSaldrá de la opción de 'Retirar efectivo'");
				
				}
				in.close();
			}else {
				this.cantidad -= extraccion;
				System.out.println("Ingresos actuales en su cuenta: " + this.cantidad);
			}
		}
		
		
}
