import java.util.Scanner;

public class Exercicio_8 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		
		System.out.println("Digite qual seu dia da semana preferido: ");
		System.out.println("Escolha 1 para segunda e 7 para domingo.");
		
		int num = in.nextInt();
		
		
		// Utilizando se/sen�o
//		String dia = (num==1) ? "Segunda" :
//			         (num==2) ? "Ter�a" :
//			         (num==3) ? "Quarta" :
//			         (num==4) ? "Quinta" :
//			         (num==5) ? "Sexta" :
//			         (num==6) ? "S�bado" :
//			         (num==7) ? "Domingo" :
//			                    "Dia inv�lido";
//		System.out.println("O dia escolhido foi: "+ dia);
		
		// Utilizando Case
		String dia;
		switch (num) {
			case 1 : dia = "Segunda";
			break;
			case 2 : dia = "Ter�a";
			break;
			case 3 : dia = "Quarta";
			break;
			case 4 : dia = "Quinta";
			break;
			case 5 : dia = "Sexta";
			break;
			case 6 : dia = "S�bado";
			break;
			case 7 : dia = "Domingo";
			break;
			default  : dia = "Dia inv�lido";
		}
		System.out.println("O dia escolhido foi: "+ dia);
		
		
		
	}
	}


