package app;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import pojo.Circulo;
import pojo.Cuadrado;
import pojo.Figura;
import pojo.Ovalo;
import pojo.Rombo;
import utilidades.Teclado;

public class Principal {
	
	public static List <Figura> lista = new ArrayList <Figura> ();

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		Integer opcion = 0;
		
		do {
			System.out.println();
			mostrarMenu();
			System.out.println();
			opcion = Teclado.leerEntero("Elija una opción (0- salir): ");
			switch (opcion) {
				case 1: anadirCirculo(); break;
				case 2: anadirOvalo(); break;
				case 3: anadirCuadrado(); break;
				case 4: anadirRombo(); break;
				case 5: mostrarLista(); break;
		
			}
		}while(opcion != 0);
		
		System.out.println("Fin del programa");

	}
	
	
	public static void mostrarMenu() {
		System.out.println("Menu: \n\t1- Añadir Circulo \n\t2- Añadir Óvalo \n\t3- Añadir Cuadrado \n\t4- Añadir Rombo \n\t5- Mostra Lista de Figuras");
	}
	
	public static void anadirCirculo() throws NumberFormatException, IOException {
		Double radio = Teclado.leerDecimal("Introduzca el radio del circulo: ");
		lista.add(new Circulo(1.0, 2.0, radio));
	}
	
	public static void anadirOvalo() throws NumberFormatException, IOException {
		Double radioMayor= Teclado.leerDecimal("Introduzca el radio Mayor del Ovalo: ");
		Double radioMenor= Teclado.leerDecimal("Introduzca el radio Menor del Ovalo: ");
		
		lista.add(new Ovalo(1.0, 2.0,radioMayor,radioMenor));
	}
	public static void anadirCuadrado() throws NumberFormatException, IOException {
		Double lado= Teclado.leerDecimal("Introduzca la medida del lado del Cuadrado: ");
		
		lista.add(new Cuadrado(1.0,2.0,4,lado));
	}
	public static void anadirRombo() throws NumberFormatException, IOException {
		Double diagonalMenor = Teclado.leerDecimal("Introduzca la diagonal menor del Rombo: ");
		Double diagonalMayor = Teclado.leerDecimal("Introduzca la diagonal mayor del Rombo: ");
		
		lista.add(new Rombo(1.0,2.0,4,diagonalMenor, diagonalMayor));
	}
	
	public static void mostrarLista() {
		if (lista.isEmpty()) {
			System.out.println("La lista está vacia");
		}else {
		System.out.println("Contenido de la lista [" + lista.size() + "] ");
			int cont = 0;
			for (Figura a : lista) {
				System.out.println((++cont) + "- " + a.toString());
			}
		}
		
	}

}
