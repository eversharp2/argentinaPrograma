package ejerciciosClase5;

import java.time.*;

public class Persona {

	String nombre;
	String apellido;
	LocalDate fechaDeNacimiento;
	
	public Persona() {
		
	}
	
	public Persona(String nombre, String apellido, String fechaDeNacimiento ) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaDeNacimiento = LocalDate.parse(fechaDeNacimiento);
		
	}

	// Setters y Getters
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public LocalDate getFecheDeNacimiento() {
		return fechaDeNacimiento;
	}

	public void setFecheDeNacimiento(LocalDate fechaDeNacimiento) {
		this.fechaDeNacimiento = fechaDeNacimiento;
	}
	
	
	// Métodos
	
	public Period edad() {
		LocalDate ahora = LocalDate.now();
		
		Period edad = Period.between(this.fechaDeNacimiento, ahora);
		return edad;
	}
	
}
