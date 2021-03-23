package com.generation.farmacia.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tb_categoria")
public class Categoria {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long Id;
	
	@NotNull
	@Size(min = 3, max = 20)
	private String nome;
	
	@NotNull
	private String descricao;
	
	@OneToMany(mappedBy = "categoriaDoProduto")
	@JsonIgnoreProperties("categoriaDoProduto")
	private List<Produto> produtos;
	
	
	
	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}

	public long getId() {
		return Id;
	}

	public void setId(long id) {
		Id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getClassificacao() {
		return descricao;
	}

	public void setClassificacao(String classificacao) {
		this.descricao = classificacao;
	}
	public List<Produto> getProdutos() {
		return produtos;
	}

}
