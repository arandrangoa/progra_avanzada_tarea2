package com.example.demo.herencia;

import java.time.LocalDateTime;

public class CompraEntradaH {
	
	private String numero;
	private LocalDateTime fechaCompra;
	private VendedorH vendedor;
	private CompradorH comprador;
	private LocalDateTime fechaConcierto;

	
	public void OrdenCompra(String numero, LocalDateTime fechaConcierto, CompradorH cH, VendedorH vH) {
		this.numero=numero;
		this.fechaConcierto=fechaConcierto;
		this.fechaCompra = LocalDateTime.now();
		
		Integer valorDescuento= cH.calcularDescuento();
		System.out.println("Cliente con un descuento del: "+valorDescuento+"%");
		this.comprador=cH;
		this.vendedor=vH;
		
		this.guardarCompra(this);
		
	}
	
	private void guardarCompra(CompraEntradaH compra) {
	System.out.println("**Compra realizada con exito***");
	System.out.println(compra);
	}
	
	@Override
	public String toString() {
		return "Datos de la compra \nNumero de ticket: " + numero + ", Fecha de concierto:" + fechaConcierto + ", Fecha de compra:" + fechaCompra
				 + vendedor+ comprador ;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public LocalDateTime getFechaCompra() {
		return fechaCompra;
	}

	public void setFechaCompra(LocalDateTime fechaCompra) {
		this.fechaCompra = fechaCompra;
	}

	public VendedorH getVendedor() {
		return vendedor;
	}

	public void setVendedor(VendedorH vendedor) {
		this.vendedor = vendedor;
	}

	public CompradorH getComprador() {
		return comprador;
	}

	public void setComprador(CompradorH comprador) {
		this.comprador = comprador;
	}

	public LocalDateTime getFechaConcierto() {
		return fechaConcierto;
	}

	public void setFechaConcierto(LocalDateTime fechaConcierto) {
		this.fechaConcierto = fechaConcierto;
	}

	//SET Y GET
	
	
	

}