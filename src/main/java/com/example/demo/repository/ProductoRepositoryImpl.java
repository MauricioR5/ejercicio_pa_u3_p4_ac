package com.example.demo.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.Producto;

import jakarta.transaction.Transactional;

@Repository
@Transactional
public class ProductoRepositoryImpl implements ProductoRepository{

	@Override
	public void insertar(Producto producto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actualizar(Producto producto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Producto buscarPorCodBarras(String product) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		
	}

}
