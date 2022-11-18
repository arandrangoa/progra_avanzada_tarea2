package com.example.demo.tradicional;
import java.time.LocalDateTime;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CompraEntrada compra= new CompraEntrada();
		compra.OrdenCompra("172719", LocalDateTime.of(2023, 03, 14,  21, 00), "Darleen Calvachi", "1713031191",
				"Alex Andrango", "1727193847", "TR");

	}

}
