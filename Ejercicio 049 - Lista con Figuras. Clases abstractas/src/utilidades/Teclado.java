package utilidades;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Teclado {

	public static Integer leerEntero(String pregunta) throws NumberFormatException, IOException {

		BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
		int dato;
		System.out.print(pregunta);
		dato = Integer.valueOf(teclado.readLine());
		return dato;
	}

	public static String leerTexto(String pregunta) throws NumberFormatException, IOException {

		BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
		String dato;
		System.out.print(pregunta);
		dato = teclado.readLine();
		return dato;

	}

	public static Double leerDecimal(String pregunta) throws NumberFormatException, IOException {

		BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
		Double dato;
		System.out.print(pregunta);
		dato = Double.valueOf(teclado.readLine());
		return dato;

	}
 /*
	public static Boolean leerBooleano(String pregunta) throws NumberFormatException, IOException {

		BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
		Boolean dato = true;
		char respuesta;
		System.out.print(pregunta);
		respuesta = teclado.readLine().charAt(1);
		if (respuesta =='S') {
			dato = true;
		}else {
			if (respuesta == 'N') {
				dato = false;
			} else {
				System.out.println("La respuesta no es válida");
			}
		}
		return dato;

	}
*/
}
