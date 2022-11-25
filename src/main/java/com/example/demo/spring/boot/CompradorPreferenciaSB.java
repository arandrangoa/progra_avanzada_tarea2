package com.example.demo.spring.boot;

import org.springframework.stereotype.Component;

@Component 
public class CompradorPreferenciaSB extends CompradorSB{
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
