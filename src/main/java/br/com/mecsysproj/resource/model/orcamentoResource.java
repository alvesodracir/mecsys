package br.com.mecsysproj.resource.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

public class orcamentoResource {

		@JsonProperty
	    private Integer idOrc;
	    private Integer cliente_idCliente;
	    private Integer funcionario_idFunc;
	    private String veiculo_placaVeiculo;
	    private Integer servico_idServico;
	    private String situacaoOrcamento;
	    private String descricaoServico;
	    private Date dataAtual;
	    private Double valorServico;
	    
	    public orcamentoResource() {}
	    
	    public orcamentoResource(Integer idOrc, Integer cliente_idCliente, Integer funcionario_idFunc,
				String veiculo_placaVeiculo, Integer servico_idServico, String situacaoOrcamento,
				String descricaoServico, Date dataAtual, Double valorServico) {


			this.idOrc = idOrc;
			this.cliente_idCliente = cliente_idCliente;
			this.funcionario_idFunc = funcionario_idFunc;
			this.veiculo_placaVeiculo = veiculo_placaVeiculo;
			this.servico_idServico = servico_idServico;
			this.situacaoOrcamento = situacaoOrcamento;
			this.descricaoServico = descricaoServico;
			this.dataAtual = dataAtual;
			this.valorServico = valorServico;
		}

		public Integer getIdOrc() {
			return idOrc;
		}

		public void setIdOrc(Integer idOrc) {
			this.idOrc = idOrc;
		}

		public Integer getCliente_idCliente() {
			return cliente_idCliente;
		}

		public void setCliente_idCliente(Integer cliente_idCliente) {
			this.cliente_idCliente = cliente_idCliente;
		}

		public Integer getFuncionario_idFunc() {
			return funcionario_idFunc;
		}

		public void setFuncionario_idFunc(Integer funcionario_idFunc) {
			this.funcionario_idFunc = funcionario_idFunc;
		}

		public String getVeiculo_placaVeiculo() {
			return veiculo_placaVeiculo;
		}

		public void setVeiculo_placaVeiculo(String veiculo_placaVeiculo) {
			this.veiculo_placaVeiculo = veiculo_placaVeiculo;
		}

		public Integer getServico_idServico() {
			return servico_idServico;
		}

		public void setServico_idServico(Integer servico_idServico) {
			this.servico_idServico = servico_idServico;
		}

		public String getSituacaoOrcamento() {
			return situacaoOrcamento;
		}

		public void setSituacaoOrcamento(String situacaoOrcamento) {
			this.situacaoOrcamento = situacaoOrcamento;
		}

		public String getDescricaoServico() {
			return descricaoServico;
		}

		public void setDescricaoServico(String descricaoServico) {
			this.descricaoServico = descricaoServico;
		}

		public Date getDataAtual() {
			return dataAtual;
		}

		public void setDataAtual(Date dataAtual) {
			this.dataAtual = dataAtual;
		}

		public Double getValorServico() {
			return valorServico;
		}

		public void setValorServico(Double valorServico) {
			this.valorServico = valorServico;
		}
	    
	    
	    
}
