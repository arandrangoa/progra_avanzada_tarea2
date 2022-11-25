package com.example.demo.herencia;

import java.time.LocalDateTime;

public class mainFramework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CompradorPreferenciaH compradorPR= new CompradorPreferenciaH();
		compradorPR.setCedula("1727193847");
		compradorPR.setNombre("Alex Andrango");
		compradorPR.setBloque("A");
		
		VendedorH vendedor= new VendedorH();
		vendedor.setNombre("Darleen Calvachi");
		vendedor.setCedula("1714458237");
		
		CompraEntradaH compra=new CompraEntradaH();
		compra.OrdenCompra("302416",  LocalDateTime.of(2023, 03, 14,  21, 00), compradorPR, vendedor);
		

	}

}
