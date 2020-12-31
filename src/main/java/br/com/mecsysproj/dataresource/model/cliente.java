package br.com.mecsysproj.dataresource.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table 
public class cliente implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idCliente;
	
    private String nomeCliente;
    private String situacaoCliente;
    private String tipoCliente;
    private String cpf;
    private String cnpj;
    private String emailCliente;
    private String telefoneCliente;
    private String celularCliente;
    private String enderecoCliente;
    private String numeroCliente;
    private String bairroCliente;
    private String cidadeCliente;
    private String ufCliente;
    private String obsCliente;
    private String cepCliente;
    
    
  
    public cliente() {}
    
	public cliente(Integer idCliente, String nomeCliente, String situacaoCliente, String tipoCliente, String cpf,
			String cnpj, String emailCliente, String telefoneCliente, String celularCliente, String enderecoCliente,
			String numeroCliente, String bairroCliente, String cidadeCliente, String ufCliente, String obsCliente,
			String cepCliente) {
		
		this.idCliente = idCliente;
		this.nomeCliente = nomeCliente;
		this.situacaoCliente = situacaoCliente;
		this.tipoCliente = tipoCliente;
		this.cpf = cpf;
		this.cnpj = cnpj;
		this.emailCliente = emailCliente;
		this.telefoneCliente = telefoneCliente;
		this.celularCliente = celularCliente;
		this.enderecoCliente = enderecoCliente;
		this.numeroCliente = numeroCliente;
		this.bairroCliente = bairroCliente;
		this.cidadeCliente = cidadeCliente;
		this.ufCliente = ufCliente;
		this.obsCliente = obsCliente;
		this.cepCliente = cepCliente;
	}

	public Integer getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getSituacaoCliente() {
		return situacaoCliente;
	}

	public void setSituacaoCliente(String situacaoCliente) {
		this.situacaoCliente = situacaoCliente;
	}

	public String getTipoCliente() {
		return tipoCliente;
	}

	public void setTipoCliente(String tipoCliente) {
		this.tipoCliente = tipoCliente;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getEmailCliente() {
		return emailCliente;
	}

	public void setEmailCliente(String emailCliente) {
		this.emailCliente = emailCliente;
	}

	public String getTelefoneCliente() {
		return telefoneCliente;
	}

	public void setTelefoneCliente(String telefoneCliente) {
		this.telefoneCliente = telefoneCliente;
	}

	public String getCelularCliente() {
		return celularCliente;
	}

	public void setCelularCliente(String celularCliente) {
		this.celularCliente = celularCliente;
	}

	public String getEnderecoCliente() {
		return enderecoCliente;
	}

	public void setEnderecoCliente(String enderecoCliente) {
		this.enderecoCliente = enderecoCliente;
	}

	public String getNumeroCliente() {
		return numeroCliente;
	}

	public void setNumeroCliente(String numeroCliente) {
		this.numeroCliente = numeroCliente;
	}

	public String getBairroCliente() {
		return bairroCliente;
	}

	public void setBairroCliente(String bairroCliente) {
		this.bairroCliente = bairroCliente;
	}

	public String getCidadeCliente() {
		return cidadeCliente;
	}

	public void setCidadeCliente(String cidadeCliente) {
		this.cidadeCliente = cidadeCliente;
	}

	public String getUfCliente() {
		return ufCliente;
	}

	public void setUfCliente(String ufCliente) {
		this.ufCliente = ufCliente;
	}

	public String getObsCliente() {
		return obsCliente;
	}

	public void setObsCliente(String obsCliente) {
		this.obsCliente = obsCliente;
	}

	public String getCepCliente() {
		return cepCliente;
	}

	public void setCepCliente(String cepCliente) {
		this.cepCliente = cepCliente;
	}
}
