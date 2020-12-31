package br.com.mecsysproj.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.mecsysproj.dataresource.model.funcionario;

public interface funcionarioRepository extends JpaRepository<funcionario, Integer>{

}
