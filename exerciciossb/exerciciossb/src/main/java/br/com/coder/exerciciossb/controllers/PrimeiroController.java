package br.com.coder.exerciciossb.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrimeiroController {
	
//	@RequestMapping(method = RequestMethod.GET, path = "/ola")
	@GetMapping(path = {"/ola", "/saudacao"}) // posso ter mais de uma URL para rodar
	public String ola() {
		return "Olá Spring Boot";
	}

}
