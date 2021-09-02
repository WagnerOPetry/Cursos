package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Produto;
import entities.ProdutoImportado;
import entities.ProdutoUsado;

public class Program {

	/*
	 * Fazer um programa para ler os dados de N produtos (N fornecido pelo usu�rio).
	 * Ao final, mostrar a etiqueta de pre�o de cada produto na mesma ordem em que
	 * foram digitados. Todo produto possui nome e pre�o. Produtos importados
	 * possuem uma taxa de alf�ndega, e produtos usados possuem data de fabrica��o.
	 * Estes dados espec�ficos devem ser acrescentados na etiqueta. Para produtos
	 * importados, a taxa e alf�ndega deve ser acrescentada ao pre�o final do
	 * produto.
	 * 
	 */

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		Scanner in = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		List<Produto> lista = new ArrayList<>();

		System.out.print("Entre com o numero de produtos: ");
		int n = in.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Dados do #" + i + " Produto:");
			System.out.print("Comum, usado ou importado (c/u/i)? ");
			char x = in.next().charAt(0);
			System.out.print("Name: ");
			in.nextLine();
			String nome = in.nextLine();
			System.out.print("Pre�o: ");
			double preco = in.nextDouble();

			if (x == 'c') {
				Produto produto = new Produto(nome, preco);
				lista.add(new Produto(nome, preco));
			} else if (x == 'i') {
				System.out.print("Custo da taxa: ");
				double taxa = in.nextDouble();
				lista.add(new ProdutoImportado(nome, preco, taxa));

			} else {
				System.out.print("Data de Fabrica��o: ");
				Date date = sdf.parse(in.next());
				lista.add(new ProdutoUsado(nome, preco, date));
			}
		}

		System.out.println();
		System.out.println("Etiquetas de Pre�os:");
		for (Produto prod : lista) {
			System.out.println(prod.precoEtiqueta());

		}

		in.close();
	}

}
