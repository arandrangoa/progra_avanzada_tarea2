package com.example.demo.tradicional;

import java.time.LocalDateTime;

public class CompraEntrada {
	
	private String numero;
	private LocalDateTime fechaCompra;
	private Vendedor vendedor;
	private Comprador comprador;
	private LocalDateTime fechaConcierto;

	
	public void OrdenCompra(String numero, LocalDateTime fechaConcierto, String nombreVendedor,
			String cedulaVendedor, String nombreComprador, String cedulaComprador, String localidad) {
		this.numero=numero;
		this.fechaConcierto=fechaConcierto;
		this.fechaCompra = LocalDateTime.now();
		
		Vendedor vendedorobj=new Vendedor();
		vendedorobj.setCedula(cedulaVendedor);
		vendedorobj.setNombre(nombreVendedor);
		this.vendedor=vendedorobj;
		

		//Tribuna es TR, Preferencia es PR
		if(localidad.equals("TR")) {
			CompradorTribuna compradorTR = new CompradorTribuna();
			
			compradorTR.setNumeroAsiento("15622");
			compradorTR.setTipo("TR");
			
			this.comprador = compradorTR;
			System.out.println("COMPRA DE LOCALIDAD TRIBUNA");
			
		}else {
			CompradorPreferencia compradorPR = new CompradorPreferencia();
			
			compradorPR.setBloque("D");		
			compradorPR.setTipo("PR");
			
			this.comprador = compradorPR;
			System.out.println("Comprador de entrada Preferencia");
		}
		
		this.comprador.setNombre(nombreComprador);
		this.comprador.setCedula(cedulaComprador);
		
		this.guardarCompra(this);
		
	}
	
	private void guardarCompra(CompraEntrada compra) {
		//Insert en la base de datos, gurdar la cita
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

	public Vendedor getVendedor() {
		return vendedor;
	}

	public void setVendedor(Vendedor vendedor) {
		this.vendedor = vendedor;
	}

	public Comprador getComprador() {
		return comprador;
	}

	public void setComprador(Comprador comprador) {
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