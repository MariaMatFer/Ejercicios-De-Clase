package utilidades;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Teclado {

	public static Integer leerEntero (String pregunta) throws NumberFormatException, IOException {
		BufferedReader teclado = new BufferedReader (new InputStreamReader (System.in));
		System.out.print(pregunta);
		int dato = 0;
		dato = Integer.valueOf(teclado.readLine());
		return dato;
	}
}
