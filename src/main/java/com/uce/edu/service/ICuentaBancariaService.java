package com.uce.edu.service;

import com.uce.edu.repository.modelo.CuentaBancaria;

public interface ICuentaBancariaService {

	public void agregar(CuentaBancaria cuentaBancaria);
	
	public CuentaBancaria buscar(String numero);
	
	public CuentaBancaria actualizar(CuentaBancaria cuentaBancaria);
	
	public void borrar(String numero);
}
