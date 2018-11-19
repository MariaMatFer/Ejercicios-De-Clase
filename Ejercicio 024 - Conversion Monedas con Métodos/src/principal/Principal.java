
/* EJERCICIO: CREAR UN PROGRAMA DE CONVERSION DE MONEDAS UNIVERSAL */

package principal;

import utilidades.Operaciones;
import utilidades.Teclado;

public class Principal {

	public static void main(String[] args) {

		// DECLARACION VARIABLES

		String nombreMoneda1;
		String nombreMoneda2;
		double factConv;
		double cantidadMonedaIntro; // CANTIDAD DE MONEDAS INTRODUCIDAS
		double cantidadMonedaConv; // CANTIDAD DE MONEDAS CONVERTIDAS

		// INICIALIZACION VARIABLES

		nombreMoneda1 = Teclado.preguntarTexto("La primera moneda se llama: ");
		nombreMoneda2 = Teclado.preguntarTexto("La segunda moneda se llama: ");
		factConv = Teclado.preguntarfactorConversion("¿Cuál es el factor de conversión de " + nombreMoneda1 + " a " + nombreMoneda2 + "?: ");
		cantidadMonedaIntro = Teclado.preguntarImporteMonedas("Introduzca el total de " + nombreMoneda1 + ": ");

		// PROCESO

		cantidadMonedaConv = Operaciones.convertirMoneda(cantidadMonedaIntro, factConv);

		// SALIDA

		System.out.println("Resultado: " + cantidadMonedaIntro + " " + nombreMoneda1 + " son " + cantidadMonedaConv + " " + nombreMoneda2);

	}

}
