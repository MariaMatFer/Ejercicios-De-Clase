package unico;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EjercicioSwitch4 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		//Declaración variables
		double operando1, operando2, resultado;
		String operador;
		char letraOperador;
		boolean operadorValido; 

		//Inicialización variables
		BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Introduzca el primer operando:");
		operando1 = Double.parseDouble(teclado.readLine());	
		System.out.println("Introduzca el segundo operando:");
		operando2 = Double.parseDouble(teclado.readLine());	
		System.out.println("Introduzca el operador:");
		operador = teclado.readLine();
		// usaremos toLoweCase para que la cadena contenida en operador se ponga toda en minúsculas
		operador = operador.toLowerCase();
		letraOperador = operador.charAt(0);
		resultado = 0;
		operadorValido = true;
		
		//Proceso y salidas
		switch (letraOperador) {
		case 's': resultado = operando1 + operando2;
					break;
		case 'r': resultado = operando1 - operando2;
					break;
		case 'm':
		case 'p': resultado = operando1 * operando2;
					break;
		case 'd': resultado = operando1 / operando2;
					break;
		default: System.out.println("No existe el operador!");
					operadorValido = false;
		}
		if (operadorValido){
		System.out.println("El resultado de la operación es " + resultado);
		}
	}

}
