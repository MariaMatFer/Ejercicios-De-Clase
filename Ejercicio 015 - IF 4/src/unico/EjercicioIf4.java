
/* EJERCICIO: PROGRAMA QUE CALCULE EL INDICE DE MASA CORPORAL DE UNA PERSONA (IMC = PESO / ALTURA al cuadrado) E INDIQUE EL ESTADO EN EL
 * QUE SE ENCUENTRA:
 * 
 * <16 - CRITERIO DE INGRESO EN EL HOSPITAL
 * DE 16 A 17 - INFRAPESO
 * DE 17 A 18 - BAJO PESO
 * DE 18 A 25 - PESO NORMAL (SALUDABLE)
 * DE 25 A 30 - SOBREPESO (OBESIDA GRADO 1)
 * DE 30 A 35 - SOBREPESO CRONICO (OBESIDAD DE GRADO 2)
 * DE 35 A 40 - OBESIDAD PREMÓRRBIDA (OBESIDAD DE GRADO 3)
 * >40 - OBESIDAD MÓRBIDA (OBESIDAD DE GRADO 4)
 */

package unico;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EjercicioIf4 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader teclado = new BufferedReader (new InputStreamReader (System.in));
		
		//DECLARACION
		
			double peso;
			double altura;
			double imc;
			
		
		//INICIALIZACION
			
			System.out.print("Introduzca su peso: ");
			peso = Double.valueOf(teclado.readLine());
			
			System.out.print("Introduzca su altura: ");
			altura = Double.valueOf(teclado.readLine());
		
		
		//PROCESO
		
			imc = peso / Math.pow(altura, 2);
					
			if (imc < 16) {
				System.out.println("CRITERIO DE INGRESO EN EL HOSPITAL");
			}else if (imc <17) {
				System.out.println("INFRAPESO");
			}else if (imc < 18) {
				System.out.println("BAJO PESO");
			}else if (imc < 25) {
				System.out.println("PESO NORMAL");
			}else if (imc <30) {
				System.out.println("SOBREPESO");
			}else if (imc < 35) {
				System.out.println("SOBREPESO CRÓNICO");
			}else if (imc <40) {
				System.out.println("OBESIDA PREMÓRBIDA");
			}else {
				System.out.println("OBESIDAD MÓRBIDA");
			}
		

	}

}
