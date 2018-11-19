package unico;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Principal {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader teclado = new BufferedReader (new InputStreamReader (System.in));
		
		//DECLARACION
		
			int 	base;
			int 	p0, p1, p2, p3, p4;
			int		r0,r1,r2,r3,r4;
			int 	resultado;
		
		//INICIALIZACION
			
			System.out.println("Introduzca el n�mero de derecha a izquierda.");
			System.out.println("");
			
			System.out.print("Introduzca la posici�n 1: ");
			p0= Integer.valueOf(teclado.readLine());
			
			System.out.print("Introduzca la posici�n 2: ");
			p1= Integer.valueOf(teclado.readLine());
			
			System.out.print("Introduzca la posici�n 3: ");
			p2= Integer.valueOf(teclado.readLine());
			
			System.out.print("Introduzca la posici�n 4: ");
			p3= Integer.valueOf(teclado.readLine());
			
			System.out.print("Introduzca la posici�n 5: ");
			p4= Integer.valueOf(teclado.readLine());
			
			System.out.println("");
			System.out.print("�En qu� base se encuentra el n�mero?: ");
			base = Integer.valueOf(teclado.readLine());

			
		//PROCESO
			
			r0 = (int) (p0 * Math.pow(base, 0));
			r1 = (int) (p1 * Math.pow(base, 1));
			r2 = (int) (p2 * Math.pow(base, 2));
			r3 = (int) (p3 * Math.pow(base, 3));
			r4 = (int) (p4 * Math.pow(base, 4));
			
			resultado = (int) (r0 + r1 + r2 + r3 + r4);
				
		//SALIDA
			
			System.out.println("");
			System.out.println("El n�mero binario " + p4+p3+p2+p1+p0 + " equivale en base 10 al n�mero: " + resultado);

	}

}
