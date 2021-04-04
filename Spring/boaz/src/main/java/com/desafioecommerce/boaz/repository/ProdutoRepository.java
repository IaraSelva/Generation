package com.desafioecommerce.boaz.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.desafioecommerce.boaz.model.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long>{
	
	public List<Produto> findAllBytituloProdutoContainingIgnoreCase (String tituloProduto);
	
	public List<Produto> findAllByValorLessThanEqual (double valor);
	
	public List<Produto> findAllByValorGreaterThanEqual (double valor);
	
	@Query(value = "SELECT * FROM tb_produto inner join tb_loja on tb_loja.id = tb_produto.loja_id where nome_loja like %:nome%", nativeQuery = true)
	public List<Produto> findAllProdutoByLojaNomeLoja(@Param("nome")String nome);

}
