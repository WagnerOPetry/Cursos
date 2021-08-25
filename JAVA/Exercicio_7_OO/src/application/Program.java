package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Room;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner in = new Scanner(System.in);

		/*
		 * A dona de um pensionato possui dez quartos para alugar para estudantes, sendo
		 * esses quartos identificados pelos números 0 a 9. Fazer um programa que inicie
		 * com todos os dez quartos vazios, e depois leia uma quantidade N representando
		 * o número de estudantes que vão alugar quartos (N pode ser de 1 a 10). Em
		 * seguida, registre o aluguel dos N estudantes. Para cada registro de aluguel,
		 * informar o nome e email do estudante, bem como qual dos quartos ele escolheu
		 * (de 0 a 9). Suponha que seja escolhido um quarto vago. Ao final, seu programa
		 * deve imprimir um relatório de todas ocupações do pensionato, por ordem de
		 * quarto, conforme exemplo.
		 */

		System.out.print("How many rooms will be rented? ");
		int n = in.nextInt();

		Room[] vect = new Room[10];

		for (int i = 0; i < n; i++) {

			System.out.println("Rent #" + (i + 1) + ":");
			System.out.print("Name: ");
			in.nextLine();
			String name = in.nextLine();
			System.out.print("Email: ");
			String email = in.nextLine();
			System.out.print("Room: ");
			int room = in.nextInt();
			vect[room] = new Room(name, email);
		}

		System.out.println();
		System.out.println("Busy rooms: ");

		for (int i = 0; i < 10; i++) {
			if (vect[i] != null) {
				System.out.println(i + ": " + vect[i]);
			}
		}
		in.close();
	}
}
