/*
 * Realiza un programa con switch que, al indicar el nombre del mes escriba por
 * pantalla el n�mero de d�as que tiene.
 */
package unico;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.GregorianCalendar;

public class EjercicioSwitch3 {

	public static void main(String[] args) throws IOException {

		//Declaraci�n variables
		String mes;
		GregorianCalendar calendario;
		int anyo;
		
		//Inicializaci�n variables
		BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Introduzca el mes:");
		mes = teclado.readLine();		
		calendario = new GregorianCalendar();
		anyo = calendario.YEAR;

		//Proceso y salidas
		switch (mes.toLowerCase()) {
		// el m�todo toLowerCase pasa a min�sculas todos los caracteres de la cadena
		case "enero": 
		case "marzo":
		case "mayo":
		case "julio":
		case "agosto":
		case "octubre":
		case "diciembre": System.out.println(mes + " tiene 31 d�as");
									break;
		case "abril":
		case "septiembre":
		case "junio":
		case "noviembre": System.out.println(mes + " tiene 30 d�as");
									break;
		case "febrero": if (calendario.isLeapYear(anyo)){
			System.out.println(mes + " tiene 29 d�as");
			} else {
				System.out.println(mes + " tiene 28 d�as");
			}
								break;
		default: System.out.println(mes + " no es correcto");
					  break;
			
		}
	}

}
