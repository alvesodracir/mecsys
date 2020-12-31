package br.com.mecsysproj.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.mecsysproj.dataresource.model.veiculo;

@Repository
public interface veiculoRepository extends JpaRepository<veiculo, String>{

}
