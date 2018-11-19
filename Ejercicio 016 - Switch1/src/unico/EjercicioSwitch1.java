package unico;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EjercicioSwitch1 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		//Declaración variables
		int posicion;
		
		//inicialización variables
		BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Introduzca la posición:");
		posicion = Integer.parseInt(teclado.readLine());
		switch (posicion) {
		case 1: System.out.println("ORO");
					break;
		case 2: System.out.println("PLATA");
					break;
		case 3: System.out.println("BRONCE");
					break;
		case 4: 
		case 5: System.out.println("DIPLOMA");
					break;
		/*default: System.out.println("SIN PREMIO");
					 break;*/
		}
		
	}

}
