package BankSys;

public class Banco {
	private Conta[] contas;
	private int indice = 0;
	
	public Banco() {
		contas = new Conta[100];
	}
	
	public void cadastrar(Conta conta) {
		contas[indice] = conta;
		indice++;
	}
	
	private Conta procurar(String numero) {
		
		for(int i=0; i<indice; i++) {
			String numero2 = contas[i].numero();
			if(numero.equals(numero2)) return contas[i];
		}
		System.out.println("Conta inexistente.");
		return null;
	}
	
	public void creditar(String numero, double valor) {
		Conta conta = procurar(numero);
		if(conta!=null) conta.creditar(valor);
	}
	
	public void debitar(String numero, double valor) {
		Conta conta = procurar(numero);
		if(conta!=null) conta.debitar(valor);
	}
	
	public double saldo(String numero) {
		Conta conta = procurar(numero);
		if(conta!=null) return conta.saldo();
		else return 0;
	}
	
	public void transferir(String origem, String destino, double valor) {
		Conta conta_origem =  procurar(origem);
		Conta conta_destino = procurar(destino);
		
		if(conta_origem!=null && conta_destino!=null) {
			conta_origem.debitar(valor);
			conta_destino.creditar(valor);
		}
	}

}
