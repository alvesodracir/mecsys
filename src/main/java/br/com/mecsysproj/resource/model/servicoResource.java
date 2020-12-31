package br.com.mecsysproj.resource.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class servicoResource {

	   @JsonProperty
	   private Integer idServico;
	   private String nomeServico;
	   private String descricaoServico;
	   private Double valorServico;
	   private String situacaoServico;
	   
	   public servicoResource() {}
	   
	public servicoResource(Integer idServico, String nomeServico, String descricaoServico, Double valorServico,
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
