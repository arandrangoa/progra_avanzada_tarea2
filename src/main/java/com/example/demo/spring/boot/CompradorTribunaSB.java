package com.example.demo.spring.boot;

import org.springframework.stereotype.Component;

@Component 
public class CompradorTribunaSB extends CompradorSB{
	
	private String numeroAsiento;
	
	public Integer calcularDescuento() {
		System.out.println("Cliente aplica al descuento");
		return 20;
	}

	public String getNumeroAsiento() {
		return numeroAsiento;
	}

	public void setNumeroAsiento(String numeroAsiento) {
		numeroAsiento = numeroAsiento;
	}
	
	

}
