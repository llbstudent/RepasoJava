package POO_5_ClasesAbstracctas_2;

import java.util.Calendar;

public class ProfesorInterino extends Profesor_ABS{
	private Calendar fechaComienzoInterinidad;
	
	// Constructores
	public ProfesorInterino (Calendar fechaInicioInterinidad) {
		super();
		fechaComienzoInterinidad = fechaInicioInterinidad; 
	}

    public ProfesorInterino (String nombre, String apellidos, int edad, String id, Calendar fechaInicioInterinidad) {
    	super(nombre, apellidos, edad, id);
    	fechaComienzoInterinidad = fechaInicioInterinidad; 
    }

    //Getters
    public Calendar getFechaComienzoInterinidad () { return fechaComienzoInterinidad; } //Método

    //-------------
    //Métodos
    //-------------
    
    //SobreEscritura de 'toString()
    public String toString () {
    	return super.toString().concat (" Fecha comienzo interinidad: ")
    			.concat (fechaComienzoInterinidad.getTime().toString()); 
    }

    
    //Método abstracto sobreEscrito
	@Override
	public float importeNomina() {
		 return 30f * 35.60f ;
	}
}
