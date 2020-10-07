package POO_5_ClasesAbstracctas_2;

//Es una clase abstracta que hereda de otra Clase
//Cómo vemos, puede tener anto métodos normales como abstractos
public abstract class Profesor_ABS extends Persona{
	private String IdProfesor; 

    // Constructores
    public Profesor_ABS() { 
    	super();
    	IdProfesor = "Unknown";   
    } 

    public Profesor_ABS (String nombre, String apellidos, int edad, String id) { 
    	super(nombre, apellidos, edad);   
    	IdProfesor = id; 
    }

    
    // SETTER & GETTER
    public void setIdProfesor (String IdProfesor) { this.IdProfesor = IdProfesor;   }
    public String getIdProfesor () { return IdProfesor;   }

    
    //---------------
    // Métodos
    //---------------
    
    
    //Método normal
    public void mostrarDatos() {
    	System.out.println ("Datos Profesor. Profesor de nombre: " + getNombre() + " " +
    	getApellidos() + " con Id de profesor: " + getIdProfesor() );   
    }

    //SobreEscritura del método 'toString'
    public String toString () { 
    	return super.toString().concat(" -IdProfesor: ").concat(IdProfesor); 
    }

    // Método abstracto
    abstract public float importeNomina ();  
}
