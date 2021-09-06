package entities;

import exceptions.ContaException;

public class Conta {

	private Integer numero;
	private String nome;
	private Double saldo;
	private Double limiteSaque;

	public Conta() {
	}

	public Conta(Integer numero, String nome, Double saldo, Double limiteSaque) {
		this.numero = numero;
		this.nome = nome;
		this.saldo = saldo;
		this.limiteSaque = limiteSaque;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public Double getLimiteSaque() {
		return limiteSaque;
	}

	public void setLimiteSaque(Double limiteSaque) {
		this.limiteSaque = limiteSaque;
	}

	public void deposito(double valor) {
		saldo += valor;
	}

	public void saque(double valor) {
		saqueValido(valor);
		saldo -= valor;

	}

	private void saqueValido(Double valor) {
		if (valor > getLimiteSaque()) {
			throw new ContaException("Erro de Saque: Valor acima do limite de saque.");
		}
		if (valor > getSaldo()) {
			throw new ContaException("Erro de Saque: Saldo insuficiente.");
		}

	}

}
