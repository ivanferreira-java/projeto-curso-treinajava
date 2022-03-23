package cursojava.operlogicascondicionaisrelacionais;

public class Modulo806EstruturaRepeticaoWHILEeDOWHILE {
	
	public static void main(String[] args) {
		
		// WHILE - verifica e depois executa
		int numero = 0;
		while (numero <= 20) {
				System.out.println("O número atual é: " + numero);
				numero++;
		}
		
		System.out.println("\n\n");
		
		// DO WHILE - primeiro executa e depois verifica
		int numero2 = 0;
		do {
			System.out.println("O número atual é: " + numero2);
			numero2++;
		} while(numero2 <= 20);
		
	}

}
