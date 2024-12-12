package com.ronaldo.resources;

import java.time.Instant;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ronaldo.entities.Unidade;

@RestController
@RequestMapping(value = "unidades")
public class UnidadeResource {

	@GetMapping
	public ResponseEntity<Unidade> findAll() {
		Unidade u = new Unidade(1L, "Unidade 23 de Maio", Instant.now(), 's');
		return ResponseEntity.ok().body(u);
	}

}
