import java.util.Scanner;
public class Exercicio_3 {
	public static void main(String[] args) {
	 
	 Scanner in = new Scanner(System.in);	
		
	 double nota1, nota2, nota3, nota4, media;
	 
	 System.out.println("Digite a primeira nota: ");
	 
	 
	 nota1 = in.nextDouble();
	 
	 System.out.println("Digite a segunda nota: ");
	 nota2 = in.nextDouble();
	 
	 System.out.println("Digite a terceira nota: ");
	 nota3 = in.nextDouble();
	 
	 System.out.println("Digite a quarta nota: ");
	 nota4 = in.nextDouble();
	 
	 media = (nota1 + nota2 + nota3 + nota4) / 4;
	 
	 if(media>6.0) {
		 System.out.println("Aprovado! Média: " + media);
	 }else {
		 System.out.println("Reprovado... Média: " + media);
	 }	 
	 
	}
}
