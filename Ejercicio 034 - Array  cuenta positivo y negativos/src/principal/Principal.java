
/* 
 * ARRAY DONDE SE LE PIDA AL USUARIO NUMEROS Y QUE TERMINE CUANDO EL USUARIO INTRODUZCA UN CERO. LEUGO QUE CUENTE LOS NUMEROS 
 * SON NEGATIVOS Y CUANTOS SEAN POSITIVOS
 */

package principal;

import java.io.IOException;

import utilidades.Teclado;

public class Principal {

	public static void main(String[] args) throws NumberFormatException, IOException {
	
		
		int [] contador = new int [2];
		contador[0] = 0; // PARA QUE NO HAYA PROBLEMAS CON LOS NULOS
		contador[0] = 0;
		
		int dato;
		
		do {
			dato = Teclado.leerEntero ("Introduzca datos negativos y positivos. Para salir introduzca un 0: ");
			if (dato > 0) {
				contador[0] = contador[0] + 1;
			}else {
				if (dato != 0) {
					contador[1] = contador[1] + 1;
				}
			}
		}
		while (dato != 0); 
		
		System.out.println("Ha introducido " + contador[0] + " valores positivos y " + contador[1] + " valores negativos");
	}

}
