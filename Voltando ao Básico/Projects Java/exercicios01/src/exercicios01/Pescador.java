package exercicios01;

import java.util.Scanner;

public class Pescador {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		//limite = 50kg
		//se exceder paga-se 4$ por kilo excedido
		
		double peso;
		
		System.out.println("Quantos kilos voce pescou? ");
		peso = scan.nextDouble();
		
		if(peso < 50 || peso == 50) {
			System.out.println("Sua pescaria está dentro do limite do estado");
		}else {
			double qtdExc = peso - 50;
			double multa = qtdExc * 4;
			
			System.out.println("Voce pagará " + multa + " reais de multa");
		}
	}
	

}
