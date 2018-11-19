package utilidades;

import principal.Principal;

public class Metodos {

	public static void introducirNotas(int TOTalumnos, int TOTtrimestres) {
		
		for(int a = 0; a < TOTalumnos; a++) {
			for(int t = 0; t <TOTtrimestres; t++) {
				Principal.notas[a][t] = (int) (Math.random()*11);
			}
		}
	}
	
	
	public static void mostrarNotas (int TOTalumnos, int TOTtrimestres) {
		for(int a = 0; a < TOTalumnos; a++) {
			System.out.print("Notas del alumno " + (a+1) + ":  ");
			for(int t = 0; t <TOTtrimestres; t++) {
				System.out.print(Principal.notas[a][t] + "  ");
			}
			System.out.println();
		}
	}
}
