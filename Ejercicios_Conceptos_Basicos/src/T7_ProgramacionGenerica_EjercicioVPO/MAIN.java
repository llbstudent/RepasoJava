package T7_ProgramacionGenerica_EjercicioVPO;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import T6_Collections_ArrayList_Iterator.Empleado;

/********************************************************************
 * DESCRIPCIÓN EJERCICIO
 * ********************************************************************
 * Implementa una aplicación que permita sortear las viviendas de protección
 * oficial entre una serie de aspirantes, que podrán ser organizaciones o
 * personas. De las organizaciones de vecinos y deberemos saber el nombre y nif.
 * Las viviendasdeben ser de tipo vecinal (sólo existen tres: La granja,
 * Barriada España y El Pelirón. El nif te lo inventas.)
 * 
 * Sobre las personas se necesita saber el dni y el nombre y podrán ser el tipo:
 * sin hijos, con hijos, minusválido. A su vez las viviendas podrán ser casas o
 * pisos. Estarán identificadas por el nº de registro y la dirección.
 * 
 * Tendremos dos conjuntos separados de aspirantes y viviendas que se sortearán.
 * El resultado del sorteo se guardará en una lista de ganadores, dónde la clase
 * ganador será: Ganador<T,E>, emparejando vivienda y propietario. Las prioridad
 * a la hora de asignar viviendas será a personas con hijos, después a
 * minusválidos y por ultimo a personas sin hijos.
 * 
 * Implementa una excepción llamada NotNullDNI que permita gestionar una
 * excepción en caso de que la el parámetro String en el constructor de Persona
 * esté vacío. Controla también que en la clase principal una excepción de tipo
 * NullPointerException sea tratada dando un mensaje informativo de lo que ha
 * sucedido. Ambas excepciones serán capturadas en el main
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
		organizaciones.add(new Aspirante_Organizacion("TRL", "11554778", Enum_TipoVecinal.Barriada_España));
		organizaciones.add(new Aspirante_Organizacion("MSF", "54985778", Enum_TipoVecinal.El_Peliron));
		organizaciones.add(new Aspirante_Organizacion("Parados LD", "15477678", Enum_TipoVecinal.La_Granja));

		// 2-Personas (Ordenadas ya por preferencia)
		ArrayList<Aspirante_Persona> personas = new ArrayList<Aspirante_Persona>();
		personas.add(new Aspirante_Persona("45789655J", "Juan Mordaz", Enum_TipoPersona.Con_Hijos));
		personas.add(new Aspirante_Persona("45571165H", "Francisco Ferrera", Enum_TipoPersona.Minusvalido));
		personas.add(new Aspirante_Persona("45896331O", "Pablo Piqueras", Enum_TipoPersona.Sin_Hijos));
		personas.add(new Aspirante_Persona("32126687Y", "Bernardo Díaz", Enum_TipoPersona.Sin_Hijos));

		// Desordenamos las viviendas, organizaciones y personas
		Collections.shuffle(viviendasLST);
		Collections.shuffle(organizaciones);
		Collections.shuffle(personas);

		// Aquí guardaremos a los ganadores
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
