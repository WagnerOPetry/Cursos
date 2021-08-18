package aplication;

import java.util.Locale;
import java.util.Scanner;

import conversor.Conversor;

public class aplication {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner in = new Scanner(System.in);

		/*
		 * ler a cotação do dólar, e depois um valor em dólares a ser comprado por uma
		 * pessoa em reais. Informar quantos reais a pessoa vai pagar pelos dólares,
		 * considerando ainda que a pessoa terá que pagar 6% de IOF sobre o valor em
		 * dólar
		 */
		
		System.out.print("Qual o valor do dólar? ");
		double precoDolar = in.nextDouble();

		System.out.print("Quantos dólares você vai comprar? ");
		double valorCompra = in.nextDouble();

		System.out.printf("Você pagará em reais = %.2f%n", Conversor.valorFinal(precoDolar, valorCompra));
        		
		in.close();
		
	}

}
