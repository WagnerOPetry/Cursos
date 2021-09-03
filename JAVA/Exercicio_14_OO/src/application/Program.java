package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;
import entities.PessoaFisica;
import entities.PessoaJuridica;

public class Program {
	public static void main(String[] args) {

		/*
		 * Fazer um programa para ler os dados de N contribuintes (N fornecido pelo
		 * usu�rio), os quais podem ser pessoa f�sica ou pessoa jur�dica, e depois
		 * mostrar o valor do imposto pago por cada um, bem como o total de imposto
		 * arrecadado. Os dados de pessoa f�sica s�o: nome, renda anual e gastos com
		 * sa�de. Os dados de pessoa jur�dica s�o nome, renda anual e n�mero de
		 * funcion�rios. As regras para c�lculo de imposto s�o as seguintes:
		 * 
		 * - Pessoa f�sica: pessoas cuja renda foi abaixo de 20000.00 pagam 15% de
		 * imposto. Pessoas com renda de 20000.00 em diante pagam 25% de imposto. Se a
		 * pessoa teve gastos com sa�de, 50% destes gastos s�o abatidos no imposto.
		 * Exemplo: uma pessoa cuja renda foi 50000.00 e teve 2000.00 em gastos com
		 * sa�de, o imposto fica: (50000 * 25%) - (2000 * 50%) = 11500.00.
		 * 
		 * - Pessoa jur�dica: pessoas jur�dicas pagam 16% de imposto. Por�m, se a empresa
		 * possuir mais de 10 funcion�rios, ela paga 14% de imposto. Exemplo: uma
		 * empresa cuja renda foi 400000.00 e possui 25 funcion�rios, o imposto fica:
		 * 400000 * 14% = 56000.00
		 * 
		 */

		Locale.setDefault(Locale.US);
		Scanner in = new Scanner(System.in);

		List<Pessoa> lista = new ArrayList<>();

		System.out.print("Digite quantas pessoas: ");
		int n = in.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Dados da #" + i + " Pessoa:");
			System.out.print("Pessoa F�sica ou Jur�dica (f/j): ");
			char ch = in.next().charAt(0);
			System.out.print("Nome: ");
			in.nextLine();
			String nome = in.nextLine();
			System.out.print("Renda Anual: ");
			double rendaAnual = in.nextDouble();

			if (ch == 'f') {
				System.out.print("Gastos com sa�de: ");
				double gastosSaude = in.nextDouble();
				lista.add(new PessoaFisica(nome, rendaAnual, gastosSaude));
			} else {
				System.out.print("N�mero de funcion�rios: ");
				int numeroDeFuncionarios = in.nextInt();
				lista.add(new PessoaJuridica(nome, rendaAnual, numeroDeFuncionarios));

			}

		}

		double soma = 0;
		System.out.println();
		System.out.println("Taxas Pagas:");
		for (Pessoa p : lista) {
			double taxa = p.imposto();
			System.out.printf(p.getName() + ": $" + String.format("%.2f%n", taxa));
			soma += taxa;
		}

		System.out.println();
		System.out.printf("Total de taxas: " + String.format("%.2f", soma));

		in.close();

	}

}
