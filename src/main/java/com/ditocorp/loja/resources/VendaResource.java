package com.ditocorp.loja.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ditocorp.loja.entities.Venda;
import com.ditocorp.loja.services.VendaService;

@RestController
@RequestMapping(value = "/vendas")
public class VendaResource {

	@Autowired
	private VendaService service;

	@GetMapping
	public ResponseEntity<List<Venda>> findAll() {
		List<Venda> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}

	@GetMapping(value = "/{idVenda}")
	public ResponseEntity<Venda> findById(@PathVariable Long idVenda) {
		Venda obj = service.findById(idVenda);
		return ResponseEntity.ok().body(obj);
	}

}
