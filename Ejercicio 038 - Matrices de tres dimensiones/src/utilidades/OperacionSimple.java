package utilidades;

public class OperacionSimple {

	public static Integer sumar(Integer n1, Integer n2) {
		Integer resultado;
		resultado = n1 + n2;
		return resultado;
	}

	public static Integer restar(Integer n1, Integer n2) {
		Integer resultado;
		resultado = n1 - n2;
		return resultado;
	}

	public static Integer multiplicar(Integer n1, Integer n2) {
		Integer resultado;
		resultado = n1 * n2;
		return resultado;
	}

	public static Double dividir(Integer n1, Integer n2) {
		Double cociente;
		cociente = ((double) n1 / n2);
		return cociente;
	}

	public static Integer cubo(int n) {
		return (int) Math.pow(n, 3);
	}

	public static int aleatorio(int maximo) {
		return (int) (Math.random() * (maximo + 1));
	}

}