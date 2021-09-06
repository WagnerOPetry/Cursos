package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Conta;
import exceptions.ContaException;

public class Program {

	/*
	 * Fazer um programa para ler os dados de uma conta bancária e depois realizar
	 * um saque nesta conta bancária, mostrando o novo saldo. Um saque não pode
	 * ocorrer ou se não houver saldo na conta, ou se o valor do saque for superior
	 * ao limite de saque da conta.
	 */
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner in = new Scanner(System.in);

		System.out.println("Entre com os dados da conta:");
		System.out.print("Número da Conta: ");
		int numero = in.nextInt();
		System.out.print("Titular: ");
		in.nextLine();
		String nome = in.nextLine();
		System.out.print("Saldo Inicial: ");
		double saldo = in.nextDouble();
		System.out.print("Limite de Saque: ");
		double limiteSaque = in.nextDouble();
		Conta conta = new Conta(numero, nome, saldo, limiteSaque);

		System.out.println();
		System.out.print("Valor do saque: ");
		double saque = in.nextDouble();

		try {
			conta.saque(saque);
			System.out.println("Novo Saldo = " + String.format("%.2f%n", conta.getSaldo()));

		} catch (ContaException e) {
			System.out.println(e.getMessage());
		}

		in.close();
	}

}
