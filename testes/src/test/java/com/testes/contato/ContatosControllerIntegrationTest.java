package com.testes.contato;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import junit.framework.Assert;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class ContatosControllerIntegrationTest {
	
	@Autowired
	private TestRestTemplate testRestTemplate;
	
	@SuppressWarnings("deprecation")
	@Test
	public void deveMostrarTodosContatos() {
	ResponseEntity<String> resposta = testRestTemplate.exchange("/contatos/", HttpMethod.GET, null, String.class);
	Assert.assertEquals(HttpStatus.OK, resposta.getStatusCode());
	}

}
