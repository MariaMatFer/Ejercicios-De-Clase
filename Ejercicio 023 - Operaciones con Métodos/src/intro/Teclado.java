package intro;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Teclado {
	
	/*
	 * 		CREAMOS UN METODO PARA PEDIR QUE SE INTRODUZCAN DATOS ENTEROS (BufferedReader)
	 */
		
		public static Integer leerEntero (String pregunta) {
			
			BufferedReader teclado = new BufferedReader (new InputStreamReader (System.in));
			
			int dato = 0;
			System.out.print(pregunta);
			
			try {
				dato = Integer.valueOf(teclado.readLine());
			} catch (Exception e){};
			
			return dato;
			
		}
		
	/*
	 * 		CREAMOS UN METODO PARA PEDIR QUE SE INTRODUZCAN DATOS DECIMALES (DOUBLE) (BufferedReader)
	 */
			
		public static Double leerDouble (String pregunta) {
				
			BufferedReader teclado = new BufferedReader (new InputStreamReader (System.in));
				
			double dato = 0;
			System.out.print(pregunta);
				
			try {
				dato = Double.valueOf(teclado.readLine());
			} catch (Exception e){};
				
			return dato;
				
			}
		
	/*
	 * 		CREAMOS UN METODO PARA PEDIR QUE SE INTRODUZCAN DATOS LECTURA (BufferedReader)
	*/
				
		public static String leerLectura (String pregunta) {
					
			BufferedReader teclado = new BufferedReader (new InputStreamReader (System.in));
					
			String dato = "";
			System.out.print(pregunta);
					
			try {
				dato = teclado.readLine();
			} catch (Exception e){};
					
			return dato;
					
			}

}
