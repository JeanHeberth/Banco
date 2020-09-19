package br.com.contacorrente;

import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class Banco {

	private int cadastro;
	private float deposito;
	private float saque;
	private float saldo;
	private String nome;

	public int getCadastro() {
		return cadastro;
	}

	public void setCadastro(int cadastro) {
		this.cadastro = cadastro;
	}

	public float getDeposito() {
		return deposito;
	}

	public void setDeposito(float deposito) {
		this.deposito = deposito;
	}

	public float getSaque() {
		return saque;
	}

	public void setSaque(float saque) {
		this.saque = saque;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	DecimalFormat resultadoValor = new DecimalFormat("###.##");

	public void entraCadastro() {
		nome = JOptionPane.showInputDialog("Digite seu Nome: ", "Exemplo: Pablo Trindade");
		cadastro = (Integer.parseInt(JOptionPane.showInputDialog("Digite o número da Conta: ", "Exemplo: 321654")));
		JOptionPane.showMessageDialog(null,
				"\nObrigado pela preferencia Sr.(a)" + nome + "\nCadastro efetuado com sucesso.");
	}

	// metodo entraDeposito
	public void entraDeposito() {

		deposito = (Float.parseFloat((JOptionPane.showInputDialog("Digite o valor a ser depositado: "))));
		JOptionPane.showMessageDialog(null, "O depoisto de valor R$: " + resultadoValor.format(deposito)
				+ " foi depositado na conta do sr.(a) " + nome);

		saldo = saldo + deposito;
	}

	// metodo entraSaque
	public void entraSaque() {
		saque = (Float.parseFloat(JOptionPane.showInputDialog(" Informe o valor a ser sacado ")));
		if (saldo >= saque) {
			JOptionPane.showMessageDialog(null,
					"O saque no valor de " + resultadoValor.format(saque) + " foi realizado com sucesso");
			saldo = saldo - saque;
		} else {
			JOptionPane.showMessageDialog(null, "O saldo é insuficiente");
		}

	}

	// metodo entraSaldo
	public void entraSaldo() {

		JOptionPane.showMessageDialog(null, "O valor total em sua conta é: " + resultadoValor.format(saldo));

	}

}
