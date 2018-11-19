package utilidades;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Teclado {

public static Integer leerNumero(String pregunta) {
		
		BufferedReader teclado = new BufferedReader (new InputStreamReader (System.in));
		int dato = 0;
		System.out.print(pregunta);
		try {
			dato = Integer.valueOf(teclado.readLine());
		} catch (Exception e) {};
		return dato;
		
	}

}
