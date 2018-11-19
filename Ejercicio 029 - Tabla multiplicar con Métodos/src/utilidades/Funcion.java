package utilidades;

public class Funcion {

	public static void tablaMultiplicar (int numero, int empezar, int terminar) {
		
		int contador;
		
		for (contador=empezar;contador<=terminar;contador++){
			System.out.println(numero + " X " + contador + " = " + numero*contador);	
		}
	}
}
