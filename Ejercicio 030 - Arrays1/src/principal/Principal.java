
/*
 * CREAR UN ARRAY DE 10 POSICIONES DE NUMEROS ENTEROSCON VALORES PEDIDOS POR TECLADO. MUESTRA POR CONSOLA ELINDICE Y EL VALOR 
 * AL QUE CORRESPONDE. HAZ DOS MÉTODOS, UNO PARA RELLENAR VALORES Y OTRO PARA MOSTRAR. EJ: EN LA POSICION 1 ESTA EL VALOR TAL
 */

package principal;

import java.io.IOException;

import utilidades.Array;

public class Principal {
	
	public static int [] posiciones;
	final static int POS = 10;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		posiciones = new int [POS];
		
		Array.cargarArray(POS);
		Array.imprimeArray(POS);
	}	
}
