package com.example.demo;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.spring.boot.CompraEntradaSB;
import com.example.demo.spring.boot.CompradorTribunaSB;
import com.example.demo.spring.boot.VendedorSB;

@SpringBootApplication
public class Tarea2AaApplication implements CommandLineRunner {
	
	@Autowired
	private CompradorTribunaSB compradorTR;
	@Autowired
	private VendedorSB vendedorSB;
	@Autowired
	private CompraEntradaSB compraentradaSB;
	

	public static void main(String[] args) {
		SpringApplication.run(Tarea2AaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Spring boot");
		
		this.compradorTR.setNombre("Alex Andrango");
		this.compradorTR.setCedula("1727193847");
		this.compradorTR.setNumeroAsiento("288");
		this.vendedorSB.setNombre("Mashiel Tuquerres");
		this.vendedorSB.setCedula("1755285381");
		
		System.out.println(compradorTR);
		
		compraentradaSB.OrdenCompra("2886618", LocalDateTime.of(2023, 03, 14,  21, 00), compradorTR, vendedorSB);
		
	
		
	}

}
