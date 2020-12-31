package br.com.mecsysproj.resource.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class veiculoResource {

	 @JsonProperty	
	 private String placaVeiculo;  
	 private Integer cliente_idCliente;
	 private String veiculo;
	 private String marcaVeiculo;
	 private String modeloVeiculo;
	 private String obsVeiculo;
	 private String situacaoVeiculo;
	 private String frotaVeiculo;
	    
	    public veiculoResource() {}
	    
	    

		public veiculoResource(Integer cliente_idCliente, String veiculo, String placaVeiculo, String marcaVeiculo,
				String modeloVeiculo, String obsVeiculo, String situacaoVeiculo, String frotaVeiculo) {
			
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
	 	 
	    
	 
	 
}
