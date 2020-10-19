package T7_ProgramacionGenerica__Clase;

public class Uso_PCG {

	public static void main(String[] args) {
		//Instanciamos PrimeraClaseGenerica
		PrimeraClaseGenerica<String> pcg1 = new PrimeraClaseGenerica<String>();
		pcg1.setTipo("Ana");
		System.out.println(pcg1.getTipo().toString());
		
		//nos creamos una persona
		Persona p1 = new Persona("Ana", 22);
		PrimeraClaseGenerica<Persona> pcg2 = new PrimeraClaseGenerica<Persona>();
		pcg2.setTipo(p1);
		System.out.println(pcg2.getTipo().toString());
	}

}
