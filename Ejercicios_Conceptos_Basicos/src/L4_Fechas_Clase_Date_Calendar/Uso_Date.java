package L4_Fechas_Clase_Date_Calendar;

import java.text.ParseException;
import java.text.SimpleDateFormat;
// Lo importamos
import java.util.Date;

public class Uso_Date {

	public static void main(String[] args){
		// Obtenemos la fecha actual del sistema
		Date fechaActual = new Date();
		System.out.println(fechaActual);
		
		//Formateador para las fechas
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		String fechaStrg = sdf.format(fechaActual); //En string
		
		try {
			Date fechaActualFormat = new SimpleDateFormat("dd/MM/yyyy").parse(fechaStrg);
		} catch (ParseException e) {
			System.out.println("Error en transformar la fecha");
		}  
	}

}
