package Application;

import java.util.Locale;
import java.util.Scanner;

import Entities.Aluno;

public class App {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner in = new Scanner(System.in);

		Aluno aluno = new Aluno();

		aluno.name = in.nextLine();
		aluno.nota1 = in.nextDouble();
		aluno.nota2 = in.nextDouble();
		aluno.nota3 = in.nextDouble();

		System.out.printf("NOTA FINAL = %.2f%n", aluno.notaFinal());

		if (aluno.notaFinal() > 60.0) {
			System.out.println("APROVADO!");
		} else {
			System.out.println("REPROVADO!");
			System.out.printf("FALTOU %.2f PONTOS%n", aluno.msg());
		}
		in.close();
	}
}
