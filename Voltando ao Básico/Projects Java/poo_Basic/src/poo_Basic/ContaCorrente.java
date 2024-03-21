package poo_Basic;

public class ContaCorrente {
	int conta;
	double saldo;
	boolean especial=false;
	double limit=100;
	
	void depositar(double dinheiro) {
		saldo += dinheiro;
		System.out.println("\nDepósito efetuado com Sucesso!");
		consultarSaldo();
	}
	
	void consultarSaldo() {
		System.out.println("\nSeu saldo é: " + saldo);
	}
	
	void usaChequeEspecial() {
		if(limit < 100) {
			System.out.println("\nVocê está usando o cheque especial. Seu limite é: " + limit);
		}else {
			System.out.println("\nNão está usando cheque especial. Seu limite é: " + limit);
		}
	}
	
	void tipoConta(String contaEspecial) {
		if(contaEspecial.equalsIgnoreCase("s")) {
			especial = true;
		}else {
			especial = false;
		}
	}
	
	void sacarDinheiro(double valor) {
		if(valor <=  saldo) {
			saldo -= valor;
			System.out.println("\nSaque efetuado no valor: "+valor);
			usaChequeEspecial();
			consultarSaldo();
		}else if(valor <= (saldo+limit) ) {
			saldo+=-valor;
			limit+=saldo;
			System.out.println("\nSaque efetuado no valor: "+valor);
			usaChequeEspecial();
			consultarSaldo();
		}
	}
	
	void dadosGerais() {
		System.out.println("\nNumero da conta: " + conta);
		if(especial = true) {
			System.out.println("Tipo de conta: Especial");
		}else {
			System.out.println("Tipo de conta: Comum");
		}
		System.out.println("Limite disponível: " + limit);
		System.out.println("Saldo: " + saldo);
	}

	
}
