package com.udemy.orientacaoobjetos.secao03.heranca;

public class Gerente extends Funcionario {
	private String senha;
	private int tempoEmpresa;
	
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public int getTempoEmpresa() {
		return tempoEmpresa;
	}
	public void setTempoEmpresa(int tempoEmpresa) {
		this.tempoEmpresa = tempoEmpresa;
	}

}
