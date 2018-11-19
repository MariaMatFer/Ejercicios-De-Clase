/* EJERCICIO: CREA UN PROGRAMA QUE CONVIERTA EUROS A DOLARES */

package unico;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Principal {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
			BufferedReader teclado = new BufferedReader (new InputStreamReader (System.in));
		
		//DECLARACION DE CONSTANTES
			
			final double FACT_CONV = 1.14;
			
		//DECLARACION DE VARIABLES
			
			double 	euros;			//EUROS INTRODUCIDOS POR EL USUARIO
			double 	dolares;		//DOALRES EQUIVALENTES A LAS EUROS
			String 	salida;			//TEXTO CON LA INFORMACION DE SALIDA
				
		//INICIALIZACION DE VARIABLES
		
			System.out.print("Introduzca euros: ");
			euros = Integer.valueOf(teclado.readLine());
		
		//PROCESO
			
			dolares = euros * FACT_CONV;
			salida 	= "Un total de " + euros + " € equivalen a " + dolares + " $";
			
		//SALIDA
			
			System.out.println(salida);
	}

}