
/*
 * CREAR UN ARRAY DE NUMEROS DONDE LE INDICAMOS POR TECLADO EL TAMAÑO DEL ARRAY, RELLENAREMOS EL ARRAY CON NÚMEROS ALEATORIOS
 * ENTRE 0 Y 9, AL FINAL MUESTRA POR PANTALLA EL VALOR DE CADA POSICION Y LA SUMA DE TODOS LOS VALORES. HAZ UN MÉTODO PARA RELLENAR
 * EL ARRAY (QUE TENGA COMO PARAMETROS LOS NUMEROS ENTRE LOS QUE TENGA QUE RELLENAR) PARA MOSTRAR EL CONTENIDO Y LA SUMA DEL ARRAY
 * 
 * SABIENDO QUE (MATH.RANDOM() * N) + 1 DA UN VALOR ENTRE 1 Y N.
 * (INT) (MATH.RANDOM() * 10) <--- NOS DA UN NUMERO ALEATORIO ENTRE 0 Y 9
 */

package principal;

import java.io.IOException;

import utilidades.Array;
import utilidades.Teclado;

public class Principal {
	
	public static int [] matriz;
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		int tamaño;
		
		tamaño = Teclado.leerEntero("Introduzca el tamaño de la Array: ");
		
		matriz = new int [tamaño];
		
		Array.cargarArray(tamaño);
		Array.imprimeArray(tamaño);
		Array.sumaArray(tamaño);
	}

}
