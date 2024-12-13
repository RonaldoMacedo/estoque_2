package com.ronaldo.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.ronaldo.entities.Fornecedor;
import com.ronaldo.entities.Unidade;
import com.ronaldo.repositories.FornecedorRepository;
import com.ronaldo.repositories.UnidadeRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{
	
	@Autowired
	private FornecedorRepository fornecedorRepository;
	@Autowired
	private UnidadeRepository unidadeRepository;

	@Override
	public void run(String... args) throws Exception {
		
		Fornecedor f1 = new Fornecedor(null, "COMERCIAL 3 ALBE LTDA", "3 ALBE", "74.400.052/0001-91", null, Instant.now(), 'n');
		Fornecedor f2 = new Fornecedor(null, "Aimara Comércio e Representações Ltda", "Aimara", "57.202.418/0001-07", null, Instant.now(), 's');
		
		Unidade u1 = new Unidade(null, "Unidade 23 de Maio", Instant.now(), 's');
		Unidade u2 = new Unidade(null, "Unidade Anchieta", Instant.now(), 's');
		Unidade u3 = new Unidade(null, "Unidade Varzea Paulista", Instant.now(), 's');
		
		fornecedorRepository.saveAll(Arrays.asList(f1, f2));
		unidadeRepository.saveAll(Arrays.asList(u1, u2, u3));
	}
	
	

}
