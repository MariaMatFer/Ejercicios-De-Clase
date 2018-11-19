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

}
