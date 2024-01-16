package com.uce.edu.repository.modelo;

import java.math.BigDecimal;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "cuentaBancaria")
public class CuentaBancaria {
	
	@SequenceGenerator(name = "seq_cuentaBancaria", sequenceName = "seq_cuentaBancaria", allocationSize = 1)
	@GeneratedValue(generator = "seq_cuentaBancaria", strategy = GenerationType.SEQUENCE)
	
	@Id
	@Column(name = "cnta_id")
	private Integer id;
	
	@Column(name = "cnta_numero")
	private String numero;
	
	@Column(name = "cnta_tipo")
	private String tipo;
	
	@Column(name = "cnta_saldo")
	private BigDecimal saldo;
	
	@OneToMany(mappedBy = "cuentaBancaria")
	private List<Transferencia> transferencias;
	
	@OneToOne(mappedBy = "cuentaBancaria",cascade = CascadeType.ALL)
	private Propietario propietario;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public BigDecimal getSaldo() {
		return saldo;
	}

	public void setSaldo(BigDecimal saldo) {
		this.saldo = saldo;
	}

	public List<Transferencia> getTransferencias() {
		return transferencias;
	}

	public void setTransferencias(List<Transferencia> transferencias) {
		this.transferencias = transferencias;
	}

	public Propietario getPropietario() {
		return propietario;
	}

	public void setPropietario(Propietario propietario) {
		this.propietario = propietario;
	}

	
}
