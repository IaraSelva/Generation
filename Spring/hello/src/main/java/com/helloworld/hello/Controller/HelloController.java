package com.helloworld.hello.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/habilidades")
public class HelloController {
	
	@GetMapping
	public String habilidades() {
		return "Persistência, Orientação ao Futuro, Mentalidade de Crescimento";
	}

}
