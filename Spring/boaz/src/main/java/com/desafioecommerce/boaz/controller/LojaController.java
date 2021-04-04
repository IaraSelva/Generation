package com.desafioecommerce.boaz.controller;

import java.util.List;
import java.util.Optional;

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

import com.desafioecommerce.boaz.model.Loja;
import com.desafioecommerce.boaz.repository.LojaRepository;

@RestController
@RequestMapping("/lojas")
@CrossOrigin("*")
public class LojaController {
	
	@Autowired
	private LojaRepository repository;
	
	@GetMapping
	public ResponseEntity<List<Loja>> GetAll(){
		return ResponseEntity.ok(repository.findAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Optional<Loja>> GetById (long id){
		return ResponseEntity.ok(repository.findById(id));
	}
	
	@PostMapping("/cadastrar")
	public ResponseEntity<Loja> post (@RequestBody Loja loja){
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(loja));
	}
	 @PutMapping("/alterar/{id}")
	 public ResponseEntity<Loja> put (@RequestBody Loja loja){
		 return ResponseEntity.status(HttpStatus.OK).body(repository.save(loja));
	}
	@DeleteMapping("/excluir/{id}")
	public void delete (@PathVariable long id) {
		repository.deleteById(id);
	}

}
