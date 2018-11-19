package pojo;

public class Disco extends Articulo{

	private Boolean esLP;
	
	public Disco() {
		super();
		esLP = false;
	}
	
	public Disco(String codigo, Double precio, String titulo, Boolean esLP) {
		super(codigo, precio, titulo);
		this.esLP = esLP;	
	}

	public Boolean isEsLP() {
		return esLP;
	}

	public void setEsLP(Boolean esLP) {
		this.esLP = esLP;
	}

	@Override
	public String toString() {
		return "Disco [LP=" + esLP + ", Codigo()=" + getCodigo() + ", Precio()=" + getPrecio()
				+ ", Titulo()=" + getTitulo() + "]";
	}
	
	

}
