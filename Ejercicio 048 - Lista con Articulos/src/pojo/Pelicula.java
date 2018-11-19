package pojo;

public class Pelicula extends ConArgumento{

	private Boolean esDVD;
	
	public Pelicula() {
		super();
		esDVD = true;
	}
	
	public Pelicula(String codigo, Double precio, String titulo, String argumento, Boolean esDVD) {
		super(codigo, precio, titulo, argumento);
		this.esDVD = esDVD;
	}

	public Boolean isEsDVD() {
		return esDVD;
	}

	public void setEsDVD(Boolean esDVD) {
		this.esDVD = esDVD;
	}

	@Override
	public String toString() {
		return "\tDVD=" + esDVD + "\n\tArgumento: " + getArgumento() + "\n\tCodigo: " + getCodigo()
				+ "\n\tPrecio: " + getPrecio() + "\n\tTitulo: " + getTitulo();
	}
	
	

}
