
/*
 * EJERCICIO: UN PROGRAMA QUE SE LE PIDA AL USUARIO DOS NUMEROS, Y MEDIANTE MÉTODOS, CALCULAR LA SUMA, RESTA, MULTIPLICACION Y DIVISION
 */

package principal;

import intro.Teclado;
import mates.OperacionesSimples;

public class Ejercicio16Metodos {

	public static void main(String[] args) {
		
		//DECLARACION DE VARIABLES
		
			int n1;
			int n2;
			int resultadoSuma;
			int resultadoResta;
			int resultadoMultiplicacion;
			double resultadoDivision;
		
		//PEDIR NÚMEROS AL USUARIO
		
			n1 = Teclado.leerEntero("Introduzca el primer número: ");	
			n2 = Teclado.leerEntero("Introduzca el segundo número: ");
		
		//REALIZAR LAS OPERACIONES
		
			resultadoSuma = OperacionesSimples.sumar (n1, n2);
			resultadoResta = OperacionesSimples.restar (n1, n2);	
			resultadoMultiplicacion = OperacionesSimples.multiplicar (n1, n2);	
			resultadoDivision = OperacionesSimples.dividir (n1, n2);
		
		//MOSTRAR LOS RESULTADOS
		
			System.out.println("La suma es: " + resultadoSuma);
			System.out.println("La resta es: " + resultadoResta);
			System.out.println("La multiplicacion es: " + resultadoMultiplicacion);
			System.out.println("La division es: " + resultadoDivision);
					
	}
}
	
