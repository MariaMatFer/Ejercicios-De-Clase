package utilidades;

import java.io.IOException;
import java.util.Collections;

import pojo.Casa;
import app.Principal;

public class Metodos {
	
	public static void mostrarMenu() {
		
		System.out.println("Men�:" +
							"\n\t1- Mostrar la lista \n\t2- A�adir un elemento m�s \n\t3- Insertar un elemento m�s en una posici�n"
							+ "\n\t4- Buscar y borrar un elemento \n\t5- Borrar un elemento de una posici�n "
							+ "\n\t6- Editar el elemento de una posici�n \n\t7- Mostrar el elemento de una posici�n"
							+ "\n\t8- A�adir varios elementos \n\t9- Borrar la lista \n\t10- Ordenar la lista de forma ascendente"
							+ "\n\t11- Ordenar la lista de forma descendente");
		
		System.out.println();
		
	}
	
	public static void mostrarLista() {
		
		if (Principal.lista.isEmpty()) {
			System.out.println("La lista est� vacia");
		}else {
		System.out.println("Contenido de la lista [" + Principal.lista.size() + "] ");
			int cont = 0;
			for (Casa elemento : Principal.lista) {
				System.out.println((++cont) + "- " + elemento.toString());
			}
		}
		
	}
	
	public static Casa preguntarDatos() throws NumberFormatException, IOException {
		String calle;
		Integer numero;
		Double superficie;
		
		calle = Teclado.leerTexto("Introduzca el nombre de la calle: ");
		numero = Teclado.leerEntero("Introduzca el numero de la casa: ");
		superficie = Teclado.leerDecimal("Introduzca la superficie de la casa: ");
		
		Casa c = new Casa(calle, numero, superficie);
		return c;
		
	}
	
	public static void anadirElemento() throws NumberFormatException, IOException {

		Principal.lista.add(preguntarDatos());
		
	}
	
	public static void insertarEnPosicion() throws NumberFormatException, IOException {
		
		int indice = Teclado.leerEntero("Introduzca la posici�n en la que quiera a�adir el elemento: ");
		Casa o = preguntarDatos();

		Principal.lista.add(indice, o);
		
	}
	
	public static void borrarPorContenido() throws NumberFormatException, IOException {
		
		Casa c = preguntarDatos();
		for(int i= 0; i < Principal.lista.size(); i++) {
			if(Principal.lista.get(i).compareTo(c)==0) {
				Principal.lista.remove(i);
			}
		}		
	}
	
	public static void borrarPorPosicion() throws NumberFormatException, IOException {
		
		int indice = Teclado.leerEntero("Introduzca la posici�n del elemento que quiera borra: ");
				
		Principal.lista.remove(indice);
		
	}
	
	public static void editarElemento() throws NumberFormatException, IOException {
		
		int indice = Teclado.leerEntero("Introduzca la posici�n del elemento que quiera editar: ");
		Casa o = preguntarDatos();
		
		Principal.lista.set(indice, o);
		
	}
	
	public static void buscarPorPosicion() throws NumberFormatException, IOException {
		
		int indice = Teclado.leerEntero("Introduzca la posici�n del elemento que quiera mostrar: ");
		System.out.println("El elemento es: " + Principal.lista.get(indice-1));		
		
	}

	public static void anadirVarios() {
		Principal.lista.add(new Casa ("Sol",12, 60.0));
		Principal.lista.add(new Casa ("Estrella",34, 60.0));
		Principal.lista.add(new Casa ("Sol",45, 60.0));
		Principal.lista.add(new Casa ("J�piter",13, 60.0));
		Principal.lista.add(new Casa ("Urano",27, 60.0));
		Principal.lista.add(new Casa ("Sol",7, 60.0));
		Principal.lista.add(new Casa ("Urano",4, 60.0));
		Principal.lista.add(new Casa ("J�piter",48, 60.0));
		Principal.lista.add(new Casa ("Estrella",23, 60.0));
	}
	
	public static void borrarLista() {
		Principal.lista.clear();
	}
	
	public static void ordenarListaAscendente() {
		Collections.sort(Principal.lista);
	}
	
	public static void ordenarListaDescendente() {
		Collections.sort(Principal.lista);
		Collections.reverse(Principal.lista);
	}
	
}
