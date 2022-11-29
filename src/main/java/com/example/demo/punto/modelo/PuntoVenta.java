package com.example.demo.punto.modelo;

import java.math.BigDecimal;

public class PuntoVenta {
	
	private String direccion;
	private int numentradas;
	private BigDecimal ingresos;
	
//Metodos SET Y GET
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public int getNumentradas() {
		return numentradas;
	}
	public void setNumentradas(int numentradas) {
		this.numentradas = numentradas;
	}
	public BigDecimal getIngresos() {
		return ingresos;
	}
	public void setIngresos(BigDecimal ingresos) {
		this.ingresos = ingresos;
	}
	
	

}
