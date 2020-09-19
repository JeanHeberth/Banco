package br.com.contacorrente;

import javax.swing.JOptionPane;

public class ObjetoBanco {

	public static void main(String[] args) {

		
		Banco objeto = new Banco();
		int op = 0;

		do {
			op = (Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a opcao desejada: \n"
					+ "1 - Cadastrar a Conta\n" + "2 - Deposito\n" + "3 - Saque\n" + "4 - Saldo\n" + "5 - Sair")));

			// usar o switch case
			switch (op) {
			case 1:
				objeto.entraCadastro();
				break;

			case 2:
				objeto.entraDeposito();

				break;

			case 3:
				 objeto.entraSaque();

				break;

			case 4:
				 objeto.entraSaldo();

				break;
			}

			// obj.entr
			// obj.gfogfork

		} while (op != 5);

	}

}
