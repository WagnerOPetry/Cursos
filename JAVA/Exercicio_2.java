import java.util.Scanner;
public class Exercicio_2 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		double num1, num2, soma, subtracao, mult, div;
		
		System.out.print("Digite um n�mero: ");
		num1 = in.nextDouble();
		
		System.out.print("Digite outro n�mero: ");
		num2 = in.nextDouble();
		
		soma = num1 + num2;
		System.out.println("O resultado da soma �: " + soma);
		
		subtracao = num1 - num2;
		System.out.println("O resultado da subtra��o �: " + subtracao);
		
		mult = num1 * num2;
		System.out.println("O resultado da multiplica��o �: "+ mult);
		
		div = num1 / num2;
		System.out.println("O resultado da divis�o �: " + div);
		
		
		
				
				
		
		
	}
}
