
/*	EJERCICIO: REALIZAR UN PROGRAMA QUE, TRAS INGRESAR DOS VALORES POR TECLADO, LLAMADOS VALOR1 Y VALOR2, REALICE LAS SIGUIENTES 
	COMPARACIONES LÓGICAS MEDIANTE ESTRUCTURAS IF, ELSE IF Y ELSE ANIDADAS:
	
	A)DETECTE SI VALOR1 ES MAYOR QUE 5
	B)QUE DETECTE SI VALOR2 ES MENOR O IGUAL QUE 3, Y EN CASO CONTRARIO, SI VALOR2 ES MAYOR O IGUAL QUE 6. QUE DETECTE SI NO SE DA
	  NINGUNA DE LAS CIRCUNSTANCIAS ANTERIORES.
	C)QUE DETECTE SI, VALOR1 IGUAL A 5 Y VALOR2 ES MAYOR QUE 5. VER TAMBIEN QUE VALOR1 NO SEA IGUAL A 5 Y CUANDO, SIENDO VALOR1 IGUAL A 5,
	  VALOR 2 NO SEA MAYOR O IGUAL QUE 5
	D)QUE DETECTE, E INFORME TAMBIEN DE SI EL CUADRADO DE VALOR ES MAYOR QUE 4 Y QUE A SU VEZ VALOR 2 SEA MAYOR QUE VALOR1
 */

package unico;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EjercicioIF3 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader teclado = new BufferedReader (new InputStreamReader (System.in));

		//DECLARACION
		
			int valor1;
			int valor2;
		
		//INICIALIZACION
			
			System.out.print("Introduzca el valor 1: ");
			valor1 = Integer.valueOf(teclado.readLine());
			
			System.out.print("Introduzca el valor 2: ");
			valor2 = Integer.valueOf(teclado.readLine());
		
		//PROCESO
			
			// A)
			
			if (valor1 > 5) {
				System.out.println("Valor 1 es mayor que 5");
			}else {
				System.out.println("Valor 1 es menor que 5");
			}
			
			// B)
			
			if (valor2 <= 3) {
				System.out.println("Valor 2 es menor o igual que 3");
			}else if (valor2 >= 6) {
				System.out.println("Valor 2 es mayor o igual que 6");
			}else {
				System.out.println("No se cumplen las condiciones");
			}
			
			// C)
			
			if ( (valor1 == 5) && (valor2 > 5) ) {
				System.out.println("Valor 1 es igual a 5 y Valor 2 es mayor que 5");
			}else if ( (valor1 == 5) && (valor2 < 5) ) {
				System.out.println("Valor 1 es igual 5 y valor 2 no es mayor o igual que 5");
			}else if (valor1 != 5) {
				System.out.println("Valor 1 distinto de 5");
			}
			
			// D)
			
			if ( (valor1*valor1) > 4 && (valor2 > valor1) ) {
				System.out.println("El cuadrado del Valor 1 es mayor que 4 y el valor 2 es mayor que el valor 1");
			}else {
				System.out.println("No se cumple la condicion");	
			}
			
	}

}
