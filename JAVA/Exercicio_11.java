import java.util.Locale;
import java.util.Scanner;

public class Exercicio_11 {

	public static void main(String[] args) {
	Locale.setDefault(Locale.US);	
	Scanner in = new Scanner(System.in);
			
	double base, alt, area, perimetro, diagonal;
	
	System.out.print("Digite a base do retangulo: ");
	base = in. nextDouble();
	
	System.out.print("Digite a altura do retangulo: ");
	alt = in. nextDouble();
	
	area = base * alt;
	System.out.println("AREA = "+ String.format("%.4f", area));
	
	perimetro = 2 * (base + alt);
	System.out.println("PERIMETRO = " + String.format("%.4f",perimetro));
	
	diagonal = Math.sqrt((base * base) + (alt * alt));
	System.out.println("DIAGONAL = "+ String.format("%.4f",diagonal));
	
	
	
	
	
	
	
	
	
	
	
	
		
	
	
	
	
	
		
		
 }

	private static double RaizQ(double d) {
		// TODO Auto-generated method stub
		return 0;
	}

}


