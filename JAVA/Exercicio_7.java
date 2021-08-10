import java.util.Scanner;

public class Exercicio_7 {

	public static void main(String[] args) {
		
	Scanner in = new Scanner(System.in);
		
		
	int a, b;
	
	a = 0;
	b = 0;
	
	System.out.println("Digite um numero: ");
		a = in.nextInt();
		
	System.out.println("Digite outro numero: ");	
		b = in.nextInt();
	
	String valor = (a>b) ? "Deu bom" : " Deu ruim";
	
	System.out.println(valor);
	
	//Como diminuir a qtdd de ifs e elses!
		
	}

}
