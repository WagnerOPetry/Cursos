
public class Exercicio_10 {

	public static void main(String[] args) {
		
		int [] array = {78, 20, 56, 89, 1};
		System.out.printf("%s%8s", "Indice", "Valores");
		System.out.println();
		
		for(int i=0; i< array.length; i++) {
			System.out.printf("%5d%8d", i, array[i]);
			System.out.println();
			
		}
	}
}
