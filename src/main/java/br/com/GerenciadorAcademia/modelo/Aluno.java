package br.com.GerenciadorAcademia.modelo;

import java.time.LocalDateTime;

import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Aluno {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@NotNull @Column(length = 30)
	private String nome;
	@NotNull @Column(length = 11)
	private Integer cpf;
	@NotNull @Column(length = 11)
	private Integer telefone;
	@NotNull @Column(length = 20)
	private String email;
	@NotNull @Column(length = 1)
	private String sexo;
	private LocalDateTime dtNasc;
	@ManyToOne
	private Endereco endereco;

	public Aluno() {
	}

	public Aluno(Long id, String nome, Integer cpf, Integer telefone, String email, String sexo,
			LocalDateTime dtNasc, Endereco endereco) {
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
		this.telefone = telefone;
		this.email = email;
		this.sexo = sexo;
		this.dtNasc = dtNasc;
		this.endereco = endereco;
	}

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

	public Integer getCpf() {
		return cpf;
	}

	public void setCpf(Integer cpf) {
		this.cpf = cpf;
	}

	public Integer getTelefone() {
		return telefone;
	}

	public void setTelefone(Integer telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public LocalDateTime getDtNasc() {
		return dtNasc;
	}

	public void setDtNasc(LocalDateTime dtNasc) {
		this.dtNasc = dtNasc;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
}
