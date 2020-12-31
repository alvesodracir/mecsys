package br.com.mecsysproj.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.mecsysproj.dataresource.model.servico;
import br.com.mecsysproj.repository.servicoRepository;

@RestController
@RequestMapping(value = "/api")
public class servicoController {
	
	@Autowired
	public servicoRepository repository;
	
	@GetMapping(path = "/servico")
	public List<servico> buscarServico(){
		return repository.findAll();
	}
	
	@GetMapping(path = "/servico/id/{id}")
	public Optional<servico> buscarServicoPorId(@PathVariable(name = "id", required = true) Integer id){
		return repository.findById(id);
	}
	
	@PostMapping(path = "/servico/save")
	public void salvarServico(@RequestBody servico serv) {
		repository.save(serv);
	}
	

}
