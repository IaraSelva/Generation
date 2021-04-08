package com.testes.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.testes.model.ContatoModel;

public interface ContatoRepository extends JpaRepository<ContatoModel, Long>{

	List<ContatoModel> findFirstByNome(String nome);
	
	List<ContatoModel> findAllByNomeContainingIgnoreCase(String nome);

}
