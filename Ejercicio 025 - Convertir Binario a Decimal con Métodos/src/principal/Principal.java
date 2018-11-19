package principal;



import utilidades.Teclado;
import utilidades.Varios;

public class Principal {

	public static void main(String[] args) {
		
		//DECLARACION
		
			int 	base;
			int 	p0, p1, p2, p3, p4;
			int 	resultado;
		
		//INICIALIZACION
			
			System.out.println("Introduzca el número de derecha a izquierda.");
			System.out.println("");
			
			p0= Teclado.leerNumero("Introduzca la posición 1: ");
			p1= Teclado.leerNumero("Introduzca la posición 2: ");
			p2= Teclado.leerNumero("Introduzca la posición 3: ");
			p3= Teclado.leerNumero("Introduzca la posición 4: ");
			p4= Teclado.leerNumero("Introduzca la posición 5: ");
			
			System.out.println("");
			base = Teclado.leerNumero("¿En qué base se encuentra el número?: ");

			
		//PROCESO
			
			resultado = Varios.convertirNumero(base, p0, p1, p2, p3, p4);
				
		//SALIDA
			
			System.out.println("");
			System.out.println("El número " + p4+p3+p2+p1+p0 + " equivale en base decimal al número: " + resultado);

	}

}
