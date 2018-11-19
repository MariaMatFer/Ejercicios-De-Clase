package utilidades;

import java.io.IOException;
import principal.Principal;

public class Array {

public static void cargarArray (int POS) throws NumberFormatException, IOException {
		
		for (int i = 0; i < (POS-1); i++) {
			Principal.valores[i] = POS + 1;
		}
	}

	
	public static void imprimeArray(int POS) {
		for (int i = 0; i < (POS-1); i++) {
			System.out.println("El valor de la posición " + (i+1) + " es "+ Principal.valores[i]);
		}
	}
	
	public static Integer sumaArray(int POS) {
		int suma = 0; 
		for (int i = 0; i < (POS-1); i++) {
			suma = suma + Principal.valores[i];
		}
		return suma;
	}
	
}
