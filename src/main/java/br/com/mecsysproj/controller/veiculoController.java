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

import br.com.mecsysproj.dataresource.model.veiculo;
import br.com.mecsysproj.repository.veiculoRepository;

@RestController
@RequestMapping(value = "/api")
public class veiculoController {
	
	@Autowired
	private veiculoRepository repository;
	
	@GetMapping(path = "/veiculo")
	public List<veiculo> buscarVeiculos(){
		return repository.findAll();
	}
	
	@GetMapping(path = "/veiculo/id/{id}")
	public Optional<veiculo> buscarVeiculoPorPlaca(@PathVariable(name = "id", required = true) String id){
		return repository.findById(id);
		
	}
	
	@PostMapping(path = "/veiculo/save")
	public void salvarVeiculo(@RequestBody veiculo veic) {
		repository.save(veic);
	}

}
