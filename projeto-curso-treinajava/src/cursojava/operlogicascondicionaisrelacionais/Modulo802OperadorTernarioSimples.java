package cursojava.operlogicascondicionaisrelacionais;

public class Modulo802OperadorTernarioSimples {
	
	public static void main(String[] args) {

		int nota1 = 90;
		int nota2 = 20;
		int nota3 = 50;
		int nota4 = 50;
		int media = 0;
		
		media = (nota1 + nota2 + nota3 + nota4) / 4;
		/*
		String saidaResultado;
		saidaResultado = media >= 70 ? "Aluno aprovado" : "Aluno reprovado";
		*/
		// String saidaResultado = media >= 70 ? "Aluno aprovado" : "Aluno reprovado";
		String saidaResultado = media >= 70 ? "Aluno aprovado" : (media >= 40 && media <=69) ? "Aluno em recuperação" : "Aluno reprovado";
		
		System.out.println(saidaResultado + ": " + media);
		
	}

}
