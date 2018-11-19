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
			
			System.out.println("Introduzca el n�mero de derecha a izquierda.");
			System.out.println("");
			
			p0= Teclado.leerNumero("Introduzca la posici�n 1: ");
			p1= Teclado.leerNumero("Introduzca la posici�n 2: ");
			p2= Teclado.leerNumero("Introduzca la posici�n 3: ");
			p3= Teclado.leerNumero("Introduzca la posici�n 4: ");
			p4= Teclado.leerNumero("Introduzca la posici�n 5: ");
			
			System.out.println("");
			base = Teclado.leerNumero("�En qu� base se encuentra el n�mero?: ");

			
		//PROCESO
			
			resultado = Varios.convertirNumero(base, p0, p1, p2, p3, p4);
				
		//SALIDA
			
			System.out.println("");
			System.out.println("El n�mero " + p4+p3+p2+p1+p0 + " equivale en base decimal al n�mero: " + resultado);

	}

}
