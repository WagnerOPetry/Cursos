import java.util.Random;

public class Exercicio6_numeros_aleatorios {

	public static void main(String[] args) {
		Random num = new Random();
		System.out.println(num.nextInt());
		// Gera um n�mero aleat�rio inteiro
		
		
		System.out.println(num.nextInt(6)+1);
		//Gera um n�mero aleat�rio de 1 at� 6 (dado)
		
        for(int i =0; i<10; ++i) {
        	System.out.println(num.nextInt(6)+1);
        	//Gera qtdd determinada de n�mero alat�rios
        }
	

	}

}
