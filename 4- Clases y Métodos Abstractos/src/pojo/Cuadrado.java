package pojo;

public class Cuadrado extends Poligonal {

	private Double lado;

	// Constructores

	public Cuadrado() {
		super();
		lado = 0.0;
	}

	public Cuadrado(Double posX, Double posY, Integer numLado, Double lado) {
		super(posX, posY, numLado);
		this.lado = lado;
	}

	// Getter y setter

	public Double getLado() {
		return lado;
	}

	public void setLado(Double lado) {
		this.lado = lado;
	}

	// Metodo Abstracto

	public Double getArea() {
		Double area;
		area = Math.pow(lado, 2);
		return area;
	}

}
