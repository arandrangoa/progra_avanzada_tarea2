package com.example.demo.punto.repository;

import com.example.demo.punto.modelo.PuntoVenta;

public interface IPuntoVentaRepository {
	
	public PuntoVenta buscarpordireccion(String direccionPuntoVenta);
	
	//CRUD
		public PuntoVenta buscar(Integer id);
		//
		public void actualizar(PuntoVenta puntoventa);
		public void insertar(PuntoVenta puntoventa);
		public void borrar(Integer id);

}
