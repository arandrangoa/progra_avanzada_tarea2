package com.example.demo;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.modelo.CitaMedica;
import com.example.demo.modelo.Medico;
import com.example.demo.modelo.Paciente;
import com.example.demo.service.ICitaMedicaService;
import com.example.demo.service.IMedicoService;
import com.example.demo.service.IPacienteService;

@SpringBootApplication
public class TareaU2PaAaApplication implements CommandLineRunner{
	@Autowired
	private ICitaMedicaService citaMedicaService;
	
	@Autowired
	private IMedicoService iMedicoService;
	
	@Autowired
	private IPacienteService iPacienteService;
	


	public static void main(String[] args) {
		SpringApplication.run(TareaU2PaAaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Paciente pacienteTE=new Paciente();
		pacienteTE.setCedula("1727193847");
		pacienteTE.setNombre("Alex Andrango");
		pacienteTE.setTipo("A");
	
		Medico medico=new Medico();
		medico.setCedula("1714458237");
		medico.setNombre("Darleen Calvachi");
		
		
		System.out.println(pacienteTE);
		citaMedicaService.agendar("123456", LocalDateTime.of(2022, 12, 2,  8, 30), pacienteTE, medico);
		
		
		
		
		
		
	}

}
