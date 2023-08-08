package com.example.demo.repository.modelo;

import java.math.BigDecimal;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "det_factura")
public class DetalleFactura {
	
	@GeneratedValue(generator = "seq_det_factura",strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "seq_det_factura",sequenceName = "seq_det_factura",allocationSize = 1)
	
	@Id
	@Column(name= "det_facturaId")
	private Integer id;
	
	@Column(name= "det_cantidad")
	private int cantidad;
	
	@Column(name= "det_precioUnitario")
	private BigDecimal precioUnitario;
	
	@Column(name= "det_subtotal")
	private BigDecimal subtotal;
	
	@Column(name= "det_idFactura")
	private String idFactura;
	
	@Column(name= "det_idProducto")
	private String idProducto;

	@OneToMany()
	private List<Factura> facturas;
	
	//SET Y GET
	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public BigDecimal getPrecioUnitario() {
		return precioUnitario;
	}

	public void setPrecioUnitario(BigDecimal precioUnitario) {
		this.precioUnitario = precioUnitario;
	}

	public BigDecimal getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(BigDecimal subtotal) {
		this.subtotal = subtotal;
	}

	public String getIdFactura() {
		return idFactura;
	}

	public void setIdFactura(String idFactura) {
		this.idFactura = idFactura;
	}

	public String getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(String idProducto) {
		this.idProducto = idProducto;
	}
	

}
