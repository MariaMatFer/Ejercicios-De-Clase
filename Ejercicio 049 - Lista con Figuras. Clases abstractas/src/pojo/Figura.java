package pojo;

public abstract class Figura {

	//Funciona como cualquier otra clase.
	
	//Creamos los otributos, un constructor vacio y getter y setter
	private double posX;
	private double posY;
	
	//Constructores
	
	public Figura() {
		super();
	}
	
	public Figura(Double posX, Double posY) {
		this.posX = posX;
		this.posY = posY;
	}
	
	//Getter y setter

	public double getPosX() {
		return posX;
	}

	public void setPosX(double posX) {
		this.posX = posX;
	}

	public double getPosY() {
		return posY;
	}

	public void setPosY(double posY) {
		this.posY = posY;
	}
	
	//Añadimos un método abstracto, ya que aquí no es utilizable, hasta que elijamos la figura que queramos.
	
	public abstract Double getArea();
	
}
