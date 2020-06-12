package com.example.biblioteca.projetoBiblioteca.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.biblioteca.projetoBiblioteca.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long>{
	public List<Cliente> findAllByNomeContainingIgnoreCase(String nome);
	public List<Cliente> findAllByCpfContainingIgnoreCase(String cpf);
}
