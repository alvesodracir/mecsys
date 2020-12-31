package br.com.mecsysproj.dataresource.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class servico implements Serializable {

		private static final long serialVersionUID = 4676454435180129123L;
	   @Id
	   @GeneratedValue(strategy = GenerationType.IDENTITY)
	   private Integer idServico;
	   private String nomeServico;
	   private String descricaoServico;
	   private Double valorServico;
	   private String situacaoServico;
	   
	   public servico() {}
	   
	   public servico(Integer idServico, String nomeServico, String descricaoServico, Double valorServico,
			String situacaoServico) {
		
		this.idServico = idServico;
		this.nomeServico = nomeServico;
		this.descricaoServico = descricaoServico;
		this.valorServico = valorServico;
		this.situacaoServico = situacaoServico;
	}

	public Integer getIdServico() {
		return idServico;
	}

	public void setIdServico(Integer idServico) {
		this.idServico = idServico;
	}

	public String getNomeServico() {
		return nomeServico;
	}

	public void setNomeServico(String nomeServico) {
		this.nomeServico = nomeServico;
	}

	public String getDescricaoServico() {
		return descricaoServico;
	}

	public void setDescricaoServico(String descricaoServico) {
		this.descricaoServico = descricaoServico;
	}

	public Double getValorServico() {
		return valorServico;
	}

	public void setValorServico(Double valorServico) {
		this.valorServico = valorServico;
	}

	public String getSituacaoServico() {
		return situacaoServico;
	}

	public void setSituacaoServico(String situacaoServico) {
		this.situacaoServico = situacaoServico;
	}
	   
	   
	   
	   
}
