package pojo;

public class ConArgumento extends Articulo{

	private String argumento;
	
	public ConArgumento () {
		super();
		argumento = "Sin argumento.";
	}
	
	public ConArgumento(String codigo, Double precio, String titulo, String argumento) {
		super(codigo, precio, titulo);
		this.argumento = argumento;
	}
		
	public ConArgumento(String argumento, String codigo, Double precio, String titulo) {
		super(codigo, precio, titulo);
		this.argumento = argumento;
	}

	public String getArgumento() {
		return argumento;
	}

	public void setArgumento(String argumento) {
		this.argumento = argumento;
	}

	@Override
	public String toString() {
		return "ConArgumento [Argumento=" + argumento + ", Codigo()=" + getCodigo() + ", Precio()=" + getPrecio()
				+ ", Titulo()=" + getTitulo() + "]";
	}

	
	
}
