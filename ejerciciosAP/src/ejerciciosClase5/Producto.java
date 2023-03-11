package ejerciciosClase5;

public class Producto {
	String nombre;
	String codigo;
	float precio;
	
	public Producto() {
		
	}
	public Producto(String nombre, String codigo, float precio) {
		this.nombre = nombre;
		this.codigo = codigo;
		this.precio = precio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}
	
	public float costoFinal() {
		float costoFinal = this.precio;
		return costoFinal;
	}
}
