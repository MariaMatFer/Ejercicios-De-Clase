package pojo;

public class Ovalo extends Circular {

	private Double radioMayor;
	private Double radioMenor;
	
	//Constructores
	public Ovalo () {
		super();
	}
	
	public Ovalo(Double posX, Double posY, Double radioMayor, Double radioMenor) {
		super(posX, posY);
		this.radioMayor = radioMayor;
		this.radioMenor = radioMenor;
	}

	
	//Getter y setter
	public Double getRadioMayor() {
		return radioMayor;
	}

	public void setRadioMayor(Double radioMayor) {
		this.radioMayor = radioMayor;
	}

	public Double getRadioMenor() {
		return radioMenor;
	}

	public void setRadioMenor(Double radioMenor) {
		this.radioMenor = radioMenor;
	}

	
	//Metodo Abstracto
	public Double getArea() {
		Double area;
		area = Math.PI * radioMayor * radioMenor;
		return area;
	}

	@Override
	public String toString() {
		return "Ovalo [radioMayor=" + radioMayor + ", radioMenor=" + radioMenor + ", getPosX()=" + getPosX()
				+ ", getPosY()=" + getPosY() + "]";
	}
	
	
}
