package cursojava.operlogicascondicionaisrelacionais;

public class Modulo809EstruturaRepeticaoContinue {
	
public static void main(String[] args) {
		
		for (int numero2 = 0; numero2 <= 10; numero2++) {
			if (numero2 == 3 || numero2 == 6 || numero2 == 9) {
				System.out.println("\nObaaa, econtrei o numero: " + numero2 + "\n");
				continue;
			}
			
			System.out.println("Processando laço de repetição ");
			
		}
		
	}

}
