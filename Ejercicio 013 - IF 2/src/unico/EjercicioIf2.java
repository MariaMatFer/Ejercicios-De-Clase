
/* EJERCICIO: PROGRAMA QUE NOS DIGA LA CALIFICACION SEGUN LA NOTA DEL ALUMNO */

package unico;

public class EjercicioIf2 {

	public static void main(String[] args) {
		
		//DECLARACION DE VARIABLES
		
			double nota;
			String calificacion;
			
		//INICIALIZACION
			
			nota = 11;

		//PROCESO
			
			if (nota < 5.0) {
				calificacion = "SUSPENSO";
			}else if (nota < 6.0) {
				calificacion = "APROBADO";
			}else if (nota < 7.0) {
				calificacion = "BIEN";
			}else if (nota < 9) {
				calificacion = "NOTABLE";
			}else if (nota < 10) {
				calificacion = "SOBRESALIENTE";
			}else if (nota == 10) {
				calificacion = "MATRICULA DE HONOR";
			}else {
				calificacion = "NO PRESENTADO";
			}
			
			System.out.println(calificacion);
	}

}
