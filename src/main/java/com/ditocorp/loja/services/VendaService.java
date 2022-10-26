package com.ditocorp.loja.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ditocorp.loja.entities.Venda;
import com.ditocorp.loja.repositories.VendaRepository;

@Service
public class VendaService {

	@Autowired
	public VendaRepository repository;

	public List<Venda> findAll() {
		return repository.findAll();
	}

	public Venda findById(Long idVenda) {
		Optional<Venda> obj = repository.findById(idVenda);
		return obj.get();
	}

}
