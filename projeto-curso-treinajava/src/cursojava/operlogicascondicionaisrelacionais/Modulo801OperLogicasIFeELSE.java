package cursojava.operlogicascondicionaisrelacionais;

public class Modulo801OperLogicasIFeELSE {
	
	public static void main(String[] args) {
		/*
		int mediaAluno = 70;
		String nome = "Fabio";
		
		if (mediaAluno >= 70 && nome.equals("Ivan")) {
			System.out.println("Parabéns, você está aprovado");
		} else if (mediaAluno < 70) {
			System.out.println("Você está reprovado");
		} else {
			System.out.println("Aluno não encontrado");
		}
		*/
		
		int nota1 = 90;
		int nota2 = 60;
		int nota3 = 70;
		int nota4 = 90;
		int media = 0;
		
		media = (nota1 + nota2 + nota3 + nota4) / 4;
		
		if (media >= 70) {
			System.out.println("Aluno aprovado: " + media);
		} else if (media >= 40 && media <= 69) {
			System.out.println("Aluno está de recuperação: " + media);
		} else {
			System.out.println("Aluno reprovado: " + media);
		}
		
		
	}

}
