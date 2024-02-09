package exercicios01;

import java.util.Scanner;

public class AreaQuad {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in)
				;
		System.out.println("Digite o tamanho de um lado do quadrado: ");
		double lado = scan.nextDouble();
		
		double area = lado*4;
		
		System.out.println("A area do quadrado é: " + area + " e o dobro dela é " + area*2);
		
	}

}
