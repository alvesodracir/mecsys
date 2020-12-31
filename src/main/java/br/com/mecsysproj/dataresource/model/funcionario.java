package br.com.mecsysproj.dataresource.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class funcionario implements Serializable{

		private static final long serialVersionUID = -3524137468461543761L;
	@Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Integer idFunc;
	 private String nomeFuncionario;
	 private String situacaoFuncionario;
	 private String cpf;
	 private String emailFuncionario;
	 private String telefoneFuncionario;
	 private String celularFuncionario;
	 private String enderecoFuncionario;
	 private String numeroFuncionario;
	 private String bairroFuncionario;
	 private String cidadeFuncionario;
	 private String ufFuncionario;
	 private String obsFuncionario;
	 
	 public funcionario() {}
	 
	 
	 
	public funcionario(Integer idFunc, String nomeFuncionario, String situacaoFuncionario, String cpf,
			String emailFuncionario, String telefoneFuncionario, String celularFuncionario, String enderecoFuncionario,
			String numeroFuncionario, String bairroFuncionario, String cidadeFuncionario, String ufFuncionario,
			String obsFuncionario) {
		
		this.idFunc = idFunc;
		this.nomeFuncionario = nomeFuncionario;
		this.situacaoFuncionario = situacaoFuncionario;
		this.cpf = cpf;
		this.emailFuncionario = emailFuncionario;
		this.telefoneFuncionario = telefoneFuncionario;
		this.celularFuncionario = celularFuncionario;
		this.enderecoFuncionario = enderecoFuncionario;
		this.numeroFuncionario = numeroFuncionario;
		this.bairroFuncionario = bairroFuncionario;
		this.cidadeFuncionario = cidadeFuncionario;
		this.ufFuncionario = ufFuncionario;
		this.obsFuncionario = obsFuncionario;
	}



	public Integer getIdFunc() {
		return idFunc;
	}
	public void setIdFunc(Integer idFunc) {
		this.idFunc = idFunc;
	}
	public String getNomeFuncionario() {
		return nomeFuncionario;
	}
	public void setNomeFuncionario(String nomeFuncionario) {
		this.nomeFuncionario = nomeFuncionario;
	}
	public String getSituacaoFuncionario() {
		return situacaoFuncionario;
	}
	public void setSituacaoFuncionario(String situacaoFuncionario) {
		this.situacaoFuncionario = situacaoFuncionario;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getEmailFuncionario() {
		return emailFuncionario;
	}
	public void setEmailFuncionario(String emailFuncionario) {
		this.emailFuncionario = emailFuncionario;
	}
	public String getTelefoneFuncionario() {
		return telefoneFuncionario;
	}
	public void setTelefoneFuncionario(String telefoneFuncionario) {
		this.telefoneFuncionario = telefoneFuncionario;
	}
	public String getCelularFuncionario() {
		return celularFuncionario;
	}
	public void setCelularFuncionario(String celularFuncionario) {
		this.celularFuncionario = celularFuncionario;
	}
	public String getEnderecoFuncionario() {
		return enderecoFuncionario;
	}
	public void setEnderecoFuncionario(String enderecoFuncionario) {
		this.enderecoFuncionario = enderecoFuncionario;
	}
	public String getNumeroFuncionario() {
		return numeroFuncionario;
	}
	public void setNumeroFuncionario(String numeroFuncionario) {
		this.numeroFuncionario = numeroFuncionario;
	}
	public String getBairroFuncionario() {
		return bairroFuncionario;
	}
	public void setBairroFuncionario(String bairroFuncionario) {
		this.bairroFuncionario = bairroFuncionario;
	}
	public String getCidadeFuncionario() {
		return cidadeFuncionario;
	}
	public void setCidadeFuncionario(String cidadeFuncionario) {
		this.cidadeFuncionario = cidadeFuncionario;
	}
	public String getUfFuncionario() {
		return ufFuncionario;
	}
	public void setUfFuncionario(String ufFuncionario) {
		this.ufFuncionario = ufFuncionario;
	}
	public String getObsFuncionario() {
		return obsFuncionario;
	}
	public void setObsFuncionario(String obsFuncionario) {
		this.obsFuncionario = obsFuncionario;
	}
	 
	 

}
