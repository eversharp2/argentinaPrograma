package ejerciciosClase5;

import java.time.*;

public class Carrito {
	Persona persona = new Persona();
	Producto producto1 = new Producto();
	Producto producto2 = new Producto();
	Producto producto3 = new Producto();
	LocalDate fechaCompra;
	
	public Carrito(){
		
	}

	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	public Producto getProducto1() {
		return producto1;
	}

	public void setProducto1(Producto producto1) {
		this.producto1 = producto1;
	}

	public Producto getProducto2() {
		return producto2;
	}

	public void setProducto2(Producto producto2) {
		this.producto2 = producto2;
	}

	public Producto getProducto3() {
		return producto3;
	}

	public void setProducto3(Producto producto3) {
		this.producto3 = producto3;
	}

	public LocalDate getFechaCompra() {
		return fechaCompra;
	}

	public void setFechaCompra(LocalDate fechaCompra) {
		this.fechaCompra = fechaCompra;
	}
	
	public float costoFinal() {
		
		float costoFinal = this.producto1.costoFinal() + this.producto2.costoFinal() + this.producto3.costoFinal();
		return costoFinal;
	}
	
}
