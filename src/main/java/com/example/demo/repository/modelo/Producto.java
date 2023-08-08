package com.example.demo.repository.modelo;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "producto")

public class Producto {
	@GeneratedValue(generator = "seq_producto",strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "seq_producto",sequenceName = "seq_producto",allocationSize = 1)
	
	@Id
	@Column(name="prctId")
	private Integer id;
	
	@Column(name="prctCodBarras")
	private String codigoBarras;
	
	@Column(name="prctNombre")
	private String Nombre;
	
	@Column(name="prctCategoria")
	private String categoria;
	
	@Column(name="prctStock")
	private int stock;
	
	@Column(name="prctPrecio")
	private BigDecimal precio;
	
	@ManyToOne()
	@JoinColumn(name = "factura_id")
	private Factura factura;

	public String getCodigoBarras() {
		return codigoBarras;
	}

	public void setCodigoBarras(String codigoBarras) {
		this.codigoBarras = codigoBarras;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public BigDecimal getPrecio() {
		return precio;
	}

	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}

	
}
