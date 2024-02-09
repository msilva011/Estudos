package exercicios01;

import java.util.Scanner;

public class RealInt {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite o primeiro valor inteiro: ");
		int valor1 = scan.nextInt();
		
		System.out.println("Digite o segundo valor inteiro: ");
		int valor2 = scan.nextInt();
		
		System.out.println("Digite um valor real: ");
		double valorR = scan.nextDouble();
		
		//produto do dobro do primeiro com metade do segundo
		double produto = ((2*valor1) * (valor2/2));
		
		//soma do triplo do primeiro com o terceiro
		double soma = ((3 * valor1) + valorR);
		
		//o terceiro elevado ao cubo
		double cubo = Math.pow(valorR, 3);
		
		System.out.println("Os resultados são: \n Produto: " + produto + "\n Soma: " + soma + "\n Cubo: " + cubo);
		
	}

}
