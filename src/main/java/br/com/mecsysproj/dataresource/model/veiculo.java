package br.com.mecsysproj.dataresource.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class veiculo implements Serializable{

		private static final long serialVersionUID = -3191336212504518886L;
		
	@Id
	/*@GeneratedValue(strategy = GenerationType.AUTO)*/
	private String placaVeiculo;
	private Integer cliente_idCliente;
    private String veiculo;
    private String marcaVeiculo;
    private String modeloVeiculo;
    private String obsVeiculo;
    private String situacaoVeiculo;
    private String frotaVeiculo;
    
    public veiculo() {}
    
	public veiculo(String placaVeiculo, Integer cliente_idCliente, String nomeCliente, String veiculo, 
			String marcaVeiculo, String modeloVeiculo, String obsVeiculo, String situacaoVeiculo, String frotaVeiculo) {
		
		this.placaVeiculo = placaVeiculo;
		this.cliente_idCliente = cliente_idCliente;
		this.veiculo = veiculo;
		this.marcaVeiculo = marcaVeiculo;
		this.modeloVeiculo = modeloVeiculo;
		this.obsVeiculo = obsVeiculo;
		this.situacaoVeiculo = situacaoVeiculo;
		this.frotaVeiculo = frotaVeiculo;
	}


	public Integer getCliente_idCliente() {
		return cliente_idCliente;
	}


	public void setCliente_idCliente(Integer cliente_idCliente) {
		this.cliente_idCliente = cliente_idCliente;
	}


	public String getVeiculo() {
		return veiculo;
	}


	public void setVeiculo(String veiculo) {
		this.veiculo = veiculo;
	}


	public String getPlacaVeiculo() {
		return placaVeiculo;
	}


	public void setPlacaVeiculo(String placaVeiculo) {
		this.placaVeiculo = placaVeiculo;
	}


	public String getMarcaVeiculo() {
		return marcaVeiculo;
	}


	public void setMarcaVeiculo(String marcaVeiculo) {
		this.marcaVeiculo = marcaVeiculo;
	}


	public String getModeloVeiculo() {
		return modeloVeiculo;
	}


	public void setModeloVeiculo(String modeloVeiculo) {
		this.modeloVeiculo = modeloVeiculo;
	}


	public String getObsVeiculo() {
		return obsVeiculo;
	}


	public void setObsVeiculo(String obsVeiculo) {
		this.obsVeiculo = obsVeiculo;
	}


	public String getSituacaoVeiculo() {
		return situacaoVeiculo;
	}


	public void setSituacaoVeiculo(String situacaoVeiculo) {
		this.situacaoVeiculo = situacaoVeiculo;
	}


	public String getFrotaVeiculo() {
		return frotaVeiculo;
	}


	public void setFrotaVeiculo(String frotaVeiculo) {
		this.frotaVeiculo = frotaVeiculo;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
    
    

	 
	
	 
}
