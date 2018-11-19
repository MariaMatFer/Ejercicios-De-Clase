
/*	EJERCICIO 3: DADA UNA CANTIDAD 2476.25€ CON UN 21% IVA, CALCULA EL TOTAL */

package unico;

public class Principal {

	public static void main(String[] args) {
		
		//DECLARACION
		
			double 	importe;
			double	iva;
			double 	totalIva;
			double	total;
			
		//INICIALIZACION
			
			importe 	= 2476.25;
			iva 		= 0.21;
			
		//PROCESO
			
			totalIva 	= importe*iva;
			total		= importe + totalIva;
					
		//SALIDA
			
			System.out.println	("Base = " + importe + " €");	
			System.out.println	("21% = " + totalIva + " €");
			System.out.println	("El total es " + total + " €");
	}

}
