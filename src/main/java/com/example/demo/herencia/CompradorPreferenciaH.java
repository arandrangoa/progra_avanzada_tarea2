package com.example.demo.herencia;

public class CompradorPreferenciaH extends CompradorH{
	private String bloque;
	
	public Integer calcularDescuento() {
		System.out.println("Datos verificados cliente aplica al descuento");
		return 20;
	}

	public String getBloque() {
		return bloque;
	}

	public void setBloque(String bloque) {
		this.bloque = bloque;
	}

}
