package utilidades;

public class Funciones {
	
	public static Double calcularIMC(double peso, double altura) {
		
		double imc;
		imc = peso / Math.pow(altura, 2);
		return imc;
	}
	
	public static String devolverMensajeIMC (double imc) {
		
		String mensaje;
		
		if (imc < 16) {
			mensaje = "CRITERIO DE INGRESO EN EL HOSPITAL";
		}else if (imc <17) {
			mensaje = "INFRAPESO";
		}else if (imc < 18) {
			mensaje = "BAJO PESO";
		}else if (imc < 25) {
			mensaje = "PESO NORMAL";
		}else if (imc <30) {
			mensaje = "SOBREPESO";
		}else if (imc < 35) {
			mensaje = "SOBREPESO CRÓNICO";
		}else if (imc <40) {
			mensaje = "OBESIDA PREMÓRBIDA";
		}else {
			mensaje = "OBESIDAD MÓRBIDA"; }
		
		return mensaje;
		
	}

}
