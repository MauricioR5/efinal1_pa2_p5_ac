package com.uce.edu.repository;

import com.uce.edu.repository.modelo.CuentaBancaria;

public interface ICuentaBancariaRepository {

	public void insertar(CuentaBancaria cuentaBancaria);
	
	public CuentaBancaria seleccionar(String numero);
	
	public CuentaBancaria actualizar(CuentaBancaria cuentaBancaria);
	
	public void eliminar(String numero);
}
