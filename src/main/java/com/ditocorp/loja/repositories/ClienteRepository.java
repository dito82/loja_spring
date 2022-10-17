package com.ditocorp.loja.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ditocorp.loja.entities.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}
