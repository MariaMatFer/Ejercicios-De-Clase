/* EJERCICIO: 

CALCULAR LA SUPERFICIE DE UN TRIANGULO CUYA BASE ES 6.2 Y ALTURA ES 7.4

	SUPERFICIE = (BASE * ALTURA) /2
	
 */

package unico;

public class Principal {

	public static void main(String[] args) {
		
	//DECLARACION
		double base;
		double altura;
		double superficie;
	
	//INICIALIZACION
		base = 6.2;
		altura = 7.4;
	
	//PROCESO
		
		superficie = (base * altura) /2;
		
	//SALIDA

		System.out.println("La superficies es " + superficie);
	}

}
