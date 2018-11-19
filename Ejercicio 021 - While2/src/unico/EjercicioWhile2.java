package unico;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EjercicioWhile2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		//Declaración variables
		int base, exponente, resultado,numero;


		//Inicialización variables
		BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Introduzca la base:");
		base = Integer.parseInt(teclado.readLine());	
		System.out.println("Introduzca el exponente:");
		exponente = Integer.parseInt(teclado.readLine());	
		numero = 1;
		
		resultado = (int) Math.pow(base, exponente);
		System.out.println("El resultado con pow es: " + resultado);
		
		resultado = 1;
		while (numero<=exponente){
			resultado = resultado * base;
			numero++;
		}
		System.out.println("El resultado con while es: " + resultado);
		
		numero = 1;		
		resultado = 1;	
		do {
			resultado = resultado * base;
			numero++;
		} while (numero<=exponente);
		System.out.println("El resultado con do while es: " + resultado);
		
		resultado = 1;
		for(numero =1;numero<=exponente;numero++){
			resultado = resultado * base;
		}
		System.out.println("El resultado con for es: " + resultado);

	}

}
