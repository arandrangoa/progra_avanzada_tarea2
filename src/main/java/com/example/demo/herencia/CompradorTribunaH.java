package com.example.demo.herencia;

public class CompradorTribunaH extends CompradorH{
	
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
