package com.example.biblioteca.projetoBiblioteca.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "TB_CLIENTE")
public class Cliente {
	@Column(name = "cdCliente")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "cdCpf", unique = true)
	@NotNull
	@Size(min = 11, max = 11)
	private String cpf;
	
	@Column(name = "nmCliente")
	@NotNull
	@Size(min = 3, max = 80)
	private String nome;
	
	@Column(name = "nmEmail")
	@NotNull
	@Size(min = 5, max = 120)
	private String email;
	
	@Column(name = "cdTelefone")
	@Size(min = 10, max = 11)
	private String telefone;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
}
