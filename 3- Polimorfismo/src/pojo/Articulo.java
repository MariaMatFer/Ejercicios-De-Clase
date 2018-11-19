package pojo;

public class Articulo {
	
	private String codigo;
	private Double precio;
	private String titulo;
	
	public Articulo () {
		codigo = "";
		precio= 0.0;
		titulo = "";
	}
	
	public Articulo(String codigo, Double precio, String titulo) {
		this.codigo = codigo;
		this.precio = precio;
		this.titulo = titulo;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	@Override
	public String toString() {
		return "Articulo [Codigo=" + codigo + ", Precio=" + precio + ", Titulo=" + titulo + "]";
	}
	
	
}
