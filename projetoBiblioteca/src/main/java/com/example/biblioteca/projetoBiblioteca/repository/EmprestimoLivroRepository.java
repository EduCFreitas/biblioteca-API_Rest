package com.example.biblioteca.projetoBiblioteca.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.biblioteca.projetoBiblioteca.model.EmprestimoLivro;

public interface EmprestimoLivroRepository extends JpaRepository<EmprestimoLivro, Long>{

}
