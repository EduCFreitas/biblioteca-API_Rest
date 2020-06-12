package com.example.biblioteca.projetoBiblioteca.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.biblioteca.projetoBiblioteca.model.Emprestimo;

public interface EmprestimoRepository extends JpaRepository<Emprestimo, Long>{
//	public List<Emprestimo> findAllByDataEmprestimoContainingIgnoreCase(Date dataEmprestimo);
//	public List<Emprestimo> findAllByDataPrevistaDevolucaoContainingIgnoreCase(Date dataPrevistaDevolucao);
//	public List<Emprestimo> findAllByDataDevolucaoContainingIgnoreCase(Date dataDevolucao);
}
