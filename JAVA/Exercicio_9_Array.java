
public class Exercicio_9_Array {

	public static void main(String[] args) {
						
	int[] array;//declaração da variável
	array = new int[10];//cria e reserva o espaço do array
				
	System.out.printf("%s%10s", " ______", "__________"	);
	System.out.println();
	System.out.printf("%s%10s", "|Indice "  , "|Valores|");
	System.out.println();
	System.out.printf("%s%10s", "|-------", "|-------|");
	System.out.println();
			
	for (int i = 0; i <=9; i++) {
		System.out.printf("| %5d%7d   |", i, array[i]);
		System.out.println();
			}
			
	System.out.printf("%s%10s", "|-------", "|-------|");	
 }
}