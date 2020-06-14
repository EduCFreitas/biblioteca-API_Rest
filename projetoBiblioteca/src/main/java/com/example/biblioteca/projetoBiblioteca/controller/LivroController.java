package com.example.biblioteca.projetoBiblioteca.controller;

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

import com.example.biblioteca.projetoBiblioteca.model.Livro;
import com.example.biblioteca.projetoBiblioteca.repository.LivroRepository;

@RestController
@RequestMapping("/livros")
@CrossOrigin("*")
public class LivroController {
	
	@Autowired
	private LivroRepository repository;
	
	@GetMapping
	public ResponseEntity<List<Livro>> GetAll(){
		return ResponseEntity.ok(repository.findAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Livro> GetById(@PathVariable long id){
		return repository.findById(id)
				.map(resp -> ResponseEntity.ok(resp))
				.orElse(ResponseEntity.notFound().build());
	}
	
	@GetMapping("/isbn/{isbn}")
	public ResponseEntity<List<Livro>> GetByIsbn(@PathVariable String isbn){
		return ResponseEntity.ok(repository.findAllByIsbnContainingIgnoreCase(isbn));
	}
	
	@GetMapping("/nome/{nome}")
	public ResponseEntity<List<Livro>> GetByNome(@PathVariable String nome){
		return ResponseEntity.ok(repository.findAllByNomeContainingIgnoreCase(nome));
	}
	
	@GetMapping("/autor/{autor}")
	public ResponseEntity<List<Livro>> GetByAutor(@PathVariable String autor){
		return ResponseEntity.ok(repository.findAllByAutorContainingIgnoreCase(autor));
	}
	
	@GetMapping("/genero/{genero}")
	public ResponseEntity<List<Livro>> GetByGenero(@PathVariable String genero){
		return ResponseEntity.ok(repository.findAllByGeneroContainingIgnoreCase(genero));
	}
	
	@PostMapping
	public ResponseEntity<Livro> post(@RequestBody Livro livro){
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(livro));
	}
	
	@PutMapping
	public ResponseEntity<Livro> put (@RequestBody Livro livro) {
		return ResponseEntity.status(HttpStatus.OK).body(repository.save(livro));
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable long id) {
		repository.deleteById(id);
	}
}
