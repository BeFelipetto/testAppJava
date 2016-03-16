package br.com.ages.negocio;

import java.util.Date;

public class Estagiario {

	private String nome;
	private Date dataInicio;

	public Estagiario() {
		// TODO Auto-generated constructor stub
	}

	public Estagiario(String nome, Date dataInicio) {
		super();
		this.nome = nome;
		this.dataInicio = dataInicio;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}

	@Override
	public String toString() {
		return "Estagiario [nome=" + nome + ", dataInicio=" + dataInicio + "]";
	}

}
