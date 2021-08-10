import java.util.Locale;
import java.util.Scanner;
	
	public class Exercicio_diagonal_negativos {
	
			
		public static void main(String[] args) {
			
			Locale.setDefault(Locale.US);
			Scanner in = new Scanner(System.in);

			
			int N;
			System.out.print("Qual a ordem da matriz?");
			N = in.nextInt();
			
			
			int [][] mat = new int[N][N];
			
			
			for (int i=0; i<N ; i++) {
				for(int j=0; j<N; j++) {
					System.out.print("Elemento[" + i + "," + j +"]: ");
					mat[i][j] = in.nextInt();					
				}
			}
			
			System.out.println("Diagonal Principal: ");
			for (int i=0; i<N ; i++) {
				System.out.print(mat[i][i] + " ");		
			}
			
			System.out.println();
			
			int negativo = 0;
			for (int i=0; i<N ; i++) {
				for(int j=0; j<N; j++) {
				 if (mat[i][j]<0) {
					 negativo++;
				 }
				}								
              }
			System.out.println("Quantidade de negativos: "+ negativo);
       }
	}