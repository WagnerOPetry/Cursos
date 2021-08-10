import java.util.Locale;
import java.util.Scanner;

public class Exercicio_menor_de_tres{

	public static void main(String[] args) {
	Locale.setDefault(Locale.US);	
	Scanner in = new Scanner(System.in);
	
	int n1, n2, n3, menor;
		
	System.out.print("Primeiro Valor: ");
	n1 = in.nextInt();
	
	System.out.print("Segundo Valor: ");
	n2 = in.nextInt();
	
	System.out.print("Terceiro Valor: ");
	n3 = in.nextInt();
	
		if (n1 < n2 && n1 < n3) {
			menor = n1;
			}
		else if (n2 < n1 && n2 < n3) {
			menor = n2;
			}
		else {
			menor = n3;						
		}
  		
	System.out.println("Menor = " + menor);
	
		
	
	
	
}
}