package br.com.mecsysproj.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.mecsysproj.dataresource.model.orcamento;
import br.com.mecsysproj.repository.orcamentoRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value = "/api")
@Api(value = "API REST Orcamentos")
@CrossOrigin(origins = "*")
public class orcamentoController {

	@Autowired
	public orcamentoRepository repository;
	
	@GetMapping(path = "/orcamento")
	@ApiOperation(value = "Retorna uma lista de orçamentos")
	public List<br.com.mecsysproj.dataresource.model.orcamento> buscarorcamentos(){
		return repository.findAll();
	}
	
	@GetMapping(path = "/orcamento/id/{id}")
	@ApiOperation(value = "Retorna um orçamento único ")
	public Optional<orcamento> buscarOrcamentoPorId(@PathVariable(name = "id", required = true) Integer id){
		return repository.findById(id);
	}
	
	@PostMapping(path = "/orcamento/save")
	@ApiOperation(value = "Salva um orçamento")
	public void salvarOrcamento (@RequestBody orcamento orc) {
		repository.save(orc);
	}
}
