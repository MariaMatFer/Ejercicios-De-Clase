
/*
 * CREAR UN M�TODO QUE ESCRIBA POR PANTALLA LA TABLA DE MULTIPLICAR DEL N�MERO QUE DE POR PARAMETRO, PERO ADEMAS 
 * SE PODRA DETERMINAR POR DONDE EMPIEZA Y DONDE ACABA.
 * EJ: TABLAMULTIPLICAR (4,6,9) DEVOLVERA:
 *			4 X 6 = 24
 *			....
 *			4 X 9 = 36
 */

package principal;

import java.io.IOException;

import utilidades.Funcion;
import utilidades.Teclado;

public class Principal {

	public static void main(String[] args) throws NumberFormatException, IOException {
	
		int numero, empezar, terminar;

		numero = Teclado.leerEntero("Introduzca el n�mero del cual quiera su tabla de multiplicar: ");	
		empezar = Teclado.leerEntero("Introduzca el por donde empezar� la tabla de multiplicar: ");
		terminar = Teclado.leerEntero("Introduzca el por donde terminr� la tabla de multiplicar: ");
		
		Funcion.tablaMultiplicar(numero, empezar, terminar);
	}
}
