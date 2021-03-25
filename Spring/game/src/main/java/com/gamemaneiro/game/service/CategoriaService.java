package com.gamemaneiro.game.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gamemaneiro.game.model.Categoria;
import com.gamemaneiro.game.repository.CategoriaRepository;

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository repository;
	
	public List<Categoria> listarCategorias(Categoria categoria){
		return repository.findAll();
	}
	
	public Optional<Categoria> buscaPorId(Long id){
		return repository.findById(id);
	}
	
	public List<Categoria> filtrarPorClassificacao(String classificacao){
		return repository.findByClassificacaoContainingIgnoreCase(classificacao);
	}
	
	public Categoria salvar(Categoria categoria){
		return repository.save(categoria);
	}
	public Categoria salvar(Categoria categoria, String valor){
		return repository.save(categoria);
	}
	
	public Optional<Categoria> alterar(Categoria categoria) {
		Optional<Categoria> existente = repository.findById(categoria.getId());
		if (existente.isEmpty()) {
			return Optional.empty();
		} else {
			existente.get().setClassificacao(categoria.getClassificacao());
			existente.get().setTipo(categoria.getTipo());
			
			return Optional.ofNullable(repository.save(existente.get()));
		}
	}
	
	public Optional<Categoria> deletar(Long id){
		repository.deleteById(id);
		return Optional.empty();
	}
}
