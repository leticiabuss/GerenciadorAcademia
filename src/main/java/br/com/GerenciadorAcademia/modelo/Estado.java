package br.com.GerenciadorAcademia.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Estado {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY) @Column(length = 2)
	private String id;
	@NotNull @Column(length = 30)
	private String nome;

	public Estado() {
	}

	public Estado(String id, String nome) {
		this.id = id;
		this.nome = nome;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
