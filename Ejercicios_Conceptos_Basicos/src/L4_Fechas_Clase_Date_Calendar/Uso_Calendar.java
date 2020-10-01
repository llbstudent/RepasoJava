package L4_Fechas_Clase_Date_Calendar;

// Lo primero es importar la clase Calendar.
/* la clase Calendar es una clase abstracta (No se puede instanciar. ¡¡NO new Calendar();!!) 
 * nos sirve para convertir entre un objeto de tipo Date (java.util.Date) 
 * y un conjunto de campos enteros como YEAR (año), MONTH (mes), DAY (día), HOUR (hora), etc.*/
import java.util.Calendar;
import java.util.GregorianCalendar;

/*
 * Calendar es una clase abstracta, por lo que no podemos hacer un new de ella. 
 * La forma de obtener una instancia es llamando al método getInstance(), 
 * que nos devolverá alguna clase hija de Calendar inicializada con la fecha/hora actual.
 * */
public class Uso_Calendar {

	public static void main(String[] args) {
		// Ej 1
		Calendar today = Calendar.getInstance();
		System.out.println("Hoy es " + today.getTime());
		// Hoy es Wed Jul 29 10:37:57 CEST 2020

		// --------------------
		// Ej 2
		// Tenemos 2 maneras de crear un objeto calendar
		// Forma 1:
		Calendar fecha1 = Calendar.getInstance();
		fecha1.set(2016, 6, 3);
		// Forma 2 (GregorianCalendar es hija de Calendar):
		Calendar fecha2 = new GregorianCalendar(2016, 7, 5);

		//----------------------
		// Para mostrar la fecha como hacíamos con Date, necesitamos usar el método
		// getTime().
		Calendar fecha3 = Calendar.getInstance();
		fecha3.set(2016, 6, 3, 10, 5, 6);
		System.out.println(fecha3.getTime());

		//----------------------
		// En Calendar, podemos modificar cada elemento de la siguiente forma:
		Calendar fecha4 = Calendar.getInstance();

		fecha4.set(Calendar.YEAR, 2014);
		fecha4.set(Calendar.MONTH, 10); // los meses empiezan en '0' - 10 es Noviembre
		fecha4.set(Calendar.DATE, 20);

	}

}
