
/* EJERCICIO: CALCULAR LA LONGITUD Y SUPERFICIE DE UN CIRCULO, CUYO RADIO TENEMOS QUE INTRODUCIR */

package unico;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Principal {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));

		double radio;
		double superficie;
		double longitud;

		System.out.print("Introduzca el valor del radio: ");
		radio = Double.valueOf(teclado.readLine());

		longitud = 2 * Math.PI * radio;
		superficie = Math.PI * Math.pow(radio, 2);

		System.out.println("El radio es: " + radio);
		System.out.println("La longitud es: " + longitud);
		System.out.println("La superficie es: " + superficie);

	}

}
