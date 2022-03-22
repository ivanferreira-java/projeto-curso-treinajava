package cursojava.operlogicascondicionaisrelacionais;

public class Modulo803OperacoeslogicasAninhadas {
	
	public static void main(String[] args) {
		
		int nota1 = 90;
		int nota2 = 95;
		int nota3 = 91;
		int nota4 = 97;
		int media = 0;
		
		media = (nota1 + nota2 + nota3 + nota4) / 4;
		
		if (media >= 50) {
			if (media >=70) {
				if (media > 90) {
					System.out.println("Aluno aprovado direto - Parabéns: " + media);
				}else {
					System.out.println("Aluno aprovado direto: " + media);
				}
			} else {
				System.out.println("Aluno está em recuperação: " + media);
			}
		} else {
			System.out.println("Aluno reprovado direto: " + media);
		}
		
	}

}
