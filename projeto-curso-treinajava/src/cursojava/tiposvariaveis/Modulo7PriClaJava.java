package cursojava.tiposvariaveis;

public class Modulo7PriClaJava {
	
	/*Vari�vel Global � acessivel a tods*/
	static int maiorIdadeGlobal = 30;
	
	/*MAIN � um metodo auto executavel em JAVA*/
	public static void main(String[] args) {
		/*
		boolean logica;
		boolean logica2;
		
		int numero;
		int numero2;
		
		short numero4;
		*/
		/*Vari�vel local, porque pertence somente a esse m�todo*/
		int maiorIdade = 18;
		int idosoIdade = 60;
		int jovenIdade = 16;
		int criancaIdade = 7;
		
		String cpf = "123.456.789-00";
		
		System.out.println("Maior idade �: " + maiorIdade);
		System.out.println("Idoso �: " + idosoIdade);
		System.out.println("Jovem idade �: " + jovenIdade);
		System.out.println("Crian�a idade �: " + criancaIdade);
		System.out.println("CPF �:  " + cpf + "\n");
		
		/*Pode ser chamado dos DOIS geito*/
		System.out.println("Valor da vari�vel Global �: " + maiorIdadeGlobal);
		metodo2();
		
	}
	
	public static void metodo2 () {
		System.out.println("Valor da vari�vel Global �: " + maiorIdadeGlobal);
	}

}
