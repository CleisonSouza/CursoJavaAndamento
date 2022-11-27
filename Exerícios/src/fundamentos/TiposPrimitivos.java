package fundamentos;

public class TiposPrimitivos {
	
	public static void main(String[] args) {
		// Informações do funcionario
		
		// Tipos numéricos inteiros
		byte anosDeEmpresa = 23;
		short numerosDeVoos = 542;
		int id = 56789;
		long pontosAcumulados = 3_234_845_223L;
		
		// Tipos numéricos reais
		
		float salário = 11_445.44f;
		double vendasAcumuladas = 2_991_797_103.01;
		
		// Tipos boolenano
		boolean estarDeFerias = false; // true
		
		// Tipo caractere 
		char status = 'A'; // Ativo
		
		// Dias de empresa
		System.out.println(anosDeEmpresa * 345);
		
		// Número de viagens
		System.out.println(numerosDeVoos / 2);
		
		// Pontos por real
		System.out.println(pontosAcumulados / vendasAcumuladas);
		
		System.out.println(id + ": ganha ->" + salário);
		System.out.println("Férias" + estarDeFerias);
		System.out.println("status:" + status);
		

	}

}
