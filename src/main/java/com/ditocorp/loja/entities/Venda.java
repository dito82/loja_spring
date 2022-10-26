package com.ditocorp.loja.entities;

import java.io.Serializable;
import java.util.Objects;

import com.ditocorp.loja.entities.enums.VendaStatus;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_venda")
public class Venda implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long numVenda;
	private Long qtdVenda;
	private Double precoVenda;
	private Double custoVenda;

	private Integer vendaStatus;

	@ManyToOne
	@JoinColumn(name = "idCliente")
	private Cliente cliente;

	public Venda() {
	}

	public Venda(Long numVenda, Long qtdVenda, Double precoVenda, Double custoVenda, Cliente cliente,
			VendaStatus vendaStatus) {
		super();
		this.numVenda = numVenda;
		this.qtdVenda = qtdVenda;
		this.precoVenda = precoVenda;
		this.custoVenda = custoVenda;
		this.cliente = cliente;
		setVendaStatus(vendaStatus);
	}

	public Long getNumVenda() {
		return numVenda;
	}

	public void setNumVenda(Long numVenda) {
		this.numVenda = numVenda;
	}

	public Long getQtdVenda() {
		return qtdVenda;
	}

	public void setQtdVenda(Long qtdVenda) {
		this.qtdVenda = qtdVenda;
	}

	public Double getPrecoVenda() {
		return precoVenda;
	}

	public void setPrecoVenda(Double precoVenda) {
		this.precoVenda = precoVenda;
	}

	public Double getCustoVenda() {
		return custoVenda;
	}

	public void setCustoVenda(Double custoVenda) {
		this.custoVenda = custoVenda;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public VendaStatus getVendaStatus() {
		return VendaStatus.valueOf(vendaStatus);
	}

	public void setVendaStatus(VendaStatus vendaStatus) {
		if (vendaStatus != null) {
			this.vendaStatus = vendaStatus.getCode();
		}
	}

	@Override
	public int hashCode() {
		return Objects.hash(numVenda);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Venda other = (Venda) obj;
		return Objects.equals(numVenda, other.numVenda);
	}

}
