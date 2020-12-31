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

import br.com.mecsysproj.dataresource.model.cliente;
import br.com.mecsysproj.repository.clienteRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;



@RestController
@RequestMapping(value = "/api")
@Api(value = "API REST Clientes")
@CrossOrigin(origins = "*")
public class clienteController {

		@Autowired
		private clienteRepository repository;
		
		@GetMapping(path = "/cliente")
		@ApiOperation(value = "Retorna uma lista de clientes")
		public List<cliente> buscarClientes(){
			return repository.findAll(); 
		}
		
		@GetMapping(path = "/cliente/id/{id}")
		@ApiOperation(value = "Retorna um cliente único")
		public Optional<cliente> buscarClientePorId(@PathVariable(name = "id", required = true) Integer id){
			return repository.findById(id);
		}
		
		@PostMapping(path = "/cliente/save")
		@ApiOperation(value = "Salva um cliente")
		public void salvarCliente(@RequestBody cliente cli) {
			repository.save(cli);
		}
}