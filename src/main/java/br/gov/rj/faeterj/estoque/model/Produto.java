package br.gov.rj.faeterj.estoque.model;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;

public class Produto {

	@NotBlank(message = "O campo SKU não pode ficar em branco")
	private String sku;
	
	@Size(min = 3, message = "O nome precisa conter mais de 3 caracteres!")
	private String nome;
	
	@Size(min = 1, max = 50, message = "A descrição precisa conter entre 1 e 50 caracteres!")
	private String descricao;
	
	public String getSku() {
		return sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getDescricao() {
		return this.descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}
