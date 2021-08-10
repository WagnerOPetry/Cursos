import java.util.Locale;
import java.util.Scanner;

public class Exercicio_idade {
	
	public static void main(String[] args) {
	Locale.setDefault(Locale.US);	
	Scanner in = new Scanner(System.in);
	
	String nome1, nome2;
	int idade1, idade2;
	double	media;
	
	System.out.println("Dados da primeira pessoa:");
	System.out.print("Nome: ");
	nome1 = in. nextLine();
	System.out.print("Idade: ");
	idade1 = in. nextInt();
	
	System.out.println("Dados da Sgunda Pessoa:");
	System.out.print("Nome: ");
	in.nextLine();
	nome2 = in.nextLine();
	System.out.println("Idade: ");
	idade2 = in.nextInt();
	
	media = (idade1 + idade2) / 2.0;
	
	System.out.println("A idade média de " + nome1+" e " + nome2 +" é de " + media + " anos.");
	
	


}
}