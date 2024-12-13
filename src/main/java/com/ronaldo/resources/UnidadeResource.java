package com.ronaldo.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ronaldo.entities.Unidade;
import com.ronaldo.services.UnidadeService;

@RestController
@RequestMapping(value = "unidades")
public class UnidadeResource {
	
	@Autowired
	private UnidadeService service;

	@GetMapping()
	public ResponseEntity<List<Unidade>> findAll() {
		List<Unidade> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Unidade> findById(@PathVariable Long id){
		Unidade u = service.findById(id);
		return ResponseEntity.ok().body(u);
	}

}
