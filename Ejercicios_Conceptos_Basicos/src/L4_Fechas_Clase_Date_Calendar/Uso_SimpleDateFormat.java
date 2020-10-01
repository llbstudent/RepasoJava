package L4_Fechas_Clase_Date_Calendar;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;



// La clase SimpleDateFormat nos ayuda a mostrar las fechas en el formato que queramos o a reconstruirlas a partir de una cadena de texto.
public class Uso_SimpleDateFormat {
	public static void main(String[] args) {
		//Ej 1
		Date objDate = new Date(); // Sistema actual La fecha y la hora se asignan a objDate 
		 
        System.out.println(objDate); 
        String strDateFormat = "hh: mm: ss a dd-MMM-aaaa"; // El formato de fecha está especificado  
        SimpleDateFormat objSDF = new SimpleDateFormat(strDateFormat); // La cadena de formato de fecha se pasa como un argumento al objeto de formato de fecha  
        System.out.println(objSDF.format(objDate)); // El formato de fecha se aplica a la fecha actual
    
        //Ej 2
        SimpleDateFormat formateador = new SimpleDateFormat("dd/MM/yyyy");
        // Esto muestra la fecha actual en pantalla, más o menos así 26/10/2006
        System.out.println(formateador.format(new Date()));
        
        //EJ3 - Obtener de un String
        String fechaEjemploString = "16/09/1990";
        SimpleDateFormat formateador2 = new SimpleDateFormat("dd/MM/yyyy");
        try
        {
           Date fecha = formateador2.parse(fechaEjemploString);
        }
        catch (ParseException e)
        {
        	System.out.println("Error, la cadena de texto no se puede convertir en fecha.");
        }
		
	}
}
