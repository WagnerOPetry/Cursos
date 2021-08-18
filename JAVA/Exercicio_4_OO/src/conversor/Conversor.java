package conversor;

public class Conversor {
	
	public static double IOF = 0.06;
			
	public static double valorFinal(double precoDolar, double valorCompra) {
		return precoDolar * valorCompra * (1.0 + IOF);
	}
	
	
	
	

}
