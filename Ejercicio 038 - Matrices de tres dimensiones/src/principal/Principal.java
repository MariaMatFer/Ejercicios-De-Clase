
/*
 *  PROGRAMA PARA ALMACENAR LAS NOTAS DE N ALUMNOS EN N EXÁMENES POR N CONVOCATORIAS. RELLAR DE FORMA ALEATORIA.
 */

package principal;

import utilidades.OperacionSimple;

public class Principal {

	static final int TOTalumnos = 3;
	static final int TOTexamenes = 3;
	static final int TOTconvocatorias = 3;

	static int[][][] notas = new int[TOTalumnos][TOTexamenes][TOTconvocatorias];

	public static void main(String[] args) {

		introducirDatos();
		imprimirDatos();
		
	}

//	MÉTODOS DEL PROGRAMA

	private static void introducirDatos() {
		for (int a = 0; a < TOTalumnos; a++) {
			for (int e = 0; e < TOTexamenes; e++) {
				for (int c = 0; c < TOTconvocatorias; c++) {
					notas[a][e][c] = OperacionSimple.aleatorio(10);
				}
			}
		}
	}

	private static void imprimirDatos () {
		for (int a = 0; a < TOTalumnos; a++) {
			System.out.println("\nNotas del alumno " + (a+1) + ": ");
			for (int e = 0; e < TOTexamenes; e++) {
				System.out.println("\tExamen " + (e+1) + ": ");
				for (int c = 0; c < TOTconvocatorias; c++) {
					System.out.println("\t\tEn la convocatoria " + (c+1) + ": " + notas[a][e][c]);
					
				}
			}
		}
	}

}
