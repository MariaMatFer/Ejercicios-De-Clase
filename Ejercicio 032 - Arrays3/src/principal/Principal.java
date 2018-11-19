
/*
 * CREAR UN ARRAY DE NUMEROS DE 100 POSICIONES, QUE CONTENDRÁ LOS NÚMEROS DEL 1 AL 100. OBTEN LA SUMA DE TODOS ELLOS Y LA MEDIA.
 */

package principal;

import java.io.IOException;

import utilidades.Array;

public class Principal {

	public static int [] valores;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		final int POS = 100;
		int media;
		int suma;
		valores = new int [POS];
		
		Array.cargarArray(POS);

		suma = Array.sumaArray(POS);
		media = (suma / POS);
		
		System.out.println("La suma de la matriz es: " + suma);
		System.out.println("La media de la matriz es: " + media);
	}

}
