package POO_5_ClasesAbstracctas_2;

public class ProfesorTitular extends Profesor_ABS{

    public ProfesorTitular(String nombre, String apellidos, int edad, String id) {
    	super(nombre, apellidos, edad, id); }

    //Método abstracto sobreEscrito en esta clase
    public float importeNomina () { return 30f * 43.20f; }  

}
