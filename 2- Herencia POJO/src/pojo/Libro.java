package pojo;

public class Libro extends ConArgumento{

	private Integer paginas;
	
	public Libro() {
		super();
		paginas = 0;
	}
	
	public Libro(String codigo, Double precio, String titulo, String argumento, Integer paginas) {
		super(codigo, precio, titulo, argumento);
		this.paginas = paginas;
	}

	public Integer getPaginas() {
		return paginas;
	}

	public void setPaginas(Integer paginas) {
		this.paginas = paginas;
	}

	@Override
	public String toString() {
		return "Libro [Paginas=" + paginas + ", Argumento()=" + getArgumento() + ", Codigo()=" + getCodigo()
				+ ", Precio()=" + getPrecio() + ", Titulo()=" + getTitulo() + "]";
	}
	
	

}
