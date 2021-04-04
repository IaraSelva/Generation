package com.desafioecommerce.boaz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.desafioecommerce.boaz.model.Loja;

@Repository
public interface LojaRepository extends JpaRepository<Loja, Long>{

}
