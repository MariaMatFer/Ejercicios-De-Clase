
/*
 * MATRIZ CON PRODUCCION DE AVENA Y CENTENO PARA LOS PAISES DE ESPAÑA, FRANCIA E ITALIA.
 * 		A) MOSTRAR POR CADA PAIS CUAL ES LA PRODUCCION DE AVENA Y CENTENO
 * 		B) MOSTRAR LA PRODUCCION TOTAL DE TODOS LOS PAISES
 */

package principal;

import java.io.IOException;

import utilidades.Teclado;

public class Principal {

	static final int TOTcereales = 2;
	static final int TOTpaises = 3;
	
	static int [][] produccion = new int[TOTpaises][TOTcereales];
	
	static String [] nombrePais = new String [TOTpaises]; //Para dar nombre a los paises que lo imprima por pantalla
	static String [] nombreCereales = new String [TOTcereales]; //Para dar nombre a los cereales que  lo imprima por pantalla
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		pedirNombrePaises ();
		pedirNombreCereales ();
		
		introducirProduccion(TOTcereales,TOTpaises);
		
		imprimirProduccion (TOTcereales,TOTpaises);
		
		System.out.println();
		sumarProduccionTotal(TOTcereales,TOTpaises);
		
	}
	
	
/*
 * 		METODOS PARA REALIZAR EL PROGRAMA
 */
	
	public static void introducirProduccion (int TOTcereales, int TOTpaises) throws NumberFormatException, IOException {
		for (int p = 0; p < TOTpaises; p++) {
			System.out.println("Cereales para el pais " + nombrePais [p] + ": ");
			for (int c = 0; c < TOTcereales; c++) {
				produccion[p][c] = Teclado.leerEntero("Introduzca la cantidad de cereal " + nombreCereales [c] + " : ");
			}
			System.out.println();
		}
	}
	
	public static void imprimirProduccion (int TOTcereales, int TOTpaises) {
		for (int p = 0; p < TOTpaises; p++) { 
			for (int c = 0; c < TOTcereales; c++) {
				System.out.println("La producción de " + nombreCereales[c] +" para " + nombrePais [p] + " es:  " + produccion[p][c] + "  ");
			}
			System.out.println();
		}
	}
	
	
	public static void sumarProduccionTotal (int TOTcereales,int TOTpaises) {
		int suma = 0;
		for (int p = 0; p < TOTpaises; p++) {
			for (int c = 0; c < TOTcereales; c++) {
				suma += produccion[p][c];
			}
		}
		System.out.println("La producción total de cereales es = " + suma);
	}
	
	
	
/* 
 * 		MÉTODOS PARA PEDIR PAISES Y CEREALES
 */
	
	public static void pedirNombrePaises () throws NumberFormatException, IOException {
		for (int p = 0; p < TOTpaises; p++) {
			nombrePais [p] = Teclado.leerTexto ("Introduzca el nombre del pais (" + ( (p+1) + " / " + TOTpaises) + "): " );
		}
	}
	
	public static void pedirNombreCereales() throws NumberFormatException, IOException {
		for (int c = 0; c < TOTcereales; c++) {
			nombreCereales [c] = Teclado.leerTexto ("Introduzca el nombre del cereal (" + ( (c+1) + " / " + TOTcereales)  + "): ");
		}
	}

}
