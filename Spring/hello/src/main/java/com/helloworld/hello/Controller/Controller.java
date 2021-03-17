package com.helloworld.hello.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/objetivos")
public class Controller {
	
	@GetMapping
	public String objetivos() {
		return "Modelar o banco de dados e implementar Spring ao Projeto";
	}

}
