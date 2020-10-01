package SWING_Diseño_Interfaces_Graficas;

import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Clase_Graphics {
	//MAIN
	public static void main(String[] args) {
		MarcoConDibujos mcd = new MarcoConDibujos();
		mcd.setVisible(true);
		mcd.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

//El marco
class MarcoConDibujos extends JFrame{
	
	//Constructor
	MarcoConDibujos(){
		setTitle("Prueba de dibujo");
		setSize(400, 400);
		setLocation(500, 250);
		
		LaminaConFiguras lamina = new LaminaConFiguras();
		add(lamina);
	}
	
}

//Láminas
class LaminaConFiguras extends JPanel {
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawRect(30, 30, 80, 100);
		g.drawLine(50, 280, 300, 100); //X/Y del Primer Punto y del segundo punto
	}
	
}
