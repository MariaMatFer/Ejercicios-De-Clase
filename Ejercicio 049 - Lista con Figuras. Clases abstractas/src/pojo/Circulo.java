package pojo;

public class Circulo extends Circular implements Formato{

	//En este caso, es aquí donde queremos implementar el metodo abstracto, por lo tanto tenemos que implementar
	//el metodo y realizar su calculo
	
	//Realizamos la clase normal (ATRIBUTOS, CONSTRUCTOR Y GET Y SET)
	
	private double radio;
	
	
	//Constructores
	public Circulo() {
		super();
	}
	
	public Circulo(Double posX, Double posY, Double radio) {
		super(posX, posY);
		this.radio = radio;
	}
	
	//Getter y setter

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}

	//Implementamos el Método Abstracto
	
	public Double getArea() {
		Double area;
		area = Math.PI * Math.pow(radio, 2);
		return area;
	}

	@Override
	public String toString() {
		return "Circulo [radio=" + radio + ", getPosX()=" + getPosX() + ", getPosY()=" + getPosY() + "]";
	}

	
	@Override
	public void setColor(int color) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getColor() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setVisible() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Boolean isVisible(Boolean v) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	
	
	
	
}
