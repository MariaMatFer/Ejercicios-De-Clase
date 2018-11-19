package principal;

import utilidades.OperacionesSimples;
import utilidades.Teclado;

public class EjercicioSwitch4 {

	public static void main(String[] args) {

		int operando1, operando2, resultado;
		char operador;

		operando1 = Teclado.leerEntero("Introduzca el primer operando: ");	
		operando2 = Teclado.leerEntero("Introduzca el segundo operando: ");
		operador = Teclado.leerLectura("Introduzca el simbolo del operador: ");
		
		while ((operador != 'x') && (operador != 'X')) {
			
			resultado = OperacionesSimples.calcularOperacion(operando1, operando2, operador);  
			System.out.println("El resultado de " + operando1 +" "+ operador +" "+ operando2 +" "+ "es " + resultado);
			operador = Teclado.leerLectura("Introduzca el simbolo del operador: ");
			
		}

/* OTRA FORMA DE HACERLO ES CON EL IF
 
		if ( (operador == '+')||(operador=='-')||(operador=='*')||(operador=='/') )  {
			
			resultado = OperacionesSimples.calcularOperacion(operando1, operando2, operador);  
			System.out.println("El resultado de " + operando1 +" "+ operador +" "+ operando2 +" "+ "es " + resultado);
			
		}else {
			System.out.println("El operador no es válido");
		}
*/
		
	}

}
