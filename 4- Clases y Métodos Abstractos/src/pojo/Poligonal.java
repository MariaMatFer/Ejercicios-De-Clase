package pojo;

public abstract class Poligonal extends Figura {

	private Integer numLados;

	// Constructores

	public Poligonal() {
		super();
		numLados = 0;
	}

	public Poligonal(Double posX, Double posY, Integer numLados) {
		super(posX, posY);
		this.numLados = numLados;
	}

	// Getter y setter

	public Integer getNumLados() {
		return numLados;
	}

	public void setNumLados(Integer numLados) {
		this.numLados = numLados;
	}

}
