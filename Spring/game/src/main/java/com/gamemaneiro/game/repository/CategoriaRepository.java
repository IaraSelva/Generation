package com.gamemaneiro.game.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gamemaneiro.game.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long>{

	public List<Categoria> findByClassificacaoContainingIgnoreCase(String categoria);
}
