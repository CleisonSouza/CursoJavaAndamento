package fundamentos;

public class Temperatura {
	
	public static void main(String[] args) {
		
		final double FATOR = 5.0 / 9.0;
		final double AJUSTE = 32;
		
		double fahrenheit = 86;
		double celsuis = (fahrenheit - AJUSTE) * FATOR;
		System.out.println("O resultado é " + celsuis + "C.");		
		
		fahrenheit = 0;
		celsuis = (fahrenheit - AJUSTE) * FATOR;
		
		System.out.println("O resultado é " + celsuis + "C.");		
		
				
		
				
		
	}	

}
