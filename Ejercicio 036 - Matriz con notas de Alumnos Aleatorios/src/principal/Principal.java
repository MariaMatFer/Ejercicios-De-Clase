
/*
 * LISTA DE ALUMNOS CON LAS NOTAS DE CADA TRIMESTRES, CON NOTAS ALEATORIAS.
 */

package principal;

import utilidades.Metodos;

public class Principal {

	static final int TOTalumnos = 5;
	static final int TOTtrimestres = 3;
	
	public static int [][] notas = new int [TOTalumnos][TOTtrimestres];
	
	public static void main(String[] args) {
		
		Metodos.introducirNotas(TOTalumnos, TOTtrimestres);
		Metodos.mostrarNotas(TOTalumnos, TOTtrimestres);
	
	}

}
