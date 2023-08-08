package com.example.demo.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.Factura;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class FacturaRepositoryImpl implements FacturaRepository{
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertar(Factura factura) {
		this.entityManager.persist(entityManager);	
	}

	@Override
	public void actualizar(Factura factura) {
		this.entityManager.merge(factura);		
	}

	@Override
	public Factura buscarPorCodBarras(String factura) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void eliminar(Integer id) {
		this.entityManager.remove(id);		
	}

}
