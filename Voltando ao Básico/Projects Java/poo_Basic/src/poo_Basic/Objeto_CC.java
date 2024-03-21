package poo_Basic;

public class Objeto_CC {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ContaCorrente conta1 = new ContaCorrente();//conta, saldo, especial
		conta1.conta = 123456;
		conta1.especial = true;
				
		conta1.depositar(100.00);
		conta1.sacarDinheiro(22.00);
		conta1.dadosGerais();
		conta1.sacarDinheiro(80.50);
	}

}
