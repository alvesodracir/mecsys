package br.com.mecsysproj.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.mecsysproj.dataresource.model.servico;

@Repository
public interface servicoRepository extends JpaRepository<servico, Integer>{
	
}
