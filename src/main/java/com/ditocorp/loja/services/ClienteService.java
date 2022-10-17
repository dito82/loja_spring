package com.ditocorp.loja.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ditocorp.loja.entities.Cliente;
import com.ditocorp.loja.repositories.ClienteRepository;

@Service
public class ClienteService {

	@Autowired
	public ClienteRepository repository;

	public List<Cliente> findAll() {
		return repository.findAll();
	}

	public Cliente findById(Long idCliente) {
		Optional<Cliente> obj = repository.findById(idCliente);
		return obj.get();
	}

}
