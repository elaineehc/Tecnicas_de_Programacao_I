package BankSys;

public class CriaConta {
	public static void main(String[] args) {
		
		Conta conta_joao = new Conta("123-4", "Joao");
		Conta conta_maria = new Conta("123-5", "Maria");
		
		Banco banco = new Banco();
		banco.cadastrar(conta_joao);
		banco.cadastrar(conta_maria);
		
		banco.creditar(conta_joao.numero(), 50);
		System.out.println("Saldo: "+conta_joao.saldo());
		banco.creditar(conta_maria.numero(), 150);
		System.out.println("Saldo: "+conta_maria.saldo());
		
		banco.transferir(conta_joao.numero(), conta_maria.numero(), 20);
		System.out.println("Saldo: "+conta_joao.saldo());
		System.out.println("Saldo: "+conta_maria.saldo());
		
		
		
	}
}
