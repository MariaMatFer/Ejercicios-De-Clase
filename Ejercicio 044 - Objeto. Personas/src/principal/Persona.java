
/*Haz una clase llamada Persona que siga las siguientes condiciones:
 * Sus atributos son: nombre, edad, DNI, sexo (H hombre y M mujer), peso y altura.
 * Si quieres añadir algun atributo puedes hacerlo.
 * Por defecto, todos los atributos menos el DNI será los valores por defectos según su tipo (0 para números, cadena vacía 
 * para String, etc.). Sexo será por defecto. ('H')
 * 
 * 		Se implantarán varios constructores:
 * 
 * 			-Un constructor por defecto.
 * 			-Un constructor con el nombre, edad y sexo, el resto por defecto.
 * 			-Un constructor con todos los atributos com parámetros.
 * 
 * 		Los métodos que se implementarán son:
 * 
 * 			-calcularIMC(): calculará si la persona está en su peso ideal.
 * 						(peso en kg/(altura^2)). Aprovechar el códifo desarrollado previamente
 * 			-esMayorDeEdad(): indica si es mayor de edad, devuelve el booleano.
 * 			-comprobarSexo(char sexo): comprueba que elsexo introducido es correcto.
 * 					Si no es correcto, sera 'H'.
 * 			-toString(): devulve la informacion del objeto.
 * 			-generarDNI(): generar un numero aleatorio de 8 cifras.
 *			-Metodos set y get de cada parametros, excepto el DNI.
 * 
 * Ahora, crea un main que haga lo siguiente:
 * 
 * 		-Pide por teclado el nombre, la edad, sexo, peso y altura.
 * 		-Crea 3 objetos de la clase anterior, el primer objeto obtendrá las anteriores variables pedidas por teclado, el segundo
 * 		 objeto obtendrá todos los anteriores menos el peso y la altura y el ultimo por defecto, para este último utiliza 
 * 		 los metodos set para darle a los atributos un valor.
 *      -Para cada objeto, deberá comprobar si esta en su peso ideal, tiene sobrepeso o por debajo de su peso ideal con un mensaje.
 * 		-Indicar para cada objeto si es mayor de edad
 * 		-Por ultimo, mostrar la informacion de cada objeto.
 */

package principal;

import java.io.IOException;

import utilidades.Teclado;

public class Persona {

	//Atributos
		private String nombre;
		private int edad; 
		private int DNI;
		private char sexo;
		private double peso;
		private double altura;
	
	//Constructores
		//Por Defecto
		public Persona(){
			nombre="";
			edad = 0; 
			DNI = 0;
			sexo = 'H';
			peso = 0.0;
			altura = 0.0;
		}
		
		//Un constructor con el nombre, edad y sexo, el resto por defecto
		public Persona(String pnombre, int pedad, char psexo) {
			nombre = pnombre;
			edad = pedad; 
			DNI = 0;
			if(this.comprobarSexo(psexo)==true) {
				sexo = psexo;
			}else {
				sexo = 'H';
			}
			peso = 0.0;
			altura = 0.0;
		}
		
		//Un constructor con todos los atributos com parámetros
		public Persona(String pnombre, int pedad, int pdni, char psexo, double ppeso, double paltura) {
			nombre = pnombre;
			edad = pedad; 
			DNI = pdni;
			if(this.comprobarSexo(psexo)==true) {
				sexo = psexo;
			}else {
				sexo = 'H';
			}
			peso = ppeso;
			altura = paltura;
		}
		
	//Getter y Setter
		
		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public int getEdad() {
			return edad;
		}

		public void setEdad(int edad) {
			this.edad = edad;
		}

		public char getSexo() {
			return sexo;
		}

		public void setSexo(char psexo) {
			if(this.comprobarSexo(psexo)==true) {
				sexo = psexo;
			}else {
				sexo = 'H';
			}
		}

		public double getPeso() {
			return peso;
		}

		public void setPeso(double peso) {
			this.peso = peso;
		}

		public double getAltura() {
			return altura;
		}

		public void setAltura(double altura) {
			this.altura = altura;
		}
		
	//Métodos
		
		public static Double calcularIMC(double peso, double altura) {
			double imc;
			imc = peso / Math.pow(altura, 2);
			return imc;
		}
		
		public boolean esMayorDeEdad(int edad) {
			boolean comprobar;
			
			if (edad >= 18) {
				comprobar = true;
			}else {
				comprobar = false;
			}
			
			return comprobar; 
		}

		public boolean comprobarSexo(char sexo) {
			boolean comprobar;
			
			if( (sexo != 'M') && (sexo != 'H') ) {
				comprobar = false;
			}else {
				comprobar = true;
			}
			
			return comprobar;
		}

		public String toString() {
			return "Nombre: " + nombre + "\nEdad: " + edad + "\nDNI: " + DNI + "\nSexo: " + sexo + "\nPeso: " + peso + "\nAltura: " + altura;
		}

		public static double generarDNI() {
			double finalDNI;
			finalDNI = Math.round(Math.random()*100000000);
			return finalDNI;
		}
				
		
	public static void main(String[] args) throws NumberFormatException, IOException {
	//DECLARACION VARIABLES
		
		String vnombre;
		int vedad,vDNI;
		char vsexo;
		double vpeso, valtura;
			
	//Pide por teclado el nombre, la edad, sexo, peso y altura.
		vnombre = Teclado.leerTexto("Introduzca su nombre: ");
		vedad = Teclado.leerEntero("Introduzca su edad: ");
		vDNI = (int) Persona.generarDNI();
		vsexo = Teclado.leerChar("Introduzca su sexo (H/M): ");
		vpeso = Teclado.leerDouble("Introduzca su peso en Kg: ");
		valtura = Teclado.leerDouble("Introduzca su altura en metros: ");
		
	/* Crea 3 objetos de la clase anterior, el primer objeto obtendrá las anteriores variables pedidas por teclado, el segundo
		objeto obtendrá todos los anteriores menos el peso y la altura y el ultimo por defecto, para este último utiliza 
		los metodos set para darle a los atributos un valor */
		
	//INSTANCIACIÓN DE OBJETOS
		
		Persona persona1 = new Persona(vnombre,vedad,vDNI,vsexo,vpeso,valtura);
		
		Persona persona2 = new Persona(vnombre,vedad,vsexo);
		
		Persona persona3 = new Persona();   
		
			//Le damos valores a los atributos para persona 3
		
			persona3.setNombre("María Mateos");
			persona3.setEdad(24);
			persona3.DNI = (int) Persona.generarDNI();
			persona3.setSexo('k');
			persona3.setPeso(64.0);
			persona3.setAltura(1.63);
			
			persona2.setPeso(88.0);
			persona2.setAltura(1.91);
		
	//Para cada objeto, deberá comprobar si esta en su peso ideal, tiene sobrepeso o por debajo de su peso ideal con un mensaje.
			
			System.out.println("El IMC de " + persona1.getNombre() + " es " + Persona.calcularIMC(persona1.getPeso(), persona1.getAltura()));
			
			System.out.println("El IMC de " + persona2.getNombre() + " es " + Persona.calcularIMC(persona2.getPeso(), persona2.getAltura()));
			
			System.out.println("El IMC de " + persona3.getNombre() + " es " + Persona.calcularIMC(persona3.getPeso(), persona3.getAltura()));
				
	//Indicar para cada objeto si es mayor de edad
			
			if (persona1.esMayorDeEdad(vedad)) {
				System.out.println(persona1.getNombre() + " Es mayor de edad");
			}else {
				System.out.println(persona1.getNombre() + " Es menor de edad");
			}
			
			if (persona2.esMayorDeEdad(vedad)) {
				System.out.println(persona2.getNombre() + " Es mayor de edad");
			}else {
				System.out.println(persona2.getNombre() + " Es menor de edad");
			}
			
			if (persona3.esMayorDeEdad(vedad)) {
				System.out.println(persona3.getNombre() + " Es mayor de edad");
			}else {
				System.out.println(persona3.getNombre() + " Es menor de edad");
			}
				
	//Por ultimo, mostrar la informacion de cada objeto			
			
			System.out.println(persona1.toString());
			System.out.println(persona2.toString());
			System.out.println(persona3.toString());
			
	}

}
