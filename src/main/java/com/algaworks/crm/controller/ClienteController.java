package com.algaworks.crm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.algaworks.crm.model.Cliente;
import com.algaworks.crm.repository.ClienteRepository;

@RestController //Dizendo que é um controlador Rest
@RequestMapping("/clientes") //vai mapear os endpoints pra receber requisições /clientes
public class ClienteController {
	@Autowired
	private ClienteRepository clienteRepository;
	
	//Preciso mapear qual metodo ira responder a requisição do verbo GET
	@GetMapping
	public List<Cliente> listar() {
		return clienteRepository.findAll();
	}
	
	@PostMapping
	public Cliente adicionar(@RequestBody Cliente cliente) {
		return clienteRepository.save(cliente);
	}
}
