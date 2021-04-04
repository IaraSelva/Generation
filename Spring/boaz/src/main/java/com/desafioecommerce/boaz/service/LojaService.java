package com.desafioecommerce.boaz.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.desafioecommerce.boaz.repository.LojaRepository;

@Service
public class LojaService {
	
	@Autowired
	public LojaRepository repository;
	
	

}
