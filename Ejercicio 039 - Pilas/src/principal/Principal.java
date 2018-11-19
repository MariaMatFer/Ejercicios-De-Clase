package principal;

import java.util.Stack;

public class Principal {

	public static void main(String[] args) {
		
		//¿COMO SE CREA UNA PILA (STACK)
		
			Stack <String> pila1 = new Stack <String> ();   // Entre <> ponemos el tipo de elementos que vamos a añadir en el Stack.
		
		//AÑADIR ELEMENTOS A LA PILA (PUSH)
		
			pila1.push("hola");
			pila1.push("hola2");
		
		//QUITAR ELEMENTOS A LA PILA (POP)
		
			pila1.pop();
			
		//MOSTRAMOS LOS ELEMENTOS DE LA PILA
		
			System.out.println(pila1);
		
		

	}

}
