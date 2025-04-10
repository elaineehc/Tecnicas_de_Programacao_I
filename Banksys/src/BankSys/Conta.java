package BankSys;

public class Conta {
	private String numero;
	private String nome;
	private double saldo;
	
	public Conta(String numero, String nome) {
		this.numero = numero;
		this.nome = nome;
		saldo = 0;
	}
	
	public void creditar (double valor) {
		saldo = saldo + valor;
	}
	public void debitar (double valor) {
		saldo = saldo - valor;
	}
	public String numero() {
		return numero;
	}
	public String nome() {
		return nome;
	}
	public double saldo() {
		return saldo;
	}
}
