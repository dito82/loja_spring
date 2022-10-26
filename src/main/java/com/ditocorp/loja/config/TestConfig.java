package com.ditocorp.loja.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.ditocorp.loja.entities.Cliente;
import com.ditocorp.loja.entities.Venda;
import com.ditocorp.loja.entities.enums.VendaStatus;
import com.ditocorp.loja.repositories.ClienteRepository;
import com.ditocorp.loja.repositories.VendaRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

	@Autowired
	private ClienteRepository clienteRepository;
	
	@Autowired
	private VendaRepository vendaRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		Cliente c1 = new Cliente(null, "Expedito", "99999999", "Rua Aurora", "Recife", "PE", "50050400", "BR");
		Cliente c2 = new Cliente(null, "Ferreira", "55555555", "Rua América", "Maceió", "AL", "60050455", "BR");
		
		Venda v1 = new Venda(null, 25L, 5.000, 7.500, c1, VendaStatus.LIBERADO);
		Venda v2 = new Venda(null, 25L, 5.000, 7.500, c2, VendaStatus.ABERTO);
		Venda v3 = new Venda(null, 25L, 5.000, 7.500, c2, VendaStatus.BLOQUEADO);
		Venda v4 = new Venda(null, 25L, 5.000, 7.500, c1, VendaStatus.ENCERRADO);
		
		clienteRepository.saveAll(Arrays.asList(c1, c2));
		vendaRepository.saveAll(Arrays.asList(v1, v2, v3, v4));
	}
	
	

}
