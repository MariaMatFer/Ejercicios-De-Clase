package utilidades;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Teclado {
	
	public static Integer leerEntero (String pregunta) throws NumberFormatException, IOException {
		
		BufferedReader teclado = new BufferedReader (new InputStreamReader (System.in));
		int dato;
		System.out.print(pregunta);
		dato = Integer.valueOf(teclado.readLine());
		return dato;	
	}
	
	public static String leerTexto (String pregunta) throws NumberFormatException, IOException {
			
			BufferedReader teclado = new BufferedReader (new InputStreamReader (System.in));
			String dato;
			System.out.print(pregunta);
			dato = teclado.readLine();
			return dato;
			
		}

	public static double leerDouble (String pregunta) throws NumberFormatException, IOException {
		
		BufferedReader teclado = new BufferedReader (new InputStreamReader (System.in));
		double dato;
		System.out.print(pregunta);
		dato = Double.valueOf(teclado.readLine());
		return dato;
		
	}
	
	public static char leerChar (String pregunta) throws NumberFormatException, IOException {
			
			BufferedReader teclado = new BufferedReader (new InputStreamReader (System.in));
			char dato;
			System.out.print(pregunta);
			dato = teclado.readLine().charAt(1);
			return dato;
			
		}
}
