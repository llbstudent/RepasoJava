package POO_5_ClasesAbstracctas_2;

import java.util.Calendar;

public class UsoListaProfesores {

	public static void main(String[] args) {
		//Fecha a�o lectivo
		Calendar fecha1 = Calendar.getInstance();
        fecha1.set(2019,10,22); //Los meses van de 0 a 11, luego 10 representa noviembre

        //Profesores interinos
        ProfesorInterino pi1 = new ProfesorInterino("Jos�", "Hern�ndez L�pez", 45, "45221887-K", fecha1);
        ProfesorInterino pi2 = new ProfesorInterino("Andr�s", "Molt� Parra", 87, "72332634-L", fecha1);
        ProfesorInterino pi3 = new ProfesorInterino ("Jos�", "R�os Mesa", 76, "34998128-M", fecha1);

        //Profesores titulares
        ProfesorTitular pt1 = new ProfesorTitular ("Juan", "P�rez P�rez", 23, "73-K");
        ProfesorTitular pt2 = new ProfesorTitular ("Alberto", "Centa Mota", 49, "88-L");
        ProfesorTitular pt3 = new ProfesorTitular ("Alberto", "Centa Mota", 49, "81-F");

        //Nos creamos el listado
        Lista_de_Profesores listinProfesorado = new Lista_de_Profesores ();

        //Aadimos interionos y titulares
        listinProfesorado.addProfesor (pi1); listinProfesorado.addProfesor(pi2); listinProfesorado.addProfesor (pi3);
        listinProfesorado.addProfesor (pt1); listinProfesorado.addProfesor(pt2); listinProfesorado.addProfesor (pt3);
        listinProfesorado.imprimirListin();

        //Imprimimos todas las n�minas
        System.out.println ("El importe de las n�minas del profesorado que consta en el list�n es " +
        listinProfesorado.importeTotalNominaProfesorado()+ " euros");

	}

}
