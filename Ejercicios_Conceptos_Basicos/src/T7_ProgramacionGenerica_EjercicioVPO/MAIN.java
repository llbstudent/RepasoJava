package T7_ProgramacionGenerica_EjercicioVPO;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import T6_Collections_ArrayList_Iterator.Empleado;

/********************************************************************
 * DESCRIPCI�N EJERCICIO
 * ********************************************************************
 * Implementa una aplicaci�n que permita sortear las viviendas de protecci�n
 * oficial entre una serie de aspirantes, que podr�n ser organizaciones o
 * personas. De las organizaciones de vecinos y deberemos saber el nombre y nif.
 * Las viviendasdeben ser de tipo vecinal (s�lo existen tres: La granja,
 * Barriada Espa�a y El Pelir�n. El nif te lo inventas.)
 * 
 * Sobre las personas se necesita saber el dni y el nombre y podr�n ser el tipo:
 * sin hijos, con hijos, minusv�lido. A su vez las viviendas podr�n ser casas o
 * pisos. Estar�n identificadas por el n� de registro y la direcci�n.
 * 
 * Tendremos dos conjuntos separados de aspirantes y viviendas que se sortear�n.
 * El resultado del sorteo se guardar� en una lista de ganadores, d�nde la clase
 * ganador ser�: Ganador<T,E>, emparejando vivienda y propietario. Las prioridad
 * a la hora de asignar viviendas ser� a personas con hijos, despu�s a
 * minusv�lidos y por ultimo a personas sin hijos.
 * 
 * Implementa una excepci�n llamada NotNullDNI que permita gestionar una
 * excepci�n en caso de que la el par�metro String en el constructor de Persona
 * est� vac�o. Controla tambi�n que en la clase principal una excepci�n de tipo
 * NullPointerException sea tratada dando un mensaje informativo de lo que ha
 * sucedido. Ambas excepciones ser�n capturadas en el main
 **/
public class MAIN {
	public static void main(String[] args) {
		// Nos creamos las viviendas que se sortearan
		ArrayList<Vivienda> viviendasLST = new ArrayList<Vivienda>();
		viviendasLST.add(new Vivienda(154, "AVDA del Olivo", Enum_TipoVivienda.Casa));
		viviendasLST.add(new Vivienda(457, "AVDA del Mar", Enum_TipoVivienda.Piso));
		viviendasLST.add(new Vivienda(144, "AVDA de la Gaviota", Enum_TipoVivienda.Casa));
		viviendasLST.add(new Vivienda(444, "AVDA del Topo", Enum_TipoVivienda.Piso));

		// Nos creamos a los aspirantes
		// 1- Organizaciones
		ArrayList<Aspirante_Organizacion> organizaciones = new ArrayList<Aspirante_Organizacion>();
		organizaciones.add(new Aspirante_Organizacion("TRL", "11554778", Enum_TipoVecinal.Barriada_Espa�a));
		organizaciones.add(new Aspirante_Organizacion("MSF", "54985778", Enum_TipoVecinal.El_Peliron));
		organizaciones.add(new Aspirante_Organizacion("Parados LD", "15477678", Enum_TipoVecinal.La_Granja));

		// 2-Personas (Ordenadas ya por preferencia)
		ArrayList<Aspirante_Persona> personas = new ArrayList<Aspirante_Persona>();
		personas.add(new Aspirante_Persona("45789655J", "Juan Mordaz", Enum_TipoPersona.Con_Hijos));
		personas.add(new Aspirante_Persona("45571165H", "Francisco Ferrera", Enum_TipoPersona.Minusvalido));
		personas.add(new Aspirante_Persona("45896331O", "Pablo Piqueras", Enum_TipoPersona.Sin_Hijos));
		personas.add(new Aspirante_Persona("32126687Y", "Bernardo D�az", Enum_TipoPersona.Sin_Hijos));

		// Desordenamos las viviendas, organizaciones y personas
		Collections.shuffle(viviendasLST);
		Collections.shuffle(organizaciones);
		Collections.shuffle(personas);

		// Aqu� guardaremos a los ganadores
		ArrayList<Ganador> lstGanadores = new ArrayList<Ganador>();

		sorteo_de_Viviendas_por_Prioridad(lstGanadores, personas, organizaciones, viviendasLST);

		// Ver la lista de ganadores
		verListaGanadores(lstGanadores);

	}

	private static void sorteo_de_Viviendas_por_Prioridad(ArrayList<Ganador> lstGanadores, ArrayList<Aspirante_Persona> personas, 
		ArrayList<Aspirante_Organizacion> organizaciones, ArrayList<Vivienda> viviendasLST) {

		// Recorremos las viviendas a sortear con un iterador
		for (int i = 0, cond = 1; i < viviendasLST.size() && cond < 4; i++) {
			for (int j = 0; j < personas.size(); j++) {
				switch (cond) {
				case 1:
					if (personas.get(j).getTipo().equals(Enum_TipoPersona.Con_Hijos)) {
						lstGanadores.add(new Ganador<Vivienda, Aspirante_Persona>(viviendasLST.get(i), personas.get(j)));
						personas.remove(j);
					}
					if (j == personas.size() - 1)
						cond++;
					break;

				case 2:
					if (personas.get(j).getTipo().equals(Enum_TipoPersona.Minusvalido)) {
						lstGanadores.add(new Ganador<Vivienda, Aspirante_Persona>(viviendasLST.get(i), personas.get(j)));
						personas.remove(j);
					}
					if (j == personas.size() - 1)
						cond++;
					break;

				case 3:
					List<Aspirante> restoaspirantes = new ArrayList<Aspirante>();
					restoaspirantes.addAll(personas);
					restoaspirantes.addAll(organizaciones);
					Collections.shuffle(restoaspirantes);

					lstGanadores.add(new Ganador(viviendasLST.get(i), restoaspirantes.get(0)));
					//viviendasLST.remove(i);
					//personas.remove(j);
					break;
				}
			}
		}
		viviendasLST.clear();
	}

	private static void verListaGanadores(ArrayList<Ganador> lstGanadores) {
		Iterator<Ganador> miIter = lstGanadores.iterator();
		
		while(miIter.hasNext()) {
			Ganador ganador = miIter.next();
			System.out.println("\n\n***************************************************"
					+ "\n" + ganador.toString());
		}
	}
	
}
