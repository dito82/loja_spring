package com.ditocorp.loja.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.ditocorp.loja.entities.Cliente;
import com.ditocorp.loja.repositories.ClienteRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

	@Autowired
	private ClienteRepository clienteRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		Cliente c1 = new Cliente(null, "Expedito", "99999999", "Rua Aurora", "Recife", "PE", "50050400", "BR");
		Cliente c2 = new Cliente(null, "Ferreira", "55555555", "Rua América", "Maceió", "AL", "60050455", "BR");
		
		clienteRepository.saveAll(Arrays.asList(c1, c2));
	}
	
	

}
