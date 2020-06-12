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
@Table(name = "TB_LIVRO")
public class Livro {
	@Column(name = "cdLivro")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "cdIsbn", unique = true)
	@NotNull
	@Size(min = 10, max = 13)
	private String isbn;
	
	@Column(name = "nmLivro")
	@NotNull
	@Size(min = 3, max = 80)
	private String nome;
	
	@Column(name = "nmAutor")
	@NotNull
	@Size(min = 3, max = 80)
	private String autor;
	
	@Column(name = "nmGenero")
	@NotNull
	@Size(min = 3, max = 80)
	private String genero;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	
}
