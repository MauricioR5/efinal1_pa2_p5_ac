package com.uce.edu.repository;

import org.springframework.stereotype.Repository;

import com.uce.edu.repository.modelo.CuentaBancaria;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class CuentaBancariaRepositoryImpl implements ICuentaBancariaRepository {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertar(CuentaBancaria cuentaBancaria) {
		this.entityManager.persist(cuentaBancaria);
	}

	@Override
	public CuentaBancaria seleccionar(String numero) {
		// TODO Auto-generated method stub
		return this.entityManager.find(CuentaBancaria.class, numero);
	}

	@Override
	public CuentaBancaria actualizar(CuentaBancaria cuentaBancaria) {
		// TODO Auto-generated method stub
		return this.entityManager.merge(cuentaBancaria);
	}

	@Override
	public void eliminar(String numero) {

		this.entityManager.remove(numero);
	}

}
