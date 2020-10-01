package POO_2_Herencia_Empleados;

public class Empleados_Uso {	
	public static void main(String[] args) {
		//Creamos objetos
		Empleado_Comercial ec1 = new Empleado_Comercial("Jose", 20, 500.60, 110.2);
		Empleado_Comercial ec2 = new Empleado_Comercial("Alberto", 31, 530.80, 210.2);
		Empleado_Repartidor er1 = new Empleado_Repartidor("Alba", 26, 542.60, "2");
		Empleado_Repartidor er2 = new Empleado_Repartidor("Angela", 20, 480.60, "3");
		
		 //Llamamos a plus
        ec1.plus();
        ec2.plus();
        er1.plus();
        er2.plus();
 
        //Mostramos la informacion
        System.out.println(ec1);
        System.out.println(ec2);
        System.out.println(er1);
        System.out.println(er2);		
	}

}
