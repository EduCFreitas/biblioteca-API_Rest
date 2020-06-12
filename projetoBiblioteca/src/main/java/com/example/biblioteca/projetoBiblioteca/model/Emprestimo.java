package com.example.biblioteca.projetoBiblioteca.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;


@Entity
@Table(name = "TB_EMPRESTIMO")
public class Emprestimo {
	@Column(name = "cdEmprestimo")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "cdCliente", referencedColumnName = "cdCliente")
	private Cliente cliente;
	
	@Column(name = "dtEmprestimo")
	@Temporal(TemporalType.TIMESTAMP)
	private Date dataEmprestimo = new java.sql.Date(System.currentTimeMillis());
	
	@Column(name = "dtPrevistaDevolucao")
	@Temporal(TemporalType.TIMESTAMP)
	@NotNull
	private Date dataPrevistaDevolucao;
	
	@Column(name = "dtDevolucao")
	@Temporal(TemporalType.TIMESTAMP)
	private Date dataDevolucao;
	
	@Column(name = "qtLivroEmprestado")
	@NotNull
	@Min(0)
	private int qtLivroEmprestado;
	
	@Column(name = "qtLivroDevolvido")
	@NotNull
	private int qtLivroDevolvido;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Date getDataEmprestimo() {
		return dataEmprestimo;
	}

	public void setDataEmprestimo(Date dataEmprestimo) {
		this.dataEmprestimo = dataEmprestimo;
	}

	public Date getDataPrevistaDevolucao() {
		return dataPrevistaDevolucao;
	}

	public void setDataPrevistaDevolucao(Date dataPrevistaDevolucao) {
		this.dataPrevistaDevolucao = dataPrevistaDevolucao;
	}

	public Date getDataDevolucao() {
		return dataDevolucao;
	}

	public void setDataDevolucao(Date dataDevolucao) {
		this.dataDevolucao = dataDevolucao;
	}

	public int getQtLivroEmprestado() {
		return qtLivroEmprestado;
	}

	public void setQtLivroEmprestado(int qtLivroEmprestado) {
		this.qtLivroEmprestado = qtLivroEmprestado;
	}

	public int getQtLivroDevolvido() {
		return qtLivroDevolvido;
	}

	public void setQtLivroDevolvido(int qtLivroDevolvido) {
		this.qtLivroDevolvido = qtLivroDevolvido;
	}

	
	
}
