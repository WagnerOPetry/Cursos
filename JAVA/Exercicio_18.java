import java.util.Locale;
import java.util.Scanner;
import java.util.Arrays;
	
   public class Exercicio_18 {
				
	public static void main(String[] args) {
			
	Locale.setDefault(Locale.US);
	Scanner in = new Scanner(System.in);
	
	  int [] array = new int [7];
	  
	  for (int i = 0; i < 7 ; i++) {
	  System.out.printf("Digite o numero da posi��o [%d] ", i);
	  array[i] = in.nextInt();
	  }
	  
	  System.out.println(Arrays.toString(array));
	  
	  int soma = 0;
	  for (int i = 0; i<7; i++) {
		  soma = soma + array[i];
		  
	  }
		
	  System.out.println("A soma dos valores = " + soma);
	  
	  int multi = 0;	
	  for (int i = 0; i<7; i++) {
	      multi = array[i] * i;
	      System.out.println("A multiplica��o do ind�ces pelo elemento " 
	      + array[i] + " * "+ i + " � de: "+ multi);	  
		  }
	  
	  double media = soma / 7.0;
	  System.out.println();
	  System.out.println("A m�dia �: "+media);	      
      
}
}