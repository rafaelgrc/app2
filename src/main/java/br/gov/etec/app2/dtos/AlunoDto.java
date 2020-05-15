package br.gov.etec.app2.dtos;

import java.io.Serializable;
import java.util.Date;

public class AlunoDto implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String nome;
	private String rg;
	private String cpf;
	private String email;
	private Date dataNasc;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getDataNasc() {
		return dataNasc;
	}
	public void setDataNasc(Date dataNasc) {
		this.dataNasc = dataNasc;
	}
	


}
