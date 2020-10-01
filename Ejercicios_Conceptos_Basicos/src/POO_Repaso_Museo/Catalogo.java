import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

/*
 Se desea que nuestro catalogo pueda recoger, aparte de inventario y autor
 otro tipo de articulos
 Tendra una serie de metodos
*/

public class Catalogo{
	/**
	* Atributo -> Lista de objetos de la clase Obras
	*/
	private List<Obras> catalogo;

	
	/**
	* Constructor por defecto
	*/
	Catalogo(){
		this.catalogo = new ArrayList<>();
	}


	/**
	* Metodo que nos añade una obra
	* Recorremos el listado de obras para comprobar si la que vamos a insertar 
	* ya existe dentro del catalogo
	*@param Obras obra
	*/
	public void annadeObras(Obras obra){
		boolean existe_obra = false;
		//Recorremos
		for(int i=0; i < this.catalogo.size(); i++){
			//Comparacion
			if(this.catalogo.get(i).getTitulo().equalsIgnoreCase(obra.getTitulo()) && 
					this.catalogo.get(i).getAutor().equalsIgnoreCase(obra.getAutor()) ){
				existe_obra = true;

			}else{
				existe_obra = false;
			}
		}
		//Comprobacion
		if(existe_obra){
			System.out.println("La obra ya existe");
		
		}else{
			this.catalogo.add(obra);
		}
	}
		

	/**
	* Metodo que nos elimina una obra dado su numero de inventario
	* Tiene una Excepcion por si no se encuentra el numero dentro
	*@param int num_inventario
	*/
	public void eliminaObra(int num_inventario) throws MiExcepcionObras{
		for(int i=0; i < this.catalogo.size(); i++){
			if(num_inventario != this.catalogo.get(i).getNumeroinventario()){
				throw new MiExcepcionObras("No coincide el numero de inventario con " + 
					"las obras del catalogo");
			}else{
				this.catalogo.remove(this.catalogo.get(i));
			}
		}
	}


	/**
	* Metodo que nos busca una obra dado su numero de inventario
	* Tiene una Excepcion por si no se encuentra la obra
	*@param int num_inventario
	*/
	public Obras buscaObra(int num_inventario) throws MiExcepcionObras{
		for(int i=0; i < this.catalogo.size(); i++){
			if(num_inventario == this.catalogo.get(i).getNumeroinventario()){
				return this.catalogo.get(i);
			}
		}

		throw new MiExcepcionObras("Esta obra no se encuentra en el catalogo");
	}

	/**
	* Metodo que nos calculara la suma de las superficies de la clase pintura
	*@return int suma_superficie
	*/
	public int superficie(){
		int suma_superficie = 0;
		//Recorrer
		for(int i=0; i < this.catalogo.size(); i++){
			if(this.catalogo.get(i) instanceof Pinturas){
				Pinturas p_auxiliar = (Pinturas)this.catalogo.get(i);
				suma_superficie += p_auxiliar.getDimensiones();
				/* Es lo mismo
				* suma_superficie += ((Pinturas) this.catalogo.get(i)).getDimensiones();
				*/
			}
		}
		return suma_superficie;
	}

	/**
	* Metodo cuentaMaterial, nos devuelve cuantas esculturas hay de ese material
	*@param String material 
	*/
	public int cuentaMaterial(String material){
		int contador = 0;
		for(int i=0; i < this.catalogo.size(); i++){
			if(this.catalogo.get(i) instanceof Esculturas){
				Esculturas escultura_auxiliar = (Esculturas)this.catalogo.get(i);
				//Condicion
				if( escultura_auxiliar.getInformacion_Material().equalsIgnoreCase(material) ){
					contador++;
				}
			}
			
		}
		return contador;

	}

	/**
	* Metodo que muestra las obras del catalgo
	*/
	public void mostrar() throws MiExcepcionObras{
    	for(int i=0; i < this.catalogo.size(); i++){
    		//En funcion del tipo de la obra
    		if(catalogo.get(i) instanceof Esculturas){
    			Esculturas e_auxiliar = (Esculturas)catalogo.get(i);
    			System.out.println(e_auxiliar.toString());
    			
    		}else if(catalogo.get(i) instanceof Pinturas){
    			Pinturas p_auxiliar = (Pinturas)catalogo.get(i);
    			System.out.println(p_auxiliar.toString());
    		
    		}else{
    			throw new MiExcepcionObras("Obra no encontrada");
    		}
    	}
	}

}