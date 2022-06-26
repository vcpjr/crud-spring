package br.senac.sc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/celera")
public class CeleraController {
	
	@GetMapping
	public List<String> celeraMuito() {
		ArrayList<String> lista = new ArrayList<String>();
		lista.add("PASSEI PORRRAAAAAAAAAAAAAA");
		lista.add("Minha Nossa Sinhora");
		
		return lista;
	}
}
