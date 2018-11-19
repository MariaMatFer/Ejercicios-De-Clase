package utilidades;

import java.io.IOException;
import principal.Principal;

public class Array {

public static void cargarArray (int POS) throws NumberFormatException, IOException {
		
		for (int i = 0; i < (POS-1); i++) {
			Principal.posiciones[i] = Teclado.leerEntero("Introduzca un valor entero para la posicion " + (i+1) +  ": ");
		}
	}

	
	public static void imprimeArray(int POS) {
		for (int i = 0; i < (POS-1); i++) {
			System.out.println("El valor de la posición " + (i+1) + " es "+ Principal.posiciones[i]);
		}
	}
}
