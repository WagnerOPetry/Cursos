import java.util.Scanner;
public class Exercicio_1 {

	public static void main(String[] args) {
		
		System.out.println("Digite a idade do seu cachorro: ");
		Scanner in = new Scanner(System.in);
		
		int idadeCachorro = in.nextInt();
		idadeCachorro = idadeCachorro * 7;
		
		System.out.println("Seu cachorro tem "+ idadeCachorro+" anos");
		
		
		
	}

}
