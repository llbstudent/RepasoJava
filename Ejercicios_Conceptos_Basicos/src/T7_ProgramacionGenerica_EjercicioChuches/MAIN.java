package T7_ProgramacionGenerica_EjercicioChuches;

public class MAIN {
	public static void main(String[] args) {
		Bolsa<Chocolatina> bolsa = new Bolsa<Chocolatina>(0);
		Chocolatina c = new Chocolatina("milka");
		Chocolatina c1 = new Chocolatina("milka");
		Chocolatina c2 = new Chocolatina("ferrero");
		bolsa.add(c);
		bolsa.add(c1);
		bolsa.add(c2);
		for (Chocolatina chocolatina : bolsa) {
			System.out.println(chocolatina.getMarca());
		}
	}

}
