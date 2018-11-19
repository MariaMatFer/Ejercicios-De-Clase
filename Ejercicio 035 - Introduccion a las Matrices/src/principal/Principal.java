
/*
 * TENEMOS QUE GUARDAR NOTAS DE ALUMNOS PARA LOS TRES TRIMESTRES DEL CURSO. TENEMOS DOS ALUMNOS.
 */

package principal;

public class Principal {

	public static void main(String[] args) {
		
		//¿CÓMO SE DECLARAN LAS MATRICES?
		
				final int TOTalumnos = 2;
				final int TOTtrimestres = 3;
				
				int [][] notas  = new int [TOTalumnos][TOTtrimestres]; 	// 2 Alumnos, 3 Trimestres
				
		//METER DATOS EN LA MATRIZ
			
				//Datos del primer alumno
					notas[0][0] = (int) (Math.random()*11);
					notas[0][1] = (int) (Math.random()*11); 		//Notas aleatorias
					notas[0][2] = (int) (Math.random()*11);
					
				//Datos del segundo alumno
					notas[1][0] = (int) (Math.random()*11);
					notas[1][1] = (int) (Math.random()*11);
					notas[1][2] = (int) (Math.random()*11);
				
		//IMPRIMIMOS POR PANTALLA LOS DATOS
					
				//Datos del alumno 1
					for (int i = 0; i < notas[0].length; i++) {
						System.out.println("Las notas del alumno 1 son: " + notas[0][i] + " ");
					}
				
				//Datos del alumno 2
					System.out.println();
					for (int i = 0; i < notas[1].length; i++) {
						
						System.out.println("Las notas del alumno 2 son: " + notas[1][i] + " ");
					}
			
				//Mostrar datos de todos los alumnos
					System.out.println();
					for (int a = 0; a < TOTalumnos; a++) {			// a es la variables de los alumnos
						for (int t = 0; t < TOTtrimestres; t++) { 	// t es la variables de los trimestres
							System.out.print(notas[a][t]+" ");
						}
						System.out.println();
					}
					
				//Mostrar datos por cada trimestres de cada alumno
					System.out.println();
					for (int t = 0; t < TOTtrimestres; t++) {			
						for (int a = 0; a < TOTalumnos; a++) { 	
							System.out.print(notas[a][t]+" ");
						}
						System.out.println();
					}
	}

}
