package com.example.demo.punto.repository;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.punto.modelo.PuntoVenta;

@Repository
public class PuntoVentaRepositoryImpl implements IPuntoVentaRepository {
	
	private static List <PuntoVenta> basePuntos= new ArrayList<>();

	@Override
	public PuntoVenta buscarpordireccion(String direccionPuntoVenta) {
		// TODO Auto-generated method stub
		PuntoVenta pventa=new PuntoVenta();
		pventa.setDireccion(direccionPuntoVenta);
		pventa.setIngresos(new BigDecimal(1250));
		pventa.setNumentradas(250);
		return pventa;
	}

	@Override
	public PuntoVenta buscar(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void actualizar(PuntoVenta puntoventa) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void insertar(PuntoVenta puntoventa) {
		// TODO Auto-generated method stub
		basePuntos.add(puntoventa);
		
	}

	@Override
	public void borrar(Integer id) {
		// TODO Auto-generated method stub
		
	}

}
