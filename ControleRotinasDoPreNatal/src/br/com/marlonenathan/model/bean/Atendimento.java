package br.com.marlonenathan.model.bean;

public class Atendimento extends Pessoa {

	private int qtdFilhos;
	private int qtdGravidez;
	private int qtdPartos;
	private int qtdAbortos;
	private boolean doencaPrevia;
	private String dtUltimoPreventivo;
	private String exameBHCG;
	private int igUSGDias;
	private int igUSGSemanas;
	private String ultimaUSG;
	private String ultimaMenstruacao;
	private int numDeConsultas;
	private String observacoes;
	private int maxConsulta;
	

	public int getMaxConsulta() {
		return maxConsulta;
	}

	public void setMaxConsulta(int maxConsulta) {
		this.maxConsulta = maxConsulta;
	}

	public int getQtdFilhos() {
		return qtdFilhos;
	}

	public void setQtdFilhos(int qtdFilhos) {
		this.qtdFilhos = qtdFilhos;
	}

	public int getQtdGravidez() {
		return qtdGravidez;
	}

	public void setQtdGravidez(int qtdGravidez) {
		this.qtdGravidez = qtdGravidez;
	}

	public int getQtdPartos() {
		return qtdPartos;
	}

	public void setQtdPartos(int qtdPartos) {
		this.qtdPartos = qtdPartos;
	}

	public int getQtdAbortos() {
		return qtdAbortos;
	}

	public void setQtdAbortos(int qtdAbortos) {
		this.qtdAbortos = qtdAbortos;
	}

	public boolean getDoencaPrevia() {
		return doencaPrevia;
	}

	public void setDoencaPrevia(boolean doencaPrevia) {
		this.doencaPrevia = doencaPrevia;
	}

	public String getDtUltimoPreventivo() {
		return dtUltimoPreventivo;
	}

	public void setDtUltimoPreventivo(String dtUltimoPreventivo) {
		this.dtUltimoPreventivo = dtUltimoPreventivo;
	}

	public String getExameBHCG() {
		return exameBHCG;
	}

	public void setExameBHCG(String exameBHCG) {
		this.exameBHCG = exameBHCG;
	}

	public int getIgUSGDias() {
		return igUSGDias;
	}

	public void setIgUSGDias(int igUSGDias) {
		this.igUSGDias = igUSGDias;
	}

	public int getIgUSGSemanas() {
		return igUSGSemanas;
	}

	public void setIgUSGSemanas(int igUSGSemanas) {
		this.igUSGSemanas = igUSGSemanas;
	}

	public String getUltimaUSG() {
		return ultimaUSG;
	}

	public void setUltimaUSG(String ultimaUSG) {
		this.ultimaUSG = ultimaUSG;
	}

	public String getUltimaMenstruacao() {
		return ultimaMenstruacao;
	}

	public void setUltimaMenstruacao(String ultimaMenstruacao) {
		this.ultimaMenstruacao = ultimaMenstruacao;
	}

	public int getNumDeConsultas() {
		return numDeConsultas;
	}

	public void setNumDeConsultas(int numDeConsultas) {
		this.numDeConsultas = numDeConsultas;
	}

	public String getObservacoes() {
		return observacoes;
	}

	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}
}
