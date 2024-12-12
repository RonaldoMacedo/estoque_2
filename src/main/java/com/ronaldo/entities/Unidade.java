package com.ronaldo.entities;

import java.io.Serializable;
import java.time.Instant;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_unidade")
public class Unidade implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nome;
	private Instant data_cadastro;
	private Character ativo_sn;

	public Unidade() {

	}

	public Unidade(Long id, String nome, Instant data_cadastro, Character ativo_sn) {
		super();
		this.id = id;
		this.nome = nome;
		this.data_cadastro = data_cadastro;
		this.ativo_sn = ativo_sn;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Instant getData_cadastro() {
		return data_cadastro;
	}

	public void setData_cadastro(Instant data_cadastro) {
		this.data_cadastro = data_cadastro;
	}

	public Character getAtivo_sn() {
		return ativo_sn;
	}

	public void setAtivo_sn(Character ativo_sn) {
		this.ativo_sn = ativo_sn;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Unidade other = (Unidade) obj;
		return Objects.equals(id, other.id);
	}

}
