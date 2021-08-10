import java.util.Locale;
import java.util.Scanner;

public class Exercicio_crescente {

	public static void main(String[] args) {
	Locale.setDefault(Locale.US);	
	Scanner in = new Scanner(System.in);

	int X, Y;
	
	System.out.println("Digite dois numeros:");
	X = in.nextInt();
	Y = in.nextInt();
	
	while (X!=Y) {
		if (X < Y) {
			System.out.println("Crescente!");
		}else{
				System.out.println("Decrescente!");
			}
		System.out.println("Digite outros dois numeros:");
		X = in.nextInt();
		Y = in.nextInt();
		}
	}
			
	

}

