package com.desafioecommerce.boaz.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "tb_loja")
@Getter @Setter @NoArgsConstructor
public class Loja {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private long id;
	
	private String nomeLoja;
	
	private String descricao;
	
	@OneToMany(mappedBy = "loja", cascade = CascadeType.ALL)
	@JsonIgnoreProperties("loja")
	private List<Produto> produto;
	
	@ManyToMany
	@JoinTable(
			name = "tb_inscricao",
			joinColumns = @JoinColumn(name = "loja_id"),
			inverseJoinColumns = @JoinColumn(name = "usuario_id")
			)
	@JsonIgnoreProperties({""})
	private List<Usuario> usuario = new ArrayList<>();


	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public String getNomeLoja() {
		return nomeLoja;
	}
	
	public void setNomeLoja(String nomeLoja) {
		this.nomeLoja = nomeLoja;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public List<Produto> getProduto() {
		return produto;
	}
	
	public void setProduto(List<Produto> produto) {
		this.produto = produto;
	}
	
	public List<Usuario> getUsuario() {
		return usuario;
	}
	
	public void setUsuario(List<Usuario> usuario) {
		this.usuario = usuario;
	}

}
