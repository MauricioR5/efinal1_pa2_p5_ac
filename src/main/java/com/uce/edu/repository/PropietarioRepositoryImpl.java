package com.uce.edu.repository;

import org.springframework.stereotype.Repository;

import com.uce.edu.repository.modelo.Propietario;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class PropietarioRepositoryImpl implements IPropietarioRepository {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertar(Propietario propietario) {
		this.entityManager.persist(propietario);
	}

	@Override
	public Propietario seleccionar(String cedula) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Propietario.class, cedula);
	}

	@Override
	public Propietario actualizar(Propietario propietario) {
		// TODO Auto-generated method stub
		return this.entityManager.merge(propietario);
	}

	@Override
	public void eliminar(String cedula) {
		this.entityManager.remove(cedula);
	}

}
