
/* EJERCICIO: CREA UN PROGRAMA QUE CONVIERTA PESETAS A EUROS */

package unico;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Principal {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
			BufferedReader teclado = new BufferedReader (new InputStreamReader (System.in));
		
		//DECLARACION DE CONSTANTES
			
			final double FACT_CONV = 166.386;
			
		//DECLARACION DE VARIABLES
			
			int 	pesetas;		//PESETAS INTRODUCIDAS POR EL USUARIO
			double 	euros;			//EUROS EQUIVALENTES A LAS PESETAS
			String 	salida;			//TEXTO CON LA INFORMACION DE SALIDA
				
		//INICIALIZACION DE VARIABLES
		
			System.out.print("Introduzca pesetas: ");
			pesetas = Integer.valueOf(teclado.readLine());
		
		//PROCESO
			
			euros 	= pesetas / FACT_CONV;
			salida 	= "Un total de " + pesetas + " Ptas. equivalen a " + euros + " €";
			
		//SALIDA
			
			System.out.println(salida);
	}

}
