package com.uce.edu;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.repository.modelo.CuentaBancaria;
import com.uce.edu.repository.modelo.Propietario;
import com.uce.edu.service.ICuentaBancariaService;

@SpringBootApplication
public class Efinal1Pa2P5AcApplication implements CommandLineRunner {
	
	@Autowired
	private ICuentaBancariaService bancariaService;

	public static void main(String[] args) {
		SpringApplication.run(Efinal1Pa2P5AcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		//Crear cuentas bancarias
		
		CuentaBancaria cnta1 = new CuentaBancaria();
		cnta1.setNumero("12345");
		cnta1.setSaldo(new BigDecimal(50));
		cnta1.setTipo("Ahorro");
		
		Propietario prop = new Propietario();
		prop.setCedula("1234567890");
		prop.setApellido("Cacuango");
		prop.setNombre("Mauricio");
		
		

		
		cnta1.setPropietario(prop);
		
		CuentaBancaria cnta2 = new CuentaBancaria();
		cnta2.setNumero("125345");
		cnta2.setSaldo(new BigDecimal(50));
		cnta2.setTipo("Ahorro");
		
		Propietario prop2 = new Propietario();
		prop2.setCedula("1234567890");
		prop2.setApellido("Cacuango");
		prop2.setNombre("Mauricio");
		
		cnta1.setPropietario(prop2);
		
		this.bancariaService.agregar(cnta1);
		this.bancariaService.agregar(cnta2);
		
	}

	
}
