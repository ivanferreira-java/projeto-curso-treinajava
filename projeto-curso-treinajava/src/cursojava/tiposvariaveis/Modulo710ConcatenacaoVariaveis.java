package cursojava.tiposvariaveis;

public class Modulo710ConcatenacaoVariaveis {
	
	public static void main(String[] args) {
			
			/*CONCATENA��O  = Unir ou juntar dados*/
		String nome = "Ivan Ferreira";
		String cpf = "123.456.789-00";
		String telefone = "(89) 99494-9898";
		String endereco = "Rua Java - JV";
		int idade = 32;
		
		String saida = "Meu nome �: " + nome 
				+ ", CPF: " + cpf 
				+ ", Contato: " + telefone 
				+ ", Endere�o: " + endereco
				+ " e Minha idade: " + idade;
		
		System.out.println(saida);
		
		System.out.println("\nMeu nome �: " + nome 
				+ ", CPF: " + cpf 
				+ ", Contato: " + telefone 
				+ ", Endere�o: " + endereco
				+ " e Minha idade: " + idade);
		
		}

}
