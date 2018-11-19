
/*
 * PEDIR AL USUARIO CINCO NOMBRES, AÑADIRLO A UNA PILA Y LUEGO ELIMINAR TRES DE ELLOS
 */

package principal;

import java.io.IOException;
import java.util.Stack;

import utilidades.Teclado;

public class Principal {

	static Stack <String> nombres = new Stack <String> ();
	
	static final int nombresIntroducir = 5;
	
	public static void main(String[] args) throws IOException {
		
		int n;
		
		introducirNombres(nombresIntroducir);
		System.out.println(nombres);

		n = Teclado.leerEntero("\n¿Cuántos nombres desea eliminar?: (max. " + (nombres.size())+ ") ");
		
		borrarNombres(n);
		System.out.println(nombres);

	}
	
	
		//METODOS DEL PROGRAMA
	
	private static void introducirNombres(int nombresIntroducir) throws IOException {
		for (int i = 0; i < nombresIntroducir; i++) {
			nombres.push(Teclado.leerTexto("Introduzca un nombre: "));
		}
	}
	
	private static void borrarNombres(int n) throws NumberFormatException, IOException {
		String nombre;
		for(int i = 0; i < n; i++) {
			nombre = nombres.pop();
			System.out.println("Has eliminado a: " + nombre);
		}
	}

}
