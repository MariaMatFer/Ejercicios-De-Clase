package utilidades;

import java.io.IOException;
import principal.Principal;

public class Array {

public static void cargarArray (int POS) throws NumberFormatException, IOException {
		
		for (int i = 0; i < (POS-1); i++) {
			Principal.matriz[i] = (int) (Math.random() * 10);
		}
	}

	
	public static void imprimeArray(int POS) {
		for (int i = 0; i < (POS-1); i++) {
			System.out.println("El valor de la posici�n " + (i+1) + " es "+ Principal.matriz[i]);
		}
	}
	
	public static void sumaArray(int POS) {
		int suma = 0; 
		for (int i = 0; i < (POS-1); i++) {
			suma = suma + Principal.matriz[i];
		}
		System.out.println("La suma de la matriz es: " + suma);
	}
}
