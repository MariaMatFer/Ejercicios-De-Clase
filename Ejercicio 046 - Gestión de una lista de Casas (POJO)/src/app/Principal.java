
/*
 * CREAR UN PROGRAMA QUE PERMITA MEDIANTE UN MENU DE OPCIONES, PERMITA LA GESTI�N DE UNA LISTA. TENDR� LA SIGUIENTE ESTRUCTURA:
 * 
 * 		MENU:
 * 			1- MOSTRAR LA LISTA
 * 			2- A�ADIR UN ELEMENTO M�S
 * 			3- INSERTAR UN ELEMENTO EN UNA POSICI�N 
 * 			4- BUSCAR Y BORRAR UN ELEMENTO
 * 			5- BORRAR UN ELEMENTO DE UNA POSICI�N
 * 			6- EDITAR EL ELEMENTO DE UNA POSICI�N
 * 			7- MOSTRAR EL ELEMENTO DE UNA POSICI�N
 * 			0- SALIR
 * 
 * 		OPCI�N:
 * 
 */

package app;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import pojo.Casa;
import utilidades.Metodos;
import utilidades.Teclado;

public class Principal {
	
	public static List <Casa> lista;

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		lista = new ArrayList <Casa> ();
		
		Integer opcion = 0;
		
		do {
			System.out.println();
			Metodos.mostrarMenu();
			System.out.println();
			opcion = Teclado.leerEntero("Elija una opci�n (0- salir): ");
			switch (opcion) {
				case 1: Metodos.mostrarLista(); break;
				case 2: Metodos.anadirElemento(); break;
				case 3: Metodos.insertarEnPosicion(); break;
				case 4: Metodos.borrarPorContenido(); break;
				case 5: Metodos.borrarPorPosicion(); break;
				case 6: Metodos.editarElemento(); break;
				case 7: Metodos.buscarPorPosicion(); break;
				case 8: Metodos.anadirVarios(); break;
				case 9: Metodos.borrarLista(); break;
				case 10: Metodos.ordenarListaAscendente(); break;
				case 11: Metodos.ordenarListaDescendente(); break;
			}
		}while(opcion != 0);
		
		System.out.println("Fin del programa");

	}

}
