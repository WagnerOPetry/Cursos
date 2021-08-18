package Problema_retangulo;

import java.util.Locale;
import java.util.Scanner;
import Retangulo.Retangulo;

public class App {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner in = new Scanner(System.in);
		Retangulo r = new Retangulo();

		System.out.println("Enter rectangle width and height: ");
		r.altura = in.nextDouble();
		r.largura = in.nextDouble();

		System.out.printf("AREA = %.2f%n", r.area());
		System.out.printf("PERIMETRO = %.2f%n", r.perimetro());
		System.out.printf("DIAGONAL = %.2f%n", r.diagonal());
		
		

	}

}
