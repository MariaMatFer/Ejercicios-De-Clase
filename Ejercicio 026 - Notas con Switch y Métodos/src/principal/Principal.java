
/*
 *  CREAR UN PROGRAMA QUE PIDA POR TECLADO LA NOTA (INTEGER) INDEFINIDAMENTE EN BUCLE, HASTA QUE SE INTRODUZCA UN VALOR 
 *  NO VALIDO (VALOR MENOR QUE CERO O MAYOR QUE DIEZ). DEBE DEVOLVER LA NOTA DE MANERA TEXTUAL (SUSPENDIDO DI ES 0,1,2,3,4),
 *  APROBADO (5), BIEN (6), NOTABLE (7, 8), SOBRESALIENTE (9) Y MATRICULA DE HONOR (10).
 *  SE DEBE CREAR UNA FUNCION QUE TENGA COMO PARAMETRO LA NOTA EN ENTERO Y DEBERA DEVOLVER UN STRING QUE CONTENGA LA NOTA
 *  DE MANERA TEXTUAL (SUSPENDIDO, APROBADO, BIEN...)
 */

package principal;

import utilidades.Funciones;
import utilidades.Teclado;

public class Principal {

	public static void main(String[] args) {
		
		int nota;
		String resultado = "";
		
		nota = Teclado.leerNumero("¿Cuál es la nota del alumno?: ");
		
		while ( (nota < 11) && (nota >= 0) ) {
			
			resultado = Funciones.notaTextual(nota);
			System.out.println("La nota del alumno es: " + resultado);
			nota = Teclado.leerNumero("¿Cuál es la nota del alumno?: ");
		}
		
		
	}

}
