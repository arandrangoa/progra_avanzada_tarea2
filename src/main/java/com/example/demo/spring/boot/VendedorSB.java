package com.example.demo.spring.boot;

import org.springframework.stereotype.Component;

@Component 
public class VendedorSB {
	@Override
	public String toString() {
		return "\nDatos del vendedor \nNombre:" + nombre + ", Cedula:" + cedula;
	}
	private String nombre;
	private String cedula;
	
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
	
	

}
