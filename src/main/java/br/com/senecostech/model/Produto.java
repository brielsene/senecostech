package br.com.senecostech.model;

import java.math.BigDecimal;

public class Produto {
	private int id;
	private String nome, descricao;
	private BigDecimal valor;
	
	
	public Produto(String nome, String descricao, BigDecimal valor) {
		this.nome = nome;
		this.descricao = descricao;
		this.valor = valor;
	}
	
	public Produto(int id, String nome, String descricao, BigDecimal valor) {
		this.id = id;
		this.nome = nome;
		this.descricao = descricao;
		this.valor = valor;
	}
	
	public int getId() {
		return id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public BigDecimal getValor() {
		return valor;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	@Override
	public String toString() {
		return "Produto [id=" + id + ", nome=" + nome + ", descricao=" + descricao + ", valor=" + valor + "]";
	}
	
	
	
	
	
	
	
	
	

}
