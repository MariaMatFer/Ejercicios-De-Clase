
/*EJERCICIO: CALCULAR EL RESULTADO DE UNA ECUACION DE SEGUNDO GRADO */

package unico;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Principal {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader teclado = new BufferedReader (new InputStreamReader (System.in));
		
		//DECLARACION VARIABLES
		
			int 	a;
			int 	b;
			int 	c;
			double	primero;		// -b / 2a
			double	segundo;		// RAIZ / 2a
			double 	resultado1;
			double 	resultado2;
		
		//INICIALIZACION VARIABLES
		
			System.out.println("Para calcular una ecuación de segundo grado necesitamos saber los siguientes valores: ");
			
			System.out.println("Ecuacion => ax2 + bx + c = 0");
			System.out.println("");
			System.out.print("Valor de a: ");
			a = Integer.valueOf(teclado.readLine());
			
			System.out.print("Valor de b: ");
			b = Integer.valueOf(teclado.readLine());
			
			System.out.print("Valor de c: ");
			c = Integer.valueOf(teclado.readLine());
			
		
		//PROCESO
			
			primero = (-b) / (2*a);
			segundo = Math.sqrt( Math.pow(b,2)-(4*a*c) ) / (2*4);
		
			resultado1 = primero + segundo;
			resultado2 = primero - segundo;
		
		//SALIDA
		
			System.out.println("");
			System.out.println("La ecuación tiene como resultados: ");
			System.out.println("x1 = " + resultado1);
			System.out.println("x2 = " + resultado2);
	}

}
