/*
 * Realiza un programa con switch que, al indicar la nota (en números enteros) 
de un alumno escriba por pantalla la información textual correspondiente:
SUSPENDIDO, APROBADO, BIEN, NOTABLE, SOBRESALIENTE, MATRICULA DE HONOR o ERROR.
 */
package unico;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EjercicioSwitch2 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		//Declaración variables
		int nota;
		
		//inicialización variables
		BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Introduzca la nota:");
		nota = Integer.parseInt(teclado.readLine());
		
		switch (nota) {
		case 0: 
		case 1:
		case 2:
		case 3:
		case 4: System.out.println("SUSPENDIDO");
					break;
		case 5: System.out.println("APROBADO");
					break;
		case 6: System.out.println("BIEN");
					break;	
		case 7:
		case 8: System.out.println("NOTABLE");
					break;				
		case 9: System.out.println("SOBRESALIENTE");
					break;
		case 10: System.out.println("MATRICULA DE HONOR");
					break;	
		default: System.out.println("ERROR");
					break;
		}

	}

}
