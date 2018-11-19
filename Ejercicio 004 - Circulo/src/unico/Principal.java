
/* EJERCICIO 4: CALCULAR LA LONGITUD Y SUPERFICIE DE UN CIRCULO, CUYO RADIO ES DE 12 */

package unico;

public class Principal {

	public static void main(String[] args) {
		
		//DECLARACION CONSTANTES
		
			final double	PI = Math.PI;
		
		//DECLARACION
		
			double 	radio;
			double	longitud;
			double	superficie;
			
		//INICIALIZACION
			
			radio 	= 12;
						
		//PROCESO
			
			longitud 		= 2 * PI * radio;
			superficie 		= PI * Math.pow(radio, 2);
			
		//SALIDA
			
			System.out.println	("El radio del circulo es " + radio);
			System.out.println	("La longitud del circulo es " + longitud);
			System.out.println	("La superficie del circulo es " + superficie);

	}

}
