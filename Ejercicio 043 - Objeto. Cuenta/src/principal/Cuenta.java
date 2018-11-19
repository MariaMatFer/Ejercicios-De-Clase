/*
 * Crea una clase llamada Cuenta que tendrá los siguientes atributos: titular y 
cantidad (puede tener decimales).

Crea sus métodos get, set y informarCuenta.

Tendrá dos métodos especiales:

    ingresar(double ingreso): se ingresa una cantidad a la cuenta, si la cantidad 
a ingresar (el ingreso) es negativa, no se hará nada.
    retirar(double retiro): se retira una cantidad a la cuenta, si restando la 
cantidad actual a la que nos pasan (retiro) es negativa, la cantidad de la cuenta pasa a ser 0.
    cambiarTitularidad(String nuevoTitular): se cambia el titular por el nuevo.
 */


package principal;

import intro.Teclado;

public class Cuenta {
	
	//Atributos
	private String titular;
	private double cantidad;
	
	//Constructores
	public Cuenta(){
		titular="";
		cantidad=0.0;
	}
	
	public Cuenta(String tit, double cant){
		titular = tit;
		cantidad = cant;
	}
	
	public Cuenta(String tit){
		titular = tit;
		cantidad = 0.0;
	}
	
	public Cuenta(double cant){
		titular = "";
		cantidad = cant;
	}
	
	//getters y setters
	
	public String getTitular(){
		return titular;
	}
	
	public void setTitular(String titu){
		this.titular = titu;
	}
	
	public double getCantidad(){
		return cantidad;
	}
	
	public void setCantidad(double cant){
		this.cantidad = cant;
	}
	
	public String toString(){
		return "Titular: " +  titular + "\nCantidad: " +cantidad + "\n";
	}
	
	//Métodos especiales
	
	public void ingresar(double ingreso) {
		if (ingreso > 0){
			cantidad = cantidad + ingreso;
			// Es equivalente a: cantidad += ingreso;
		}
	}
	
	public void retirar(double retiro){
		if ((cantidad - retiro)<0){
			cantidad = 0;
		} else {
			cantidad = cantidad - retiro;
			//Es equivalente a cantidad-= retiro;
		}		
	}
	
	public void cambiarTitularidad(String nuevo){
		setTitular(nuevo);
		//Es equivalente a titular = nuevo; (que se podría hacer si nuevo fuera public)
	}
	
	public static void main(String[] args) {
		//variables locales del main
		String cadena;
		double dinero;
		
		// Instanciar objetos de la clase Cuenta
		Cuenta cuenta1 = new Cuenta();
		Cuenta cuenta2 = new Cuenta("Pedro Perez",1000.00);
		
		//Inicializamos los atributos de cuenta1
		cadena = Teclado.leerTexto("Introduzca el titular de la cuenta: ");
		cuenta1.setTitular(cadena);
		dinero = Teclado.leerDecimal("Introduzca la catidad de la cuenta: ");
		cuenta1.setCantidad(dinero);
		
		//Mostramos información inicial de las cuentas
		System.out.println(cuenta1.toString());
		System.out.println(cuenta2.toString());
		
		//Hacemos ingreso y retiro
		dinero = Teclado.leerDecimal("Introduzca la catidad a ingresar: ");
		cuenta2.retirar(dinero);
		cuenta1.ingresar(dinero);
		
		//Mostramos información final de las cuentas
		System.out.println("Estado de las cuentas tras ingresar " + dinero + 
				" euros de la cuenta 1 a la cuenta 2");
		System.out.println(cuenta1.toString());
		System.out.println(cuenta2.toString());		
	}

}
