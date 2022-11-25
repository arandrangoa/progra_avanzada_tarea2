package com.example.demo.spring.boot;

import java.time.LocalDateTime;

import org.springframework.stereotype.Service;

@Service
public class CompraEntradaSB {
	
	private String numero;
	private LocalDateTime fechaCompra;
	private VendedorSB vendedor;
	private CompradorSB comprador;
	private LocalDateTime fechaConcierto;

	
	public void OrdenCompra(String numero, LocalDateTime fechaConcierto, CompradorSB cH, VendedorSB vH) {
		this.numero=numero;
		this.fechaConcierto=fechaConcierto;
		this.fechaCompra = LocalDateTime.now();
		
		Integer valorDescuento= cH.calcularDescuento();
		System.out.println("Cliente con un descuento del: "+valorDescuento+"%");
		this.comprador=cH;
		this.vendedor=vH;
		
		this.guardarCompra(this);
		
	}
	
	private void guardarCompra(CompraEntradaSB compra) {
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

	public VendedorSB getVendedor() {
		return vendedor;
	}

	public void setVendedor(VendedorSB vendedor) {
		this.vendedor = vendedor;
	}

	public CompradorSB getComprador() {
		return comprador;
	}

	public void setComprador(CompradorSB comprador) {
		this.comprador = comprador;
	}

	public LocalDateTime getFechaConcierto() {
		return fechaConcierto;
	}

	public void setFechaConcierto(LocalDateTime fechaConcierto) {
		this.fechaConcierto = fechaConcierto;
	}
	
	

}