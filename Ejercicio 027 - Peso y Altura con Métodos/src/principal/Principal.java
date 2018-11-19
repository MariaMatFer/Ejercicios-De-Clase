
/*
 * CREAR UN PROGRAMA QUE PIDA POR TECLADO EL PESO Y LA ALTURA (DECIMALES) INDEFINIDAMENTE (BUCLE) 
 * HASTA QUE SE INTRODUZCA UN CERO EN ALGUNO DE ESOS VALORES.
 * PARA CADA UNO DE ESOS VALORES DE PESO Y ALTURA SE DEBERA DEVOLVER EL AVISO DE INDICE DE MASA CORPORAL QUE YA VIMOS. SE DEBE 
 * CREAR UNA FUNCION CALCULARIMC QUE RECIBA POR PARMETROS LA ALTURA Y EL PESO Y DEVULVA EL IMC.
 * DESPUES DE CRER UN METODO QUE RECIBA EL IMC Y EN BASE A ELLO DEVUELVA EL MENSAJE INDICADO EL GRADO DE OBESIDAD QUE 
 * TIENE EL USUARIO.
 */

package principal;

import utilidades.Funciones;
import utilidades.Teclado;

public class Principal {

	public static void main(String[] args) {
		
			double peso;
			double altura;
			double imc;

			peso = Teclado.leerDecimal("Introduzca su peso en Kg: ");
			altura = Teclado.leerDecimal("Introduzca su altura en metros: ");

			while ( (peso != 0) && (altura != 0)) {
				
				imc = Funciones.calcularIMC(peso, altura);
				System.out.println(Funciones.devolverMensajeIMC(imc));
				peso = Teclado.leerDecimal("Introduzca su peso: ");
				altura = Teclado.leerDecimal("Introduzca su altura: ");
			}
			
			System.out.println("Fin del programa");
	}
}
