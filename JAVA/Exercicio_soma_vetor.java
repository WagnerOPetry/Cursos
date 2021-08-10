import java.util.Locale;
import java.util.Scanner;
public class Exercicio_soma_vetor {


	public static void main(String[] args) {
	Locale.setDefault(Locale.US);	
	Scanner in = new Scanner(System.in);
	
	int N;
	double soma, media;
	System.out.println("Quantos numeros voc� vai digitar?");
	N = in.nextInt();
		
	double[] vet = new double[N];
		
	for(int i = 0; i < N; i++) {
		System.out.println("Digite um numero: ");
		vet[i] = in.nextDouble();
	}	
	
	System.out.print("VALORES = ");
	for (int i = 0; i < N; i++) {
		System.out.print(String.format("%.1f ", vet[i]));
			}
	System.out.println();
	
	soma = 0;
	for(int i = 0; i < N; i++) {
		soma = soma + vet[i];
	}
	
	
	media = soma / N;
	
	System.out.println("SOMA = " + String.format("%.1f "+ soma));
	System.out.println("M�DIA = " + String.format("%.1f "+ media));
	
	
	
	
	}

}
