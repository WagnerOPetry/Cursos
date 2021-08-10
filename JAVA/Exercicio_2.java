import java.util.Scanner;
public class Exercicio_2 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		double num1, num2, soma, subtracao, mult, div;
		
		System.out.print("Digite um número: ");
		num1 = in.nextDouble();
		
		System.out.print("Digite outro número: ");
		num2 = in.nextDouble();
		
		soma = num1 + num2;
		System.out.println("O resultado da soma é: " + soma);
		
		subtracao = num1 - num2;
		System.out.println("O resultado da subtração é: " + subtracao);
		
		mult = num1 * num2;
		System.out.println("O resultado da multiplicação é: "+ mult);
		
		div = num1 / num2;
		System.out.println("O resultado da divisão é: " + div);
		
		
		
				
				
		
		
	}
}
