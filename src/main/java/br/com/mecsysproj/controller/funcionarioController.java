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

import br.com.mecsysproj.dataresource.model.funcionario;
import br.com.mecsysproj.repository.funcionarioRepository;


@RestController
@RequestMapping(value = "/api")


public class funcionarioController {
	
	@Autowired
	public funcionarioRepository repository;
	
	@GetMapping(path = "/funcionario")
	public List<funcionario> buscarFuncionarios(){
		return repository.findAll();
	}
	
	@GetMapping(path = "/funcionario/id/{id}")
	public Optional<funcionario> buscarFuncionarioPorId(@PathVariable(name = "id", required = true) Integer id){
		return repository.findById(id);
	}
	
	@PostMapping(path = "/funcionario/save")
	public void salvarFuncionario(@RequestBody funcionario func) {
		repository.save(func);
	}
		
	

}
