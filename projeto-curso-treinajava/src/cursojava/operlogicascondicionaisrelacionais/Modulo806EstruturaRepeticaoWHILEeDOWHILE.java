package cursojava.operlogicascondicionaisrelacionais;

public class Modulo806EstruturaRepeticaoWHILEeDOWHILE {
	
	public static void main(String[] args) {
		
		// WHILE - verifica e depois executa
		int numero = 0;
		while (numero <= 20) {
				System.out.println("O n�mero atual �: " + numero);
				numero++;
		}
		
		System.out.println("\n\n");
		
		// DO WHILE - primeiro executa e depois verifica
		int numero2 = 0;
		do {
			System.out.println("O n�mero atual �: " + numero2);
			numero2++;
		} while(numero2 <= 20);
		
	}

}
