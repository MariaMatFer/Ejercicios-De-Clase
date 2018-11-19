package intro;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Teclado {

	public static Integer leerEntero (String pregunta) {
		BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
		Integer dato = 0;
		System.out.print(pregunta);
		try {
			dato = Integer.parseInt(teclado.readLine());
		} catch (Exception e) {}
		return dato;
	}
	
	public static Double leerDecimal (String pregunta) {
		BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
		Double dato = 0.0;
		System.out.print(pregunta);
		try {
			dato = Double.parseDouble(teclado.readLine());
		} catch (Exception e) {}
		return dato;
	}
	
	
	public static String leerTexto (String pregunta) {
		BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
		String dato = "";
		System.out.print(pregunta);
		try {
			dato = teclado.readLine();
		} catch (Exception e) {}
		return dato;
	}
	
	
}
