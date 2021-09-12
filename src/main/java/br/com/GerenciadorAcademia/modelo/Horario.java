package br.com.GerenciadorAcademia.modelo;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

@Entity
public class Horario {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@ManyToOne
	private Instrutor instrutor;
	@NotNull
	private Integer hrInicial;
	@NotNull
	private Integer hrFinal;
	@Enumerated(EnumType.STRING)
	private DiaDaSemana diaDaSemana;
	@NotNull
	private Integer limite;

	public Horario() {
	}

	public Horario(Long id, Instrutor instrutor, Integer hrInicial, Integer hrFinal,
			DiaDaSemana diaDaSemana, Integer limite) {
		this.id = id;
		this.instrutor = instrutor;
		this.hrInicial = hrInicial;
		this.hrFinal = hrFinal;
		this.diaDaSemana = diaDaSemana;
		this.limite = limite;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Instrutor getInstrutor() {
		return instrutor;
	}

	public void setInstrutor(Instrutor instrutor) {
		this.instrutor = instrutor;
	}

	public Integer getHrInicial() {
		return hrInicial;
	}

	public void setHrInicial(Integer hrInicial) {
		this.hrInicial = hrInicial;
	}

	public Integer getHrFinal() {
		return hrFinal;
	}

	public void setHrFinal(Integer hrFinal) {
		this.hrFinal = hrFinal;
	}

	public DiaDaSemana getDiaDaSemana() {
		return diaDaSemana;
	}

	public void setDiaDaSemana(DiaDaSemana diaDaSemana) {
		this.diaDaSemana = diaDaSemana;
	}

	public Integer getLimite() {
		return limite;
	}

	public void setLimite(Integer limite) {
		this.limite = limite;
	}
}
