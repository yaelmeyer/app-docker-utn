package com.curso.docker.tp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/saludo")
public class SaludoController {

	@GetMapping("/hola")
	public String saludo() {
		return "saludo";
	}
}
