package aula16_Exercicios;

import java.util.Scanner;

public class Intervalo_numeros {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num1 = 0, num2 = 0, i, result=0;
		
		System.out.println("Digite um valor: ");
		num1 = scan.nextInt();
		
		System.out.println("Digite outro valor: ");
		num2 = scan.nextInt();
		
		for(i=num1+1; i>num1 && i <num2; i++) {
			result +=i;
			System.out.println("\n "+i);
		}
		System.out.println("\n---------Resultado----------\n"+result);
		
	}

}
