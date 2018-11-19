
/* EJERCICIO: CREAR UN PROGRAMA DE CONVERSION DE MONEDAS UNIVERSAL */

package unico;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Principal {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader teclado = new BufferedReader (new InputStreamReader (System.in));
		
		//DECLARACION VARIABLES
		
			String	primera;
			String	segunda;
			double	conversion;
			double	importe;   		//CANTIDAD DE MONEDAS INTRODUCIDAS
			double	total;			//CANTIDAD DE MONEDAS CONVERTIDAS
		
		//INICIALIZACION VARIABLES
			
			System.out.print("La primera moneda es: ");
			primera = teclado.readLine();
			
			System.out.print("La segunda moneda es: ");
			segunda = teclado.readLine();
			
			System.out.print("¿Cúal es el factor de conversión de " + primera + " a " + segunda + "?: ");
			conversion = Double.valueOf( teclado.readLine() );
			
			System.out.print("Introduzca el total de " + primera + ": ");
			importe = Double.valueOf( teclado.readLine() );
			
		//PROCESO
			
			total = importe * conversion;
			
		//SALIDA
			
			System.out.println("Resultado: " + importe + " " + primera + " son " + total + " " + segunda);
		
	}

}
