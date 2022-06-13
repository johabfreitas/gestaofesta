package br.com.johabfreitas.festa.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity // torna a nossa classe como uma entidade de banco de dados;
public class Convidado implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * (Id, GeneratedValue) São para marcar a propriedade id como identificador da entidade (ou seja, a
	 * chave primária no banco de dados) e para pedir que o Hibernate (nossa
	 * implementação por trás do JPA) gere o identificador para nós,
	 * respectivamente.
	 */

	@Id
	@GeneratedValue
	private Long id;

	private String nome;

	private Integer quantidadeAcompanhantes;

	//getters e setters;
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getQuantidadeAcompanhantes() {
		return quantidadeAcompanhantes;
	}

	public void setQuantidadeAcompanhantes(Integer quantidadeAcompanhantes) {
		this.quantidadeAcompanhantes = quantidadeAcompanhantes;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
