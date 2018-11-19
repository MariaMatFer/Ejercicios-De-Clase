package utilidades;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Teclado {
	
	public static Double leerDecimal (String pregunta) {
		
		BufferedReader teclado = new BufferedReader (new InputStreamReader (System.in));
		
		double dato = 0;
		System.out.print(pregunta);
			
		try {
			dato = Double.valueOf(teclado.readLine());
		} catch (Exception e){};
			
		return dato;
		
	}

}
