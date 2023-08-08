package com.example.demo.repository.modelo;

import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "factura")
public class Factura {
	
	@GeneratedValue(generator = "seq_factura",strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "seq_factura",sequenceName = "seq_factura",allocationSize = 1)
	
	@Id
	@Column(name = "factId")
	private Integer id;
	
	@Column(name = "factFecha")
	private LocalDateTime fecha;
	
	@Column(name = "ceduCliente")
	private String cedulaCliente;
	
	@Column(name = "totalFacturas")
	private int totalFactura;
	
	@ManyToOne()
	@JoinColumn(name ="factura_id")
	private DetalleFactura detalleFactura;
	
	@OneToMany(mappedBy = "factura")
	private List<Producto> productos;
	
	
	//SET Y GET

	public LocalDateTime getFecha() {
		return fecha;
	}

	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}

	public String getCedulaCliente() {
		return cedulaCliente;
	}

	public void setCedulaCliente(String cedulaCliente) {
		this.cedulaCliente = cedulaCliente;
	}

	public int getTotalFactura() {
		return totalFactura;
	}

	public void setTotalFactura(int totalFactura) {
		this.totalFactura = totalFactura;
	}
	

}
