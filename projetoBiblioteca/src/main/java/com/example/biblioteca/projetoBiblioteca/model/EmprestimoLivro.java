package com.example.biblioteca.projetoBiblioteca.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "TB_EMPRESTIMO_LIVRO")
public class EmprestimoLivro {
	@Column(name = "cdEmprestimoLivro")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "cdLivro", referencedColumnName = "cdLivro")
	private Livro livro;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "cdEmprestimo", referencedColumnName = "cdEmprestimo")
	private Emprestimo emprestimo;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Livro getLivro() {
		return livro;
	}

	public void setLivro(Livro livro) {
		this.livro = livro;
	}

	public Emprestimo getEmprestimo() {
		return emprestimo;
	}

	public void setEmprestimo(Emprestimo emprestimo) {
		this.emprestimo = emprestimo;
	}
	
	
}
