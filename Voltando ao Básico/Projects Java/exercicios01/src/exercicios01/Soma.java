package exercicios01;

import java.util.Scanner;

public class Soma {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o primeiro valor: ");
		double valor1 = scan.nextDouble();
		
		System.out.println("Digite o segundo valor: ");
		double valor2 = scan.nextDouble();
		
		double resultado = valor1 + valor2;
		
		System.out.println("A soma dos valores digitados é: " + resultado);

	}

}
