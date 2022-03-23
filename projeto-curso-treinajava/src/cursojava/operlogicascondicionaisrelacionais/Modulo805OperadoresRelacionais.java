package cursojava.operlogicascondicionaisrelacionais;

public class Modulo805OperadoresRelacionais {
	
public static void main(String[] args) {
		
		int nota1 = 90;
		int nota2 = 90;
		//SE FOR IGUAL: ==
		if (nota1 == nota2) {
			System.out.println("As notas são iguais");
		} 
		
		int nota3 = 85;
		int nota4 = 90;
		// SE FOR DIFERENTE: != 
		if (nota3 != nota4) {
			System.out.println("As notas são diferentes");
		} 
		
		int nota5 = 85;
		int nota6 = 90;
		// SE FOR MENOR: <  
		if (nota5 < nota6) {
			System.out.println("As nota 1 é menor");
		}
		
		int nota7 = 90;
		int nota8 = 90;
		// SE FOR MENOR OU IGUAL: <=  
		if (nota7 <= nota8) {
			System.out.println("As nota 1 é menor ou igual");
		}
		
		int nota9 = 95;
		int nota10 = 90;
		// SE FOR MAIOR: >  
		if (nota9 > nota10) {
			System.out.println("As nota 1 maior");
		}
		
		int nota11 = 95;
		int nota12 = 95;
		// SE FOR MAIOR OU IGUAL: >=  
		if (nota11 >= nota12) {
			System.out.println("As nota 1 maior ou igual");
		}
		
	}

}
