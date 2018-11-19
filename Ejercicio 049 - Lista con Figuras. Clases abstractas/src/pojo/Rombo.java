package pojo;

public class Rombo extends Poligonal {

	private Double diagonalMenor;
	private Double diagonalMayor;

	// Constructores

	public Rombo() {
		super();
		diagonalMenor = 0.0;
		diagonalMayor = 0.0;
	}

	public Rombo(Double posX, Double posY, Integer numLado, Double diagonalMenor, Double diagonalMayor) {
			super(posX, posY, numLado);
			this.diagonalMenor = diagonalMenor;
			this.diagonalMayor = diagonalMayor;
	}

	// Getter y setter

	public Double getDiagonalMenor() {
		return diagonalMenor;
	}

	public void setDiagonalMenor(Double diagonalMenor) {
		this.diagonalMenor = diagonalMenor;
	}

	public Double getDiagonalMayor() {
		return diagonalMayor;
	}

	public void setDiagonalMayor(Double diagonalMayor) {
		this.diagonalMayor = diagonalMayor;
	}

	// Metodo Abstracto

	public Double getArea() {
		Double area;
		area = (diagonalMenor * diagonalMayor)/2;
		return area;
	}

	@Override
	public String toString() {
		return "Rombo [diagonalMenor=" + diagonalMenor + ", diagonalMayor=" + diagonalMayor + ", getNumLados()="
				+ getNumLados() + ", getPosX()=" + getPosX() + ", getPosY()=" + getPosY() + "]";
	}
	
	


}
