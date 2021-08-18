package aplication;

import java.util.Locale;
import java.util.Scanner;

import conversor.Conversor;

public class aplication {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner in = new Scanner(System.in);

		/*
		 * ler a cota��o do d�lar, e depois um valor em d�lares a ser comprado por uma
		 * pessoa em reais. Informar quantos reais a pessoa vai pagar pelos d�lares,
		 * considerando ainda que a pessoa ter� que pagar 6% de IOF sobre o valor em
		 * d�lar
		 */
		
		System.out.print("Qual o valor do d�lar? ");
		double precoDolar = in.nextDouble();

		System.out.print("Quantos d�lares voc� vai comprar? ");
		double valorCompra = in.nextDouble();

		System.out.printf("Voc� pagar� em reais = %.2f%n", Conversor.valorFinal(precoDolar, valorCompra));
        		
		in.close();
		
	}

}
