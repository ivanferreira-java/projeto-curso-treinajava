package cursojava.operlogicascondicionaisrelacionais;

import javax.swing.JOptionPane;

public class Modulo812CriandoOpcooConfirma��o {
	
public static void main(String[] args) {
		
		String carros =  JOptionPane.showInputDialog("Informe a quantidade de carros?");
		String pessoas =  JOptionPane.showInputDialog("Informe a quantidade de pessoas?");
		
		double carroNumero = Double.parseDouble(carros);
		double pessoaNumero = Double.parseDouble(pessoas);
		
		int divisao = (int) (carroNumero / pessoaNumero);
		double resto = carroNumero % pessoaNumero;
		
		int resposta = JOptionPane.showConfirmDialog(null, "Deseja ver o resultado da divis�o?");
		if (resposta == 0) {
			JOptionPane.showMessageDialog(null, "Divis�o para pessoas deu " + divisao );
		} else {
			System.out.println("N�o quiz ver o resultado");
		}
		
		resposta = JOptionPane.showConfirmDialog(null, "Deseja ver o resto da divis�o?");
		if (resposta == 0) {
			JOptionPane.showMessageDialog(null, "O resto da divis�o deu " + resto );
		}else {
			System.out.println("N�o quiz ver o resultado");
		}
		
	}

}
