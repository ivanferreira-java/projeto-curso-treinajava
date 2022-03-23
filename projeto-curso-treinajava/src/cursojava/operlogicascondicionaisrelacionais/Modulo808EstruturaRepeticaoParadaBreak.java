package cursojava.operlogicascondicionaisrelacionais;

public class Modulo808EstruturaRepeticaoParadaBreak {
	
	public static void main(String[] args) {
		
		for (int numero2 = 0; numero2 <= 10; numero2++) {
			if (numero2 == 8) {
				System.out.println("Obaaa, econtrei o numero: " + numero2);
				System.out.println("Estou parando a execução...");
				break;
			}
		}
		
	}

}
