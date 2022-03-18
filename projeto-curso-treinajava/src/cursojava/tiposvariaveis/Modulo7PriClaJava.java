package cursojava.tiposvariaveis;

public class Modulo7PriClaJava {
	
	/*Variável Global é acessivel a tods*/
	static int maiorIdadeGlobal = 30;
	
	/*MAIN é um metodo auto executavel em JAVA*/
	public static void main(String[] args) {
		/*
		boolean logica;
		boolean logica2;
		
		int numero;
		int numero2;
		
		short numero4;
		*/
		/*Variável local, porque pertence somente a esse método*/
		int maiorIdade = 18;
		int idosoIdade = 60;
		int jovenIdade = 16;
		int criancaIdade = 7;
		
		String cpf = "123.456.789-00";
		
		System.out.println("Maior idade é: " + maiorIdade);
		System.out.println("Idoso é: " + idosoIdade);
		System.out.println("Jovem idade é: " + jovenIdade);
		System.out.println("Criança idade é: " + criancaIdade);
		System.out.println("CPF é:  " + cpf + "\n");
		
		/*Pode ser chamado dos DOIS geito*/
		System.out.println("Valor da variável Global é: " + maiorIdadeGlobal);
		metodo2();
		
	}
	
	public static void metodo2 () {
		System.out.println("Valor da variável Global é: " + maiorIdadeGlobal);
	}

}
