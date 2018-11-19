
/* EJERCICIO 11: EJEMPLO DEL LIBRO. PAG. 29 */

package unico;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EjercicioIf1 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader teclado = new BufferedReader (new InputStreamReader (System.in));
		
		//DECLARACION DE VARIABLES
			
			int a;
		
		//INICIALIZACION
			
			System.out.print("Introduzca el valor de la variable: ");
			a = Integer.valueOf(teclado.readLine());
		
		//PROCESO
			
			if 		(a == 4) {
				System.out.println("La variable es igual a 4");
			}

			
			if 		(a > 5) {
				System.out.println("La variable es mayor que 5");
			}
			else	{
				System.out.println("La variable es menor que 5");
			}
			
			
			if		(a > 5) {
				System.out.println("La variable es mayor que 5");
			}
			else 	if	(a == 5) {
				System.out.println("La variable es igual que 5");	
			}
			else	{
				System.out.println("La variables es menor que 5");
			}
	}
}
