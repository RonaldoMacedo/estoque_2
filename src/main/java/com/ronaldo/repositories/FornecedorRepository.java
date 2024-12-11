package com.ronaldo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ronaldo.entities.Fornecedor;

public interface FornecedorRepository extends JpaRepository<Fornecedor, Long> {

}
