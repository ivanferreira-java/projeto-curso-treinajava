package cursojava.operlogicascondicionaisrelacionais;

public class Modulo804ComandoSwitchCase {
	
	public static void main(String[] args) {
		
		int dia = 6;
		
		switch (dia) {
		case 1:
			System.out.println("Domingo");
			break;
		case 2:
			System.out.println("Segunda");
			break;
		case 3:
			System.out.println("Ter�a");
			break;
		case 4:
			System.out.println("Quarta");
			break;
		case 5:
			System.out.println("Quinta");
			break;
		case 6:
			System.out.println("Sexta");
			break;
		case 7:
			System.out.println("Sabado");
			break;

		default:
			System.out.println("Outro n�mero, incorreto  " + dia);
			break;
		}
		
		
	}

}
