package com.desafioecommerce.boaz.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.desafioecommerce.boaz.model.Produto;
import com.desafioecommerce.boaz.repository.ProdutoRepository;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {
	
	@Autowired
	private ProdutoRepository repository;
	
	@GetMapping
	public ResponseEntity<List<Produto>> getAll (Produto produto){
		return new ResponseEntity<List<Produto>>(repository.findAll(), HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Optional<Produto>> getById (@PathVariable long id){
		return ResponseEntity.status(HttpStatus.OK).body(repository.findById(id));
	}
	
	@GetMapping("/nome/{tituloProduto}")
	public ResponseEntity<List<Produto>> getByTittle (@PathVariable String tituloProduto){
		return new ResponseEntity<List<Produto>>(repository.findAllBytituloProdutoContainingIgnoreCase(tituloProduto),HttpStatus.OK);
	}
	
	@GetMapping("/menorPreco/{valor}")
	public ResponseEntity<List<Produto>> getByLessValue (@PathVariable double valor){
		return new ResponseEntity<List<Produto>>(repository.findAllByValorLessThanEqual(valor),HttpStatus.OK);
	}
	
	@GetMapping("/maiorPreco/{valor}")
	public ResponseEntity<List<Produto>> getByGreaterValue (@PathVariable double valor){
		return new ResponseEntity<List<Produto>>(repository.findAllByValorGreaterThanEqual(valor),HttpStatus.OK);
	}
	
	@GetMapping("/loja/{nomeLoja}")
	public ResponseEntity<List<Produto>> getByStore (@PathVariable String nomeLoja){
		return ResponseEntity.status(HttpStatus.OK).body(repository.findAllProdutoByLojaNomeLoja(nomeLoja));
	}
	
	@PostMapping("/cadastrar")
	public ResponseEntity<Produto> post (@RequestBody Produto produto){
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(produto));
	}
	
	@PutMapping("/alterar")
	public ResponseEntity<Produto> put (@RequestBody Produto produto){
		return ResponseEntity.ok(repository.save(produto));
	}
	
	@DeleteMapping("/deletar/{id}")
	public void delete (@PathVariable long id) {
		repository.deleteById(id);
	}

}
