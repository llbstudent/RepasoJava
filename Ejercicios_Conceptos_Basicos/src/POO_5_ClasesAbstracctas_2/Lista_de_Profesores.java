package POO_5_ClasesAbstracctas_2;

import java.util.ArrayList;
import java.util.Iterator;

public class Lista_de_Profesores {
	//Único campo de la clase
	 private ArrayList <Profesor_ABS> listProfesores;
	 
	 //Constructor
	 public Lista_de_Profesores () {  
		 listProfesores = new ArrayList <Profesor_ABS> ();  
	}

	 //Método Añadir profesor
	 public void addProfesor (Profesor_ABS profesor) {  
		 this.listProfesores.add(profesor);  
	 }

	    
	 //Método para imprimir el listado
	 public void imprimirListin() { 
		 String tmpStr1 = ""; //String temporal que usamos como auxiliar

		 System.out.println ("Se procede a mostrar los datos de los profesores existentes en el listín \n");
		 
		 //for in/each
		 for (Profesor_ABS tmp: this.listProfesores) {
			 System.out.println (tmp.toString () );
			 
			 if (tmp instanceof ProfesorInterino)
				 tmpStr1 = "Interino"; 
			 
			 else
				 tmpStr1 = "Titular";
			 
			 System.out.println("-Tipo de este profesor:"+tmpStr1+" -Nómina de este profesor: "+(tmp.importeNomina())+ "\n");}

	    }
	 
	 	
	 //Importe total de todos los sueldos de los profesores
	 public float importeTotalNominaProfesorado() {
		 float importeTotal = 0f; //Variable temporal que usamos como auxiliar
		 
		 Iterator<Profesor_ABS> it = this.listProfesores.iterator();
		 
		 while (it.hasNext() ) { 
			 importeTotal = importeTotal + it.next().importeNomina(); 
		 }
		 
		 return importeTotal;
	}
}
