package unico;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EjercicioWhile3 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		//Declaraci�n variables
				int numero, contador;


				//Inicializaci�n variables
				BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
				System.out.println("Introduzca el n�mero del cual quiera su tabla de multiplicar:");
				numero = Integer.parseInt(teclado.readLine());	
				contador = 0;

				while (contador<=10){
					System.out.println(numero + " X " + contador + " = " + numero*contador);
					contador++;
				}
	
				System.out.println("Introduzca el n�mero del cual quiera su tabla de multiplicar:");
				numero = Integer.parseInt(teclado.readLine());	
				contador = 0;
				do {
					System.out.println(numero + " X " + contador + " = " + numero*contador);
					contador++;
				} while (contador<=10);
				
				System.out.println("Introduzca el n�mero del cual quiera su tabla de multiplicar:");
				numero = Integer.parseInt(teclado.readLine());	
				for (contador=0;contador<=10;contador++)
				{
					System.out.println(numero + " X " + contador + " = " + numero*contador);
				}
				
				

	}

}
