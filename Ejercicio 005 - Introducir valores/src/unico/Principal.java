
/* EJERCICIO: INTRODUCIR VALORES. NOMBRE, APELLIDOS Y EDAD */

package unico;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Principal {

	public static void main(String[] args) throws IOException {
		
		BufferedReader teclado = new BufferedReader (new InputStreamReader(System.in));
		
		String		nombre;
		String		apellidos;
		int			edad;
		
		System.out.print("Introduzca su nombre: ");
		nombre = teclado.readLine();
		
		System.out.print("Introduzca sus apellidos: ");
		apellidos = teclado.readLine();
		
		System.out.println("Hola " + apellidos + ", " + nombre);

		System.out.print("Introduzca su edad: ");
		edad = Integer.valueOf (teclado.readLine());
		
		System.out.println("Su edad es: " + edad);
		
	}

}
