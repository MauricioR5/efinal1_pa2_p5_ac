package com.uce.edu.service;

import com.uce.edu.repository.modelo.Propietario;

public interface IPropietarioService {

public void agregar(Propietario propietario);
	
	public Propietario buscar(String numero);
	
	public Propietario actualizar(Propietario propietario);
	
	public void borrar(String numero);
}
