package utilidades;


public class OperacionesSimples {
	
	public static Integer calcularOperacion(int operando1, int operando2, char operador) {
		
		int resultado = 0;
		
		switch (operador) {
		case '+': resultado = sumar(operando1, operando2);
					break;
		case '-': resultado = restar(operando1, operando2);
					break;
		case '*': resultado = multiplicar(operando1, operando2);
					break;
		case '/': resultado = dividir(operando1, operando2);
					break;
		}
		return resultado;
		
	}
	
		
	/*
	 * 		CREAMOS LOS MÉTODOS PARA REALIZAR LOS CÁLCULOS	
	 */
		
		public static Integer sumar(int n1, int n2) {
			
			int resultado;
			resultado = n1 + n2;
			return resultado;
			
		}
		
		public static Integer restar(int n1, int n2) {
				
				int resultado;
				resultado = n1 - n2;
				return resultado;
				
			}
		
		public static Integer multiplicar(int n1, int n2) {
			
			int resultado;
			resultado = n1 * n2;
			return resultado;
			
		}
		
		public static Integer dividir(int n1, int n2) {
			
			Integer resultado;
			resultado = (n1 / n2);
			return resultado;
			
		}

	}

