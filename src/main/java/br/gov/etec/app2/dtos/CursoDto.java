package br.gov.etec.app2.dtos;

import java.io.Serializable;

public class CursoDto implements Serializable{

	private static final long serialVersionUID = 1L;
	
    private String nome;
	
	private String descricao;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
}