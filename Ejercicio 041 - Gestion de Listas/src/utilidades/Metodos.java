package utilidades;

import java.io.IOException;
import java.util.Collections;

import principal.Principal;

public class Metodos {
	
	public static void mostrarMenu() {
		
		System.out.println("Menú:" +
							"\n\t1- Mostrar la lista \n\t2- Añadir un elemento más \n\t3- Insertar un elemento más en una posición"
							+ "\n\t4- Buscar y borrar un elemento \n\t5- Borrar un elemento de una posición "
							+ "\n\t6- Editar el elemento de una posición \n\t7- Mostrar el elemento de una posición"
							+ "\n\t8- Añadir varios elementos \n\t9- Borrar la lista \n\t10- Ordenar la lista de forma ascendente"
							+ "\n\t11- Ordenar la lista de forma descendente");
		
		System.out.println();
		
	}
	
	public static void mostrarLista() {
		
		if (Principal.lista.isEmpty()) {
			System.out.println("La lista está vacia");
		}else {
		System.out.println("Contenido de la lista [" + Principal.lista.size() + "] ");
			int cont = 0;
			for (String elemento : Principal.lista) {
				System.out.println((++cont) + "- " + elemento);
			}
		}
		
	}
	
	public static void anadirElemento() throws NumberFormatException, IOException {
		
		String elemento = Teclado.leerTexto("Introduzca el elemento que quiera añadir: ");
		
		Principal.lista.add(elemento);
		
	}
	
	public static void insertarEnPosicion() throws NumberFormatException, IOException {
		
		int indice = Teclado.leerEntero("Introduzca la posición en la que quiera añadir el elemento: ");
		String elemento = Teclado.leerTexto("Introduzca el elemento que quiera añadir: ");
		
		Principal.lista.add(indice, elemento);
		
	}
	
	public static void borrarPorContenido() throws NumberFormatException, IOException {
		
		String elemento = Teclado.leerTexto("Introduzca el elemento que quiera borrar: ");
		
		Principal.lista.remove(elemento);
		
	}
	
	public static void borrarPorPosicion() throws NumberFormatException, IOException {
		
		int indice = Teclado.leerEntero("Introduzca la posición del elemento que quiera borra: ");
				
		Principal.lista.remove(indice);
		
	}
	
	public static void editarElemento() throws NumberFormatException, IOException {
		
		int indice = Teclado.leerEntero("Introduzca la posición del elemento que quiera editar: ");
		String elemento = Teclado.leerTexto("Introduzca el nuevo contenido del elemento: ");
		
		Principal.lista.set(indice, elemento);
		
	}
	
	public static void buscarPorPosicion() throws NumberFormatException, IOException {
		
		int indice = Teclado.leerEntero("Introduzca la posición del elemento que quiera mostrar: ");
		System.out.println("El elemento es: " + Principal.lista.get(indice));		
		
	}

	public static void anadirVarios() {
		Principal.lista.add("España");
		Principal.lista.add("Grecia");
		Principal.lista.add("Portugal");
		Principal.lista.add("Francia");
		Principal.lista.add("Brasil");
		Principal.lista.add("Alemania");
		Principal.lista.add("Argentina");
		Principal.lista.add("Suecia");
		Principal.lista.add("Filipinas");
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
