package utilidades;

public class Varios {

	public static Integer convertirNumero (int base, int p0, int p1, int p2, int p3, int p4) {
		
		int resultado;
		int r0, r1, r2, r3, r4;
		
		r0 = (int) (p0 * Math.pow(base, 0));
		r1 = (int) (p1 * Math.pow(base, 1));
		r2 = (int) (p2 * Math.pow(base, 2));
		r3 = (int) (p3 * Math.pow(base, 3));
		r4 = (int) (p4 * Math.pow(base, 4));
		
		resultado = (int) (r0 + r1 + r2 + r3 + r4);
		
		return resultado;
		
	}
	
}
