package app;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import pojo.Articulo;
import pojo.Disco;
import pojo.Libro;
import pojo.Pelicula;
import utilidades.Teclado;

public class Principal {

	public static List <Articulo> stock = new ArrayList <Articulo> ();
	
	public static void main(String[] args) throws NumberFormatException, IOException {
				
		Integer opcion = 0;
		
		do {
			System.out.println();
			mostrarMenu();
			System.out.println();
			opcion = Teclado.leerEntero("Elija una opción (0- salir): ");
			switch (opcion) {
				case 1: anadirLibro(); break;
				case 2: anadirPelicula(); break;
				case 3: anadirDisco(); break;
				case 4: mostrarStock(); break;
				case 5: anadirArticulos(); break;
			}
		}while(opcion != 0);
		
		System.out.println("Fin del programa");

	}
	
	public static void mostrarMenu() {
		System.out.println("Menu: \n\t1- Añadir libro \n\t2- Añadir Pelicula \n\t3- Añadir Disco \n\t4- Mostra Lista de Stock");
	}
	
	public static void anadirLibro() throws NumberFormatException, IOException {
		String codigo = Teclado.leerTexto("Introduzca el código del Libro: ");
		Double precio = Teclado.leerDecimal("Introduzca el precio: ");
		String titulo = Teclado.leerTexto("Introduzca el título del libro: ");
		String argumento = Teclado.leerTexto("Introduzca el argumento del libro: ");
		Integer paginas = Teclado.leerEntero("Introduzca el número de páginas del libro: ");
		
		Libro l = new Libro(codigo, precio, titulo, argumento, paginas);
		
		stock.add(l);
	
	}
	
	public static void anadirPelicula() throws NumberFormatException, IOException {
		String codigo = Teclado.leerTexto("Introduzca el código de la Pelicula: ");
		Double precio = Teclado.leerDecimal("Introduzca el precio: ");
		String titulo = Teclado.leerTexto("Introduzca el título de la Pelicula: ");
		String argumento = Teclado.leerTexto("Introduzca el argumento de la Pelicula: ");
		String respuesta = Teclado.leerTexto("Introduzca si es DVD (Si/No): ");
		Boolean esDVD;
		
		if(respuesta.equalsIgnoreCase("si")) {
			esDVD = true;
		}else {
			esDVD = false;
		}
		
		Pelicula p = new Pelicula(codigo, precio, titulo, argumento, esDVD);
		
		stock.add(p);
	}
	
	public static void anadirDisco() throws NumberFormatException, IOException {
		String codigo = Teclado.leerTexto("Introduzca el código del Disco: ");
		Double precio = Teclado.leerDecimal("Introduzca el precio: ");
		String titulo = Teclado.leerTexto("Introduzca el título del Disco: ");
		String respuesta = Teclado.leerTexto("Introduzca si es LP (Si/No): ");
		Boolean esLP;
		
		if(respuesta.equalsIgnoreCase("si")) {
			esLP = true;
		}else {
			esLP = false;
		}
		
		Disco d = new Disco(codigo, precio, titulo, esLP);
		
		stock.add(d);
	}
	
	public static void mostrarStock() {
		if (stock.isEmpty()) {
			System.out.println("La lista está vacia");
		}else {
		System.out.println("Contenido de la lista [" + stock.size() + "] ");
			int cont = 0;
			for (Articulo a : stock) {
				System.out.println((++cont) + "- " + a.toString());
			}
		}
	}
	
	public static void anadirArticulos() {
		
		stock.add(new Libro(123, 25.6, titulo, argumento, paginas));
		stock.add(new Libro(124, 28,3, titulo, argumento, paginas));
		stock.add(new Pelicula(125, 15.3, titulo, argumento, esDVD));
		stock.add(new Pelicula(126, 21.4, titulo, argumento, esDVD));
		stock.add(new Disco(127, 18.4, titulo, esLP));
		stock.add(new Disco(128, 16.3, titulo, esLP));
		
	}

}
