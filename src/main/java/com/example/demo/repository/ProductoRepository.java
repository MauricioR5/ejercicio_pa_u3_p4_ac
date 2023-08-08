package com.example.demo.repository;

import com.example.demo.repository.modelo.Producto;

public interface ProductoRepository {

	public void insertar(Producto producto);
	public void actualizar(Producto producto);
	public Producto buscarPorCodBarras(String product);
	public void eliminar(Integer id);
}
