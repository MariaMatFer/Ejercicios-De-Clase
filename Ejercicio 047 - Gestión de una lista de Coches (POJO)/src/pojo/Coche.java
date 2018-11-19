package pojo;

public class Coche implements Comparable<Coche> {

	String marca;
	Boolean esGasolina;
	Integer potencia;

	// CONSTRUCTORES

	public Coche() {
		marca = "";
		esGasolina = true;
		potencia = 0;
	}

	public Coche(String marca, Boolean esGasolina, Integer potencia) {
		this.marca = marca;
		this.esGasolina = esGasolina;
		this.potencia = potencia;
	}

	// SETTER Y GETTER

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public Boolean isEsGasolina() {
		return esGasolina;
	}

	public void setEsGasolina(Boolean esGasolina) {
		this.esGasolina = esGasolina;
	}

	public Integer getPotencia() {
		return potencia;
	}

	public void setPotencia(Integer potencia) {
		this.potencia = potencia;
	}

	// OTROS METODOS

	public String toString() {
		return "\tMarca: " + this.marca + "\n\tGasolina: " + this.esGasolina + "\nF\tPotencia: " + this.potencia;
	}

	public int compareTo(Coche c) {
		int r;
	/*	if (this.getMarca().compareTo(c.getMarca()) == 0) {

			if (this.getPotencia() < c.getPotencia()) {
				r = -1;
			} else {

				if (this.getPotencia() > c.getPotencia()) {
					r = 1;
				} else {
					r = 0;
				}
			}

		} else {
			if (this.getMarca().compareTo(c.getMarca()) > 0) {
				r = 1;
			} else {
				r = -1;
			}
		}
		*/
		r=(this.getMarca().compareTo(c.getMarca()) == 0)?
				((this.getPotencia() < c.getPotencia())?-1:
					((this.getPotencia() > c.getPotencia())?1:0)):
						((this.getMarca().compareTo(c.getMarca()) > 0)?1:-1);
		return r;
	}

	
	
	
}
