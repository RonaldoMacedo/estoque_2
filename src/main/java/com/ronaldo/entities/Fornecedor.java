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
@Table(name = "tb_fornecedor")
public class Fornecedor implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String razao_social;
	private String apelido;
	private String cnpj;
	private String email;
	private Instant data_cadastro;
	private Character ativo_sn;
	
	public Fornecedor() {
		
	}

	public Fornecedor(Long id, String razao_social, String apelido, String cnpj, String email, Instant data_cadastro,
			Character ativo_sn) {
		super();
		this.id = id;
		this.razao_social = razao_social;
		this.apelido = apelido;
		this.cnpj = cnpj;
		this.email = email;
		this.data_cadastro = data_cadastro;
		this.ativo_sn = ativo_sn;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRazao_social() {
		return razao_social;
	}

	public void setRazao_social(String razao_social) {
		this.razao_social = razao_social;
	}

	public String getApelido() {
		return apelido;
	}

	public void setApelido(String apelido) {
		this.apelido = apelido;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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
		Fornecedor other = (Fornecedor) obj;
		return Objects.equals(id, other.id);
	}

}
