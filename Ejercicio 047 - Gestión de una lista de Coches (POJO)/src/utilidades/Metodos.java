package utilidades;

import java.io.IOException;
import java.util.Collections;

import pojo.Coche;
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
			for (Coche elemento : Principal.lista) {
				System.out.println((++cont) + "- " + elemento.toString());
			}
		}
		
	}
	
	public static Coche preguntarDatos() throws NumberFormatException, IOException {
		String marca;
		Integer potencia;
		Boolean esGasolina = false;
		String respuesta;
		
		marca = Teclado.leerTexto("Introduzca el nombre de la marca: ");
		respuesta = Teclado.leerTexto ("Introduzca si es Gasolina (Si/No): ");
		
		esGasolina=(respuesta.equalsIgnoreCase("si"))?true:false;
		
		potencia = Teclado.leerEntero("Introduzca la potencia: ");
		
		Coche c = new Coche(marca, esGasolina, potencia);
		return c;
		
	}
	
	public static void anadirElemento() throws NumberFormatException, IOException {

		Principal.lista.add(preguntarDatos());
		
	}
	
	public static void insertarEnPosicion() throws NumberFormatException, IOException {
		
		int indice = Teclado.leerEntero("Introduzca la posici�n en la que quiera a�adir el elemento: ");
		Coche o = preguntarDatos();

		Principal.lista.add(indice, o);
		
	}
	
	public static void borrarPorContenido() throws NumberFormatException, IOException {
		
		Coche c = preguntarDatos();
		for(int i= 0; i < Principal.lista.size(); i++) {
			if(Principal.lista.get(i).compareTo(c)==0) {
				Principal.lista.remove(i);
			}
		}		
	}
	
	public static void borrarPorPosicion() throws NumberFormatException, IOException {
		
		int indice = Teclado.leerEntero("Introduzca la posici�n del elemento que quiera borrar: ");
				
		Principal.lista.remove(indice-1);
		
	}
	
	public static void editarElemento() throws NumberFormatException, IOException {
		
		int indice = Teclado.leerEntero("Introduzca la posici�n del elemento que quiera editar: ");
		Coche o = preguntarDatos();
		
		Principal.lista.set(indice, o);
		
	}
	
	public static void buscarPorPosicion() throws NumberFormatException, IOException {
		
		int indice = Teclado.leerEntero("Introduzca la posici�n del elemento que quiera mostrar: ");
		System.out.println("El elemento es: " + Principal.lista.get(indice-1));		
		
	}

	public static void anadirVarios() {
		Principal.lista.add(new Coche ("Ford Focus",true, 350));
		Principal.lista.add(new Coche ("Nissan 370Z",true, 328));
		Principal.lista.add(new Coche ("Honda Civic",false,  320));
		Principal.lista.add(new Coche ("SEAT Le�n",false, 300));
		Principal.lista.add(new Coche ("Ford Focus",true, 470));
		Principal.lista.add(new Coche ("SEAT Le�n",false, 380));
		Principal.lista.add(new Coche ("Audi A1",false, 256));
		Principal.lista.add(new Coche ("Renault M�gane",true, 230));
		Principal.lista.add(new Coche ("Honda Civic",false, 410));
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
