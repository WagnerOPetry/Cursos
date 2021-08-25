package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner in = new Scanner(System.in);

		/*
		 * programa para ler um número inteiro N e os dados (nome e preço) de N
		 * Produtos. Armazene os N produtos em um vetor. Em seguida, mostrar o preço
		 * médio dos produtos.
		 */

		int n = in.nextInt();

		Product[] vect = new Product[n];

		for (int i = 0; i < vect.length; i++) {
			in.nextLine();
			String name = in.nextLine();
			double price = in.nextDouble();
			vect[i] = new Product(name, price);
		}

		double calc = 0.0;
		for (int i = 0; i < vect.length; i++) {
			calc += vect[i].getPrice() / vect.length;
		}

		System.out.printf("AVARAGE PRICE = %.2f%n", calc);
		
		in.close();

	}

}
