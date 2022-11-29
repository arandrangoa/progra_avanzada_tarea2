package com.example.demo.punto.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Reserva {
	
	private LocalDateTime fecha;
	private int numEntradas;
	private BigDecimal montoReserva;
	
//Metodos SET Y GET
	public LocalDateTime getFecha() {
		return fecha;
	}
	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}
	public int getNumEntradas() {
		return numEntradas;
	}
	public void setNumEntradas(int numEntradas) {
		this.numEntradas = numEntradas;
	}
	public BigDecimal getMontoReserva() {
		return montoReserva;
	}
	public void setMontoReserva(BigDecimal montoReserva) {
		this.montoReserva = montoReserva;
	}
	
	

}
