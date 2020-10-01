package SWING_Diseño_Interfaces_Graficas;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Image;
import java.awt.Toolkit;

//Se importa
import javax.swing.JFrame;

public class Ej1_PrimerMarco_SWING {
	
	//MAIN
	public static void main(String[] args) {
		MiMarco marco1 = new MiMarco();
		// Para visualizar la ventana
		marco1.setVisible(true);
		
		// Formas de cerrar la ventana. En este caso termina la aplicación
		marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// Cierras pero el programa sigue en ejecución: marco1.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		
	}

}

//Clase SWING
class MiMarco extends JFrame{
	
	//Constructos
	public MiMarco() {
		//setSize(500, 300); 	//Hay mejores maneras de adaptar la resolución a las pantallas
		//setLocation(500, 250); // X, Y (Eje coordenadas cartesiano) / Si es negativo sale de la pantalla
		setBounds(500, 300, 250, 250); //Para todo, primero posición, luego tamaño
		setResizable(false);	// Tamaño fijo
		setTitle("Mi primera ventana");
		
		//Ocupa el tamaño de toda la ventana: setExtendedState(Frame.MAXIMIZED_BOTH);
		
		//Marco de la ventana adaptado y centrado
		Toolkit miPantalla = Toolkit.getDefaultToolkit();
		Dimension tamPantalla = miPantalla.getScreenSize();
		int alturaPantalla = tamPantalla.height;
		int anchuraPantalla = tamPantalla.width;
		setSize(anchuraPantalla/2, alturaPantalla/2);
		//Centrado:
		setLocation(anchuraPantalla/4, alturaPantalla/4);
		
		//Sustitución del icono
		Image miIcono = miPantalla.getImage("img/imgIcono.gif"); //Ruta se parte de la carpeta principal del proyecto
	}
	
}