package utilidades;

public class Funciones {

	public static String notaTextual(int nota) {

		String resultado = "";

		switch (nota) {
		case 0:
		case 1:
		case 2:
		case 3:
		case 4:
			resultado = "SUSPENDIDO";
			break;
		case 5:
			resultado = "APROBADO";
			break;
		case 6:
			resultado = "BIEN";
			break;
		case 7:
		case 8:
			resultado = "NOTABLE";
			break;
		case 9:
			resultado = "SOBRESALIENTE";
			break;
		case 10:
			resultado = "MATRICULA DE HONOR";
			break;
		}
		
		return resultado;
	}

}