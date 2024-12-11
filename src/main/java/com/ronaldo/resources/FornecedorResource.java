package com.ronaldo.resources;

import java.time.Instant;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ronaldo.entities.Fornecedor;

@RestController
@RequestMapping(value = "/fornecedores")
public class FornecedorResource {

	@GetMapping
	public ResponseEntity<Fornecedor> findAll() {
		Fornecedor f = new Fornecedor(1L, "COMERCIAL 3 ALBE LTDA", "3 ALBE", "74.400.052/0001-91", null, Instant.now(), 'n');
		return ResponseEntity.ok().body(f);
	}

}
