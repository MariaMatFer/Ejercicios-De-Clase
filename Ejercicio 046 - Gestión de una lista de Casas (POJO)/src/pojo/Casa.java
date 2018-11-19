
/*
 * 		COMO CREAR UNA CLASE POJO (OBJETO)
 */

package pojo;

public class Casa implements Comparable<Casa>{
	
//ATRIBUTOS
	
		private String calle;
		private Integer numero;
		private Double superficie;
		
//CONSTRUCTOR DE LA CLASE: Para inicializar los objetos que instancian la clase
		
		//Por defecto
		
		public Casa() {
			calle = "";
			numero = 0;
			superficie = 0.0;
		}
		
		//Con algunos parametros. No todos.
		
		public Casa (String calle, Integer numero) {
			this.calle = calle;					// this - se pone para distinguir el atributo (Calle) con el parametro (Calle)
			this.numero = numero;
			superficie = 0.0;
		}
		
		//Con todos los parámetros.

		public Casa (String calle, Integer numero, Double superficie) {
			this.calle = calle;					
			this.numero = numero;
			this.superficie = superficie;
		}
		
//METODOS CONSULTORES Y MODIFICADORES (GETTER Y SETTER)
		
		//Modificadores (Setter)
		
		public void setCalle (String calle) {
			this.calle = calle;
		}
		
		public void setNumero (Integer numero) {
			this.numero = numero;
		}
		
		public void setSuperficie (Double superficie) {
			this.superficie = superficie;
		}
		
		//Consultores (Getter)
		
		public String getCalle () {
			return this.calle;
		}
		
		public Integer getNumero () {
			return this.numero;
		}
		
		public Double getSuperficie () {
			return this.superficie;
		}
		
		
//OTROS METODOS ESPECIALES
		
		//toString - Cadena de caracteres que imprime la informacion de los atributos de la clase.
		
		public String toString() {
			return "C/. " + this.calle + ", " + this.numero + " S= " + this.superficie;
		}
		
		//compareTo - Sirve para comparar objetos 
		
		public int compareTo (Casa c) {
			int r;
			if (this.getCalle().compareTo(c.getCalle()) == 0) {   // Los String se comparan con el mismo compareTo
				
				if (this.getNumero() <c.getNumero()) {
					r = -1;
				} else {
					
					if (this.getNumero() > c.getNumero()) {
						r = 1;
					} else {
						r = 0;
					}
				}
				
			} else {
				if (this.getCalle().compareTo(c.getCalle()) > 0) {
				r = 1;
				}else {
				r = -1;
				}
			}
			return r;
		}
		
}
