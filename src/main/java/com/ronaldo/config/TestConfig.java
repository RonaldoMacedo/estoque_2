package com.ronaldo.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.ronaldo.entities.Fornecedor;
import com.ronaldo.repositories.FornecedorRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{
	
	@Autowired
	private FornecedorRepository fornecedorRepository;

	@Override
	public void run(String... args) throws Exception {
		
		Fornecedor f1 = new Fornecedor(null, "COMERCIAL 3 ALBE LTDA", "3 ALBE", "74.400.052/0001-91", null, Instant.now(), 'n');
		Fornecedor f2 = new Fornecedor(null, "Aimara Comércio e Representações Ltda", "Aimara", "57.202.418/0001-07", null, Instant.now(), 's');
		
		fornecedorRepository.saveAll(Arrays.asList(f1, f2));
	}
	
	

}
