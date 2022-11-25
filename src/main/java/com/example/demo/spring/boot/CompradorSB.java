package com.example.demo.spring.boot;

public class CompradorSB {
	
	@Override
	public String toString() {
		return "\nDatos del cliente \nNombre:" + nombre + ", Cedula:" + cedula;
	}
	
	private String nombre;
	private String cedula;
	private String tipo;
	
	protected Integer calcularDescuento() {
		System.out.println("Cliente sin descuento");
		return 0;
	}
	
	
	
	//SET Y GET
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	

}
