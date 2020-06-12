package com.example.biblioteca.projetoBiblioteca.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.biblioteca.projetoBiblioteca.model.Livro;

public interface LivroRepository extends JpaRepository<Livro, Long>{
	public List<Livro> findAllByIsbnContainingIgnoreCase(String isbn);
	public List<Livro> findAllByNomeContainingIgnoreCase(String nome);
	public List<Livro> findAllByAutorContainingIgnoreCase(String autor);
	public List<Livro> findAllByGeneroContainingIgnoreCase(String genero);
}
