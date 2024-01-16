package com.uce.edu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.repository.IPropietarioRepository;
import com.uce.edu.repository.modelo.Propietario;

@Service
public class PropietarioServiceImpl implements IPropietarioService {

	@Autowired
	private IPropietarioRepository iPropietarioRepository;
	
	@Override
	public void agregar(Propietario propietario) {
this.iPropietarioRepository.insertar(propietario);
	}

	@Override
	public Propietario buscar(String numero) {
		// TODO Auto-generated method stub
		return this.iPropietarioRepository.seleccionar(numero);
	}

	@Override
	public Propietario actualizar(Propietario propietario) {
		// TODO Auto-generated method stub
		return this.iPropietarioRepository.actualizar(propietario);
	}

	@Override
	public void borrar(String numero) {
this.iPropietarioRepository.eliminar(numero);
	}

}
