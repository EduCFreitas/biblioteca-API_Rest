package com.example.biblioteca.projetoBiblioteca.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.biblioteca.projetoBiblioteca.model.Emprestimo;
import com.example.biblioteca.projetoBiblioteca.repository.EmprestimoRepository;

@RestController
@RequestMapping("/emprestimos")
@CrossOrigin("*")
public class EmprestimoController {
	@Autowired
	private EmprestimoRepository repository;

	@GetMapping
	public ResponseEntity<List<Emprestimo>> GetAll(){
		return ResponseEntity.ok(repository.findAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Emprestimo> GetById(@PathVariable long id){
		return repository.findById(id)
				.map(resp -> ResponseEntity.ok(resp))
				.orElse(ResponseEntity.notFound().build());
	}
	
//	@GetMapping("/data-emprestimo/{dataEmprestimo}")
//	public ResponseEntity<List<Emprestimo>> GetByDataEmprestimo(@PathVariable Date dataEmprestimo){
//		return ResponseEntity.ok(repository.findAllByDataEmprestimoContainingIgnoreCase(dataEmprestimo));
//	}
//	
//	@GetMapping("/data-prevista-devolucao/{dataPrevistaDevolucao}")
//	public ResponseEntity<List<Emprestimo>> GetByDataPrevistaDevolucao(@PathVariable Date dataPrevistaDevolucao){
//		return ResponseEntity.ok(repository.findAllByDataPrevistaDevolucaoContainingIgnoreCase(dataPrevistaDevolucao));
//	}
//	
//	@GetMapping("/data-devolucao/{dataDevolucao}")
//	public ResponseEntity<List<Emprestimo>> GetByDataDevolucao(@PathVariable Date dataDevolucao){
//		return ResponseEntity.ok(repository.findAllByDataDevolucaoContainingIgnoreCase(dataDevolucao));
//	}
	
	@PostMapping
	public ResponseEntity<Emprestimo> post(@RequestBody Emprestimo emprestimo){
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(emprestimo));
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Emprestimo> put (@RequestBody Emprestimo emprestimo) {
		return ResponseEntity.status(HttpStatus.OK).body(repository.save(emprestimo));
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable long id) {
		repository.deleteById(id);
	}
	
}

