package com.gamemaneiro.game.controller;

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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.gamemaneiro.game.model.Categoria;
import com.gamemaneiro.game.service.CategoriaService;

@RestController
@RequestMapping("/categoria")
@CrossOrigin("*")
public class CategoriaController {
	
	@Autowired
	private CategoriaService service;
	
	@GetMapping
	public ResponseEntity<List<Categoria>> listarCategorias(Categoria categoria){
		return new ResponseEntity<List<Categoria>>(service.listarCategorias(categoria), HttpStatus.OK);
	}
	
	@GetMapping("{id}")
	public ResponseEntity<Optional<Categoria>> buscaPorId(@PathVariable Long id){
		return new ResponseEntity<Optional<Categoria>>(service.buscaPorId(id), HttpStatus.OK);
	}
	
	@GetMapping("/classificacao")
	public ResponseEntity<List<Categoria>> buscaClassificacao(@RequestParam String classificacao){
		return new ResponseEntity<List<Categoria>>(service.filtrarPorClassificacao(classificacao), HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<Categoria> post(@RequestBody Categoria categoria){
		return new ResponseEntity<Categoria>(service.salvar(categoria),HttpStatus.CREATED);
	}
	
	@PutMapping
	public ResponseEntity<Object> put(@RequestBody Categoria categoria){
		Optional<Categoria> alterado = service.alterar(categoria);
		if (alterado.isEmpty()) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Categoria Inexistente");
		} else {
			return ResponseEntity.status(HttpStatus.CREATED).body(alterado.get());
		}
	}
	
	@DeleteMapping("/deletar/{id}")
	public ResponseEntity <Categoria> deletar(@PathVariable Long id){
		Optional<Categoria> deletado = service.deletar(id);
		if (deletado.isEmpty()) {
			return ResponseEntity.notFound().build();
		} else {
			return ResponseEntity.status(HttpStatus.OK).build();
		}

	}
}
