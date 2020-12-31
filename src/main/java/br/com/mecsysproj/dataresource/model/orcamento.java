package br.com.mecsysproj.dataresource.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class orcamento implements Serializable{
		
	
	private static final long serialVersionUID = -3915402540163806138L;
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Integer idOrc;
	    private Integer cliente_idCliente;
	    private Integer funcionario_idFunc;
	    private String veiculo_placaVeiculo;
	    private Integer servico_idServico;
	    private String situacaoOrcamento;
	    private String descricaoServico;
	    private Date dataAtual;
	    private Double valorServico;
	   
	   
	   
	    
	    public orcamento() {}
	    
	    public orcamento(Integer idOrc, Integer cliente_idCliente, String nomeCliente, Integer servico_idServico,
				String nomeServico, String descricaoServico, String veiculo_placaVeiculo, Date dataAtual,
				Double valorServico, String situcaoOrcamento, Integer funcionario_idFunc, String nomeFuncionario) {
		
			this.idOrc = idOrc;
			this.cliente_idCliente = cliente_idCliente;
			this.servico_idServico = servico_idServico;
			this.descricaoServico = descricaoServico;
			this.veiculo_placaVeiculo = veiculo_placaVeiculo;
			this.dataAtual = dataAtual;
			this.valorServico = valorServico;
			this.funcionario_idFunc = funcionario_idFunc;
		
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
		public Integer getServico_idServico() {
			return servico_idServico;
		}
		public void setServico_idServico(Integer servico_idServico) {
			this.servico_idServico = servico_idServico;
		}
		public String getDescricaoServico() {
			return descricaoServico;
		}
		public void setDescricaoServico(String descricaoServico) {
			this.descricaoServico = descricaoServico;
		}
		public String getVeiculo_placaVeiculo() {
			return veiculo_placaVeiculo;
		}
		public void setVeiculo_placaVeiculo(String veiculo_placaVeiculo) {
			this.veiculo_placaVeiculo = veiculo_placaVeiculo;
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
		public String getSituacaoOrcamento() {
			return situacaoOrcamento;
		}
		public void setSituacaoOrcamento(String situacaoOrcamento) {
			this.situacaoOrcamento = situacaoOrcamento;
		}
		public Integer getFuncionario_idFunc() {
			return funcionario_idFunc;
		}
		public void setFuncionario_idFunc(Integer funcionario_idFunc) {
			this.funcionario_idFunc = funcionario_idFunc;
		}
		
	    
	    
	    
	    
}
