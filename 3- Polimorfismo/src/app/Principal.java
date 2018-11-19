package app;

import java.util.ArrayList;
import java.util.List;

import pojo.Articulo;
import pojo.Disco;
import pojo.Libro;
import pojo.Pelicula;

public class Principal {

	public static void main(String[] args) {
		
		List <Articulo> stock = new ArrayList <Articulo>();
		
		Libro l1 = new Libro("123", 45.5, "Lo que el viento se llevó", "uyyyy", 1576);
		
		Libro l2 = new Libro("124", 120.75, "El nombre de la rosa", "Carmensita", 700);
		
		Pelicula p1 = new Pelicula("125", 25.8, "Tiburon", "uyyyy", true);
		
		Disco d1 = new Disco("126", 15.2, "OT", true);
		
		//Ahora tenemos que añadir esos libros y pelicula dentro de la lista de articulos.
		//Esto se puede hacer ya que, aunque son clases distintas, al estar relacionadas (HERENCIA), se puede añadir
		//Ya que en el fondo los libros son articulos, al igual que las peliculas
		
		stock.add(l1);
		stock.add(l2);
		stock.add(p1);
		stock.add(d1);
		
		for(Articulo a : stock) {
			System.out.println(a.getPrecio());
		}
		
		//Tambien podemos ver si cada uno de los articulos es libro o no, por ejemplo.
		System.out.println();
		
		for (Articulo a : stock) {
			System.out.println( a instanceof Libro);
			System.out.println( a.getPrecio());
		}
		
		//Si queremos ver las paginas concretas de los libros, no podemos verlo, ya que en la lista almacenamos Articulos
		// y los articulos no dispone del atributo paginas, ya que ese atributo es de su hija Libro.
		//Pero podemos hacerlo de la siguiente manera:
		System.out.println();
		
		for (Articulo a : stock) {
			
			if(a instanceof Libro) {
				((Libro) a).getPaginas();  	//Esto lo que hace es tratar a "a" como un objeto de Libro, por lo tanto
											//podemos acceder a todo los atributos de Libro.
			}	
		}
		
		//Esto lo podemos hacer con todos los objetos de la lista
		System.out.println();
		
		for (Articulo a : stock) {
			
			if(a instanceof Libro) {
				System.out.println("Libro " + ((Libro) a).getPaginas());  	
			}
			if(a instanceof Pelicula) {
				System.out.println("Pelicula " + ((Pelicula) a).isEsDVD());  	
			}
			if(a instanceof Disco) {
				System.out.println("Disco " + ((Disco) a).isEsLP());  	
			}
			
		}
		

	}

}
