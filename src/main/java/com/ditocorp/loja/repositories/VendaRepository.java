package com.ditocorp.loja.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ditocorp.loja.entities.Venda;

public interface VendaRepository extends JpaRepository<Venda, Long> {

}
