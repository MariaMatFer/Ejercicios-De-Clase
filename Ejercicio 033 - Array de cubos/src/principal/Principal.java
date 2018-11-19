
/*
 * CREAR PROGRAMA QUE MEDIANTE UN ARRAY DE 10 POSICIONES, INTRODUZCA EN CADA POSICIÓN EL NÚMERO DE LA POSICIÓN AL CUBO
 */

package principal;

public class Principal {

	public static void main(String[] args) {

		int [] valores = new int [10];
		
		for (int i = 0; i < valores.length; i++) {
			valores [i] = (int) Math.pow(i, 3);
			System.out.println("El cubo de " + i + " es " + valores[i]);
		}
	}
}
